package com.company;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	LinearRecursion test = new LinearRecursion();
    HaNoiTower hnt = new HaNoiTower();
    Fibonaci fibonaci = new Fibonaci();
    NQueen3 nq3 = new NQueen3(5);
    nq3.findSolution(0);
//    NQueen2 nq2 = new NQueen2();
//        List<List<String>> result = nq2.solveQueens(5);
//        int ordNum = 1;
//        for(List<String> list : result) {
//            System.out.println(ordNum + ": " + list);
//            ordNum++;
//        }
//    NQueen nq = new NQueen(4);
//    nq.solve();
//    long z= fibonaci.fibonaci(6);
//    int x = test.euclid(3,8);
//    int y = test.factorial(5);

//        hnt.move(2, 'A','B','C');
//       boolean x = fibonaci.isEven(6);
//            System.out.println(x);
    }
}
