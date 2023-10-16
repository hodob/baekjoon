

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
		StringBuilder sb = new StringBuilder();


		long num1 = Long.parseLong(br.readLine());
//		long num2 = Long.parseLong(br.readLine());
		long test = Math.floorDiv(num1,4);
		for (int i=0; i<test; i++) {
		sb.append("long ");	
		}
		sb.append("int");
		System.out.println(sb);
		
		

//		System.out.println(a);

//		long num2 = Long.parseLong(br.readLine());
//		
//		if(num1>0) {
//			if(num2>0) 				System.out.println('1');
//			else  System.out.println('4');
//		}else {
//			if(num2>0) 				System.out.println('2');
//			else  System.out.println('3');
//		}
		
//		double f = Double.parseDouble(st.nextToken());
//		double f2= Double.parseDouble(st.nextToken());
//		long number1 = Long.parseLong(st.nextToken());
//		long number2 = Long.parseLong(st.nextToken());
//		long number3 = Long.parseLong(st.nextToken());
//		long result = 0;
		

//		for (int i=1; i<10; i++) {
//			sb.append(number1).append(" * ").append(i).append(" = ").append(number1*i).append('\n');
//		}
//		
//		System.out.println(sb);
//		
//		long result1 = 0;
//		long result2 = 0;
//
//		if(number2+number3>=60) {
//			result1 = number1 + Math.floorDiv((number2+number3),60);
//			result2 =( number2+number3)%60;
//			if(result1 >=24) {
//				
//				
//				sb.append(result1-24).append(' ').append(result2).append('\n');
//			}else
//			{
//				
//			
//				sb.append(result1).append(' ').append(result2).append('\n');
//			}
//		}else {
//
//			sb.append(number1).append(' ').append(number2+number3);
//		}
//		
//		
//		System.out.println(sb);
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
