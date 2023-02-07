
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=6543789,rev=0,rem;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}*/
		String name = "Manoj";
		int lang = name.length();
		String rev = "";
		for (int i=lang-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

	}

}
