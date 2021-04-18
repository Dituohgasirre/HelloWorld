package com.qingke.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnFile {

	File file = new File("info.txt");
	List<Info> list = new ArrayList<>();

	public List<Info> returnList() {

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

				Info info = new Info();
				if (in[0].equals("07")) {
					info.setAdressID(in[0]);
					info.setAddress(in[1]);
					info.setSalary(Double.valueOf(in[2]));
					info.setPartaddressID(in[3]);
					list.add(info);
					line = breader.readLine();
				} else {
					info.setAdressID(in[0]);
					info.setAddress(in[1]);
					info.setSalary(Double.valueOf(in[2]));
					info.setPartaddressID(in[3]);
					info.setName(in[4]);
					list.add(info);
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

	public void seeMesage(String ID) {
		returnList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAdressID().equals(ID)) {
				System.out.println(list.get(i));
			}
		}
	}

	public void seeSalary() {
		List<Info> list = new ArrayList<>();
		list = returnList();

		Collections.sort(list, new Info());
		for (Info l : list) {
			System.out.println(l);
		}
	}

	public void storage() {
		list = returnList();
		Collections.sort(list, new Info());
		File file = new File("result.txt");
		BufferedWriter bwriter = null;
		try {
			FileWriter writer = new FileWriter(file);
			bwriter = new BufferedWriter(writer);
			for (Info i : list) {
				bwriter.write(i.toString());
				bwriter.newLine();
			}

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

	public void output(String ID) {
		returnList();
		seeMesage(ID);
		System.out.println("\n\t");

		for (Info l : list) {
			if (l.getPartaddressID().equals(ID)) {
				System.out.println(l);
			}
		}
	}

}
