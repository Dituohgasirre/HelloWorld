package com.qingke.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("localhost",2525);
			BufferedReader input =new BufferedReader(new InputStreamReader(s.getInputStream())) ;
			BufferedWriter output =new BufferedWriter(new OutputStreamWriter(s.getOutputStream())) ;
			String clientMsg;
			String serverMsg;
			Scanner sc =new Scanner(System.in);
			clientMsg=sc.nextLine();
			while(true){
				output.write(clientMsg+"\r\n");
				output.flush();
				if("bye".equals(clientMsg)){
					break;
				}
				serverMsg =input.readLine();
				System.out.println("·þÎñ¶ËËµ£º"+serverMsg);
				clientMsg=sc.nextLine();
				
				
			}
			sc.close();
			s.close();
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
	}

}
