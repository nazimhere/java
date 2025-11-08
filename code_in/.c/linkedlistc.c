#include<stdio.h>
#include<stdlib.h>
 struct node
 { int data;
     struct node*next;
     

 }

   insertionindex(struct node*head,int data,int index)
   {
     struct node*p=(struct node *)malloc(sizeof (struct node));
     struct node*q=head;
     int i=0;
     while(i!=index-1)
     {
       q=q->next;
       i++;
     }
     p->data=data;
     p->next=q->next;
     q->next=p;
     return head;
   }         
   struct node*insertioninlast(struct node*head,int data)
   {
     struct node*p=(struct node *)malloc(sizeof (struct node));
     struct node*q=head;


     while(q->next!=NULL)
     {
       q=q->next;
      
       printf("insertion after first \n");
head=insertioninfirst(head,45);
traverse(head);printf("insertion after index \n");

head=insertionindex(head,78,2);   
traverse(head);   
head=insertnode(head,second,89);
printf("insertion after node \n");
traverse(head);

  }
     }
     q->next=p;
     p->data=data;
     p->next=NULL;
     return head;
   }               

         struct node*insertnode(struct node*head,struct node*prevnode,int data)
            {
              struct node*p=(struct node*)malloc(sizeof (struct node));
              p->next=prevnode->next;
              p->data=data;
              prevnode->next=p;
              return head;
            }
         
        
                             
  int main()
  {
    struct node *head =(struct node *)malloc(sizeof (struct node));
    struct node* second=(struct node *)malloc(sizeof (struct node));
    struct node* third=(struct node *)malloc(sizeof (struct node));
//head =(struct node *)malloc(sizeof (struct node));
//second =(struct node *)malloc(sizeof (struct node));
//third =(struct node *)malloc(sizeof (struct node));
head->data=3;
head->next=second;
second->data=4;
second->next=third;
third->data=5;
third->next=NULL;

traverse(head);head=insertnode(head,second,89);
printf("insertion after node \n");
traverse(head);
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
insertioninfirst(struct node*head,int data)
{ 
 struct node*p=(struct node *)malloc(sizeof (struct node));
 p->next= head;
 return 0;
}}