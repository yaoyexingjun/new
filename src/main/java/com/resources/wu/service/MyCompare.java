package com.resources.wu.service;

import java.util.ArrayList;
import java.util.List;

public class MyCompare implements Compare {
    @Override
    public int max(int[] nums) {
            int max = 0;
            for(int x=1; x<nums.length; x++){
                if(nums[x]>nums[max]){
                    max = x;
                }
            }
            return max;
        }



    @Override
    public int max(int num1, int num2) {
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    @Override
    public int max(int num1, int num2, int num3) {
        if (num1>num2){
            return num1;
        }else if(num2>num3){
            return num2;
        }else {
            return num3;
        }
    }

    @Override
    public int max(int num1, int num2, int num3, int num4, int num5) {
        int[] array={num1,num2,num3,num4,num5};
        int index=0;
        int max=array[index];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                index=i;
                max=array[i];
            }
        }
        return max;
    }
}
