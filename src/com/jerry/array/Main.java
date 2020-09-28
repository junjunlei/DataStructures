package com.jerry.array;

import java.util.*;

/**
 * @author Jerry
 * @create 2020-06-28 15:32
 */
public class Main {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
        public static List<List<Integer>> threeSum(int[] nums) {
            //思路  排序 三数转二数  双指针
            Set set=new HashSet<>();
            if(nums==null||nums.length<3){
                return null;
            }
            //排序
            Arrays.sort(nums);
            //第一个数必须是0或者负数
            for(int i=0;i<nums.length&&nums[i]<=0;i++){
                System.out.println("遍历次数为："+i);
                //将第一个数的相反数定为后面两数和的target
                int target=-nums[i];
                int left=i+1;
                int right=nums.length-1;
                while(left<right){
                    int s=nums[left]+nums[right];
                    if(s==target){
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);
                        //这里要处理
                        right--;
                        left++;
                    }else {
                        if (s > target) {
                            right--;
                        } else {
                            left++;
                        }
                    }
                }
            }
            return new ArrayList<List<Integer>>(set);
        }
}
