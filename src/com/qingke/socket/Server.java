package com.qingke.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static int port =2525;
	public static void main(String[] args) {
		try {
			ServerSocket ss =new ServerSocket(port);
			System.out.println("正在连接中..........");
			Socket socket =ss.accept();
			System.out.println("连接成功");

			BufferedReader input =new BufferedReader(new InputStreamReader(socket.getInputStream())) ;
			BufferedWriter output =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())) ;
			String clientMsg;
			String serverMsg;
			Scanner sc =new Scanner(System.in);
			clientMsg = input.readLine();
			while(true){
				System.out.println("客户端说："+clientMsg);
				if(clientMsg.equals("bye")){
					break;
				}
				serverMsg=sc.nextLine();
				output.write(serverMsg+"\r\n");
				output.flush();
				clientMsg =input.readLine();
			}
			sc.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
