package com.books.chapters.restfulapi.patterns.chap3.springboot.models.errorsandexceptions;

public class InvestorNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvestorNotFoundException(String exception)
	{
		super(exception);
	}
}
