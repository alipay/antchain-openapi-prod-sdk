// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryCctPictureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // InfoSecAnalyzeSyncContent json
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    // RaaS产品码
    @NameInMap("raas_products")
    @Validation(required = true)
    public String raasProducts;

    public static QueryCctPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCctPictureRequest self = new QueryCctPictureRequest();
        return TeaModel.build(map, self);
    }

    public QueryCctPictureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCctPictureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCctPictureRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public QueryCctPictureRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

}
