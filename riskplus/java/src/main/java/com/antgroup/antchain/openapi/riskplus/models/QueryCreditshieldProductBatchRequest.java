// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldProductBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询类型：
    // 1.还款概率评估
    // 2.经济波动检测
    // 3.触达前筛
    @NameInMap("query_type")
    @Validation(required = true)
    public Long queryType;

    // 查询信息集合
    @NameInMap("query_infos")
    @Validation(required = true)
    public java.util.List<QueryInfo> queryInfos;

    public static QueryCreditshieldProductBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldProductBatchRequest self = new QueryCreditshieldProductBatchRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldProductBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldProductBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldProductBatchRequest setQueryType(Long queryType) {
        this.queryType = queryType;
        return this;
    }
    public Long getQueryType() {
        return this.queryType;
    }

    public QueryCreditshieldProductBatchRequest setQueryInfos(java.util.List<QueryInfo> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<QueryInfo> getQueryInfos() {
        return this.queryInfos;
    }

}
