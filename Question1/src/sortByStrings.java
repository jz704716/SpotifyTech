public class sortByStrings {

	public static void main(String[] args) {
	String a = "sasfaasafasf";
	String b = "afs";
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

	System.out.print(result);
	}

}