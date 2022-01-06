// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgRouterrulegroupsRequest extends TeaModel {
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
    @Validation(required = true)
    public String dataId;

    // 下发版本
    @NameInMap("dispatch_version")
    public String dispatchVersion;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public Long enabled;

    // id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 编辑人
    @NameInMap("operator")
    public String operator;

    // JSON格式：路由规则
    @NameInMap("rules")
    @Validation(required = true)
    public String rules;

    // dataID的类型，应用/服务；默认为0，服务级
    @NameInMap("type")
    public String type;

    // 规则组名称
    @NameInMap("name")
    public String name;

    public static AddSgRouterrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgRouterrulegroupsRequest self = new AddSgRouterrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public AddSgRouterrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgRouterrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgRouterrulegroupsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddSgRouterrulegroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddSgRouterrulegroupsRequest setDispatchVersion(String dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public String getDispatchVersion() {
        return this.dispatchVersion;
    }

    public AddSgRouterrulegroupsRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AddSgRouterrulegroupsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddSgRouterrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgRouterrulegroupsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddSgRouterrulegroupsRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public AddSgRouterrulegroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddSgRouterrulegroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
