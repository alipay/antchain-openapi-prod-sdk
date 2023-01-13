// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightSearchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
    @NameInMap("biz_ids")
    public java.util.List<String> bizIds;

    // 搜索请求
    @NameInMap("request")
    @Validation(required = true)
    public ChainInsightSearchRequest request;

    public static QueryChaininsightSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightSearchRequest self = new QueryChaininsightSearchRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightSearchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightSearchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightSearchRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public QueryChaininsightSearchRequest setBizIds(java.util.List<String> bizIds) {
        this.bizIds = bizIds;
        return this;
    }
    public java.util.List<String> getBizIds() {
        return this.bizIds;
    }

    public QueryChaininsightSearchRequest setRequest(ChainInsightSearchRequest request) {
        this.request = request;
        return this;
    }
    public ChainInsightSearchRequest getRequest() {
        return this.request;
    }

}
