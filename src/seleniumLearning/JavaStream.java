package seleniumLearning;

import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		
		//Count Names which starts with 'A' word
		ArrayList<String> names =new ArrayList<String>();
		names.add("Gopinath");
		names.add("Aria");
		names.add("Arjunan");
		names.add("Chloe");
		names.add("James");
		names.add("Adhiyan");
		
		long Count = names.stream().filter(s->s.startsWith("A")).count();
		//System.out.println(Count);

		//There is no life intermediate operation if there is no terminal operation
		//Terminal operation will not execute if intermediate operation returns false.
		
		
		//Creating stream using Stream interface package
		long namesCount = Stream.of("Olivia","Allison","Abinaya","Abigail","Lucifer").filter(s->s.startsWith("A")).count();
		System.out.println(namesCount);
		
		//Print all the names in the List
		
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		//if neccessary to limit results then use limit(max limit)
		
		names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		
	}

}
