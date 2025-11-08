#include<stdio.h>
#include<stdlib.h>
void showarray(int array[]){
    for(int i=0;i<5;i++){
        printf("%d\t",array[i]);
    }
}
 int main()
 {
     int array[5];
     printf("enter elements");
     for( int i=0;i<5;i++)
    
     {scanf("%d",array[i]);}
     showarray(array);
     return 0;
 }
    
 