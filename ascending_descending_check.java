import java.util.*;
public class ascending_descending_check{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to be checked: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for(int i =0 ; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isDescending = true;
        boolean isAscending = true;

        for(int i = 0 ; i<numbers.length-1; i++){
            if(numbers[i]<numbers[i+1]){
                isDescending = false;
            }
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }
        
        System.out.print("\n");
        if(isAscending){
            System.out.println("Elements are sorted in ascending order...");
        }
        else if(isDescending){
            System.out.println("Elements are sorted in descending order...");
        }
        else{
            System.out.println("Elements are not sorted....");
        }
    }
}
