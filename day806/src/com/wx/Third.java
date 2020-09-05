package com.wx;

import java.util.Scanner;

/**
 * 作业三
 * @author 王旭
 * @version [V1.00, 2020年8月6日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class Third
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生数：");
        int num = scanner.nextInt();
        int[] a = new int[num];
        String[] b = new String[num];
        for (int i = 0; i <= num - 1; i++)
        {
            System.out.print("请输入学生姓名：");
            b[i] = scanner.next();
            System.out.print("请输入学生成绩：");
            a[i] = scanner.nextInt();
            continue;
        }
        boolean Y = false;
        do
        {
            for (int i = 0; i <= num - 1; i++)
            {
                if (a[i] < 60)
                {
                    System.out.printf("不及格的学生叫%s,分数是%d", b[i], a[i]);
                    System.out.println();
                    continue;
                }
                Y = true;
            }
        } while (Y);
        if (Y == true)
            System.out.println("无不及格学生");
        
        int max = a[0];
        String name = b[0];
        for (int i = 1; i <= num - 1; i++)
        {
            if (a[0] < a[i])
            {
                max = a[i];
                name = b[i];
                continue;
            }
        }
        System.out.printf("成绩最高的学生是%s,分数是%d", name, max);
        System.out.println();
        boolean X = false;
        System.out.println("请输入查找的学生姓名：");
        String ID = scanner.next();
        do
        {
            for (int i = 0; i <= num - 1; i++)
            {
                if (ID.equals(b[i]))
                {
                    X = true;
                    System.out.println("该学生的成绩是：" + a[i]);
                }
                else
                {
                    continue;
                }
            }
            break;
        } while (X);
        if (X == false)
        {
            System.out.println("查无此人");
        }
        scanner.close();
    }
    
}
