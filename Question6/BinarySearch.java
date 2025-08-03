package Question6;

public class BinarySearch {
    public static void BinarySearchIterative(AlumniRecord[] records,int id){
        System.out.println("BINARY SEARCH ITERATIVE");
        //start index is low and end index is the high
        int low=0;
        int high=records.length-1;
        //iterate over the array halving it as long as low and high dont overlap
        while(high>=low){
            //find the mid
            int mid=Math.floorDiv((high+low),2);
            AlumniRecord current=records[mid];
            if(current.getStudentID()==id){
                System.out.println("Found: "+current.getStudentID()+" "+current.getName()+" "+ current.getMajor()+" "+current.getGraduationYear());
                return;
            } else if (current.getStudentID()<id) {
                low=mid+1;
            }
            else high=mid-1;

        }
        System.out.println("Not Found: "+id);

    }
    public static void BinarySearchRecursive(AlumniRecord[] records,int id){
        System.out.println("BINARY SEARCH RECURSIVE");
        int low=0;
        int high=records.length-1;
        bs(records,low,high,id);

    }
    public static void bs(AlumniRecord[] records,int start,int end,int target) {
        if (end >= start) {
            int mid = Math.floorDiv((start + end), 2);
            AlumniRecord current = records[mid];
            if (current.getStudentID() == target) {
                System.out.println("Found: " + current.getStudentID() + " " + current.getName() +" "+ current.getMajor() +" "+ current.getGraduationYear());
                return;
            } else if (current.getStudentID() < target) {
                bs(records, mid + 1, end, target);
                return;
            } else {
                bs(records, start, mid - 1, target);
                return;
            }
        }
        System.out.println("Not found: "+target);
    }
}
