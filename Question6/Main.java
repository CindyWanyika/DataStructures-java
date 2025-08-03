package Question6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Number of records");
        //get the number of people to be added
        int n=input.nextInt();
        //run a while loop based on the number of records and add the people to the list of records
        AlumniRecord[] records=new AlumniRecord[n];
        int count=0;
        while(count<n){
            System.out.println("Student ID: ");
            int id=input.nextInt();
            System.out.println("Name: ");
            String name=input.next();
            System.out.println("Major: ");
            String major=input.next();
            System.out.println("Graduation Year: ");
            int year=input.nextInt();
            AlumniRecord rec=new AlumniRecord(id,name,major,year);
            records[count]=rec;
            count++;
        }
        //sort the records by the id
        Arrays.sort(records, new Comparator<AlumniRecord>() {
            @Override
            public int compare(AlumniRecord rec1, AlumniRecord rec2) {
                return Integer.compare(rec1.getStudentID(), rec2.getStudentID());
            }
        });

        System.out.println("enter number of searches to make");
        int queries=input.nextInt();

        while (queries>0){
            System.out.println("enter ID to search for: ");
            int target=input.nextInt();
            BinarySearch.BinarySearchIterative(records,target);
            BinarySearch.BinarySearchRecursive(records,target);
            queries--;
        }




    }
}
