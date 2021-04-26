package leetcode.exer;
/**
 * 
 * @Description leetcode #1672 最富有客户的资产总量
 * @author YinLinghan 1457851494@qq.com
 * @version
 * @date 2020年12月26日下午2:19:08
 *
 */
public class Solution1672RichestCustomerWealth
{
	public int maximumWealth(int[][] accounts) 
	{
		int maxWealth=0;
		int maxiWealth=0;
		for(int i=0;i<accounts.length;i++)
		{
			maxiWealth=0;
			for(int j=0;j<accounts[i].length;j++)
			{
				maxiWealth+=accounts[i][j];
			}
			if(maxWealth<maxiWealth)
			{
				maxWealth=maxiWealth;
			}
		}
		return maxWealth;
	}
}
