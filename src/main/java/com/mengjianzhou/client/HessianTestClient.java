package com.mengjianzhou.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.mengjianzhou.bean.HelloWorld;
import com.mengjianzhou.service.HessianService;

import java.net.MalformedURLException;

/**
 * @auth mengjianzhou
 * @Date 2018/4/6
 */
public class HessianTestClient {
    public static void main(String[] args) {
        //在服务器端的web.xml文件中配置的HessianServlet映射的访问URL地址
        String url = "http://localhost:9001/ServiceServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        HessianService service = null;
        try {
            service = (HessianService) factory.create(HessianService.class, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //创建IService接口的实例对象
        HelloWorld helloWorld = service.sayHelloWorld();
        //调用Hessian服务器端的ServiceImpl类中的getUser方法来获取一个User对象
        System.out.println(helloWorld.getName());
    }
}

