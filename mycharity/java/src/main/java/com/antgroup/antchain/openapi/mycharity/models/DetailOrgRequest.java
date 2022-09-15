// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class DetailOrgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 50字符，单平台幂等
    @NameInMap("id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String id;

    public static DetailOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailOrgRequest self = new DetailOrgRequest();
        return TeaModel.build(map, self);
    }

    public DetailOrgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailOrgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailOrgRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
