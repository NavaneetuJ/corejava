package collection;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="There is a Girl by the track";
		char arr[]=str.toCharArray();
		String res=" ";
		for(char i:arr) {
			if(res.indexOf(i)== -1) {
				res+=1;
			}
		}
		System.out.println("the string after removing duplicates is" +res);

	}

}
