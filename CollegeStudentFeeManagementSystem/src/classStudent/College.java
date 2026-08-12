package classStudent;

public class College{
    
    static final String collegeName = "XYZ Engineering College";
    final int registrationFee;
    static int totalStudents = 0;
    
    College(int registrationFee)
    {
    this.registrationFee = registrationFee;
    totalStudents++;
    }
    
    public static void displayColldegeDetails()
    {
    
        System.out.println("COLLEGE NAME = "+collegeName);
        System.out.println("TOTAL STUDENTS COUNT = "+totalStudents);
        
    }
    
    public void displayStudentFee()
    {
        System.out.println("REGISTRATION FEE = "+registrationFee);
    
    }
    
    public static void main(String[] args) {
        
        College c = new College(25000);
        College cg = new College(30000);
        
        displayColldegeDetails();
        
        c.displayStudentFee();
        cg.displayStudentFee();
        
        
        
        
    }
}
