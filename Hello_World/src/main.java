
public class main {
	public static void main(String [] args){
		String s="iammadammai";
				if(palin(s)){
					System.out.println("The String is palindrome");
				}
				else{
					System.out.println("The String is not palin");
				}
	}
public static boolean palin(String str){
	if(str!=null){
		int i=0;
			for(int j=str.length()-1;j>i;j--,i++){
				if(str.charAt(i)!=str.charAt(j)){
					return false;
				}
			}
		}
		
     
	return true;
}
}
