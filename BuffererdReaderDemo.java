package FileoutputnputIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffererdReaderDemo {
	
	public static void main(String[] args) {
		
		String path = "Demo.txt";
				
				try(BufferedReader br = new BufferedReader(new FileReader(path))) {
					
					
					String Line;
					
					while
						((Line = br.readLine()) != null){
						
						System.out.println(Line);
						
						
						
					}
				}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
