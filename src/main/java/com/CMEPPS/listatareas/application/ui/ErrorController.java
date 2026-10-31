package com.CMEPPS.listatareas.application.ui;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// Corrección 8.4: era @Controller("error"). Un @ExceptionHandler dentro de un
// @Controller solo captura las excepciones de ese mismo controlador (que no
// tiene ningún handler), así que nunca se ejecutaba. Con @ControllerAdvice
// captura las de toda la aplicación.
@ControllerAdvice
public class ErrorController {

	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleException(HttpServletRequest request, Exception ex) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("exception", ex.getLocalizedMessage());
		mv.addObject("url", request.getRequestURL());

		mv.setViewName("error");
		return mv;
	}
}
