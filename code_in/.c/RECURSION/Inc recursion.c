#include<stdio.h>
void increasing (int a,int p)
{{ if (a>p)
   return ;
   }
   {printf("%d\n",p);
    inc(p-1);
    return;
    }}

   int main()

  {int p;
     printf("enter a noo.") ;

    scanf("%d",&p);
 increasing(1,p);
 return 0;}