package com.wx;
/**
 * (不对)
 * 作业二
 * @author  王旭
 * @version  [V1.00, 2020年8月6日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Second
{
    public static void main(String[] args)
    {
      int[]  a= {55,88,66,33,22,59};
      int c=0;
      int j;
       for(int i=0;i<a.length;i++) {
           for(j=i+1;j<a.length;j++) {
             c=i;
             if(a[c]>a[j]) {
                 c=j;
             } 
           }
          int temp=a[i];
          a[i]=a[c];
          a[j]=temp;
       } 
       for(int k=0;k<a.length;k++) {
           System.out.printf("a[%d]=%d",k,a[k]);
           System.out.println();
       }
       
       
       
    }
    
}
