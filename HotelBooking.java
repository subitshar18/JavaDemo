/*
 * Hotel Count Occupied

There are 10 floors in a hotel (numbered from 0 to 9). On each floor there are 26 rooms, each marked with a capital letter of the English alphabet (from "A" to "Z").

You are presented with the list of reservations, which consists of N three-character strings. The first character of each string is "+" or "−", which describes whether the room was booked or freed. The second and third characters correspond to the number of the floor and letter of the room, respectively. For example, "+4C" means that room C on the 4th floor has just been booked, and "−0G" means that room G on the 0th floor has been freed.

Your task is to compute the number of rooms that are still booked after processing the entire list. You may assume that the list describes a correct sequence of bookings in chronological order; that is, only free rooms can be booked and only booked rooms can be freed. All rooms are initially free.

Write a function that, given an array A consisting of N strings, representing the reservations list, returns an integer: the number of rooms that are booked at the end.

Examples:

1. Given A = ["+0A", "+9Z", "+4F", "−9Z", "+3G", "+9Z"], the function should return 4. Rooms "0A", "4F", "3G" and "9Z" are booked at the end.

2. Given A = ["+4B", "−4B", "+4B", "−4B"], the function should return 0. There are no rooms booked at the end.

3. Given A = ["+4A", "+5B", "+5A"], the function should return 3. Rooms "4A", "5B" and "5A" are booked at the end.

Assume that:
- N is an integer within the range [1..600];
- each element of array A is a string consisting of three characters: "+" or "−", a digit ("0"-"9"), and an uppercase English letter ("A"-"Z");
- the sequence is correct; that is, every booked room was previously free and every freed room was previously booked.

 */
package com.subi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelBooking {

	public static void main(String[] args) {
		List<String> history = new ArrayList<>(Arrays.asList("+0A", "+9Z", "+4F", "−9Z", "+3G", "+9Z"));
		List<String> survey = new ArrayList<>();
		for (String s : history) {
			if (survey.contains(s.substring(1))) {
				survey.remove(s.substring(1));
			} else {
				survey.add(s.substring(1));
			}
		}
		System.out.println("The Rooms Still Booked :"+survey.size());

	}

}
