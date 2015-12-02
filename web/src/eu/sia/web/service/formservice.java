package eu.sia.web.service;

public class formservice {
	
	public formservice() {};
	
	public boolean testNomi(String nome, String cognome) {
		{
			if ((nome.equalsIgnoreCase("Antonio") && (cognome.equalsIgnoreCase("Zito")))
					|| 
				(nome.equalsIgnoreCase("Luca") && (cognome.equalsIgnoreCase("Trotta")) )
					|| 
				(nome.equalsIgnoreCase("Massimo") && (cognome.equalsIgnoreCase("Oliveri"))) 
					|| 
				(nome.equalsIgnoreCase("Giampietro")&& (cognome.equalsIgnoreCase("Biffi"))) 
					|| 
				(nome.equalsIgnoreCase("Luigi") && (cognome.equalsIgnoreCase("Fugaro"))))
				return true;
			else
				return false;
		}
	}; 
}