package arrayconcept;

public class Array1 {

	public static void main(String[] args) {
		int i;
		int a[]=new int [5];
		System.out.println(a);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		String s="20";
		a[2]=Integer.valueOf(s);
		a[3]=(int) 10.5;
		a[4]=50;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
