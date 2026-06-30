// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryFaceshieldWebRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户id，标识客户来源
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 设备token
    @NameInMap("apdid_token")
    public String apdidToken;

    // 切面数据（JSON，详见下方）
    @NameInMap("aop_data")
    public String aopData;

    // RaaS租户
    // 
    @NameInMap("raas_products")
    @Validation(required = true)
    public String raasProducts;

    // raas二级租户
    // 
    @NameInMap("raas_second_tenant")
    public String raasSecondTenant;

    public static QueryFaceshieldWebRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceshieldWebRequest self = new QueryFaceshieldWebRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceshieldWebRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceshieldWebRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceshieldWebRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryFaceshieldWebRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryFaceshieldWebRequest setAopData(String aopData) {
        this.aopData = aopData;
        return this;
    }
    public String getAopData() {
        return this.aopData;
    }

    public QueryFaceshieldWebRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

    public QueryFaceshieldWebRequest setRaasSecondTenant(String raasSecondTenant) {
        this.raasSecondTenant = raasSecondTenant;
        return this;
    }
    public String getRaasSecondTenant() {
        return this.raasSecondTenant;
    }

}
