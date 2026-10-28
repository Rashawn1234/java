import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add names to the ArrayList
        students.add("John");
        students.add("Maria");
        students.add("David");
        students.add("Sarah");

        // Use a while loop to display the names
        int index = 0;

        System.out.println("Student List:");

        while (index < students.size()) {
            System.out.println(students.get(index));
            index++;
        }
    }
}
