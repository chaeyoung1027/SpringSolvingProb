package kr.hs.study.beans;
//3. 정수 a, b를 입력받아 a>b 면 1, a<b 면 0, 같으면 a==b를 출력하는 프로그램을 작성해보자.
public class Prob3 {
    private int a;
    private int b;

    Prob3(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void prData(){
        System.out.println("3번 문제 정답");
        if(a>b) System.out.println("1");
        else if(a<b) System.out.println("0");
        else System.out.println("a==b");

    }
}
