// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetAppsBiztypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 000001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // saga状态机定义id
    @NameInMap("statemachine_id")
    public String statemachineId;

    public static GetAppsBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppsBiztypeRequest self = new GetAppsBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public GetAppsBiztypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppsBiztypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAppsBiztypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppsBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetAppsBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAppsBiztypeRequest setStatemachineId(String statemachineId) {
        this.statemachineId = statemachineId;
        return this;
    }
    public String getStatemachineId() {
        return this.statemachineId;
    }

}
