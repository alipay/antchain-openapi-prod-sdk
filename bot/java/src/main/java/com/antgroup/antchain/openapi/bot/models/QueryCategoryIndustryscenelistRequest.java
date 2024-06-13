// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCategoryIndustryscenelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类类型
    // 标准品类：standard
    // 自定义品类：custom
    @NameInMap("category_type")
    @Validation(required = true)
    public String categoryType;

    public static QueryCategoryIndustryscenelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCategoryIndustryscenelistRequest self = new QueryCategoryIndustryscenelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryCategoryIndustryscenelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCategoryIndustryscenelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCategoryIndustryscenelistRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

}
