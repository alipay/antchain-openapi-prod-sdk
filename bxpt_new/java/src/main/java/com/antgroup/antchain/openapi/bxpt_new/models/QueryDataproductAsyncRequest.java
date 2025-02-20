// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class QueryDataproductAsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 数据产品编码
    // 
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品类型
    // 
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 请求ID，需要确保和异步调用的请求ID一致
    // 
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static QueryDataproductAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataproductAsyncRequest self = new QueryDataproductAsyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataproductAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataproductAsyncRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryDataproductAsyncRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryDataproductAsyncRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
