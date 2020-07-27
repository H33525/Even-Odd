import java.io.*;
class ev
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a;
		System.out.println("Enter Any No.");
		a=Integer.parseInt(br.readLine());
		if(a%2==0)
		{
			System.out.println("Even No. is=");
		}
		else
		{
			System.out.println("Odd No. is=");
		}
	}
}