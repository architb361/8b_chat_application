package xyz;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class chat_server 
{

	public static void main(String[] args) 
	{
		System.out.println("Server says wating for connection");
		try 
		{
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			System.out.println("Server says connected");
			System.out.println("enter text");
			Scanner scan = new Scanner(System.in);
			while(true)
			{
				System.out.println("enter text");
				String send=scan.nextLine();
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				out.writeUTF(send);
				DataInputStream in = new DataInputStream(s.getInputStream());
				String rec=(String)in.readUTF();
				System.out.println("client says "+rec);
				
			}
			
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
