package tut01;

import java.io.IOException;
import java.util.*;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;


public class PasswordCallback implements CallbackHandler {
	private Map<String, String> passwords = new HashMap<String, String>();
	{
     	passwords.put("admin", "admin123");
      	passwords.put("Alice", "ecilA");
     	passwords.put("abcd", "dcba");
     	passwords.put("dsa", "dsa");
	}

	/**
	 * Here, we attempt to get the password from the private
 	 * alias/passwords map.
 	 */
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		System.out.println("Callback");
		for (int i = 0; i < callbacks.length; i++) {
        	WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];
        	String pass = passwords.get(pc.getIdentifier());
        	if (pass != null) {
             	pc.setPassword(pass);
            	return;
        	}
    	}
	}
}
