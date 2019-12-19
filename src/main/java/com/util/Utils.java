package com.util;

/**
 * @ProjectName: example
 * @Package: com.util
 * @ClassName: Utils
 * @Author: mazhiyue
 * @Description: 工具类
 * @Date: 2019/12/14 17:04
 * @Version: 1.0
 */
public class Utils {
    public static void main(String[] args) {
        String str = "111";


        System.out.println(str);

        str = str + "222";
        method(str);
        System.out.println(str);
        String str1 = "测试是否自动合并第一版";
        String str2 = "测试sourcetree";

    }

    public static void method (String str){
        str = str +"333";
        System.out.println(str);
        String str1 = "左侧为被合并分支，右侧为自己的开发分支";
		String str1 = "冲突文件中，未冲突的地方idea不会自动合并，sourcetree会自动合并";
    }

}
