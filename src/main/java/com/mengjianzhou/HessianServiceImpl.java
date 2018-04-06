package com.mengjianzhou;

import com.mengjianzhou.bean.HelloWorld;
import com.mengjianzhou.service.HessianService;

/**
 * @auth mengjianzhou
 * @Date 2018/4/6
 */
public class HessianServiceImpl implements HessianService {


    public HelloWorld sayHelloWorld() {
        return new HelloWorld("hello hessian");
    }
}
