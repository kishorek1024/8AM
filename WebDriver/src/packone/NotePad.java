package packone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePad {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD8\\OP.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.append("Selenium");
		bw.newLine();
		bw.write("Kishore");
		
		/*bw.write("Kishore Kumar");*/
		bw.close();
		
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD8\\123.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null){
			System.out.println(s);
		}
*/
	}

}
