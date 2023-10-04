// written by Stephen D 
// Done for Software Devolopment
// This is for arrays

public class Sorting {
//Swap function by kimg@techtrepacademy.com
//this function will take a array of ints and the lower index as an int and then return the array with the two items swapped.
static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
    int temp;
    temp=arrayToSwap[lowerIndex];
    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
    arrayToSwap[lowerIndex+1]=temp;
    return arrayToSwap;
    }


    public static void main(String[] args) { 
// this creates the array.
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
    for (int t=0;t<arrayToSort.length;t++) {

     System.out.println(arrayToSort[t]);
    }
//this will do the sorting, and print out it non-sorted and sorted
    for (int t=0;t<arrayToSort.length-1;t++) {
       for (int i=0;i<arrayToSort.length-1;i++) {
         if  (arrayToSort[i]>arrayToSort[i+1]){
         arrayToSort=swapTwoArrayElements(arrayToSort, i); 
         }  
    }
}
for (int t=0;t<arrayToSort.length;t++) {

     System.out.println(arrayToSort[t]);
    }
}
}