// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciUserbyphoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    public static QueryDciUserbyphoneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciUserbyphoneRequest self = new QueryDciUserbyphoneRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciUserbyphoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciUserbyphoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciUserbyphoneRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
