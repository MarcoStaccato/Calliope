package com.staccato.cracking.arrays;

public class sudoku {

    boolean sudoku2(char[][] grid) {

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != '.'){
                    if(!checkVector(grid, i, j)){
                        return false;
                    }
                }else if((i==1 && j==1) || (i==1 && j==4) || (i==1 && j==7) ||
                        (i==4 && j==1) || (i==4 && j==4) || (i==4 && j==7) ||
                        (i==7 && j==1) || (i==7 && j==4) || (i==7 && j==7)){
                    if(!checkGrid(grid, i, j)){
                        return false;
                    }
                }
            }
        }
        return true;

    }

    boolean checkVector(char[][] grid, int x, int y){
        char current = grid[x][y];
        boolean isValid = true;
        System.out.println("\nfor char: " + current);
        for(int i=0; i<grid.length; i++){
            if(i!=x && current == grid[i][y]){
                return false;
            }
        }
        System.out.println("");
        for(int i=0; i<grid.length; i++){
            if(i!=y && current == grid[x][i]){
                return false;
            }
        }
        return true;

    }

    boolean checkGrid(char[][] grid, int x, int y){
        short[] array = new short[256];
        array[grid[x-1][y-1]+0]++; array[grid[x][y-1]+0]++; array[grid[x+1][y-1]+0]++;
        array[grid[x-1][y]+0]++;   array[grid[x][y]+0]++;   array[grid[x+1][y]+0]++;
        array[grid[x-1][y+1]+0]++; array[grid[x][y+1]+0]++; array[grid[x+1][y+1]+0]++;

        for(short occurrences: array){
            if(occurrences !=array[46] && occurrences > 1){
                return false;
            }
        }
        return true;
    }

}
