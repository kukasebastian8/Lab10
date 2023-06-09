/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
//testPositive();
//testNegative();
//testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){

/*int[] arr = new int[6];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[6];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
*/
int[] arr = new int[] {8, 9, 7, 10, 2};
int[] Sortedarr = new int[] {2, 7, 8, 9, 10};
SelectionSort sort = new SelectionSort();
sort.basicSelectionSort(arr);
/** add tests to check for this unit test **/

Assert.assertArrayEquals("Invalid positive test", Sortedarr , arr);
}

public void testNegative(){
	/*
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = -9;
	arr[2] = -7;
	arr[3] = -10;
	arr[4] = -2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -10;
	Sortedarr[1] = -9;
	Sortedarr[2] = -8;
	Sortedarr[3] = -7;
	Sortedarr[4] = -2;
	*/
	int[] arr = new int[] {-8, -9, -7, -10, -2};
	int[] Sortedarr = new int[] {-10, -9, -8, -7, -2};
	SelectionSort sort = new SelectionSort();
	sort.basicSelectionSort(arr);
/** Test data contains negative values only **/
	Assert.assertArrayEquals("Invalid negative test", Sortedarr , arr);
}
public void testMixed(){
	/*
	int[] arr = new int[6];
	arr[0] = -8;
	arr[1] = 9;
	arr[2] = -7;
	arr[3] = 10;
	arr[4] = -2;
	arr[5] = 0;
	int[] Sortedarr = new int[6];
	Sortedarr[0] = -8;
	Sortedarr[1] = -7;
	Sortedarr[2] = -2;
	Sortedarr[3] = 0;
	Sortedarr[4] = 9;
	Sortedarr[5] = 10;
	*/
	int[] arr = new int[] {-8, 9, -7, 10, -2, 0};
	int[] Sortedarr = new int[] {-8, -7, -2, 0, 9, 10};
	SelectionSort sort = new SelectionSort();
	sort.basicSelectionSort(arr);
/** Test data contains with both positive, negative and zeros **/
	Assert.assertArrayEquals("Invalid mixed test", Sortedarr , arr);
}
public void testDuplicates(){
	/*
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = 7;
	arr[2] = 8;
	arr[3] = -2;
	arr[4] = -2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -2;
	Sortedarr[1] = -2;
	Sortedarr[2] = 7;
	Sortedarr[3] = 8;
	Sortedarr[4] = 8;
	*/
/** Test data contains duplicates **/
	int[] arr = new int[] {8, 7, 8, -2, -2};
	int[] Sortedarr = new int[] {-2, -2, 7, 8, 8};
	SelectionSort sort = new SelectionSort();
	sort.basicSelectionSort(arr);
	Assert.assertArrayEquals("Invalid duplicate test", Sortedarr , arr);
}
}
