#include<stdio.h>


 void printarray(int a[],int n){
 for (int i=0;i<n;i++)
 printf("%d\t",a[i]);
}

int main()
{ 
     int a[45];
       printf("enter  no in array");
       for (int i=0;i<=5;i++)
       {scanf("%d",&a[i]);}
    
       printarray(a,5);
       return 0;
}