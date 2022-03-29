// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ClientInfoDTO extends TeaModel {
    // 客户端ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 客户端地址
    @NameInMap("client_addr")
    @Validation(required = true)
    public String clientAddr;

    // 订阅详情
    @NameInMap("subscriptions")
    @Validation(required = true)
    public java.util.List<SubscriptionDTO> subscriptions;

    public static ClientInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        ClientInfoDTO self = new ClientInfoDTO();
        return TeaModel.build(map, self);
    }

    public ClientInfoDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ClientInfoDTO setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }
    public String getClientAddr() {
        return this.clientAddr;
    }

    public ClientInfoDTO setSubscriptions(java.util.List<SubscriptionDTO> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }
    public java.util.List<SubscriptionDTO> getSubscriptions() {
        return this.subscriptions;
    }

}
