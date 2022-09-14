// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeBusinessDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询字段（注册号，社会统一信用代码，公司名称）
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    public static QueryDubbridgeBusinessDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeBusinessDetailRequest self = new QueryDubbridgeBusinessDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeBusinessDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeBusinessDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeBusinessDetailRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
