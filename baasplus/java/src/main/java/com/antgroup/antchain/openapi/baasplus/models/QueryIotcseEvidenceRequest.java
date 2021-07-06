// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIotcseEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 序列化的json string
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static QueryIotcseEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotcseEvidenceRequest self = new QueryIotcseEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotcseEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotcseEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotcseEvidenceRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
