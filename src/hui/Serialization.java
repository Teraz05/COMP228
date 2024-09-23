package hui;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
		//BASIC SERIALIZATION
		//(converts an object into a byte stream
		//Think of it as if you're saving a file with the object's information
		
		
		//DESERIALIZATION = The reverse process of converting a byte stream into an object
		// It's Like loading a saved file
		
		
		//     Steps to Serialize
		//     -------------------------------------
		//    1. Your object class should implement Serializable interface
		//    2. Add import java.io.Serializable;
		//    3. FileOutputStream fileOut = new FIleOutputStream(file path)
		//    4. ObjectOutputStream out =  new ObjectOutputStream(fileOUt);
		//    5. out.writeObject(ObjectName);
		//    6. out.close(); fileOut.close();
		
		User user = new User();
		user.name = "Jhon";
		user.pass = "1234";
		
		FileOutputStream fileOut = new FileOutputStream("Info.ser");
		ObjectOutputStream out =  new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		main.prnt("Object info saved");
	}

}


