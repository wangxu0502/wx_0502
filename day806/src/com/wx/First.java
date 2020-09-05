package com.wx;

import java.util.Scanner;

/**
 * 作业一
 * @author 王旭
 * @version [V1.00, 2020年8月6日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class First
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int m = scanner.nextInt();
        System.out.print("请输入第二个数:");
        int n = scanner.nextInt();
        int max = 1;
        int min = 1;
        int temp = 0;
        while (m > n)//取小值减少循环
        {
            temp = n;
            n = m;
            m = temp;
        }
        for (int i = 1; i < m; i++)
        {
            if (m % i == 0 && n % i == 0)//计算最大公倍数
            {
                max = i;
                continue;
            }
            min = m * n / max;//计算最小公约数
        }
        System.out.println("最小公倍数" + min);
        System.out.print("最大公约数是" + max);
        scanner.close();
    }
    
}
