import java.util.Scanner;

class ArrayCreation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i = 0; i< size; i++){
            marks[i] = sc.nextInt();
        }
        displayMarks(marks);
    }
    static void displayMarks(int[]  marks){
        for(int x : marks){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int findMin(int[] marks){
        int min = Integer.MAX_VALUE;
        for(int x:marks){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
    static int findMax(int[] marks){
        int max = Integer.MIN_VALUE;
        for(int x:marks){
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    static double findAvg(int[] marks){
        int sum = 0;
        for(int x : marks){
            sum += x;
        }
        return (double)sum/marks.length;
    }

    static double[] increaseMarks(int[] marks){
        double[] newMarks = new double[marks.length];
       for(int i = 0; i < marks.length; i++){
            newMarks[i] = marks[i]*1.15;
       }
       return newMarks;
    }

}