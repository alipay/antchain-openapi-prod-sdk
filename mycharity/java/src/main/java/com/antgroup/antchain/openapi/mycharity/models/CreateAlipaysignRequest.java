// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateAlipaysignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签约记录id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 机构id
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 支付宝代扣账号
    @NameInMap("alipay_account")
    @Validation(required = true)
    public String alipayAccount;

    public static CreateAlipaysignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlipaysignRequest self = new CreateAlipaysignRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlipaysignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAlipaysignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAlipaysignRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAlipaysignRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateAlipaysignRequest setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

}
