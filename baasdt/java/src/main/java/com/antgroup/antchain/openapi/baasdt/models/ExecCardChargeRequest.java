// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCardChargeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 交易信息
    @NameInMap("tx")
    @Validation(required = true)
    public Transaction tx;

    public static ExecCardChargeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCardChargeRequest self = new ExecCardChargeRequest();
        return TeaModel.build(map, self);
    }

    public ExecCardChargeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCardChargeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCardChargeRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCardChargeRequest setTx(Transaction tx) {
        this.tx = tx;
        return this;
    }
    public Transaction getTx() {
        return this.tx;
    }

}
