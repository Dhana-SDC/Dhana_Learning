package collection4;
import java.util.*;

import collection4.collection408.Student;
public class collection409 {
	 private String studentname;
	    private int rollno;
	    private int studentage;

	    public void Student(int rollno, String studentname, int studentage) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
	    }
	   
	    //Getter and setter methods same as the above examples
	   
	    /*Comparator for sorting the list by Student Name*/
	    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

	 public int compare(Student s1, Student s2) {
	    String StudentName1 = s1.getStudentage().toUpperCase();
	    String StudentName2 = s2.getStudentage().toUpperCase();

	    //ascending order
	    return StudentName1.compareTo(StudentName2);

	    //descending order
	    //return StudentName2.compareTo(StudentName1);
	    }};

	    /*Comparator for sorting the list by roll no*/
	    public static Comparator<Student> StuRollno = new Comparator<Student>() {

	 public int compare(Student s1, Student s2) {

	    int rollno1 = s1.getRollno();
	    int rollno2 = s2.getRollno();

	    /*For ascending order*/
	    return rollno1-rollno2;

	    /*For descending order*/
	    //rollno2-rollno1;
	   }};
	    @Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	    }

	
public static void main(String args[]){
	    ArrayList<Student> arraylist = new ArrayList<Student>();
	    arraylist.add(new Student(111, "John", 30));
	    arraylist.add(new Student(333, "Ronaldo", 31));
	    arraylist.add(new Student(222, "Messi", 29));

	    /*Sorting based on Student Name*/
	    System.out.println("Student Name Sorting:");
	    Collections.sort(arraylist, Student.StuNameComparator);

	    for(Student str: arraylist){
	   System.out.println(str);
	    }

	    /* Sorting on Rollno property*/
	    System.out.println("RollNum Sorting:");
	    Collections.sort(arraylist, Student.StuRollno);
	    for(Student str: arraylist){
	   System.out.println(str);
	    }
	 }
}
