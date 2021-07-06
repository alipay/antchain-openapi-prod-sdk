// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseidFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证的唯一性标示
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryEnterpriseidFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseidFaceauthRequest self = new QueryEnterpriseidFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseidFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseidFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseidFaceauthRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
