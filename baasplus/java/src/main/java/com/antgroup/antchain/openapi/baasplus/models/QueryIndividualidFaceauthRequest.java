// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证的唯一性id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static QueryIndividualidFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidFaceauthRequest self = new QueryIndividualidFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndividualidFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndividualidFaceauthRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
