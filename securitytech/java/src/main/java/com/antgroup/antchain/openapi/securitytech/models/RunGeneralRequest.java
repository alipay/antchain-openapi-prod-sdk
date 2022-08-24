// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RunGeneralRequest extends TeaModel {
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

    public static RunGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        RunGeneralRequest self = new RunGeneralRequest();
        return TeaModel.build(map, self);
    }

    public RunGeneralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunGeneralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunGeneralRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public RunGeneralRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
