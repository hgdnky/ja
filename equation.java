package cn.edu.ccnu.cs_2016212297_;
//import java.util.*;
import java.util.Scanner;//java.util包，Scanner类，当需要使用控制台输入时调用这个类
/**
 * 输入一元二次方程系数，
 * 若有实数根，求根并输出，
 * 否则输出“没有实数根”。
 *
 */
public class Hello {//public类的名称必须与.java文件（即编译单元）的名称相同。
//包之外的世界无法看见非public类，非public类用来为public类提供支持。
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("请依次输入一元二次方程的三个系数：");
        double a,b,c,d,x1,x2;
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();
            d=b*b-4*a*c;
            sc.close();
            if(d>0)
            {//有两个不同实数根
                x1=(-b+Math.sqrt(d))/(2*a);
                x2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("实数根1为："+x1);
                System.out.println("实数根2为："+x2);
            }
            else if(d==0)
            {//只有一个实根
                x1=(-b)/(2*a);
                System.out.println("唯一实数根为："+x1);
            }
            else{
                System.out.println("该系数下的一元二次方程没有实数根！");
            }


	}

}
