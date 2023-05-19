import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class ThisGetsThingsDone {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(1); //duplicate
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5); //another duplicate

        try {
            Set<Integer> noDuplicates = new HashSet<>(integerList);

            System.out.println("List without duplicates: " + noDuplicates);

            int totalSum = 0;
            for (int value : noDuplicates) {
                totalSum += value;
            }
            System.out.println("Total sum: " + totalSum);

            if (noDuplicates.size() > 0) {
                double average = (double) totalSum /noDuplicates.size();
                System.out.println("Average: " + average);
            }
        } catch (ArithmeticException error) {
            System.out.println("Beep boop. Something broke: " + error.getMessage());
        } finally {
            System.out.println("That is all.");
        }
    }
}
