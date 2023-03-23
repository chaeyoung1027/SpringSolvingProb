package kr.hs.study.beans;
//2. 정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
public class Prob2 {
    private int a;
    private int b;
    private int c;
    private int sum;

    Prob2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        sum+=(a+b+c);
    }
    public void prData(){
        System.out.println("2번 답");
        System.out.println("합 : "+(sum));
        System.out.println("평균 : "+(sum/3));
    }
}
