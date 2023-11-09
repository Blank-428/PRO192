public class Employee {
  String name; int age; double income;
  Employee() {
      
  }
  Employee(String xName, int xAge, double xIncome) {
     name=xName;age=xAge;income=xIncome; 
  }
  @Override
  public String toString() {
    String s = "("+name+"," +age+","+income+") ";
    return(s);
  }
}
