package final_test_dictionary;

import java.io.File;
import java.util.Scanner;

public class ReadDictionary {

	static String path = "text/DictionaryText.txt";
	static File f = new File(path); // Get the file

	public static void main(String[] args) {

		try {
			doesFileExist(path);
		} catch (Exception e) {
			e.printStackTrace();
		}

		printDictionary();

	}

	/*** Method doesFileExist will print if file exists or not ***/
	public static void doesFileExist(String path) {

		// Check if the specified file Exists or not
		try {
			if (f.exists()) {
				System.out.println("Yes, File Exists!");
				System.out.println();
			} else {
				System.out.println("No, File Does not Exist!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of doesFileExist method

	/*** This method will print words and their meanings ***/
	public static void printDictionary() {
		// File f= new File(path);
		try {
			Scanner sc = new Scanner(f);
			String line;
			int i = 1;

			while (sc.hasNextLine()) {
				line = sc.nextLine();

				String[] splitLine = line.split("-");
				String[] meaning = splitLine[1].split(",");
				System.out.println("Word" + i + ": " + splitLine[0].trim());
				i++;

				for (int j = 0; j < meaning.length; j++) {
					System.out.println("Meaning" + (j + 1) + ": " + meaning[j].trim());
				}

				System.out.println();
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end of print dictionary method

}
