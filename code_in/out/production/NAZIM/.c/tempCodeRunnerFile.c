#include<stdio.h>
#include<stdlib.h>
 
  struct node 
  {
int data;
 struct node*next;
  };

void traverse(struct node*p)
{ while (p!=NULL)
   {
    printf("element=%d\n",p->data);
    p=p->next;
   }

}
void insertioninfirst(struct node*head,int data)
{ 
 struct node*p=(struct node *)malloc(sizeof (struct node));
 p->data=data;
 p->next= head;
 head=p;
return p;
