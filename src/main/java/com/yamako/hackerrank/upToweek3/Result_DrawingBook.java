package com.yamako.hackerrank.upToweek3;

public class Result_DrawingBook {
    public static int pageCount(int n, int p) {
        // Each page except the last page will always be printed on both sides.
        // When they open the book, page 1 is always on the right side or when turning from back, the last page is on the page.

        int  result =  0;
        boolean lastOnBack = n % 2 == 0;

        // Edge cases
        if (p == n && lastOnBack) {
            return 0;
        }
        if (p == 1 || p == n || ( p == n - 1 && !lastOnBack )) {
            return 0;
        }

        // Typical cases
        int maxTurnPos = n / 2 -1;

        int yourTurnPos = p / 2;
        int  minTurn = maxTurnPos - yourTurnPos + 1  < yourTurnPos ? maxTurnPos - yourTurnPos + 1 : yourTurnPos;

        return minTurn;
    }
}
