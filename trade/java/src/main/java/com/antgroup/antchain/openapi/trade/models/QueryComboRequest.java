// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 类目编码
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    public static QueryComboRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComboRequest self = new QueryComboRequest();
        return TeaModel.build(map, self);
    }

    public QueryComboRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComboRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

}
