// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectionDTO extends TeaModel {
    // 该消费实例的地址和端口
    @NameInMap("client_addr")
    @Validation(required = true)
    public String clientAddr;

    // 消费实例的 ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 消费端语言
    @NameInMap("language")
    @Validation(required = true)
    public String language;

    // 宿主机 IP 或公网 IP
    @NameInMap("remote_ip")
    @Validation(required = true)
    public String remoteIp;

    // 消费端版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static ConnectionDTO build(java.util.Map<String, ?> map) throws Exception {
        ConnectionDTO self = new ConnectionDTO();
        return TeaModel.build(map, self);
    }

    public ConnectionDTO setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }
    public String getClientAddr() {
        return this.clientAddr;
    }

    public ConnectionDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ConnectionDTO setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ConnectionDTO setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public ConnectionDTO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
