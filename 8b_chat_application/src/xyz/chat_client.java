package xyz;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class chat_client 
{

	public static void main(String[] args) 
	{
		try 
		{
			Socket s = new Socket("localhost", 6666);
			Scanner scan = new Scanner(System.in);
			while(true)
			{
				DataInputStream in = new DataInputStream(s.getInputStream());
				String rec =(String)in.readUTF();
				System.out.println("server said "+rec);
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				System.out.println("enter text");
				String send = scan.nextLine();
				out.writeUTF(send);
			}
		}
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
