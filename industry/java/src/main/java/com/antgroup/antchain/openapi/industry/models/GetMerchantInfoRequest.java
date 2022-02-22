// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class GetMerchantInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // source, 由中台为业务方分配, 标识业务来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 行业商户支付宝uid，跟merchant_tenant_name不能同时为空
    @NameInMap("merchant_user_id")
    public String merchantUserId;

    // 行业商户租户名称， 跟merchant_user_id不能同时为空
    @NameInMap("merchant_tenant_name")
    public String merchantTenantName;

    public static GetMerchantInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMerchantInfoRequest self = new GetMerchantInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMerchantInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMerchantInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetMerchantInfoRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public GetMerchantInfoRequest setMerchantTenantName(String merchantTenantName) {
        this.merchantTenantName = merchantTenantName;
        return this;
    }
    public String getMerchantTenantName() {
        return this.merchantTenantName;
    }

}
