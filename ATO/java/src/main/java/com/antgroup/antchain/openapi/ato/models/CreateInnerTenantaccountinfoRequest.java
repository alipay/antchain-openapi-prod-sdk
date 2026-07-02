// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerTenantaccountinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝账号id
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    public static CreateInnerTenantaccountinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerTenantaccountinfoRequest self = new CreateInnerTenantaccountinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerTenantaccountinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerTenantaccountinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerTenantaccountinfoRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
