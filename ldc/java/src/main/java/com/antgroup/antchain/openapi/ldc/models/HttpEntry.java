// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HttpEntry extends TeaModel {
    // 端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 是否使用websocket连接方式
    @NameInMap("websocket_connect")
    @Validation(required = true)
    public Boolean websocketConnect;

    public static HttpEntry build(java.util.Map<String, ?> map) throws Exception {
        HttpEntry self = new HttpEntry();
        return TeaModel.build(map, self);
    }

    public HttpEntry setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public HttpEntry setWebsocketConnect(Boolean websocketConnect) {
        this.websocketConnect = websocketConnect;
        return this;
    }
    public Boolean getWebsocketConnect() {
        return this.websocketConnect;
    }

}
