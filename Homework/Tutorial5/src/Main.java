import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(i);
		sc.close();
		
		File file=new File("input.txt");
		try {
			Scanner Fsc=new Scanner(file);
			while(Fsc.hasNextInt()) {
				System.out.print(Fsc.nextInt());
			}

			Fsc.close();3
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File ¾ø¾î");
		}

	}

}
