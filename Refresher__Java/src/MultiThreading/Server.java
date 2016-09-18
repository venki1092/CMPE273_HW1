package MultiThreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
public class Server {
	
	public void initServer()
	{
        System.out.println("The capitalization server is running.");
        int cIndex = 0;
        ServerSocket listener = null;
        try {
        	listener = new ServerSocket(9901);
            while (true) {
                new ClientHandler(listener.accept(), cIndex++).start();
            }
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
				listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    private static class ClientHandler extends Thread {
        private Socket socket;
        private int cIndex;
        static ArrayList<PrintWriter> clientList = new ArrayList<PrintWriter>(); 
        
        public ClientHandler(Socket socket, int clientNumber) {
            this.socket = socket;
            this.cIndex = clientNumber;
        }
        public void run() {
            PrintWriter out = null;
        	try {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                clientList.add(out);
                while (true) {
                    String input = in.readLine();
                    System.out.println(input + "server");
                    if (input == null || input.equals(".")) {
                        break;
                    }
                    for(int i = 0; i < clientList.size(); i++)
                    {
                    	System.out.println(clientList.size() + " " + i);
                    	clientList.get(i).println(input);
                    }
                    System.out.println("client #"+cIndex + ": " +input.toUpperCase());
                }
            } catch (IOException e) {
            } finally {
                try {
                    socket.close();
                    clientList.remove(out);
                } catch (IOException e) {
                    System.out.println("Problem in closing the socket");
                }
            }
        }
     
    }
}