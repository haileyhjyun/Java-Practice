import java.util.Scanner;


public class max{

	public static int max(int a, int b) {
		return (a>b)? a:b;
	}
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기: ");
		int number = scanner.nextInt();
		int [] array = new int[number];
		
		for(int i=0; i<number; i++) {
			System.out.println("배열에 정수를 하나씩 입력하세요: ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i=0; i<number; i++) {
			result = max(result, array[i]);
		}
		System.out.println("최댓값은 "+ result);
	}
}