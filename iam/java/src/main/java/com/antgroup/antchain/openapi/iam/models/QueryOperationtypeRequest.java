// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryOperationtypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 来源信息
    @NameInMap("source")
    public String source;

    public static QueryOperationtypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationtypeRequest self = new QueryOperationtypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationtypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOperationtypeRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public QueryOperationtypeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
