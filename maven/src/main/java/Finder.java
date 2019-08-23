//Author: Ashleigh Payne
//aap0035
//COMP 3700

public class Finder {
    
    //Method to find the largest number in the array
    java.lang.Integer findMax(int[] intArray) {

        //Logic to handle inappropriate array submissions
        if (intArray == null || intArray.length == 0) {
            return null;
        }

        //Logic to handle appropriate array submissions
        else {
            int count = 1; 
            //Starting with the first number is arbitrary, could start with any number
            //However, this means we can skip the comparison intArray[0], and count starts at 1
            int currentMax = intArray[0];
            while (count < intArray.length) {
                if(intArray[count] > currentMax) {
                    currentMax = intArray[count];
                }
                count++;
            }
            return currentMax;
        }
    }

    //Method to find the smallest number in the array
    java.lang.Integer findMin(int[] intArray) {

        //Logic to handle inappropriate array submissions
        if (intArray == null || intArray.length == 0) {
            return null;
        }

        //Logic to handle appropriate array submissions
        else {
            int count = 1; 
            int currentMin = intArray[0];
            //Starting with the first number is arbitrary, could start with any number
            //However, this means we can skip the comparison intArray[0], and count starts at 1
            while (count < intArray.length) {
                if(intArray[count] < currentMin) {
                    currentMin = intArray[count];
                }
                count++;
            }
            return currentMin;
        }
    }

}
