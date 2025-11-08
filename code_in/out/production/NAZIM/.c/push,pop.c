#include <stdio.h>
#include <stdlib.h>
struct stack
{
    int size;
    int top;
    int *arr;
};
int isempty(struct stack *sp )
 {
    if 
   (sp->top==-1)

     return 1;
    else 
     return 0;


 }
 int isfull(struct stack*sp)
  {
    if (sp->top==sp->size-1)
    return 1;
    else 
    return 0;


  }
 
 void push(struct stack*sp,int val)

 {
     if (isfull(sp))
     {printf("stack is full");
     }
     else 
     {
        sp->top++;
        sp->arr[sp->top]=val;
printf("stack value is =%d",val);
     }

 }
 
int main(){
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack));
    sp->size = 5;
    sp->top = -1;
    sp->arr = (int *)malloc(sp->size * sizeof(int));
   // isempty(sp);
   // isfull(sp);
    push(sp,9);
    return 0;
}
