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
{
 return 1;}
    else 
     return 0;
     }
 int isfull(struct stack*sp)
  {
    if (sp->top==sp->size-1)
    return 1;
    else 
    return 0;}
 
 int  push(struct stack*s,int val)

 {
     if (isfull(s))
     {printf("stack is full");
     return 1;}
     else 
     {
        s->top++;
        s->arr[s->top]=val;
        printf ("stack value is =%d\n",val);

     }
     return 0 ;

 }
 void pop(struct stack *sp)
 {
    if (isempty(sp))
    printf ("stack is under flow can not popped  more ");
    else 
    {
        int val=sp->arr[sp->top];
        sp->top--;
        printf("stack removed is =%d\n",val);
    }
}
 
 int  peek(struct stack *p,int i )
 { int arrayind =p->top-i+1;
    if(arrayind < 0)
    {
 printf ("not valid position for the stack \n");
 return -1;}

    
    else 
    {return p->arr[arrayind]; }
 }
int main(){
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack));
    sp->size = 6;
    sp->top = -1;
    sp->arr = (int *)malloc(sp->size * sizeof(int));
    isempty(sp);
    isfull(sp);
    push(sp,9);
    push(sp,7);
    push(sp,90);
    push(sp,93);
    push(sp,48);
     for (int i=1;i<=sp->top+1;i++)
    {printf ("\nthe data and element %d  is=%d",i,peek(sp,i));}

    //pop(sp);
  //  pop(sp);
    return 0; 
}
