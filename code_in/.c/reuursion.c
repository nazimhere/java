#include <stdio.h>
void nazim(int n,int sum)
 { 
   if (n==0)
   {printf("%d",sum);
    return ;}
   nazim(n-1,sum+n);

    return;}

    
 int main()
 {
    int n;
    printf("enter a no.");

    scanf("%d",&n);
    nazim(n,0); 

    return 0;
    

 }
