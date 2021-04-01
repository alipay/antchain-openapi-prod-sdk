// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecPkiEncryptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户管理员/其用户的链上账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 明文（base64编码）
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 商户管理员/其用户归属的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    public static ExecPkiEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecPkiEncryptRequest self = new ExecPkiEncryptRequest();
        return TeaModel.build(map, self);
    }

    public ExecPkiEncryptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecPkiEncryptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecPkiEncryptRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ExecPkiEncryptRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecPkiEncryptRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

}
