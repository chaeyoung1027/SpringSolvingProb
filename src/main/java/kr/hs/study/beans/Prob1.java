package kr.hs.study.beans;
import lombok.Data;


//1. 두 개의 문자를 입력받은 후 순서를 바꿔서 출력해보자.
@Data
public class Prob1 {
    private String data1;
    private String data2;

    public Prob1(String data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }
    public void prData(){
        System.out.println("1번 정답 : " + data2 + data1);
    }
}
