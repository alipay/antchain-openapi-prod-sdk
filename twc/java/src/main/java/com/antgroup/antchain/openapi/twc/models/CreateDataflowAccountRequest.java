// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateDataflowAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上账号名称，真实名称会在前加租户ID
    @NameInMap("biz_chain_account")
    @Validation(required = true)
    public String bizChainAccount;

    // 账户密钥算法
    @NameInMap("key_algorithm")
    public String keyAlgorithm;

    public static CreateDataflowAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataflowAccountRequest self = new CreateDataflowAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataflowAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataflowAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataflowAccountRequest setBizChainAccount(String bizChainAccount) {
        this.bizChainAccount = bizChainAccount;
        return this;
    }
    public String getBizChainAccount() {
        return this.bizChainAccount;
    }

    public CreateDataflowAccountRequest setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

}
