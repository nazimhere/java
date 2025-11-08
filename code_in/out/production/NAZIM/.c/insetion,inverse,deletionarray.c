#include<stdio.h>
 void printarray(int a[],int n)
 {
 for (int i=0;i<n;i++)
 printf("%d\t",a[i]);
}
void revarray(int a[],int n)
{
     for (int i=n-1;i>=0;i--)
     {
         printf("%d\t",a[i]);
     }
}
void insertion(int a[],int element,int size,int index)
{ for (int i=size-1;i>=index;i--)
 {
    a[i+1]=a[i];}
    a[index]=element;
    
}
    void deletion(int a[],int index,int size)
    {
       for (int i=index;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
    }

 int main()
{ 
     int a[45];
     int size=5;
       printf("enter  no in array");
       for (int i=0;i<5;i++)
        
       {scanf("%d",&a[i]);}
    
       printarray(a,5); printf("\n");

       revarray(a,5);
       printf("\n");
      
insertion(a,90,5,size);
size+=1;printf("\n");

printarray(a,size);
deletion(a,4,size);
size-=1;
printf("\n");
printarray(a,size);
return 0;}

