// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryTraceabilityTxCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接入业务标识，一接入方有条链或者必须区分统计业务类型情况下必填。
    @NameInMap("biz_type")
    public String bizType;

    // 溯源信息内容校验码用sha256hex(内容) 计算出其正确性。
    @NameInMap("payload_hash")
    public String payloadHash;

    // 区块链接入来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 区块查证信息透传
    @NameInMap("sub_title")
    public String subTitle;

    // 透传到查证结果的标题信息
    @NameInMap("title")
    public String title;

    // 要查询的区块链交易信息。
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static QueryTraceabilityTxCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceabilityTxCheckRequest self = new QueryTraceabilityTxCheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceabilityTxCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceabilityTxCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTraceabilityTxCheckRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryTraceabilityTxCheckRequest setPayloadHash(String payloadHash) {
        this.payloadHash = payloadHash;
        return this;
    }
    public String getPayloadHash() {
        return this.payloadHash;
    }

    public QueryTraceabilityTxCheckRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryTraceabilityTxCheckRequest setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }
    public String getSubTitle() {
        return this.subTitle;
    }

    public QueryTraceabilityTxCheckRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryTraceabilityTxCheckRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
