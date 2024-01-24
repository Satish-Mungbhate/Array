package arrayconcept;

public class Array2 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println(a);
		System.out.println(a.length);
		for(int i:a)
		{
			System.out.println(i);
		}
		
		String []st= {"satish","lalit","Bhushan"};
		System.out.println(st.length);
		System.out.println(st[0].length());
		System.out.println(st[1].length());
		System.out.println(st[2].length());
		
		System.out.println("--------------------------");
		int b[][]=new int[8][4];
		b[0][0]=10;
		b[7][3]=20;
		int c=b[0][0]+b[7][3];
		System.out.println(b.length);
		System.out.println(b[0][0]);
		System.out.println(b[7][3]);
		System.out.println(b[0][0]+b[7][3]);
		System.out.println(c);
		System.out.println(b[0].length+b[1].length+b[2].length+b[3].length+b[4].length);
	}

}
