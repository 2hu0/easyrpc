package com.rpc;

/**
 * @author 2hu0
 */
public class HelloRpcImpl implements HelloRpc{
    @Override
    public String sayHi(String name) {
        return "hello consumer:" + name;
    }
}
