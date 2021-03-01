
public class Student
{
  private String firstName;
  private String lastName;
  int gradYear; 
  private double gpa;
  private String major; 

  public Student(String firstName, String lastName, int gradYear, double gpa, 
      String major)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gradYear = gradYear;
    this.gpa = gpa;
    this.major = major; 
  }
  
  public void expectedGradYear()
  {
    this.gradYear = gradYear + 1; 
  }
}
