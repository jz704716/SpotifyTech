public class decodeStrings {

	public static void main(String[] args) {
		String str = "4[ab2[c]]";
		
		System.out.print(decode(str));
			
	}
	
	public static String decode(String str) {
		String k = "";
		String s = "";
		String r = "";
		int i = 0;
		for(; i < str.length(); i++) {
		while(i < str.length() && str.charAt(i) != '[' || str.charAt(i) != ']') {
			if(Character.isDigit(str.charAt(i))) {
				k += str.charAt(i);
			}else 
				r += str.charAt(i);
		}
		}
		s = repeat(Integer.parseInt(k), r);
		return s;
			
	}
	
	public static String repeat(int n, String r) {
		String result = "";
        for(int i = 0; i < n; i++){
            result += r;
        }
		return result;
	}
}
