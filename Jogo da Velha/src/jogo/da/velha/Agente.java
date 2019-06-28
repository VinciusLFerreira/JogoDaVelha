/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;

/**
 *
 *  @author Vinícius Lima Ferreira 11826064
 */
public class Agente {
    
    public int checkMatriz(int[][] gamePositions){
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                switch(gamePositions[i][j]){
                    case 0:
                        gamePositions[i][j] = 2;
                        System.out.println(i+j+1);
                        if(i==0){
                           return (i+j+1); 
                        }else if(i==1){
                           return (i+j+3); 
                        }else if(i==2){
                           return (i+j+5); 
                        }
                        
                }
            }
        }
        return 0;
    }
    
    public int checkStatusGame(int[][] gamePositions){
        
        if(gamePositions[0][0] == gamePositions[0][1] && gamePositions[0][0] == gamePositions[0][2]){
            checkWin(gamePositions[0][0]);
        }else if(gamePositions[0][0] == gamePositions[1][0] && gamePositions[0][0] == gamePositions[2][0]){
            checkWin(gamePositions[0][0]);
        }else if(gamePositions[0][0] == gamePositions[1][1] && gamePositions[0][0] == gamePositions[2][2]){
            checkWin(gamePositions[0][0]);
        }else if(gamePositions[0][1] == gamePositions[1][1] && gamePositions[0][1] == gamePositions[2][1]){
            checkWin(gamePositions[0][1]);
        }else if(gamePositions[0][2] == gamePositions[1][2] && gamePositions[0][2] == gamePositions[2][2]){
            checkWin(gamePositions[0][2]);
        }else if(gamePositions[0][2] == gamePositions[1][1] && gamePositions[0][2] == gamePositions[2][0]){
            checkWin(gamePositions[0][2]);
        }else if(gamePositions[0][2] == gamePositions[1][2] && gamePositions[0][2] == gamePositions[2][2]){
            checkWin(gamePositions[0][2]);
        }else if(gamePositions[1][0] == gamePositions[1][1] && gamePositions[0][2] == gamePositions[1][2]){
            checkWin(gamePositions[1][0]);
        }else if(gamePositions[2][0] == gamePositions[2][1] && gamePositions[0][2] == gamePositions[2][2]){
            checkWin(gamePositions[2][0]);
        }
        return 0;
    }
    
    public void checkWin(int val){
        if(val == 1){
            System.out.println("Acabouu 1");
        }else{
            System.out.println("Acabouu 1");
        }
    }
}