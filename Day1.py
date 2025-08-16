from typing import List

class Solution:
    def setZeros(self, matrix:List[List[int]])-> None:
        n,m=len(matrix),len(matrix[0])
        col0=True

        for i in range(n):
            if matrix[i][0]==0:
                col0=False

            for j in range(1,m):
                if matrix[i][j]==0:
                    matrix[i][0]=0
                    matrix[0][j]=0

        for i in range(n-1,-1,-1):
            for j in range(m-1,0,-1):
                if matrix[i][0]==0 or matrix[0][j]==0:
                    matrix[i][j]=0
            
            if not col0:
                    matrix[i][0]=0

matrix=[
    [1,1,1],
    [1,0,1],
    [1,1,1]
]

sol=Solution()
sol.setZeros(matrix)
print("output matrix:")
for row in matrix:
    print(row)
