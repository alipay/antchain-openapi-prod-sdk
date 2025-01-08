// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ffd8f5e932224d668101af0154daa8a6.models;

import com.aliyun.tea.*;

public class QueryAntcloudBxptnewDataproductAsyncRequest extends TeaModel {
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

    public static QueryAntcloudBxptnewDataproductAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudBxptnewDataproductAsyncRequest self = new QueryAntcloudBxptnewDataproductAsyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudBxptnewDataproductAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudBxptnewDataproductAsyncRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAntcloudBxptnewDataproductAsyncRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryAntcloudBxptnewDataproductAsyncRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
