package hui;

import java.io.Serializable;

public class User implements Serializable {

	String name;
	String pass;
	
	public void say() {
		main.prnt("Hello " + name);
	}
}
