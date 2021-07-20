package com.FileHandlingConcept;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class CreatFolder {
	@Test
	
	public void CreatFolderEx() throws IOException 
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
		File f=new File("‪‪‪‪C:\\Users\\user\\OneDrive\\Desktop\\"+sdf.format(d));
		
		if(!f.exists()) 
		{
			f.mkdirs(); 
			f=new File("‪‪‪‪C:\\Users\\user\\OneDrive\\Desktop\\"+sdf.format(d));
			f.createNewFile(); 
		}
				
		
	}

}
