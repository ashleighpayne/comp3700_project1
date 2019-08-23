public class Finder {
    
    java.lang.Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            int count = 0; 
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

    java.lang.Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            int count = 0; 
            int currentMin = intArray[0];
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
