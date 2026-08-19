// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecAiotdatalinkInterfaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务接口
    @NameInMap("api")
    @Validation(required = true)
    public String api;

    // 请求示例，会根据不同的接口传入不同的参数，json 格式字符串
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static ExecAiotdatalinkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAiotdatalinkInterfaceRequest self = new ExecAiotdatalinkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public ExecAiotdatalinkInterfaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAiotdatalinkInterfaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAiotdatalinkInterfaceRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public ExecAiotdatalinkInterfaceRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
