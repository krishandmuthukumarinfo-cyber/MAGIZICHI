package institution;

public class Institution {

    String name = "ABC Institute";

    class Student {

        String studentName;
        int rollNo;
        int[] mark;
        double average;
        String grade;

        void addStudent(String name, int roll) {
            studentName = name;
            rollNo = roll;
        }

        void calculateGrade() {

            int total = 0;

            for (int i = 0; i < mark.length; i++) {
                total = total + mark[i];
            }

            average = (double) total / mark.length;

            if (average >= 90) {
                grade = "A";
            }
            else if (average >= 75) {
                grade = "B";
            }
            else if (average >= 50) {
                grade = "C";
            }
            else {
                grade = "Fail";
            }
        }

        void display() {

            System.out.println("\n**********************");
            System.out.println(" STUDENT DETAILS");
            System.out.println("**********************");

            System.out.println("Institution  : " + name);
            System.out.println("Student Name : " + studentName);
            System.out.println("Roll Number  : " + rollNo);

            System.out.println("Marks:");

            for (int i = 0; i < mark.length; i++) {
                System.out.println(
                    "Subject " + (i + 1) + " : " + mark[i]
                );
            }

            System.out.println("Average      : " + average);
            System.out.println("Grade        : " + grade);
        }
    }
}