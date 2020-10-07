import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class arrayLists {
    ArrayList<Integer> lottery;
//code will generate 6 different numbers from 1 to 49

    public arrayLists(){
        lottery = new ArrayList<Integer>();
    }

    public void quickPick(int n) {
        //ArrayList<Integer> lottery = new ArrayList<Integer>();

        //loop to create n arrayLists
        for (int c = 0; c < n; c++) {

            //loop to add random integers to my ArrayList
            for (int i = 0; i < 6; i++) {
                Random randomGenerator = new Random();
                int number = randomGenerator.nextInt(49) + 1;

                //checks the ArrayList for duplicates
                while (lottery.contains(number) == true) {
                    number = randomGenerator.nextInt(49) + 1;
                }

                lottery.add(number); //adds number to lottery if it is not a duplicate
            }
            Collections.sort(lottery); //sorts ArrayList numerically
            System.out.println(lottery);
            lottery.clear(); //clears ArrayList for next iteration
        }
    }

        public static void main (String[]args){
            arrayLists trial = new arrayLists();
            Scanner reader = new Scanner(System.in); //reading from system.in
            System.out.println("Enter a number: ");
            int n = reader.nextInt();
            reader.close();
            trial.quickPick(n);


        }
    }


