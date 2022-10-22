import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		CSVReader csvreader = new CSVReader();
		
		String newArray[][] = csvreader.createArray("Customers");
		System.out.println(newArray[1][2]);

	}

}
