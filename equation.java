package cn.edu.ccnu.cs_2016212297_;
//import java.util.*;
import java.util.Scanner;//java.util����Scanner�࣬����Ҫʹ�ÿ���̨����ʱ���������
/**
 * ����һԪ���η���ϵ����
 * ����ʵ����������������
 * ���������û��ʵ��������
 *
 */
public class Hello {//public������Ʊ�����.java�ļ��������뵥Ԫ����������ͬ��
//��֮��������޷�������public�࣬��public������Ϊpublic���ṩ֧�֡�
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("����������һԪ���η��̵�����ϵ����");
        double a,b,c,d,x1,x2;
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();
            d=b*b-4*a*c;
            sc.close();
            if(d>0)
            {//��������ͬʵ����
                x1=(-b+Math.sqrt(d))/(2*a);
                x2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("ʵ����1Ϊ��"+x1);
                System.out.println("ʵ����2Ϊ��"+x2);
            }
            else if(d==0)
            {//ֻ��һ��ʵ��
                x1=(-b)/(2*a);
                System.out.println("Ψһʵ����Ϊ��"+x1);
            }
            else{
                System.out.println("��ϵ���µ�һԪ���η���û��ʵ������");
            }


	}

}
