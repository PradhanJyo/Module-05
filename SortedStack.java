

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Stack;

/**
 * This class saves a list of integers to a Stack from smallest to largest.
 * @author Jyotsna Pradhan
 * @version 1.0.0
 * @since week 4 of CSC6301
 */


public class SortedStack {
/**
 * This is main method of SortedStack class
 * @param args default parameter of a main - not used
 */
    public static void main(String[] args){
        //object creation for Integer types with Stack and ArrayList
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> listOfNum = new ArrayList<>();

        Random rand = new Random();

        int numberOfInteger = 10; // defines the number of integers in stack
        int upperBound = 200; //defines max limit to get random integers


        for(int i = 0; i < numberOfInteger; i++){
            listOfNum.add(rand.nextInt(upperBound));
        }

        System.out.print("List of unsorted integer: [" );
        for(int i = 0; i < listOfNum.size(); i++){      //Eg of code reuse
            System.out.print( listOfNum.get(i));        //Eg of code reuse
            if(i < listOfNum.size() - 1){
                    System.out.print(", ");
                }

        }
        System.out.print("]");

        for (int num : listOfNum){
            sortedStack(stack, num);
        }
        System.out.println();
        System.out.println("Sorted stack of integer:" + stack);

    }
/**
 * It inserts the given integer into stack in ascending order.
 * @param list the stack where the integer should be inserted
 * @param num  the integer to be inserted into stack
 */
    public static void sortedStack(Stack<Integer> list, int num){
        ListIterator<Integer> iterator = list.listIterator();  //Eg of code reuse
        while(iterator.hasNext()){  //hasNext() checks if there are numbers to iterate or not
            if(num < iterator.next()){   // Eg of code reuse
                iterator.previous();    //Eg of code reuse
                iterator.add(num);     // Eg of code reuse
                return;
            }
        }
        list.push(num);    //Eg of code reuse
    }

}
