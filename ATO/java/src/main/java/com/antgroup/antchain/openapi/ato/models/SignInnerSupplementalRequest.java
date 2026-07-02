// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignInnerSupplementalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户ID
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 64)
    public String tenantId;

    // 同意接受用户补充接口，目前取值只能为true
    @NameInMap("auth_result")
    @Validation(required = true)
    public Boolean authResult;

    public static SignInnerSupplementalRequest build(java.util.Map<String, ?> map) throws Exception {
        SignInnerSupplementalRequest self = new SignInnerSupplementalRequest();
        return TeaModel.build(map, self);
    }

    public SignInnerSupplementalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignInnerSupplementalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignInnerSupplementalRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SignInnerSupplementalRequest setAuthResult(Boolean authResult) {
        this.authResult = authResult;
        return this;
    }
    public Boolean getAuthResult() {
        return this.authResult;
    }

}
