#include<stdio.h>
#include<stdlib.h>
void showarray(int array[]){
    for(int i=0;i<74;i++)
       {
        printf("%d",array[i]);
       }}
    void rev(int array[],int n)
    { 
        int t;
        for (int i=0;i<(n/2);i++)
      {
         t=array[i];
         array[i]=array[n-i-1];
         array[n-i-1]=t;
         printf("\n");}
         showarray(array);
      }
      int insersion(int array[],int size,int elment,int index)
    {  ///{ if (size>=cap)
         ///return -1;}
     for(int i=size-1;i>=index;i--)
       { array[i+1]=array[i];}
       array[index]=elment;
       return 1;
    }

 int main()
 {
     int array[100];
    int n,f;
    printf("enter index no. and no to insert ");
    scanf("%d%d",&n,&f);
     printf("enter elements");
     for( int i=0;i<5;i++)
    
     {scanf("%d",&array[i]);}
     showarray(array);
     rev(array,5);
     int size=5,elment=f, index=n;
    insersion(array,size,elment,index);
    size+=1;
    printf("\n");
    showarray(array);
     return 0;
 }
    
 