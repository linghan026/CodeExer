package leetcode.offer;

import org.junit.Test;

public class Offer10_1 {

    public int fib(int n) {
		//法一 递归（超时）
		//     if(n==0)
		//         return 0;
		//     if(n==1)
		//         return 1;
		//     return (fib(n-1)+fib(n-2))%1000000007;
		// }
		//法二：计算至100，生成查询表
		// int[] nums=new int[101];
		// nums[0]=0;
		// nums[1]=1;
		// for(int i=2;i<101;i++){
		//     nums[i]=(nums[i-1]+nums[i-2])%1000000007;
		// }
		// return nums[n];
		//法三: 计算至n即停止

		if (n == 0 || n == 1)
			return n;
		else{
			int nums_n=1,nums_n_1=0;
			for(int i=2;i<=n;i++){
				int temp=nums_n;//上一项的值
				nums_n=(nums_n+nums_n_1)%1000000007;//计算当前项的值
				nums_n_1=temp;//上一项的值
			}
			return nums_n;
		}
    }
    @Test
	public void test(){
		System.out.println(fib(30));
	}
}
