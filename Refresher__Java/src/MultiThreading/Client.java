package MultiThreading;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Client {

    private BufferedReader in;
    private PrintWriter out;
    private String serverAddress = "localhost";
    public Client() {

       
    }

    public String getserverAddress() {
		return serverAddress;
	}

	public void setserverAddress(String serveraddress) {
		this.serverAddress = serveraddress;
	}
    public void connectToServer() throws IOException {

       // Make connection and initialize streams
        Socket socket = new Socket(serverAddress, 9901);
        in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }
    public void initClient() throws Exception {
        
         connectToServer();
    }
    
    public void sendMessage(String message)
    {
    	out.println(message);
    }
    public String readMessage() throws IOException
    {
    	return in.readLine();
    }
}
