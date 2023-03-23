package kr.hs.study.beans;
//8. 학생 수를 입력 받아 학생 수만큼의 점수를 입력받고, 3
// 최대점수와 최소점수를 출력하는 프로그램을 작성하시오.
public class Prob8 {
    private int stu1;
    private int stu2;
    private int stu3;
    private int stu[] = new int[3];
    private int max = 0;
    private int min = 100;

    Prob8(int stu1, int stu2, int stu3){
        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;

        for(int i = 0; i<stu.length; i++){
            if(max<=stu[i]) max = stu[i];
            if(min>=stu[i]) min = stu[i];
        }
    }
    public void prData(){
        System.out.println("최대점수 : "+max);
        System.out.println("최소점수 : "+min);

    }

}
