package com.zx.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class GoodsTest {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Goods> GoodsMap = new HashMap<String, Goods>();
        System.out.println("请输入三条商品信息");
        int i = 0;
        while (i < 3) {
            System.out.println("*******第" + (i + 1) + "条商品信息录入***********");
            System.out.println("请输入商品编号：");
            String goodsId = scanner.next();
            System.out.println("请输入商品名称：");
            String goodsName = scanner.next();
            System.out.println("请输入商品的价格：");
            double goodsPrice = scanner.nextDouble();
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            //GoodsMap.put();
            i++;
        }
        System.out.println("使用跌打器方法输出的参数是：");
    }
}
