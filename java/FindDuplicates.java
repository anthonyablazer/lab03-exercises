
import java.util.*;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<>();

        // Nested loop to find duplicates
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j)) && !duplicates.contains(l.get(i))) {
                    duplicates.add(l.get(i)); // Add to the duplicates list if not already present
                }
            }
        }
        return duplicates;
    }

     //HashMap implementation to find duplicates
    public static List<Integer> findModeUsingHashMap(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (int num : l) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find duplicates (elements with a count greater than 1)
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }




    public static void main(String[] args) {
        // nested loop test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));


	//HashMap test strings
	List<Integer> sample5 = new ArrayList<>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample6 = new ArrayList<>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample7 = new ArrayList<>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample8 = new ArrayList<>(Arrays.asList(3));

        System.out.println("Sample 5 (HashMap): " + findModeUsingHashMap(sample1));
        System.out.println("Sample 6 (HashMap): " + findModeUsingHashMap(sample2));
        System.out.println("Sample 7 (HashMap): " + findModeUsingHashMap(sample3));
        System.out.println("Sample 8 (HashMap): " + findModeUsingHashMap(sample4));
    }

}
