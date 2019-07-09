package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor {
	
	@Autowired
		private SpellChecker sp;
	public void load(String doc) {
			System.out.println(doc + "loaded................");
		//SpellChecker sp = new SpellChecker();
		
		sp.spellCheck(doc);
		
}
}