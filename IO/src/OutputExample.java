import java.io.*;  
public class OutputExample {
	public static void main(String[] args) throws IOException {  
		FileOutputStream file = new FileOutputStream("C:\Users\Navaneetu\Documents\MATLAB\\testout.txt");  
		DataOutputStream data = new DataOutputStream(file);  
		data.writeInt(65);  
		data.flush();  
		data.close();  
		System.out.println("Succcess...");  
	} 

}
