// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecCardForbiddenRequest extends TeaModel {
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

    public static ExecCardForbiddenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCardForbiddenRequest self = new ExecCardForbiddenRequest();
        return TeaModel.build(map, self);
    }

    public ExecCardForbiddenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCardForbiddenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecCardForbiddenRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecCardForbiddenRequest setTx(Transaction tx) {
        this.tx = tx;
        return this;
    }
    public Transaction getTx() {
        return this.tx;
    }

}
