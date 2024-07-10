package com.tricentis.genericutility;

import java.time.LocalDateTime;

public class JavaUtility 

{
	public String getLocalTimeStamp() 
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}
}

