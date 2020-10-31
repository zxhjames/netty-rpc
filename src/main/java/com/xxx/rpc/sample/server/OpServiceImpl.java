package com.xxx.rpc.sample.server;

import com.xxx.rpc.sample.api.HelloService;
import com.xxx.rpc.sample.api.OpService;
import com.xxx.rpc.server.RpcService;

/**
 * @program: netty-rpc
 * @description:
 * @author: 占翔昊
 * @create 2020-10-31 15:29
 **/
@RpcService(value = OpService.class,version = "version1")
public class OpServiceImpl implements OpService{
    @Override
    public int Add(int a, int b) {
        return a + b;
    }
}
