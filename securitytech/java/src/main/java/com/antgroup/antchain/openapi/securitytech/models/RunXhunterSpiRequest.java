// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RunXhunterSpiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    // XHUNTER_ISV_STANDARD
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // json
    @NameInMap("ext_info")
    public String extInfo;

    // raas_products
    @NameInMap("raas_products")
    @Validation(required = true)
    public String raasProducts;

    public static RunXhunterSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        RunXhunterSpiRequest self = new RunXhunterSpiRequest();
        return TeaModel.build(map, self);
    }

    public RunXhunterSpiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunXhunterSpiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunXhunterSpiRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public RunXhunterSpiRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunXhunterSpiRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RunXhunterSpiRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

}
