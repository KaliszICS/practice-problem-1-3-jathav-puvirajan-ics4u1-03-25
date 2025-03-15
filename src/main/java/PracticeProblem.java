import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String backwardsReadFile(String f) {
		BufferedReader r = null;
		Scanner s = null;
		String output = "";
		try {
			r = new BufferedReader(new FileReader(f));
			while(r.ready()){
				output = (char) r.read() + output;
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return output;
	}
	public static String readFile(String f) {
		BufferedReader r = null;
		Scanner s = null;
		String output = "";
		try {
			r = new BufferedReader(new FileReader(f));
			while(r.ready()){
				output = output + (char) r.read();
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return output;
	}

}
