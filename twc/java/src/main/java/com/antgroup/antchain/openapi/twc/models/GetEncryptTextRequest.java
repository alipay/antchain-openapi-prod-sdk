// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetEncryptTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证地址
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 存证方使用的链上账号，当存证地址来自其他存证方用户时必填
    @NameInMap("target_account_id")
    public String targetAccountId;

    public static GetEncryptTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEncryptTextRequest self = new GetEncryptTextRequest();
        return TeaModel.build(map, self);
    }

    public GetEncryptTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetEncryptTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetEncryptTextRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public GetEncryptTextRequest setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
        return this;
    }
    public String getTargetAccountId() {
        return this.targetAccountId;
    }

}
