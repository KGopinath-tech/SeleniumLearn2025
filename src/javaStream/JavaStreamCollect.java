package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values= Arrays.asList(1,2,3,2,9,6,4,9,1);
		
		//Print unique value from Array
		
		values.stream().distinct().forEach(s->System.out.println(s));
		
		//Sort the Array and get 3rd index of the array
		
		List<Integer> newValue = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("3rd index value is "+ newValue.get(2));
		
		//Convert Stream back to List( word which ends with a letter with uppercase)
		
		List<String> company= Stream.of("Honda","Yamaha","TVS","Bajaj").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList()); //Can convert to Set and Map as well
		System.out.println(company.get(0)); 

	}

}
