package com.yamako.hackerrank.week5;

import java.util.ArrayList;
import java.util.List;

public class Result_DynamicArray {
    /** You create a brand-new result list to modify by running given queries in sequence.

     * @param n : positive integer represents number of elements that you need to have in your brand-new list that you are going to modify by running a series of query on it.
     *
     * @param queries :
     *      A list which element is a list of 3 integers that represents a query instruction, where first element is "type" of query you have to perform, second element is x value and third is y value.
     *  Query is the task to modify your result list you just created new. You modify it in certain predefined way.
     *  YOu know which certain way to modify your result list by looking at give the "type" value included in queries list; it could be "1" or "2". You have to figure out what is "1" type query or "2" type query by reading HackerRank coding challenge instruction text.
     *  When you are doing calculation for the predefined task, you use the "last answer" value which essentially is the last value you just added to your result list along value x and value y.
     *  At the first time, you use value zero for the "last answer" value.
     * From HackerRanck problem description:
     *      type 1:
     *         step 1.  Let idx = (( x ^ lastAnswer) % n )
     *         step 2.  Append the integer y to arr[idx]
     *      type 2:
     *         step 1.  Let idx = (( x ^ lastAnswer) % n )
     *         step 2.  Assign the value arr[idx][y % size(arr[idx])] to lastAnswer
     *         step 3. Store the new value of lastAnswer to an answers array.
     * @return Your result list that you created and modified.
     *
     * Note:
     *  lastAnswer = 0 as initial value
     *  ^ is bitwise XOR in Java
     *  idx = (x ^ lastAnswer) % n to find the specific index in your result list to add new value.
     *  arr[idx][y % arr[idx].size()]
     *  Query: 1 arr[idx] = y
     *  Query: 2 arr[idx][y ^ arr.get(idx).size()] = lastAnswer
     *
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(new ArrayList<Integer>());

        int lastAnswer = 0;

        for (int i = 0; i < queries.size(); i++) {
            List<Integer> qry = queries.get(i);
            int type = qry.get(0);
            int x = qry.get(1);
            int y = qry.get(2);

            //step 1.  Let idx = (( x ^ lastAnswer) % n )
            int idx = (( x ^ lastAnswer ) % n);

            switch (type) {
                case 1:
                    //step 2.  Append the integer y to arr[idx]
                    arr.get(idx).add(y);
                    break;
                case 2:
                    //step 2.  Assign the value arr[idx][y % size(arr[idx])] to lastAnswer
                    lastAnswer = arr.get(idx).get( y % arr.get(idx).size());
                    //step 3. Store the new value of lastAnswer to an answers array.
                    answer.add(lastAnswer);
                    break;
            }
        }

        return answer;
    }
}
