// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class WithdrawOneLimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 1
    @NameInMap("param")
    public java.util.List<AbcDemoStruct> param;

    public static WithdrawOneLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawOneLimitRequest self = new WithdrawOneLimitRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawOneLimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public WithdrawOneLimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public WithdrawOneLimitRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public WithdrawOneLimitRequest setParam(java.util.List<AbcDemoStruct> param) {
        this.param = param;
        return this;
    }
    public java.util.List<AbcDemoStruct> getParam() {
        return this.param;
    }

}
