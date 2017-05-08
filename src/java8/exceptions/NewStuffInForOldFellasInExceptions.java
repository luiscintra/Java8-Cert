package java8.exceptions;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewStuffInForOldFellasInExceptions {
	
	public static void main(String[] args) {
		
		// Resources declared in special section () after try keyword.
		// They can be used here when they implement AutoCloseable interface
		try (BufferedReader reader = new BufferedReader(null);) {
			
			String line = reader.readLine();

			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
			Date date = sdf.parse(line);

		// Multi-catch block
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}

}

class UseMyResource {
	
	void use() {
		
		
		try (MyOwnResource resource = new MyOwnResource().open(); ) {
			
			
			resource.doStuff();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

class MyOwnResource implements Closeable {
	
	public MyOwnResource open() throws IOException {
		System.out.println("Opening resource.");
		return this;
	}
	
	public void doStuff() {
		System.out.println("Do something fun.");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closing this shit as I won't use it anymore.");
	}
	
}
