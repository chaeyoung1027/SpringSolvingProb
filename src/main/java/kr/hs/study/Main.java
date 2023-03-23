package kr.hs.study;
import kr.hs.study.beans.Prob1;
import kr.hs.study.beans.Prob2;
import kr.hs.study.beans.Prob3;
import kr.hs.study.beans.Prob4;
import kr.hs.study.beans.Prob5;
import kr.hs.study.beans.Prob6;
import kr.hs.study.beans.Prob7;
import kr.hs.study.beans.Prob8;
import kr.hs.study.beans.Prob9;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        //1번
        Prob1 obj1 = ctx.getBean("p1", Prob1.class);
        obj1.prData();
        //2번
        Prob2 obj2 = ctx.getBean("p2", Prob2.class);
        obj2.prData();
        //3번
        Prob3 obj3 = ctx.getBean("p3", Prob3.class);
        obj3.prData();
        //4번
        Prob4 obj4 = ctx.getBean("p4", Prob4.class);
        obj4.prData();
        //5번
        Prob5 obj5 = ctx.getBean("p5", Prob5.class);
        obj5.prData();
        //6번
        Prob6 obj6 = ctx.getBean("p6", Prob6.class);
        obj6.prData();
        //7번
        Prob7 obj7 = ctx.getBean("p7", Prob7.class);
        obj7.prData();
        //8번
        Prob8 obj8 = ctx.getBean("p8", Prob8.class);
        obj8.prData();
        //9번
        Prob9 obj9 = ctx.getBean("p9", Prob9.class);
        obj9.prData();

    }
}