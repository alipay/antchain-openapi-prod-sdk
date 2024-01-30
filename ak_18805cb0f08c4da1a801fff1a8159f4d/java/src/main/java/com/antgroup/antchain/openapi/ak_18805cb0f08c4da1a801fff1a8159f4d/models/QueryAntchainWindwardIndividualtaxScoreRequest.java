// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_18805cb0f08c4da1a801fff1a8159f4d.models;

import com.aliyun.tea.*;

public class QueryAntchainWindwardIndividualtaxScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求体
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static QueryAntchainWindwardIndividualtaxScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainWindwardIndividualtaxScoreRequest self = new QueryAntchainWindwardIndividualtaxScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainWindwardIndividualtaxScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainWindwardIndividualtaxScoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainWindwardIndividualtaxScoreRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
