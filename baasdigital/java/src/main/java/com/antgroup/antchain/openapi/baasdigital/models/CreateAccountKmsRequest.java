// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateAccountKmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    // 链账户名称，支持长度100以内的，大小写字母、数字、下划线、横线、@、点
    @NameInMap("account")
    @Validation(required = true, minLength = 1)
    public String account;

    // 托管账户所在的租户，默认为调用者的租户
    @NameInMap("tenant_id")
    public String tenantId;

    public static CreateAccountKmsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountKmsRequest self = new CreateAccountKmsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountKmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAccountKmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAccountKmsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateAccountKmsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAccountKmsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
