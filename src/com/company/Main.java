package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Gameboard gameboard = new Gameboard();
        System.out.println("Player 1 enter name: ");
        String input1 = scan.nextLine();
        System.out.println("Player 1 choose symbol: ");
        String input2 = scan.nextLine();
        Player player1 = new Player( input1, input2);
        System.out.println("Player 2 enter name: ");
        String input3 = scan.nextLine();
        System.out.println("Player 2 choose symbol: ");
        String input4 = scan.nextLine();
        Player player2 = new Player( input3, input4);
        Player activePlayer = player1;
        Player inActivePlayer = player2;
        Player holder;
        while(true){
            System.out.println(activePlayer.name + "'s Turn");
            System.out.println("\n");
            System.out.println(gameboard);
            System.out.println("\n");
            if(gameboard.s1 != "1" && gameboard.s2 != "2" && gameboard.s3 != "3" && gameboard.s4 != "4" && gameboard.s5 != "5" && gameboard.s6 != "6" && gameboard.s7 != "7" && gameboard.s8 != "8" && gameboard.s9 != "9"){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Choose a position (1 - 9)");
            int selection = scan.nextInt();
            if(selection == 1 && gameboard.s1 == "1"){
                gameboard.s1 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 2 && gameboard.s2 == "2"){
                gameboard.s2 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 3 && gameboard.s3 == "3"){
                gameboard.s3 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 4 && gameboard.s4 == "4"){
                gameboard.s4 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 5 && gameboard.s5 == "5"){
                gameboard.s5 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 6 && gameboard.s6 == "6"){
                gameboard.s6 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 7 && gameboard.s7 == "7"){
                gameboard.s7 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 8 && gameboard.s8 == "8"){
                gameboard.s8 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else if (selection == 9 && gameboard.s9 == "9"){
                gameboard.s9 = activePlayer.symbol;
                holder = activePlayer;
                activePlayer = inActivePlayer;
                inActivePlayer = holder;
            }
            else
                continue;

            if((gameboard.s1 == inActivePlayer.symbol && gameboard.s2 == inActivePlayer.symbol && gameboard.s3 == inActivePlayer.symbol) ||(gameboard.s1 == inActivePlayer.symbol && gameboard.s4 == inActivePlayer.symbol && gameboard.s7 == inActivePlayer.symbol) || (gameboard.s1 == inActivePlayer.symbol && gameboard.s5 == inActivePlayer.symbol && gameboard.s9 == inActivePlayer.symbol) || (gameboard.s2 == inActivePlayer.symbol && gameboard.s5 == inActivePlayer.symbol && gameboard.s8 == inActivePlayer.symbol) || (gameboard.s3 == inActivePlayer.symbol && gameboard.s6 == inActivePlayer.symbol && gameboard.s9 == inActivePlayer.symbol) || (gameboard.s4 == inActivePlayer.symbol && gameboard.s5 == inActivePlayer.symbol && gameboard.s6 == inActivePlayer.symbol) || (gameboard.s7 == inActivePlayer.symbol && gameboard.s8 == inActivePlayer.symbol && gameboard.s9 == inActivePlayer.symbol) || (gameboard.s3 == inActivePlayer.symbol && gameboard.s5 == inActivePlayer.symbol && gameboard.s7 == inActivePlayer.symbol)){
                System.out.println(gameboard);
                System.out.println("\n");
                System.out.println("Game Over, " + inActivePlayer.name + " Wins!!!");
                break;
            }

        }



    }
}
