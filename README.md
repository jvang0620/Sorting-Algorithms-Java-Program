# Sorting-Algorithms-Java-Program

This program is a modular Java application that allows the user to input an array of integers and choose from various sorting algorithms to sort the array. Here's a breakdown of the program's functionality:

Main Class (SortingAlgorithms):

Takes user input for the size and elements of an array.
Asks the user to choose a sorting algorithm.
Invokes the chosen sorting algorithm to sort the array.
Displays the original and sorted arrays.
Sorting Algorithm Interface (SortingAlgorithm):

Defines a common interface for sorting algorithms (sort method).
Sorting Algorithm Classes:

BubbleSort:

Implements the bubble sort algorithm.
MergeSort:

Implements the merge sort algorithm.
QuickSort:

Implements the quick sort algorithm.
SelectionSort:

Implements the selection sort algorithm.
InsertionSort:

Implements the insertion sort algorithm.
HeapSort:

Implements the heap sort algorithm.
ShellSort:

Implements the shell sort algorithm.
Main Method (main in SortingAlgorithms):

Takes user input for the size and elements of an array.
Asks the user to choose a sorting algorithm.
Instantiates the chosen sorting algorithm class.
Invokes the sort method of the chosen algorithm to sort the array.
Displays the original and sorted arrays.
This structure makes it easy to add or modify sorting algorithms. The user can choose a sorting algorithm at runtime, and the program will apply the selected algorithm to sort the array.
