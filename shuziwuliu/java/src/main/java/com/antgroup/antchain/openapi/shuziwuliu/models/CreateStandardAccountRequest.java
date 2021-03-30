// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateStandardAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账户的code
    @NameInMap("account_code")
    @Validation(required = true)
    public String accountCode;

    // 账户的公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    public static CreateStandardAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardAccountRequest self = new CreateStandardAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStandardAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateStandardAccountRequest setAccountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }
    public String getAccountCode() {
        return this.accountCode;
    }

    public CreateStandardAccountRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
