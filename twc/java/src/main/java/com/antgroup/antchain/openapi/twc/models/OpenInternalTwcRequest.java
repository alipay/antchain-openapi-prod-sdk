// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OpenInternalTwcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权开通的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 授权开通的产品码
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 授权开通的行业类型（版权/租赁）
    @NameInMap("customer_biz_id")
    @Validation(required = true)
    public String customerBizId;

    // 授权码
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    public static OpenInternalTwcRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenInternalTwcRequest self = new OpenInternalTwcRequest();
        return TeaModel.build(map, self);
    }

    public OpenInternalTwcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenInternalTwcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenInternalTwcRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenInternalTwcRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public OpenInternalTwcRequest setCustomerBizId(String customerBizId) {
        this.customerBizId = customerBizId;
        return this;
    }
    public String getCustomerBizId() {
        return this.customerBizId;
    }

    public OpenInternalTwcRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
