package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		try {
			FileOutputStream fos= new FileOutputStream("dxc.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);

			oos.writeObject(d1);
		}catch(IOException e) { e.printStackTrace();

		}

	
	FileInputStream fis;
	try {
		fis = new FileInputStream("dxc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d2.i +"\t"+ d2.j);

	} catch (FileNotFoundException e) {			e.printStackTrace();} 
	catch (IOException e) {			e.printStackTrace();	} 
	catch (ClassNotFoundException e) {			e.printStackTrace();		}

}
}


