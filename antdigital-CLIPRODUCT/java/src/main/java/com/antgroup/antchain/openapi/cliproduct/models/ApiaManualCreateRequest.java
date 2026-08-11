// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class ApiaManualCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    // param
    @NameInMap("param")
    public OrderItem param;

    public static ApiaManualCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiaManualCreateRequest self = new ApiaManualCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiaManualCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiaManualCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApiaManualCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ApiaManualCreateRequest setParam(OrderItem param) {
        this.param = param;
        return this;
    }
    public OrderItem getParam() {
        return this.param;
    }

}
