// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignInnerAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署合同的流程id
    @NameInMap("flow_id")
    @Validation(required = true, maxLength = 64)
    public String flowId;

    // true代表用户同意授权，
    // false代表不同意
    @NameInMap("auth_result")
    @Validation(required = true)
    public Boolean authResult;

    public static SignInnerAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        SignInnerAuthorizationRequest self = new SignInnerAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public SignInnerAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignInnerAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignInnerAuthorizationRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public SignInnerAuthorizationRequest setAuthResult(Boolean authResult) {
        this.authResult = authResult;
        return this;
    }
    public Boolean getAuthResult() {
        return this.authResult;
    }

}
