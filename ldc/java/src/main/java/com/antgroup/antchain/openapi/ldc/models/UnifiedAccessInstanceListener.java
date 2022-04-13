// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnifiedAccessInstanceListener extends TeaModel {
    // CA证书ID。 若既上传CA证书又上传服务器证书，即采用双向认证。 若用户只上传服务器证书，即为单向认证。
    @NameInMap("ca_certificate_id")
    public String caCertificateId;

    // 统一接入实例监听端口。 取值：1-65535。
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // 协议类型，目前支持http和https两种
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    // 是否使用websocket连接方式
    @NameInMap("websocket_connect")
    @Validation(required = true)
    public Boolean websocketConnect;

    public static UnifiedAccessInstanceListener build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAccessInstanceListener self = new UnifiedAccessInstanceListener();
        return TeaModel.build(map, self);
    }

    public UnifiedAccessInstanceListener setCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
        return this;
    }
    public String getCaCertificateId() {
        return this.caCertificateId;
    }

    public UnifiedAccessInstanceListener setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public UnifiedAccessInstanceListener setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UnifiedAccessInstanceListener setWebsocketConnect(Boolean websocketConnect) {
        this.websocketConnect = websocketConnect;
        return this;
    }
    public Boolean getWebsocketConnect() {
        return this.websocketConnect;
    }

}
