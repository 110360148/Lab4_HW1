import java.io.*;

public class P8 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		if(num1 == 1)
		    System.out.println("輸入的是1");
		    System.out.println("選擇的是1");

		System.out.println("結束處理");
    }
}
