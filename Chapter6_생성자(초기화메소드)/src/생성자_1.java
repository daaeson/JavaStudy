/*
		생성자 (필요 시에만 사용) => 클래스에는 반드시 첨부 (사용하지 않을 때는 컴파일러가 자동으로 첨부하기 때문에 항상 존재)
		-----
		역할 : 인스턴스 초기화 메소드
			  ----------------- 변수에 필요한 데이터를 첨부
			  					멤버변수 초기화를 담당
			  					인스턴스(객체)를 생성할 때 호출되는 메소드	==> new 생성자()
			  					외부 데이터(날씨,뉴스) 혹은 파일, 쿠키(자동 로그인)를 읽을 때 / 오라클 연결할 때 / 시작과 동시에 작업(출력)이 필요할 때
		특징
			1) 클래스명과 동일
			2) 리턴형이 없다
			3) 여러 개를 만들 수 있다
			
		멤버변수 => 인스턴스 변수
		-------------------
		기본 초기값이 자동으로 설정
		---------------------------------> 필요한 데이터값
		class ClassName
		{
			1. 명시적 초기화 int a = 10;
						  a = 100;	========> 값 변경 오류 ==> 메소드 블럭을 만들고 그 안에서 값을 초기화 해야
				클래스 영역에서는 외부 데이터 혹은 파일을 가져와 읽을 수 없음
				외부 데이터, 파일 읽기는 생성자를 통해 초기화 블록
				class 영역에서는 변수 선언과 메소드 선언만 가능하다 (메소드 호출, 값을 대입, 제어문은 사용할 수 없다)
		}
		
		생성자는 경우에 따라 하나 이상, 여러 개를 설정할 수 있다
		생성자에는 생성자를 호출할 수 있다 ==> this()를 사용
		-------------------------
			this => 자신의 객체 => new를 이용하여 메모리가 할당될 때 자동으로 생성
		-------------------------> 멤버메소드에서만 사용이 가능 (인스턴스 변수, 인스턴스 메소드	// static은 this를 사용할 수 없다)
								   지역변수와 멤버변수를 구분할 때 주로 사용한다
		
		1) 생성자 
		*** 클래스는 무조건 생성자가 존재	*** 메소드는 반드시 return 존재	==> 생략할 수 있으나 컴파일러가 자동으로 추가함
			생성자는 여러 개가 존재할 수 있으며 오버로딩이 가능하다
				오버로딩 292 page
				1) 메소드명이 동일해야
				2) 매개변수의 개수 혹은 데이터형이 달라야
				3) 같은 기능을 가지고 있는 경우에는 같은 메소드명으로 처리가 가능
				4) 생성자에서 오버로딩을 사용할 수 있다
					= 멤버변수 초기화 
						 변수 초기화 : 명시적 초기화 ==> 생성자를 사용하지 않는다 // 굳이 생성자를 사용할 필요가?
					  			    사용자로부터 입력값을 받아서 초기화 ==> 매개변수를 가지고 있는 생성자
									random() 을 사용하여 난수로 초기화 ==> 디폴트 생성자
					  *** 웹에서는 기본 생성자가 많이 사용된다 	// 페이지 선출력 후 입력값 받음
					  *** 매개변수를 가지고 있는 생성자가 한 개 이상 존재하면 컴파일러가 기본 생성자를 첨부하지 않는다
					  		class A
					  		{
					  			==> 자동으로 A(){}를 첨부
					  		}
					  		class A
					  		{
					  			A(){}	===> 자동 첨부 대상 X
					  		}
					  		class A
					  		{
					  			A(int a){}	==> 자동 첨부 대상 X
					  		}
					  
				
			기본 생성자 (디폴트 생성자) ==> () 매개변수가 없는 생성자	// 생성자를 만들지 않은 경우 컴파일러가 자동으로 생성하는 형태
			
		
		
*/
public class 생성자_1 {

	int a =10;		// 멤버변수 : 클래스가 가지고 있는 변수		//(static은 공유변수 : this도 static)	// Heap
	생성자_1()		// 생성자
	{
		int a = 20;	// 지역변수 : 블럭 내 생성 ==> 지역변수와 매개변수가 우선순위		// Stack
		System.out.println(a+", "+this.a);							// 멤버변수를 불러온다면 파란색, 지역변수를 불러온다면 밤색
		System.out.println("this = "+this);			// 모든 클래스의 객체는 생성하는 동시에 객체 주소를 갖게 되는데 그 객체 주소를 저장하고 불러오는 것 : this
		
	}
	/*
		A a = new A();
			  new : heap 메모리에 a라는 객체 생성 => a에 지정된 메모리주소를 넘겨준다
			  A(생성자) : 생성된 메모리에 데이터값을 대입하는 역할 (초기화를 담당하는 메소드) => 시작하자마자 바로 동작을 할 수 있도록
	
	*/
	public static void main(String[] args) {
		
		생성자_1 a = new 생성자_1();		
		System.out.println("a = "+a);
		생성자_1 a1 = new 생성자_1();		
		System.out.println("a1 = "+a1);
		/*
			1. 컴파일러가 하는 역할
				1) 메모리 할당 (메모리 배정)
				2) this = a
				3)
		*/
	}
}























