package org.antwalk;

import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{
	
	public String showAccont()
	{
		return "current";
	}
}
