package com.srkr;

public class EmailClinet {
	private SpellChecker spellChecker;
	
	public EmailClinet(SpellChecker spellChecker) {
		// TODO Auto-generated constructor stub
		this.spellChecker=spellChecker;
	}
	public void sendEmail(String email)
	{
		spellChecker.spellCheck(email);
	}
	}

