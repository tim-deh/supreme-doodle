/**
 * 
 */
package com.ss.training.week2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.time.*;

/**
 * @author nrdxp
 *
 */
public class Week2 {

	/**
	 * @param args
	 */
	private static String[] strings = new String[] { "foo", "bar", "baz", "goober", "sheep", "cuphead", "and" };

	private static List<Integer> ints = Arrays.asList(1, 10, 15, 18, 22, 23, 187);

	private static List<String> evenOdd(List<Integer> ints) {
		return ints.stream().map(i -> {
			if (i % 2 == 0)
				return "e" + Integer.toString(i);
			else
				return "o" + Integer.toString(i);
		}).collect(Collectors.toList());
	}

	private static int eFirst(String s1, String s2) {
		if (s1.contains("e") && s2.contains("e"))
			return 0;
		if (s1.contains("e") && !s2.contains("e"))
			return -1;
		return 1;
	}

	private static List<String> aAndThree(List<String> strings) {
		return strings.stream().filter(string -> string.charAt(0) == 'a' && string.length() == 3).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// short to long
		Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
		Arrays.stream(strings).forEach(System.out::println);

		// long to short
		Arrays.sort(strings, (s1, s2) -> s2.length() - s1.length());
		Arrays.stream(strings).forEach(System.out::println);

		// alphabetical by first letter
		Arrays.sort(strings, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		Arrays.stream(strings).forEach(System.out::println);

		// strings that contain e
		Arrays.sort(strings, (s1, s2) -> eFirst(s1, s2));
		Arrays.stream(strings).forEach(System.out::println);

		// even odd ints
		evenOdd(ints).stream().forEach(System.out::println);
		
		// starts with a and exactly 3 letters
		aAndThree(Arrays.asList(strings)).stream().forEach(System.out::println);;
		
		// Date and time Questions
		// 1. LocalDateTime
		LocalDate time = LocalDate.now();
		// 2. Find previous Thursday of random date
		int i = 1;
		do {
			time.minusDays(i);
			i++;
		} while (time.minusDays(i).getDayOfWeek() != DayOfWeek.THURSDAY);
		
		System.out.println(time.minusDays(i));
		// 3. ZoneId is an identifier for a timezone, while ZoneOffset is difference in time between a ZoneId and UTC
		// 4.
		ZoneId id = ZoneId.of("Europe/Paris");
		ZonedDateTime zoned = ZonedDateTime.of(LocalDateTime.now(), id);
		System.out.println(zoned);
		System.out.println(zoned.toLocalTime());
	}

}
