// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OpenInternalJudicialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权开通纠纷行业的真实租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 调用接口的授权码
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    public static OpenInternalJudicialRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenInternalJudicialRequest self = new OpenInternalJudicialRequest();
        return TeaModel.build(map, self);
    }

    public OpenInternalJudicialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenInternalJudicialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenInternalJudicialRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenInternalJudicialRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
