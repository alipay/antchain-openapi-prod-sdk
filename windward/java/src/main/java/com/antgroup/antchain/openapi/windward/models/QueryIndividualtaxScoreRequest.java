// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.windward.models;

import com.aliyun.tea.*;

public class QueryIndividualtaxScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求体
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static QueryIndividualtaxScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualtaxScoreRequest self = new QueryIndividualtaxScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividualtaxScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndividualtaxScoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndividualtaxScoreRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
