// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCardChargeresetRequest extends TeaModel {
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

    public static ExecCardChargeresetRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCardChargeresetRequest self = new ExecCardChargeresetRequest();
        return TeaModel.build(map, self);
    }

    public ExecCardChargeresetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCardChargeresetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCardChargeresetRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCardChargeresetRequest setTx(Transaction tx) {
        this.tx = tx;
        return this;
    }
    public Transaction getTx() {
        return this.tx;
    }

}
