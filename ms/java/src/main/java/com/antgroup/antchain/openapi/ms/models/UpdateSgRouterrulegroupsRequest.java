// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgRouterrulegroupsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 下发的版本
    @NameInMap("dispatch_version")
    public Long dispatchVersion;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public Long enabled;

    // 路由规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 编辑人
    @NameInMap("operator")
    public String operator;

    // 路由规则
    @NameInMap("rules")
    @Validation(required = true)
    public String rules;

    // dataID的类型，应用/服务
    @NameInMap("type")
    public String type;

    public static UpdateSgRouterrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgRouterrulegroupsRequest self = new UpdateSgRouterrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgRouterrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgRouterrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgRouterrulegroupsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateSgRouterrulegroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateSgRouterrulegroupsRequest setDispatchVersion(Long dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public Long getDispatchVersion() {
        return this.dispatchVersion;
    }

    public UpdateSgRouterrulegroupsRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public UpdateSgRouterrulegroupsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgRouterrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgRouterrulegroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSgRouterrulegroupsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateSgRouterrulegroupsRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public UpdateSgRouterrulegroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
