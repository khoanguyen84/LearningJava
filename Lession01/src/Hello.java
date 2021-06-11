import java.lang.System;
import java.util.Scanner;

public class Hello {
    private static final int LearningArray = 1;
    private static final int LearningTwoDimensionalArray = 2;
    private static final int Exits = 5;
    public static void main(String[] args){
        Dog bun = new Dog("Bun", 10, 4);
        System.out.println(bun.showInfo());
        System.out.println(bun.speak());
//        process();
    }

    public  static  int buildMenu(){
        int selected = 0;
        do {
            System.out.println("---------- I'm learning JAVA Core ----------");
            System.out.println("1. Learning Array");
            System.out.println("2. Learning two-dimensional array");
            System.out.println("3. Learning OOP");
            System.out.println("4. Show products");
            System.out.println("5. Exits");

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter number from 1 to 5: ");
            selected = sc.nextInt();
        }
        while (selected < 1 || selected > 5);
        return  selected;
    }

    public  static  void process(){
        int selected = 0;
        do {
            selected = buildMenu();
            clearConsole();
            switch (selected) {
                case LearningArray: {
                    GeneralArray();
                    break;
                }
                case LearningTwoDimensionalArray: {
                    twoDimensionalArray();
                    break;
                }
                case 3: {
//                    int number1 = 5;
//                    int number2 = 7;
//                    System.out.printf("number1: %d, number2: %d \n", number1, number2);
//                    swap(number1, number2);
//                    System.out.printf("number1: %d, number2: %d \n", number1, number2);
                    learningOOP();
                    break;
                }
                case Exits: {
                    System.exit(0);
                    break;
                }
            }
        }
        while (selected != 5);
    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    private static Object resizeArray (Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
        int preserveLength = Math.min(oldSize, newSize);
        if (preserveLength > 0)
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        return newArray;
    }
    public static void GeneralArray(){
        int min = 10;
        int max = 90;
        int size = 0;
        int[] array = new int[0];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        size = sc.nextInt();
        array = (int[])resizeArray(array, size);
        for(int i=0; i< size; i++){
            array[i] = (int)Math.floor(Math.random()*(max - min + 1) + min);
        }
//        for(int i=0; i< size; i++){
//            System.out.printf("%d ", array[i]);
//        }
        for(int value:array){
            System.out.printf("%d ", value);
        }
        System.out.println("");
    }

    public  static  void twoDimensionalArray(){
        int min = 10;
        int max = 90;
        int col = 10;
        int row = 8;
        int[][] array2 = new int[row][col];
        for(int i=0; i< array2.length; i++){
            for(int j=0; j< array2[i].length;j++){
                array2[i][j] = (int)Math.floor(Math.random()*(max - min + 1) + min);
            }
        }
        for(int i=0; i< array2.length; i++){
            for(int value:array2[i]){
                System.out.printf("%d ", value);
            }
            System.out.println("");
        }
    }

    public  static  void swap(int number1, int number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.printf("number1: %d, number2: %d \n", number1, number2);
    }


    public  static  void learningOOP(){
        Dog bun = new Dog("Bun", 10, 4);
        System.out.print(bun.showInfo());
    }
}
