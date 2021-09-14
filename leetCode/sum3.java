package com.mohsin.leetCode;

import java.util.ArrayList;
import java.util.List;

public class sum3 {
    public static void main(String[] args) {
        int[] arr={1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int i=0;int j=2;int k=3;
        List<Integer> elements=new ArrayList<Integer>();
        List<List<Integer>> list= new ArrayList<>();
        while(i!=j && i!=k) {
            if (nums[i] + nums[j] + nums[k] == 0) {
                elements.add(i);
                elements.add(j);
                elements.add(k);
                list.add(elements);

            }

            k++;

            if (k == nums.length - 1) {
                j++;
                k = j + 1;
            }
            if (j == nums.length - 1) {
                i++;
                j = i + 1;
                k = j + 1;
            }

        }
        return list;
    }

}
