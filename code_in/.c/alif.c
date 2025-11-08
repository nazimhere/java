#include <stdio.h>
 
    void run () 
    {
 printf("king is heren");
 return ;
 }
int main() {   
    int number;
   
    printf("Enter an integer: ");  
    
    // reads and stores input
    scanf("%d", &number);
    run();
    // displays output
    printf("\nYou entered: \n4%d", number);
    
    return 0;
}
