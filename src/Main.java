import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] num;
		int v, t;
		while ((line = in.readLine()) != null)
		{
			num = line.split(" ");
			v = Integer.parseInt(num[0]);
			t = Integer.parseInt(num[1]);
			System.out.println(calcDistance(v,t));
		}
	}
	
	public static int calcDistance(int v, int t){
		return v*t*2;
	}
}
