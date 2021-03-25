// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecPkiDecryptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户管理员/其用户的链上账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 密文（base64）
    @NameInMap("encrypted_content")
    @Validation(required = true)
    public String encryptedContent;

    public static ExecPkiDecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecPkiDecryptRequest self = new ExecPkiDecryptRequest();
        return TeaModel.build(map, self);
    }

    public ExecPkiDecryptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecPkiDecryptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecPkiDecryptRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ExecPkiDecryptRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public ExecPkiDecryptRequest setEncryptedContent(String encryptedContent) {
        this.encryptedContent = encryptedContent;
        return this;
    }
    public String getEncryptedContent() {
        return this.encryptedContent;
    }

}
