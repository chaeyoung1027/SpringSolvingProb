package kr.hs.study.beans;
//5. 2자리 정수를 입력받아 10의자리와 1의자리가 같은지 여부를 판단하는 프로그램을 작성하시오.
public class Prob5 {
    private int a;

    Prob5(int a){
        this.a = a;
    }
    public void prData(){
        System.out.println("5번 정답");
        if(a/10==a%10) System.out.println("같다");
        else System.out.println("다르다");
    }
}
