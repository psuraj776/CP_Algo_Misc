//Longest Increasing Subseqeunce
//O(n*n)
/*
Reference
https://cp-algorithms.com/sequences/longest_increasing_subsequence.html
*/

import java.util.*;

class LongestIncreasingSubsequnce {
	public static void main (String[] args) {
		int[] ar = {1,2,4,5,3,6,7,5,8,9,10};
		int n=ar.length;
		int[] dp=new int[n];
		for(int i=0;i<n;i++){
		    dp[i]=1;
		}
		for(int i=1;i<n;i++){
		    for(int j=0;j<i;j++){
		        if(ar[i]>ar[j]){
		            dp[i]=Math.max(dp[j]+1,dp[i]);
		        }
		    }
		}
		int ans=0;
		for(int i=0;i<n;i++){
		    ans=Math.max(ans,dp[i]);
		}
		System.out.println(ans);
	}
}
