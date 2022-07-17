package org.rpc.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static org.rpc.common.constants.RpcConstants.MAGIC_NUMBER;

/**
 * @Author liguanghui
 * @Date 2022/7/17 9:46
 * RPC协议类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RpcProtocol {
    private static final long serialVersionUID = 5359096060555795690L;

    private short magicNumber = MAGIC_NUMBER;       //魔法数,主要是在坐服务通讯的时候定义的一个安全检测,确认当前请求是否合法

    private int contentLength;      //传输的内容长度,主要是在防止出现TCP粘包和拆包

    private byte[] content;     //这个字段其实是RpcInvocation类的字节数组

    public RpcProtocol(byte[] content) {
        this.contentLength = content.length;
        this.content=content;
    }
}
