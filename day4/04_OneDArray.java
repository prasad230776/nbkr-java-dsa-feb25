/*
 * Write a program to read and store n number of student marks in an integer array. 
 * Write methods to display the marks, find the min, max, avg marks.
 * Write a method that returns new marks array by increasing the marks by 15%.
 */

import java.util.Scanner;

class OneDArray{
    // display method
    static void display(int[] marks){
        for(int x: marks){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // finding min
    static int findMin(int[] marks){
        int min = Integer.MAX_VALUE;
        for(int x : marks){
            if(x < min){
                min = x;
            }
        }
        return min;
    }

    // finding max
    static int findMax(int[] marks){
        int max = Integer.MIN_VALUE;
        for(int x : marks){
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    //finding second max
    static int findSecondmax(int[] marks){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int x : marks){
            if( x > max){
                secondMax = max;
                max = x; 
            }else if(secondMax < x){
                secondMax = x;
            }
        }
        return secondMax;
    }

    //finding average
    static double findAvg(int[] marks){
        int sum = 0;
        for(int x : marks){
            sum += x;
        }
        return (double)sum/marks.length;
    }

    //increase marks by 15 %
    static int[] increaseMarks(int[] marks){
        int nm[] = new int[marks.length];
        for(int i = 0; i<marks.length; i++){
            nm[i] = (int)Math.round(marks[i]*1.15); 
        }
        return nm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();    
        }
        display(marks);

        int minMarks = findMin(marks);
        System.out.println("Min-marks: " + minMarks);

        int maxMarks = findMax( marks);
        System.out.println("Max-marks: " +maxMarks);

        int secondMax = findSecondmax(marks);
        System.out.println("Second max-marks: " +secondMax);

        System.out.printf("Avg marks: %.2f\n",findAvg(marks));

        int[] newmarks = increaseMarks(marks);
        System.out.println("new marks");
        display(newmarks)

    }
}