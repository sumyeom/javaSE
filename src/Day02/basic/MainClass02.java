package Day02.basic;
/*
 * [[ 기본 자료형]]
 * 1. 논리형(boolean)
 * 
 * - 선언 방법
 * 		boolean 변수명;
 * 
 * - 가질 수 있는 범위 : true, false 두 가지 값 저장 가능.
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 논리형 지역 변수 선언하기
		boolean isWait;
		//선언한 변수에 값 대입하기
		isWait = true;
		//저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값 : " + isWait);
		
		// 지역 변수는 일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun = false; // 변수 선언과 동시에 값 대임
		
		// 변수에 저장된 값을 실행 도중에 바꿀 수 있다.
		isWait = false;
		canRun = true;
		
		System.out.println("isWait : " + isWait);
		System.out.println("canRun : " + canRun);
		
		// 추석 처리 Ctrl + /
		boolean isArea = false; //초기화
		System.out.println(isArea);
	}
}
