// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class OnlineIpValueaddRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 是否上线，否为下线
    @NameInMap("is_online")
    @Validation(required = true)
    public Boolean isOnline;

    public static OnlineIpValueaddRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineIpValueaddRequest self = new OnlineIpValueaddRequest();
        return TeaModel.build(map, self);
    }

    public OnlineIpValueaddRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineIpValueaddRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineIpValueaddRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public OnlineIpValueaddRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public OnlineIpValueaddRequest setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }
    public Boolean getIsOnline() {
        return this.isOnline;
    }

}
