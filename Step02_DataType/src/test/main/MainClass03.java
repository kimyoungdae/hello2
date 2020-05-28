package test.main;

public class MainClass03 {
	/*
	 * [ Java 기본 데이터 type]
	 * 
	 * 2. 논리형 (boolean)
	 * 
	 * -true, false 두가지 값중 하나이다
	 * -true, false 를 직접 쓰거나 비교여난 혹은 논리 연산의 결과로 얻어낼수 있다
	 * -참과 거짓을 나타내는 데이터 type
	 * 
	 */
	//논리형 변수 선언과 동시에 값 대입하기
	public static void main(String[] args) {
	boolean isRun=true;
	if(isRun) {
		System.out.println("달려요");
	}
	
	//비교연산의 결과로 얻어진 boolean 값 담기
	boolean isGreater=10>1;
	//논리연산의 결과로 얻어진 boolean 값 담기
	boolean result=true || false;
	
	//한번 선언한 변수는 다시 선언할수 없다
	//boolean result=false;
	result=false; //변수에 다른값을 대입 할수 있다(동일한 type 인경우)
	//다른type값은 변수에 담을수 없다
	//result=10;
	}
}
