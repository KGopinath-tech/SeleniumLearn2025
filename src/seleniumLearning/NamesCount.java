package seleniumLearning;

import java.util.ArrayList;

public class NamesCount {

	public static void main(String[] args) {
				
		ArrayList<String> names =new ArrayList<String>();
		names.add("Gopinath");
		names.add("Aria");
		names.add("Arjunan");
		names.add("Chloe");
		names.add("James");
		names.add("Adhiyan");
		
		//Count names which starts with 'A' word
		
	    int Count =0;
	    
	    for(int i=0;i<names.size();i++) {
	    	
	    	if(names.get(i).startsWith("A")) {
	    		Count++;
	    	}
	    }

	   System.out.println(Count);
	}
	

}
