package activities;

import java.util.Arrays;

public class Activity2 {

        public static void main(String[] args) {
            //Initialize the array
            int[] arrayList = {10, 77, 10, 54, -11, 10};

            //Set constants
            int findNum = 10;
            int sum = 30;
            int sumTotal = 0;

            for(int i=0;i<arrayList.length;i++) {
                if (arrayList[i] == findNum) {
                    sumTotal += arrayList[i];
                }
                if (sumTotal > sum) {
                    break;
                }
            }

            if(sum==sumTotal) {
                System.out.println("Result sum:" + sumTotal);
            }


        }

    }
