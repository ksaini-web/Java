package FileoutputnputIO;



import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDEMO {
	
	public static void main(String[]args) {
		
		String path = "Demo.txt";
		
		try(FileWriter writer = new  FileWriter(path)){
	   
			writer.write("hello katik\n");
		
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}

}}
