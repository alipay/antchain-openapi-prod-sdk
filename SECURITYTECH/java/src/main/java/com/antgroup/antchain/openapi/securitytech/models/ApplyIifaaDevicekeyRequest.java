// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyIifaaDevicekeyRequest extends TeaModel {
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

    public static ApplyIifaaDevicekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIifaaDevicekeyRequest self = new ApplyIifaaDevicekeyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIifaaDevicekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyIifaaDevicekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyIifaaDevicekeyRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public ApplyIifaaDevicekeyRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public ApplyIifaaDevicekeyRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
