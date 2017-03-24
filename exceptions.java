package com.Practicejava.org;

import java.io.FileReader;

public class exceptions {

	
		public void openFile(){
	        FileReader reader = null;
	        try {
	            reader = new FileReader("someFile");
	            int i=0;
	            while(i != -1){
	                i = reader.read();
	                System.out.println((char) i );
	            }
	        } catch (Exception e) {
	                    } 
	          finally
	            {
	            if(reader != null){
	                try {
	                    reader.close();
	                } catch (Exception e) {
	                                    }
	            }
	            System.out.println("File End");
	        }
	    }


	}

