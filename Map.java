

package com.Practicejava.org;


	
	import java.util.Iterator;
	import java.util.Set;
	 
	public class Map{
	 
	    public static void main(String args[])
	    {
	        Map map = new Map();
	 
	        //Adding values to the HashMap
	        map.put("test key 1", "test value 1");
	        map.put("test key 2", "test value 2");
	        map.put("test key 3", "test value 3");
	 
	        System.out.println("Retrieving values from HashMap");
	        retrieveValuesFromListMethod(map);
	        System.out.println("***\n\n");
	    }
	    
	    private void put(String string, String string2) {
	    }
		//This method retrieves values from Map
	     
	    @SuppressWarnings("rawtypes")
		public static void retrieveValuesFromListMethod(Map map)
	    {
	        Set keys = map.keySet();
	        Iterator itr = keys.iterator();
	 
	        String key;
	        String value;
	        while(itr.hasNext())
	        {
	            key = (String)itr.next();
	            value = (String)((java.util.Map) map).get(key);
	            System.out.println(key + " - "+ value);
	        }
	    }

		@SuppressWarnings("rawtypes")
		private Set keySet() {
			
			return null;
		}
	}

