package MultiThreading;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServerTest {

	@Test
	public void test() {
		 Server s = new Server();
		 System.out.println("[2]");
		 s.initServer();
	}

}
