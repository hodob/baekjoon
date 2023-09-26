
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		new Main().soulution();
	}

	private void soulution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
//
//		String text1 = st.nextToken();
//		sb.append(text1);
//		sb.append("??!");
//		System.out.println(sb);
//
//
//		
		
//		double f = Double.parseDouble(st.nextToken());
//		double f2= Double.parseDouble(st.nextToken());
		int number1 = Integer.parseInt(st.nextToken());
//		int number2 = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(number1-543));
//		
//		bw.newLine();
//		bw.write(String.valueOf(number1-number2));
//		bw.newLine();
//		bw.write(String.valueOf(number1*number2));
//		bw.newLine();
//		bw.write(String.valueOf(number1/number2));
//		bw.newLine();
//		bw.write(String.valueOf(number1%number2));
		
		bw.flush();
		br.close();
		bw.close();
	}

}
