// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiDwhbTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // biz_id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // hash_list
    @NameInMap("hash_list")
    @Validation(required = true)
    public java.util.List<String> hashList;

    public static QueryApiDwhbTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDwhbTransactionRequest self = new QueryApiDwhbTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiDwhbTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiDwhbTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiDwhbTransactionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryApiDwhbTransactionRequest setHashList(java.util.List<String> hashList) {
        this.hashList = hashList;
        return this;
    }
    public java.util.List<String> getHashList() {
        return this.hashList;
    }

}
