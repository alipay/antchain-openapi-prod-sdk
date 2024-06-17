// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class OperateCommonInterfaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参JSON
    @NameInMap("param_json")
    @Validation(required = true)
    public String paramJson;

    // 接口名称
    @NameInMap("interface_name")
    @Validation(required = true)
    public String interfaceName;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    public static OperateCommonInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonInterfaceRequest self = new OperateCommonInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public OperateCommonInterfaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateCommonInterfaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateCommonInterfaceRequest setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }
    public String getParamJson() {
        return this.paramJson;
    }

    public OperateCommonInterfaceRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public OperateCommonInterfaceRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
