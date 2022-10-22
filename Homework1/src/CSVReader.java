
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	
	
	public String[][] createArray(String csvName) throws IOException {
		
		File csvFile = new File("C:/Users/emirk/Documents/"+csvName+".csv");
		
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		
		int numberOfLines = countLine(csvName);
		int i = 0;
		String[][] count = new String[numberOfLines][];
		String line = "";
		try {
			while((line = br.readLine()) != null) {
				String values[] = line.split(",");
				count[i] = values;
				i++;
				
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		
		}
		
		
		return count;
			
		}
	
	public int countLine(String csvName) {
		
		int lines = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/emirk/Documents/"+csvName+".csv"))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      return lines;
		
	}
}
