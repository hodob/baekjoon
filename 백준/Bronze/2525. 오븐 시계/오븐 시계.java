
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

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		long number1 = Long.parseLong(st.nextToken());
		long number2 = Long.parseLong(st.nextToken());
		long number3 = Long.parseLong(br.readLine());
		long result1 = 0;
		long result2 = 0;

		if(number2+number3>=60) {
			result1 = number1 + Math.floorDiv((number2+number3),60);
			result2 = (number2+number3)%60;
			if(result1 >=24) {
				
				
				sb.append(result1-24).append(' ').append(result2).append('\n');
			}else
			{
				
				
				sb.append(result1).append(' ').append(result2).append('\n');
			}
		}else {

			sb.append(number1).append(' ').append(number2+number3);
		}
		
		
		System.out.println(sb);
//		System.out.println(number1+number2+number3);
//		bw.write(String.valueOf(number1+number2+number3));
		
//		bw.newLine();
//		bw.write(String.valueOf(((number1%number3) + (number2%number3))%number3));
//		bw.newLine();
//		bw.write(String.valueOf( (number1*number2)%number3));
//		bw.newLine();
//		bw.write(String.valueOf(((number1%number3) * (number2%number3))%number3));
//		bw.newLine();
//		bw.write(String.valueOf(number1%number2));
//		
//		bw.flush();
//		br.close();
//		bw.close();
	}

}
