package org.antwalk;

import org.springframework.stereotype.Component;

@Component("saving")
public class Saving implements Account{
	
	public String showAccont()
	{
		return "Saving";
	}

}
