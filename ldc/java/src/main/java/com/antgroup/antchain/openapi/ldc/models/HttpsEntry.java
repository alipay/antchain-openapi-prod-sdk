// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HttpsEntry extends TeaModel {
    // 端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 是否使用websocket连接方式
    @NameInMap("websocket_connect")
    @Validation(required = true)
    public Boolean websocketConnect;

    // CA证书ID
    @NameInMap("ca_certificate_id")
    @Validation(required = true)
    public String caCertificateId;

    public static HttpsEntry build(java.util.Map<String, ?> map) throws Exception {
        HttpsEntry self = new HttpsEntry();
        return TeaModel.build(map, self);
    }

    public HttpsEntry setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public HttpsEntry setWebsocketConnect(Boolean websocketConnect) {
        this.websocketConnect = websocketConnect;
        return this;
    }
    public Boolean getWebsocketConnect() {
        return this.websocketConnect;
    }

    public HttpsEntry setCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
        return this;
    }
    public String getCaCertificateId() {
        return this.caCertificateId;
    }

}
