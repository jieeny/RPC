package org.rpc.common.config;

/**
 * @Author: LiGuangHui
 * @Date: 2022/7/16 23:04
 * 客户端配置类
 */
public class ClientConfig {
    private Integer port;

    private String serverAddr;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
