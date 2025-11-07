package lab_11;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StundetRunner {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file1 = new File("roster.csv");
		Scanner scan = new Scanner(file1);
		int msum = 0;
		double mavg;
		int ssum = 0;
		double savg;
		int hsum = 0;
		double havg;
		int esum = 0;
		double eavg;
		int cssum = 0;
		double csavg;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] arr = line.split(",");
			String studentGrades = "student_grades/" + arr[0] + "_grades.txt";
			File file2 = new File(studentGrades);
			Scanner sc = new Scanner(file2);
			sc.nextLine();
			Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			
			s.average();
			msum += s.getMath();
			ssum += s.getScience();
			hsum += s.getHistory();
			esum += s.getEnglish();
			cssum += s.getComputerScience();
			
			

		}
		
		mavg = (double)msum / 16;
		savg = (double)ssum / 16;
		havg = (double)hsum / 16;
		eavg = (double)esum / 16;
		csavg = (double)cssum / 16;
		System.out.println(mavg);
		System.out.println(savg);
		System.out.println(havg);
		System.out.println(eavg);
		System.out.println(csavg);
		
		
		//System.out.println(studentsArr[0].getAverage());
	}
}
