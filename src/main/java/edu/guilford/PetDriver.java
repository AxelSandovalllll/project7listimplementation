package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class PetDriver {

        private static final int elements = 10000;
        private static final int randElement = 10000;

        public static void main(String[] args) {

                // create an array arrayList of pets
                ArrayList<Pet> arrayList = new ArrayList<>();

                // create a LinkedList of pets
                LinkedList<Pet> linkedList = new LinkedList<>();

                // Instantiate objects and add them to the array arrayList
                // time it
                long startTime = System.nanoTime();
                for (int i = 0; i < elements; i++) {
                        // Add the new object to the arrayList until elements is reached
                        arrayList.add(new Pet());
                }
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("\nIt took " + String.format("%.2f", (duration) / 1.e6)
                                + " milliseconds to create the arrayList of " + elements + " elements.\n");

                // instantiate objects and add them to the linkedList
                // time it
                startTime = System.nanoTime();
                for (int i = 0; i < elements; i++) {
                        // Add the new object to the linkedList until elements is reached
                        linkedList.add(new Pet());
                }
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                System.out.println("It took " + String.format("%.2f", (duration) / 1.e6)
                                + " milliseconds to create the linkedList of " + elements + " elements.\n");
                // System.out.println("\nThe Pet LinkedList is: \n\n" + linkedList);

                // sort the random arrayList of pets by age using the Comparable interface
                // and time how long it takes
                startTime = System.nanoTime();
                Collections.sort(arrayList);
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                // System.out.println("\nThe Pet arrayList in order by age is: \n\n" +
                // arrayList);
                System.out.println("\nIt took " + String.format("%.2f", (duration) / 1.e6)
                                + " milliseconds to sort the arrayList of " + elements + " elements by age.");

                // sort the random LinkedList of pets by name using the Comparator interface
                // and time how long it takes
                startTime = System.nanoTime();
                Collections.sort(linkedList);
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                // System.out.println("\nThe Pet LinkedList in order by age is: \n\n" +
                // linkedList);
                System.out.println("\nIt took " + String.format("%.2f", (duration) / 1.e6)
                                + " milliseconds to sort the linkedList of " + elements + " elements by age.\n");

                // shuffle the arrayList
                // time how long it takes
                startTime = System.nanoTime();
                Collections.shuffle(arrayList);
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                // System.out.println("\nThe Pet arrayList in random order is: \n\n" +
                // arrayList);
                System.out.println("\nIt took " + String.format("%.2f", (duration) / 1.e6)
                                + " milliseconds to shuffle the arrayList of " + elements + " elements \n");

                // shuffle the linkedList
                // time how long it takes
                startTime = System.nanoTime();
                Collections.shuffle(linkedList);
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                // System.out.println("\nThe Pet linkedList in random order is: \n\n" +
                // linkedList);
                System.out.println("It took " + String.format("%.2f", (duration) / 1.e6)
                                + " milliseconds to shuffle the linkedList of " + elements + " elements.\n");

                // Get a random element from the arrayList 1,000,000 times
                Random random = new Random();
                startTime = System.nanoTime();
                for (int i = 0; i < randElement; i++) {
                        int randomIndex = random.nextInt(arrayList.size()); // Generate a random index number
                        // time how long it takes
                        Pet randomPet = arrayList.get(randomIndex); // Get the random element from the arrayList
                        // print out the random pet
                        // System.out.println(randomPet);
                        endTime = System.nanoTime();
                }
                duration = (endTime - startTime);
                System.out.println(
                                "\nIt took " + String.format("%.2f", (duration) / 1.e6)
                                                + " milliseconds to generate " + randElement
                                                + " random elements from the arrayList.\n");

                // Get a random element from the linkedList 1,000,000 times
                startTime = System.nanoTime();
                for (int i = 0; i < randElement; i++) {
                        int randomIndex = random.nextInt(linkedList.size()); // Generate a random index number
                        // time how long it takes
                        Pet randomPet = linkedList.get(randomIndex); // Get the random element from the arrayList
                        // print out the random pet
                        // System.out.println(randomPet);
                        endTime = System.nanoTime();
                }
                duration = (endTime - startTime);
                System.out.println(
                                "It took " + String.format("%.2f", (duration) / 1.e6)
                                                + " milliseconds to generate " + randElement
                                                + " random elements from the linkedList.\n");

                // sequentially get each pet using a loop and print it out
                // time it
                startTime = System.nanoTime();
                for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i);
                        // System.out.println(arrayList.get(i));
                }
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                System.out.println(
                                "\nIt took " + String.format("%.2f", (duration) / 1.e6)
                                                + " milliseconds to sequentially get " + elements
                                                + " elements from the arrayList.\n");

                // sequentially get each pet using a loop and print it out for the linkedList
                // time it
                startTime = System.nanoTime();
                for (int i = 0; i < linkedList.size(); i++) {
                        linkedList.get(i);
                        // System.out.println(linkedList.get(i));
                }
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                System.out.println(
                                "It took " + String.format("%.2f", (duration) / 1.e6)
                                                + " milliseconds to sequentially get " + elements
                                                + " elements from the linkedList.\n");

        }

}
