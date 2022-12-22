// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCertDetailurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    public static QueryAuthCertDetailurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCertDetailurlRequest self = new QueryAuthCertDetailurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthCertDetailurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthCertDetailurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthCertDetailurlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
