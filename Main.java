import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   Student stu = new Student();
   System.out.println("Dobrodošli na StudentApp");
    System.out.println("Unesite ime studenta: ");
    stu.setname(in.nextLine());
    System.out.println("Unesite prezime studenta: ");
    stu.setlastName(in.nextline());
    System.out.println("Unesite godinu studenta: ");
    stu.setGradeYear(in.nextInt());
   System.out.println("Unesite Vaš balance studenta: ");
   stu.setbalance(in.nextInt());
    
  }
}