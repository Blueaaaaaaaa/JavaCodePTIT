public class SinhVien {
  private String SID;
  private String Name;
  private String Email;

  public SinhVien() {
    this.SID = "1234567890";
    this.Name = "John Doe"; 
    this.Email = "john.doe@example.com";
  }
  public void Hello() {
    System.out.println("Hello");
  }
  public void display() {
    System.out.println("SID: " + this.SID);
    System.out.println("Name: " + this.Name);
    System.out.println("Email: " + this.Email); 
  }
}
