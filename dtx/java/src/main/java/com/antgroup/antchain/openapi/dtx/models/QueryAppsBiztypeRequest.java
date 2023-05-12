// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class QueryAppsBiztypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // saga状态机定义id
    @NameInMap("statemachine_id")
    public String statemachineId;

    public static QueryAppsBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppsBiztypeRequest self = new QueryAppsBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppsBiztypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppsBiztypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAppsBiztypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppsBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAppsBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryAppsBiztypeRequest setStatemachineId(String statemachineId) {
        this.statemachineId = statemachineId;
        return this;
    }
    public String getStatemachineId() {
        return this.statemachineId;
    }

}
