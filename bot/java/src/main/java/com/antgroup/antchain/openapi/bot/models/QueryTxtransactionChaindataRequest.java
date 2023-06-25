// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTxtransactionChaindataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上链hash值，和request_id必须有一个有值
    @NameInMap("tx_hash")
    public String txHash;

    // 上链请求消息id，和tx_hash必须有一个有值
    @NameInMap("request_id")
    public String requestId;

    public static QueryTxtransactionChaindataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTxtransactionChaindataRequest self = new QueryTxtransactionChaindataRequest();
        return TeaModel.build(map, self);
    }

    public QueryTxtransactionChaindataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTxtransactionChaindataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTxtransactionChaindataRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryTxtransactionChaindataRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
