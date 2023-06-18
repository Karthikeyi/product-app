package com.srkr;

public class ProSpellChecker implements SpellChecker {

	@Override
	public void spellCheck(String message) {
		// TODO Auto-generated method stub
		if(!message.isBlank())
		{
			System.err.println("email spelling check under process" + getClass().getSimpleName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			System.out.println("spell check success:Email=>"+message);
		}
		else
		{
			System.out.println("invalid email message");
		}
	}

}
