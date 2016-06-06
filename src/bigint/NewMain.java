/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigint;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author marr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInt big = BigInt.ONE;
        BigInt sum = new BigInt(big.toString());
        List<BigInt> list = new LinkedList<>();
        list.add(big);
        for (int i = 0; i < 1023; i++) {

            big = new BigInt(sum.add(BigInt.ONE));
            list.add(big);
            sum = new BigInt(sum.add(big));

        }

        for (BigInt b : list) {
            System.out.println(b.toString().length());
        }


    }

}
