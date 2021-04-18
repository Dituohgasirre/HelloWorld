package qingke;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnFile {

	public static void main(String[] args) {
		String folderPath = "C:\\Users\\qingke04\\Desktop\\newFolder";
		creatFolder(folderPath);

		String fileName1 = "C:\\Users\\qingke04\\Desktop\\newFolder\\file1.txt";
		String fileName2 = "C:\\Users\\qingke04\\Desktop\\newFolder\\file2.txt";
		creatFile(fileName1);
		creatFile(fileName2);
		// seeFile(folderPath);
		// delFile(fileName1);
		// delFile(folderPath);
		writeToFile(fileName1);
		// readToFile(fileName1);
		File file = new File(fileName1);
		copyFile(folderPath, file);

	}

	public static void creatFolder(String folderPath) {
		File file = new File(folderPath);
		file.mkdir();
	}

	public static boolean creatFile(String fileName) {
		File file = new File(fileName);
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean isSuccess = false;

		try {
			isSuccess = file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static void seeFile(String folderPath) {
		File file = new File(folderPath);
		for (String filename : file.list()) {
			System.out.println(filename);
		}
	}

	public static void delFile(String foldPath) {
		File file = new File(foldPath);
		for (String fileName : file.list()) {
			File newfile = new File(foldPath + "\\" + fileName);
			newfile.delete();
		}
	}

	public static void writeToFile(String fileName) {
		File file = new File(fileName);
		BufferedWriter bwriter = null;
		try {
			FileWriter writer = new FileWriter(file);
			bwriter = new BufferedWriter(writer);
			bwriter.write("床前明月光");
			bwriter.newLine();
			bwriter.write("疑是地上霜");
			bwriter.newLine();
			bwriter.write("举头望明月");
			bwriter.newLine();
			bwriter.write("低头思故乡");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bwriter != null) {
				try {
					bwriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void readToFile(String fielName) {
		File file = new File(fielName);
		BufferedReader bread = null;
		try {
			FileReader read = new FileReader(file);
			bread = new BufferedReader(read);
			String line = bread.readLine();
			while (line != null) {
				System.out.println(line);
				line = bread.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFile(String folderPath, File fileName) {
		// String str = fileName.getName();
		File file1 = new File(folderPath + "\\(COPY)" + fileName.getName());
		ArrayList<String> list = new ArrayList<>();
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bwriter;
		BufferedReader bread;
		try {
			FileWriter writer = new FileWriter(file1);
			bwriter = new BufferedWriter(writer);
			FileReader read = new FileReader(fileName);
			bread = new BufferedReader(read);
			String line = bread.readLine();
			while (line != null) {
				list.add(line);
				// bwriter.write(line);
				// bwriter.newLine();
				line = bread.readLine();
			}
			Collections.shuffle(list);
			for (String l : list) {
				bwriter.write(l);
				bwriter.newLine();
			}
			bwriter.close();
			bread.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
