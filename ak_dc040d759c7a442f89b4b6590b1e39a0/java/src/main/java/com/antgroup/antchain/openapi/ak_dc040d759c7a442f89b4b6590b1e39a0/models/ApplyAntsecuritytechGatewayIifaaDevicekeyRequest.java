// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class ApplyAntsecuritytechGatewayIifaaDevicekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求头
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 业务参数
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    // 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static ApplyAntsecuritytechGatewayIifaaDevicekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntsecuritytechGatewayIifaaDevicekeyRequest self = new ApplyAntsecuritytechGatewayIifaaDevicekeyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public ApplyAntsecuritytechGatewayIifaaDevicekeyRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
