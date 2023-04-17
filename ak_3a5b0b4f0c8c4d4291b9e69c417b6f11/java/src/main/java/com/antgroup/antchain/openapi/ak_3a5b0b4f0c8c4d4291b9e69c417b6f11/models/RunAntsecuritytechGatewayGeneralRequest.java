// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_3a5b0b4f0c8c4d4291b9e69c417b6f11.models;

import com.aliyun.tea.*;

public class RunAntsecuritytechGatewayGeneralRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求数据，json格式
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    // 要调用的具体的服务名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static RunAntsecuritytechGatewayGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAntsecuritytechGatewayGeneralRequest self = new RunAntsecuritytechGatewayGeneralRequest();
        return TeaModel.build(map, self);
    }

    public RunAntsecuritytechGatewayGeneralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunAntsecuritytechGatewayGeneralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunAntsecuritytechGatewayGeneralRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public RunAntsecuritytechGatewayGeneralRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunAntsecuritytechGatewayGeneralRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
