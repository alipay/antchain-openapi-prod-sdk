// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class QueryCommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 关键词，模糊查询商品名称、商品code、商品格式化编码
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // 搜索返回条数限制
    @NameInMap("limit")
    public Long limit;

    public static QueryCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityRequest self = new QueryCommodityRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCommodityRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryCommodityRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
