package com.spring.injection.impl;

import com.spring.injection.declare.Checker;

public class SpellChecker implements Checker{
	
	public SpellChecker()
	{
		
	}
	
	@Override
	public void spellCheck() {
		System.out.println("in the spell check *****");
		
	}

}
