// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBmpbrowserTransactionqrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁区块链的唯一链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 链上合约id
    @NameInMap("contract_id")
    public String contractId;

    // 蚂蚁区块链的链上交易hash值
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    public static QueryBmpbrowserTransactionqrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBmpbrowserTransactionqrcodeRequest self = new QueryBmpbrowserTransactionqrcodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryBmpbrowserTransactionqrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBmpbrowserTransactionqrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBmpbrowserTransactionqrcodeRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryBmpbrowserTransactionqrcodeRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public QueryBmpbrowserTransactionqrcodeRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
