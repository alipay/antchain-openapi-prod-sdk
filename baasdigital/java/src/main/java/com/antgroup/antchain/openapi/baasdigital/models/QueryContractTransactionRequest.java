// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryContractTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 业务方请求唯一标识，用于异步查询交易情况。
    // trace_id 和hash至少选择一种，都输入时，使用trace_id查询
    @NameInMap("trace_id")
    public String traceId;

    // 租户id，默认为空
    @NameInMap("tenant_id")
    public String tenantId;

    // 查询的交易hash
    @NameInMap("hash")
    public String hash;

    public static QueryContractTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractTransactionRequest self = new QueryContractTransactionRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractTransactionRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryContractTransactionRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryContractTransactionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryContractTransactionRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
