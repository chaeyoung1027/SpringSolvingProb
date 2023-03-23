package kr.hs.study.beans;
//6. 세 변의 길이를 입력받아 삼각형이 가능한지 여부를 판단하는 프로그램을 작성하시오.
//   판단조건 : 삼각형의 조건 중에 두 변의 길이의 합이 나머지 한 변의 길이보다 길다.
public class Prob6 {
    private int a;
    private int b;
    private int c;
    private int max;
    private int sum;

    Prob6(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        sum+=a+b+c;

        if(a>=b && a>=c){
            max = a;
        } else if (b>=c) {
            max = b;
        }else max = c;
    }

    public void prData(){
        System.out.println("6번 정답");
        if(max<sum-max) System.out.println("가능");
        else System.out.println("불가능");
    }

}
