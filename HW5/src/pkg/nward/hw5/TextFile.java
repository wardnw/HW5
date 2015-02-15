package pkg.nward.hw5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

	//string to set the file name
	private String fileName;
	private Scanner scan;
	//private FileReader read;
	
	//working writer although I dont really understand exception handling yet
	public void WriteToFile(String s) throws IOException{
		
		FileWriter f = new FileWriter(fileName);
		f.write(s);
		f.close();
		
	}

	//this is what i'm having problems with
	public String ReadFromFile() throws FileNotFoundException{
		
		scan = new Scanner(new FileReader(fileName));
		String out = scan.next();
		return out;
	}
	
	public void setName(String n){
		fileName = n;
	}
	
	public String getName(){
		return fileName;
	}
	
}
