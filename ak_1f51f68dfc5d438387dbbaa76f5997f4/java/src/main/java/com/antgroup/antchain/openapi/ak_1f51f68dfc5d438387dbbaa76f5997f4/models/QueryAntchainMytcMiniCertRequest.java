// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class QueryAntchainMytcMiniCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 溯源码信息
    @NameInMap("code")
    @Validation(required = true, maxLength = 160)
    public String code;

    // 交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true, maxLength = 64)
    public String txHash;

    public static QueryAntchainMytcMiniCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainMytcMiniCertRequest self = new QueryAntchainMytcMiniCertRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainMytcMiniCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainMytcMiniCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainMytcMiniCertRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAntchainMytcMiniCertRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
