public class sortByStrings {

	public static void main(String[] args) {
	String a = "student";
	String b = "tendus";
	
	System.out.print(sorting(a,b));
	}
	
	public static char[] sorting (String a, String b) {
		char [] sequence = b.toCharArray();
		char [] base = a.toCharArray();
		char [] result = new char[a.length()];
		int k = 0;
		for(int i = 0; i < b.length(); i++)
		for(int j = 0; j < a.length(); j++)
			if(base[j] == sequence[i])
		{
			result[k] = base[j];
			k++;
		}
		return result;
	}
}