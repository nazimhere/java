#include <stdio.h>
#define MAX_BLOCKS 10
#define MAX_PROCESSES 5
typedef struct {
 int size;
 int allocated; // 1 if allocated, 0 otherwise
} Block;
typedef struct {
 int size;
} Process;
void calculateFragmentation(Block blocks[], int numBlocks, Process processes[], 
int numProcesses) {
 int externalFragmentation = 0, internalFragmentation = 0;
 // Check for external fragmentation (free memory blocks)
 for (int i = 0; i < numBlocks; i++) {
 if (!blocks[i].allocated) {
 externalFragmentation += blocks[i].size;
 }
 }
 // Check for internal fragmentation (unused space within allocated blocks)
 for (int i = 0; i < numProcesses; i++) {
 for (int j = 0; j < numBlocks; j++) {
 if (!blocks[j].allocated && blocks[j].size >= processes[i].size) {
 internalFragmentation += (blocks[j].size - processes[i].size);
 blocks[j].allocated = 1;
 break;
 }
 }
 }
 printf("\nTotal External Fragmentation: %d\n", externalFragmentation);
 printf("Total Internal Fragmentation: %d\n", internalFragmentation);
}
int main() {
 // Free memory blocks in the system
 Block blocks[MAX_BLOCKS] = {{50, 0}, {30, 0}, {70, 0}, {10, 0}, {90, 0}, 
 {40, 0}, {60, 0}, {20, 0}, {80, 0}, {100, 0}};
 // Process files that require memory
 Process processes[MAX_PROCESSES] = {{25}, {40}, {60}, {15}, {90}};
 printf("Memory blocks available:\n");
 for (int i = 0; i < MAX_BLOCKS; i++) {
 printf("Block %d: Size %d\n", i, blocks[i].size);
 }
 printf("\nProcess files requiring memory:\n");
 for (int i = 0; i < MAX_PROCESSES; i++) {
 printf("Process %d: Size %d\n", i, processes[i].size);
 }
 calculateFragmentation(blocks, MAX_BLOCKS, processes, MAX_PROCESSES);
 return 0;
}