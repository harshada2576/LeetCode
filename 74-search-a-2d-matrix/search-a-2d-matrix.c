#include <stdbool.h>

bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target) {
    
    int rows = matrixSize;
    int cols = *matrixColSize;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == target) {
                return true; // Found the target
            }
        }
    }

    return false;
}