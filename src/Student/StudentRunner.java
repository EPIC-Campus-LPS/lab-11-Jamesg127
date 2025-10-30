package Student;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("roster.csv");
		Scanner sc = new Scanner(file);
		String[] a = new String[16];
		while (sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
			for(int i = 0; i < 16; i++) {
				a[i] = sc.nextLine();
				System.out.println(a[i]);
				
			}
		
			
		}
	}

}
