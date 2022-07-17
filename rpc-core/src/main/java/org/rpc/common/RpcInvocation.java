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
    private String targetMethod;

    private String targetServiceName;

    private Object[] args;

    private String uuid;

    private Object response;
}
