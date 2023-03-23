package kr.hs.study.beans;
//9. 5개의 수를 입력한 후 20~50 사이의 수만 합계와 평균을 구하여 출력하는 프로그램을 작성하시오
public class Prob9 {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num[] = new int[5];
    private int sum;
    private int a;

    Prob9(int num1, int num2, int num3, int num4, int num5){
        num[0] = num1;
        num[1] = num2;
        num[2] = num3;
        num[3] = num4;
        num[4] = num5;

        for(int i = 0; i<num.length; i++) {
            if (num[i] >= 20 && num[i] <= 50) {
                sum+=num[i];
                a++;
            }
        }
    }

    public void prData(){
        System.out.println("9번 정답");
        System.out.println("합 : "+ sum);
        System.out.println("평균 : "+ sum/a);
    }

}
