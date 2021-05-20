// Simple class to hold student information
 public class Student {
   
   private String name;
   private double gpa;
   public Student() {
      this.name = "Louie";
      this.gpa = 1.0;
   }
    
   public void setName(String n) {
       //FIXME: assign parameter to instance field  
       this.name = n;
   }
   
   public void setGPA(double g) {
      this.gpa = g;
   }
   public String getName() {
      return this.name;  
   }
   public double getGPA() {
      return this.gpa;  
   }
   
   public static void main(String[] args) {
      Student student = new Student();
      System.out.println(student.getName() + "/" + student.getGPA());
      student.setName("Felix");
      student.setGPA(3.7);
      System.out.println(student.getName() + "/" + student.getGPA());
   }
}
