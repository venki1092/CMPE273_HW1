package MultiThreading;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test() {
		Client c = new Client();
		 Client c1 = new Client();
		 try {
			c.initClient();
			c1.initClient();
			Thread.sleep(3000);
			c.sendMessage("Hey this is test message");		
			String s1 = c.readMessage();
		 	String s2 = c1.readMessage();
			assertEquals(s1, s2);
		 } catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
