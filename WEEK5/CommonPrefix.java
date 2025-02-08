package WEEK5;

public class CommonPrefix {
	static StringBuilder checkStrings(String[] s) {
		StringBuilder output= new StringBuilder("");
		String c=s[0];
		int count =0;
		int flag=0;
		for(int i=0;i<s[0].length();i++) {
			for(int j=1;j<s.length;j++) {
				if(c.charAt(i)==s[j].charAt(i)) {
				  flag++;
				}
				if(c.charAt(i)!=s[j].charAt(i)) {
					break;
				}
			}
			if(flag==s.length-1) {
				count++;
				flag=0;
			}
			else {
				break;
			}
		}
		
		if (count==0) {
			return output;
		}
		else {
			for(int i=0;i<count;i++) {
				output.append(s[0].charAt(i));
			}
			return output;
		}
		
	}
	public static void main(String[] args) {
		String s[] = {"flower","flow","flight"};
		StringBuilder n=checkStrings(s);
		System.out.println(n);
		
		
	}

}
