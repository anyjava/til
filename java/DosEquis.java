public class DosEquis {
	public static void main(String[] args) {
		char x = 'X';
		int  i = 0;
		System.out.print(true  ? x : 0);
		System.out.print(false ? i : x);

		// XX 출력을 기대 하는가? X88 이 출력된다.
		// 3항 연산자에서 2번째 3번째 자료형은 맞춰 주는것이 좋다.
		// 상수일경우 char 로 되지만, int 형 변수 일경우 큰쪽으로 결과의 데이터형이 결정됨
	}
}

