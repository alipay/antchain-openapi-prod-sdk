// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class QueryModelbackProductextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通过产品Code查询出相关产品的产品名、模版字段等信息
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    public static QueryModelbackProductextRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelbackProductextRequest self = new QueryModelbackProductextRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelbackProductextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelbackProductextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelbackProductextRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

}
