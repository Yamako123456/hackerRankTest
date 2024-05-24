package com.yamako.hackerrank.week4;
import java.util.List;

public class Result_TowerBreakers {
    /**
     *
     Two players are playing a game of Tower Breakers! Player 1 always moves first, and both players always play optimally.T
     Initially there are n towers.
     Each tower m is of height .
     The players move in alternating turns.
     In each turn, a player can choose a tower of height x
     and reduce its height to y,
     where
     1 <= y < x
     and y evenly divided x.
     If the current player is unable to make a move, they lose the game.

     * @param n Number of tower
     * @param m heightt
     * @return player who wins: 1 or 2
     */
    public static int towerBreakers(int n, int m) {
        int winner = 1;
        int totalUnit = n * m;
        int[] towerUnits = new int[n];
        for (int i = 0; i < n; i++) {
            towerUnits[i] = m;
        }
        boolean isPlayer1 = false;
        WHILE:
        while (totalUnit > 0) {
            isPlayer1 = !isPlayer1;
            boolean moved = false;
            FOR:
            for (int i = 0; i < n; i++) {
                //System.out.println("tower" + i + " has " + towerUnits[i]);
                int units = 1;
                if (towerUnits[i] > 1) {

                    for (int j = towerUnits[i] - 1; j > 0; j--) {
                        if (towerUnits[i] % (towerUnits[i] - j) == 0 ) {
                            units = j;
                            break;
                        }
                    }
                    towerUnits[i] -= units;
                    //log(units, player, i, towerUnits);
                    continue WHILE;
                } else {
                    if (i == n - 1) {
                        //System.out.println("game over");
                        return isPlayer1 ? 2 : 1;
                    } else
                        continue FOR;
                }
            }

        }
        return winner;
    }
    public static void log(int count, boolean isPlayer1, int i, int[] towers) {
        int player = isPlayer1 ? 1 : 2;

        System.out.format("Player: %d remove %d from tower %d and now its height is %d\n", player, count,i, towers[i]);
    }
}
