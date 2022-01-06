// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class EnableSgRouterrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 下发版本
    @NameInMap("dispatch_version")
    @Validation(required = true)
    public Long dispatchVersion;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public String enabled;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 编辑人
    @NameInMap("operator")
    public String operator;

    // RouterRuleModel
    @NameInMap("rules")
    public String rules;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static EnableSgRouterrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSgRouterrulesRequest self = new EnableSgRouterrulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableSgRouterrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableSgRouterrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableSgRouterrulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnableSgRouterrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public EnableSgRouterrulesRequest setDispatchVersion(Long dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public Long getDispatchVersion() {
        return this.dispatchVersion;
    }

    public EnableSgRouterrulesRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public EnableSgRouterrulesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnableSgRouterrulesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public EnableSgRouterrulesRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public EnableSgRouterrulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
