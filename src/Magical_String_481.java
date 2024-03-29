
public class Magical_String_481 {
	public static int magicalString(int n) {
		if (n <= 0)
			return 0;
		if (n <= 3)
			return 1;
		StringBuilder s = new StringBuilder("122");
		int ptr = 2;
		int count = 1;

		while (s.length() < n) {
			int num = s.charAt(ptr) - '0';
			char toAdd = (s.charAt(s.length() - 1) == '1') ? '2' : '1';
			
			
			if(toAdd == '1') {
				count += num;
			}
			// Add the next part of the magical string
			s.append(String.valueOf(toAdd).repeat(num));
			ptr++;
		}
		System.out.println(s.toString());
		//Neu add qua n ma phan bi thua la so 1 thi chung ta loai bo so 1 do
		for(int i = n ; i < s.length(); i ++) {
			if(s.charAt(i) == '1') {
				count--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(magicalString(n));
	}
}
