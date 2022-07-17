package org.rpc.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author liguanghui
 * @Date 2022/7/17 9:46
 * RPC调用封装类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RpcInvocation {
    private String targetMethod;        //目标方法

    private String targetServiceName;   //目标服务名称

    private Object[] args;

    private String uuid;                //uuid对应一个线程,用来区分不同线程

    private Object response;
}
