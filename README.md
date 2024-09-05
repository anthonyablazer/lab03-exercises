# Lab 3 README.md

Find All Duplicates
Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.


Describe Different Approaches to Solving This Problem
Describe the two different ways to figure out all of the duplicate values of a list of integers in english. The first solution is the nested loop solution. 
The second solution is to use a dictionary or a map (similar to the containsPair method we wrote in class. Describe both in as much detail as you can (with no code) 
and describe the trade-offs between the two solutions.

Answer: 	My preference would be to do this problem in Java, and the first way to do this problem is with nested for loops. This implementation has the outer loop 
		pick one element at a time from the list, with the inner loop comparing the chosen element with every other element in the list, counting how many times 
		the current element matches another.
		The second way is using a HashMap, allowing us to track the number of occurences per number in the list. This requires two loops but not nested, with 
		the first loop going through the list once, and for each element, we store it in the dictionary with the element as the key and its count as the value.
		Each time an element is encountered, we either initialize its count, or increment its count. Then, we go through it to find which elements have a count 
		greater than one, collect them in a list, and return the resulting list at the end of the search.
		The biggest trade-offs come down to time complexity and space efficiency. For time complexity, the Hashmap allows for an O(n) complexity due to Hashmaps
		being O(1) and the proceeding loops crating O(n)'s, but a hashmap is a data structure that needs to take up storage space. For nested loops, though 
		they are easier on memory since they do not require a complete data strcuture to be stored, they are worst for time complextiy since embedded loops 
		create a O(n^2) complexity, which creates slower processing as the list gets larger. 




Branching (in English)
We created a copy of the main branch, thus spklit off from said branch, and are making edits that are being saved exclusively to this branch, but do not affect 
or overwrite the files associated with the main branch, leading to the branches looking different from each other.
