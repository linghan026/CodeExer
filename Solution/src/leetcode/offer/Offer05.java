package leetcode.offer;
/**
 * 
 * @Description 剑指offer05
 * @author YinLinghan 1457851494@qq.com
 * @version
 * @date 2021年1月17日下午9:38:26
 *
 */
public class Offer05 {
	public static void main(String[] args) {
		Offer05 test=new Offer05();
		System.out.println(test.replaceSpace("Hello world !"));
	}
	public String replaceSpace(String s) {
		return s.replace(" ","%20");//建议看看库函数原理
	}

}
