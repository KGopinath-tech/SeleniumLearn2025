package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreamsMap {

	public static void main(String[] args) {
		
		List<String> places = Arrays.asList("Taj mahal","Congo","Newzeland","Japan","Amazon","Mahapalipuram","Thailand","Magalaya","Kerala");
		
		//Print palces which ends with 'd' letter and make it Uppercase
		
		places.stream().filter(s->s.endsWith("d")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Print palces which start with 'm' letter with uppercase and sorted
		
		places.stream().filter(s->s.startsWith("M")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));

		
		//Merge two List or ArrayList into one with Stream
		
		List<String> myFavouritePlaces = Arrays.asList("Dubai","German","France","Swizerland");
		Stream<String> combinedStream = Stream.concat(places.stream(), myFavouritePlaces.stream());
		combinedStream.forEach(s->System.out.println(s));
		
		//Check whether word is present or not in List or Array
		
		boolean flag = Stream.of("Taj mahal","Congo","Newzeland","Japan","Amazon","Mahapalipuram","Thailand","Magalaya","Kerala")
		.anyMatch(s->s.equalsIgnoreCase("kerala"));
		Assert.assertTrue(flag);
		System.out.println(flag);
	}

}
