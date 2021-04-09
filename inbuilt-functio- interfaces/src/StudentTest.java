import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {

	static ArrayList<JavaStudent> javaStudents;

	public static ArrayList<JavaStudent> main(String[] args) {
		// TODO Auto-generated method stub
		populateStudents();
		Function<JavaStudent,String> f = (j) -> {
			if(j.marks > 80) return "Distinction";
			else if(j.marks > 60) return "first class";
			return "pass class";
		};

		for(JavaStudent s : javaStudents) {

			System.out.println(s.name +"\t"+ f.apply(s));
		}
		public static ArrayList<JavaStudent> populateStudents() {
			javaStudents = new ArrayList<JavaStudent>();
			javaStudents.add(new JavaStudent("abcd",50));
			javaStudents.add(new JavaStudent("efgh",80));
			javaStudents.add(new JavaStudent("ijkl",70));
			javaStudents.add(new JavaStudent("mnop",90));
			javaStudents.add(new JavaStudent("qrst",55));
			return javaStudents;

		}



	}

