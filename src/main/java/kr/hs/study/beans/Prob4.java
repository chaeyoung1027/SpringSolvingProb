package kr.hs.study.beans;

//4. 세 정수 a, b, c가 입력되었을 때 짝수만 출력해보자.
public class Prob4 {
    private int a;
    private int b;
    private int c;
    private int[] arr = {0, 0, 0};
    
    Prob4(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        arr[0] = this.a;
        arr[1] = this.b;
        arr[2] = this.c;
    }
    public void prData(){
        System.out.println("4번 정답");
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
