import java.util.Random;

public class bubblesort{
    public static void main(String[] args){
        Random rand = new Random();
        int[] array = new int[10];

        for(int i=0;i<array.length;i++){
            array[i] = rand.nextInt(100);
        }

        System.out.println("Array inainte de bubblesort: ");
        printArray(array);

        bubblesort(array);

        System.out.println("Array dupa bubblesort: ");
        printArray(array);
    }

    private static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void bubblesort(int[] array){
        boolean swapped = true;

        while(swapped){
            swapped = false;

            for(int i=0;i<array.length-1 ;i++){
                if(array[i] > array[i+1]){
                    swapped = true;
                    swap(array,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] array, int position1, int position2){
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }
}