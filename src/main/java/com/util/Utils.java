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
        //pull及mager是发生冲突的情况
        String str1 = "优先使用idea的pull选取两个分支合并代码时，左侧为pull远程分支后的最新代码，右侧为本地开发代码";
        String str2 = "pull时左侧为本地修改后的最新版本，右侧为远程分支版本";
        String str4 = "冲突文件中，未冲突的地方idea不会自动合并，sourcetree会自动合并";


        //测试回滚
        String str3 = "回滚至当前节点，修改发送冲突";

    }

}
