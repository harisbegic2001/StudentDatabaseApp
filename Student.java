import java.util.*;
public class Student {

    private String name;
    private String lastName;
    private String id;
    private List<String> courses;
    private int balance;
    private int gradeYear;
    private static int costOfCourse = 600;

public Student(String fname, String lname, int grade, int quantity, List<String> course) {
 name = fname;
 lastName = lname;
 gradeYear = grade;
 balance = quantity;
 courses = course;


}
public String getname() {return name;}

public void setname(String fname) {
    if (fname == " " || fname == null ) {System.out.println("Neispravan unos");}
    else {name = fname;}
}

public String getlastName() {return lastName;}

public void setlastName(String lname) {
    if (lname == " " || lname == null ) {System.out.println("Neispravan unos");}
    else {lastName = lname;}
}
public int getGradeYear() {return gradeYear;}

public void setGradeYear(int grade) {
    if (grade < 1 || grade > 4) {System.out.println("Neispravan unos");}
    else {gradeYear = grade;}
}

public String getid() {return id;}

public void setid(int godina = getGradeYear(), int rand_id = randomGenerator()){
    String s1 = to_string(godina);
    String s2 = to_string(rand_id);
    id = s1 + s2;

}
public int getbalance() {return balance;}

public void setbalance(int quantity) {
    if (quantity < 0 || quantity > 3000) {System.out.println("Prevelika ili nedovoljna količina birajte količinu između 0-3000 KM")}
    else {balance = quantity;}
}
public String getcourses() {return courses;}

public void setcourses(List<String> kurs) {
    courses = kurs;
}
public int randomGenerator(){
    Random r = new Random();
    int numero = r.nextInt(10000);
    return numero;
}

public int dodanKurs(String predmet){
    courses.add(predmet);
    balance -= costOfCourse;

}

public int izbrisanKurs(String predmet){
    courses.remove(predmet);
    balance += costOfCourse;

}


}