// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RetryDciPreregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci用户id
    @NameInMap("dci_user_id")
    @Validation(required = true)
    public String dciUserId;

    // dci内容id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 代理信息
    @NameInMap("proxy_data")
    @Validation(required = true)
    public ProxyData proxyData;

    // 幂等信息
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static RetryDciPreregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDciPreregistrationRequest self = new RetryDciPreregistrationRequest();
        return TeaModel.build(map, self);
    }

    public RetryDciPreregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryDciPreregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryDciPreregistrationRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public RetryDciPreregistrationRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public RetryDciPreregistrationRequest setProxyData(ProxyData proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public ProxyData getProxyData() {
        return this.proxyData;
    }

    public RetryDciPreregistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
