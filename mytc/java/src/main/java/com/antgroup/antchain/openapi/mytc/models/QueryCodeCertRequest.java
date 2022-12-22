// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型，客户自定义标签，做code数据隔离使用
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 区块链上交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String txHash;

    // 是否展示交易具体内容，默认false
    @NameInMap("content_flag")
    public Boolean contentFlag;

    public static QueryCodeCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeCertRequest self = new QueryCodeCertRequest();
        return TeaModel.build(map, self);
    }

    public QueryCodeCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCodeCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCodeCertRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryCodeCertRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryCodeCertRequest setContentFlag(Boolean contentFlag) {
        this.contentFlag = contentFlag;
        return this;
    }
    public Boolean getContentFlag() {
        return this.contentFlag;
    }

}
