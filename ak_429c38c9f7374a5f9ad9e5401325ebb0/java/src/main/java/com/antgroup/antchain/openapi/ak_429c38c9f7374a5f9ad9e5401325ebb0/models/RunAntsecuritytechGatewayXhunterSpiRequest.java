// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_429c38c9f7374a5f9ad9e5401325ebb0.models;

import com.aliyun.tea.*;

public class RunAntsecuritytechGatewayXhunterSpiRequest extends TeaModel {
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

    public static RunAntsecuritytechGatewayXhunterSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAntsecuritytechGatewayXhunterSpiRequest self = new RunAntsecuritytechGatewayXhunterSpiRequest();
        return TeaModel.build(map, self);
    }

    public RunAntsecuritytechGatewayXhunterSpiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunAntsecuritytechGatewayXhunterSpiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunAntsecuritytechGatewayXhunterSpiRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public RunAntsecuritytechGatewayXhunterSpiRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunAntsecuritytechGatewayXhunterSpiRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
