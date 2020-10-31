package com.xxx.rpc.sample.client;

import com.xxx.rpc.client.RpcProxy;
import com.xxx.rpc.sample.api.HelloService;
import com.xxx.rpc.sample.api.OpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: netty-rpc
 * @description:
 * @author: 占翔昊
 * @create 2020-10-31 15:31
 **/
public class AddClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        OpService opService = rpcProxy.create(OpService.class,"version1");
        int result = opService.Add(100,100);
        System.out.println(result);
        System.exit(0);
    }
}
