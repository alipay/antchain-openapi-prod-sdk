// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ConfirmSecurityPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 二次确认参数，防止篡改
    @NameInMap("confirm_params")
    @Validation(required = true)
    public String confirmParams;

    // 代码发送给安全核心的事件编码
    @NameInMap("security_id")
    @Validation(required = true)
    public String securityId;

    public static ConfirmSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSecurityPolicyRequest self = new ConfirmSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmSecurityPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmSecurityPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmSecurityPolicyRequest setConfirmParams(String confirmParams) {
        this.confirmParams = confirmParams;
        return this;
    }
    public String getConfirmParams() {
        return this.confirmParams;
    }

    public ConfirmSecurityPolicyRequest setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

}
