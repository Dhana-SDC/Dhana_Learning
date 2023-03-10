package collection4;
import java.util.*;
public class collection408 {
	public class Student implements Comparable {
	    public final Comparator StuRollno = null;
		private String studentname;
	    private int rollno;
	    private int studentage;
	  public Student(int rollno, String studentname, int studentage) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
	    }
	    
	    //getter and setter methods same as the above example 
	   
	    
	    public int compareTo(Student comparestu) {
	        int compareage=((Student)comparestu).getStudentage();
	        /* For Ascending order*/
	        return this.studentage-compareage;

	        /* For Descending order do like this */
	        //return compareage-this.studentage;
	    }

	    int getStudentage() {

			return 0;
		}

		@Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	    }

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}



	 public class ArrayListSort {
	    public void main(String args[]) {
	        
	       ArrayList<Student> arraylist = new ArrayList<Student>();
	    arraylist.add(new Student(222, "Messi", 29));
	    arraylist.add(new Student(333, "Ronaldo", 31));
	    arraylist.add(new Student(111, "john", 23));

	   

	    for(Student str: arraylist){
	   System.out.println(str);
	    }
	     }
	 }
}

