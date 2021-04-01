// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationEnterpriseFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证的唯一性标示
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryIdentificationEnterpriseFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationEnterpriseFaceauthRequest self = new QueryIdentificationEnterpriseFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationEnterpriseFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentificationEnterpriseFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentificationEnterpriseFaceauthRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
