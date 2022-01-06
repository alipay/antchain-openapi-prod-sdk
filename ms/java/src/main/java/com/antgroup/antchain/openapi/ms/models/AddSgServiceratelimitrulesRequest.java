// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgServiceratelimitrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 是否开启
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 资源类型
    @NameInMap("resource_type")
    public String resourceType;

    // {"limitStrategy":"ScaledRateLimiter","actionConfig":{"actionType":"LIMIT_EXCEPTION","responseContent":"ssssssssssddd"},"maxBurstRatio":"1","resourceConfigs":[{"method":"方法名","interface":"接口名","baseName":"com.alipay.uctcloud.service.IndicatorClient:1.0@DEFAULT.query","resourceType":"DATA_ID_METHOD"}],"runMode":"CONTROL","calculationConfigs":[{"calculationType":"INVOKE_BY_TIME","period":1000,"trafficType":"ALL","maxAllow":0}],"desc":"测试规则2","resourceType":"DATA_ID_METHOD"}
    @NameInMap("rule_config")
    @Validation(required = true)
    public String ruleConfig;

    // 运行模式
    @NameInMap("run_mode")
    public String runMode;

    // 服务框架类型
    @NameInMap("service_type")
    public String serviceType;

    public static AddSgServiceratelimitrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgServiceratelimitrulesRequest self = new AddSgServiceratelimitrulesRequest();
        return TeaModel.build(map, self);
    }

    public AddSgServiceratelimitrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgServiceratelimitrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgServiceratelimitrulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddSgServiceratelimitrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddSgServiceratelimitrulesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AddSgServiceratelimitrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgServiceratelimitrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSgServiceratelimitrulesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddSgServiceratelimitrulesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddSgServiceratelimitrulesRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public AddSgServiceratelimitrulesRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public AddSgServiceratelimitrulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
