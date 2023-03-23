package kr.hs.study.beans;
//7. 학생 수를 입력 받아 학생 수만큼의 점수를 입력받고, 3명
// 점수대별로 해당 학생 수가 표시되는 프로그램을 작성하시오.
// (단, 점수는 0~100 사이의 값들만 들어온다고 가정한다.)
public class Prob7 {
    private int stu1;
    private int stu2;
    private int stu3;
    private int [] arr = new int [11];

    Prob7(int stu1, int stu2, int stu3){
        this.stu1 = stu1;
        this.stu2 = stu2;
        this.stu3 = stu3;

        arr[stu1/10] ++;
        arr[stu2/10] ++;
        arr[stu3/10] ++;

    }

    public void prData(){
        for(int i = 0; i<arr.length-1; i++){
            System.out.println(i*10+"점대 : "+arr[i]);
        }
        System.out.println("100점 :"+arr[arr.length-1]);
    }
}
