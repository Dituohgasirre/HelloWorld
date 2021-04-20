package com.qingke.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class ReadFile {
	
	
	
	public static List<Person> returnList(){
		File file =new File("info.txt");
		List<Person> list =new ArrayList<>();
		BufferedReader breader = null;
		try {
			FileReader read = new FileReader(file);
			breader = new BufferedReader(read);
			String line = breader.readLine();
			while (line != null) {
				if (line.contains("#")) {
					line = breader.readLine();
				}
				String[] in = line.split(",");

				Person per = new Person();
				if (in[0].equals("07")) {
					per.setId(in[0]);
					per.setArea(in[1]);
					per.setIncome(Double.valueOf(in[2]));
					per.setOfarea(in[3]);
					list.add(per);
					line = breader.readLine();
				} else {
					per.setId(in[0]);
					per.setArea(in[1]);
					per.setIncome(Double.valueOf(in[2]));
					per.setOfarea(in[3]);
					per.setBoss(in[4]);
					list.add(per);
					line = breader.readLine();
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (breader != null) {
				try {
					breader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return list;
	}
	
	
}
