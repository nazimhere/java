#include<stdio.h>
#include<stdlib.h>

struct myarray {
    int total_size;  // Specify the data type for total_size
    int used_size;   // Specify the data type for used_size
    int *ptr;
};

void createarray(struct myarray *a, int tsize, int usize) {
    a->total_size = tsize;
    a->used_size = usize;
    a->ptr = (int*)malloc(tsize * sizeof(int));  // Allocate memory for the array
}

void show(struct myarray *a) {
    for (int i = 0; i < a->used_size; i++) {
        printf("%d\n", a->ptr[i]);  // Print the value at the ith index
    }
}

void setval(struct myarray *a) {
    int n;
    for (int i = 0; i < a->used_size; i++) {
        printf("Enter element %d: ", i);  // Correct the print statement
        scanf("%d", &n);  // Read the integer value
        a->ptr[i] = n;  // Store the value in the array
    }
}

int main() {
    struct myarray marks;  // Create a structure of type myarray
    createarray(&marks, 10, 2);  // Create an array of size 10, with 2 elements initialized
    setval(&marks);  // Set values for the array
    show(&marks);  // Display the values of the array
    free(marks.ptr);  // Free the dynamically allocated memory
    return 0;
}
