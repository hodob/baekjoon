

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
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();

		
//
//		String text1 = st.nextToken();
//		sb.append("|\\_/|").append("\n");
//		sb.append("|q p|   /}").append("\n");
//		sb.append("( 0 )\"\"\"\\").append("\n");
//		sb.append("|\"^\"`    |").append("\n");
//		sb.append("||_/=\\\\__|").append("\n");
//
//
//		System.out.println(sb);
//
//
		long num1 = Long.parseLong(br.readLine());
		long num2 = Long.parseLong(br.readLine());
		
		if(num1>0) {
			if(num2>0) 				System.out.println('1');
			else  System.out.println('4');
		}else {
			if(num2>0) 				System.out.println('2');
			else  System.out.println('3');
		}
		
//		double f = Double.parseDouble(st.nextToken());
//		double f2= Double.parseDouble(st.nextToken());
//		long number1 = Long.parseLong(st.nextToken());
//		long number2 = Long.parseLong(st.nextToken());
//		long number3 = Long.parseLong(st.nextToken());
		
		
//		if(number1%4==0){
//			if(number1%400==0 || number1%100!=0)
//			{System.out.println('1');}
//			else {
//				System.out.println('0');
//			}
//		} else{
//			System.out.println('0');
//		} 
//		
		
		
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
