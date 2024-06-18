// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryBusinessCodeTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1
    @NameInMap("code")
    @Validation(required = true)
    public Long code;

    // 1
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryBusinessCodeTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessCodeTestRequest self = new QueryBusinessCodeTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessCodeTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessCodeTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessCodeTestRequest setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryBusinessCodeTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
