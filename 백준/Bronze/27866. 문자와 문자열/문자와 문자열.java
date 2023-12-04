
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws Exception {
		new Main().soulution();
	}

	private void soulution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		String text = br.readLine();
		int num = Integer.parseInt(br.readLine());
		System.out.println(text.charAt(num-1));

//
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int count =0;
//		ArrayList<Integer> intList = new ArrayList<Integer>();
//		for (int i=1; i<=num1; i++) {
////			for (int j = 0; j<num1-i; j++) {
////				sb.append(" ");
////			}
////			for ( int j = 0; j<i; j++) {
////				sb.append("*");
////			}
////			sb.append("\n");
//
//
//
////			StringTokenizer st = new StringTokenizer(br.readLine());
//			int number1 = Integer.parseInt(st.nextToken());
//			intList.add(number1);
//
////			long number2 = Long.parseLong(st.nextToken());
////			Case #1: 1 + 1 = 2
////			sb.append("Case #").append(i+1).append(": ").append(number1).append(" + ").append(number2)
////			.append(" = ").append((number1+number2)).append("\n");
//
//		}
//		long num2 = Long.parseLong(br.readLine());
//		int lenth = intList.stream().filter(e -> e==num2).collect(Collectors.toList()).size();
//		ArrayList<Double> doubleList = new ArrayList<Double>();
//		int max = intList.stream().mapToInt(Math::toIntExact).max().getAsInt();
//		for(int i = 0; i<intList.size(); i++){
//			doubleList.add(((double) intList.get(i) /max*100));
//
//		}

//		var avg = doubleList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//		var min = longList.stream().mapToInt(Math::toIntExact).min().getAsInt();
//		var max = LongList.stream().mapToInt(Math::toIntExact).max().getAsInt();
//		sb.append(intList.stream().max(Integer::compareTo)).append(" ").append(intList)
//		sb.append(avg);
//		System.out.println(sb);
		
		

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
