
public class MirrorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		char a='a';
		char b='b';
		char c='c';
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				
				if((i==0)&&(j==2)||(i==1)&&(j==1)||(i==1)&&(j==3)||(i==2)&&(j==0)||(i==2)&&(j==4)||(i==3)&&(j==1)||(i==3)&&(j==3)||(i==4)&&(j==2))
				{
					System.out.print(""+a);
				}
				else if((i==2)&&(j==1)||(i==1)&&(j==2)||(i==2)&&(j==3)||(i==3)&&(j==2))
				{
					System.out.print(""+b);
				}
				
				else if((i==2)&&(j==2))
				{
					System.out.print(""+c);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
