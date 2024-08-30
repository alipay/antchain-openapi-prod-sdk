// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiDwhTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链bizid
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // block_hash
    @NameInMap("block_hash")
    public String blockHash;

    // end_timestamp
    @NameInMap("end_timestamp")
    public Long endTimestamp;

    // from
    @NameInMap("from")
    public String from;

    // pageNo
    @NameInMap("page_no")
    public Long pageNo;

    // pageSize
    @NameInMap("page_size")
    @Validation(maximum = 100)
    public Long pageSize;

    // startTimestamp
    @NameInMap("start_timestamp")
    public Long startTimestamp;

    // to
    @NameInMap("to")
    public String to;

    // transactionHash
    @NameInMap("transaction_hash")
    public String transactionHash;

    // transactionType
    @NameInMap("transaction_type")
    public Long transactionType;

    public static QueryApiDwhTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDwhTransactionRequest self = new QueryApiDwhTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiDwhTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiDwhTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApiDwhTransactionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryApiDwhTransactionRequest setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public QueryApiDwhTransactionRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public QueryApiDwhTransactionRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryApiDwhTransactionRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryApiDwhTransactionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApiDwhTransactionRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public QueryApiDwhTransactionRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryApiDwhTransactionRequest setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public QueryApiDwhTransactionRequest setTransactionType(Long transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public Long getTransactionType() {
        return this.transactionType;
    }

}
