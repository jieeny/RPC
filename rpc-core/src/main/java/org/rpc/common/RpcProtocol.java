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

    private short magicNumber = MAGIC_NUMBER;

    private int contentLength;

    private byte[] content;

    public RpcProtocol(byte[] content) {
        this.contentLength = content.length;
        this.content=content;
    }
}
