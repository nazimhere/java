#include<stdio.h>
#include<stdlib.h>

struct node {
    int data ;
    struct node*next;
};
int linkedlisttraverse(struct node*s)
{
    while(s!=NULL)
    {
        printf("DATA IS %d\n",s->data);
         s=s->next;
    }

}
///void isfull(struct node *f)

int isempty(struct node* top)
{
    if (top ==NULL)
   { return 1;}
    else   
   { return 0;}

}
int isfull(struct node* top)
{
    struct node *s=(struct node *)malloc (sizeof(struct node) );
if (s==NULL)
 return 1;
 else 
 return 0;
}
struct node* push(struct node * top,int data )
{
    if (isfull(top))
{printf("stack is over flow");
}
 else 
  {struct node* d=(struct node *)malloc(sizeof ( struct node) );
 d->data=data;
 d->next=top;
 top=d;}
 printf("wtff");
 return top;
}
struct node* pop(struct node*s)
{
    if(isempty(s))
    {
        printf("stack is empty");
    return s;}
    else{
struct node*a=s;//(struct node*)malloc(sizeof(struct node));

//int x=(s)->data;
    s=s->next;
    //a->data=(s)->data;
    //(struct node*)malloc (sizeof(struct node));
   free(a);}
   return (s);
}
/*struct node*peek(struct node*a,int index)
{
int arrayind=
}*/
int main()
{
    struct node*head=(struct node *)malloc(sizeof (struct node));
    struct node*b=(struct node*)malloc(sizeof (struct node ));
    struct node*c=(struct node *)malloc(sizeof (struct node));
    struct node*d=(struct node*)malloc(sizeof (struct node ));

 head->data=4;
 head->next=b;
 b->data=5;
 b->next=c;
 c->data=6;
 c->next=d;
 d->data=7;
 d->next=NULL;
 head=push(head,67);
 head=push(head,89);
 linkedlisttraverse(head);
 head= push(head,789);
 printf("\n");
linkedlisttraverse(head);
 head=pop(head);

printf("\n");head=pop(head);
head=pop(head);head=pop(head);

 linkedlisttraverse(head);
 return 0;
}