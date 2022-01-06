// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CircuitBreakerRuleModel extends TeaModel {
    // 应用名，数组形式，一般只有一个
    @NameInMap("app_names")
    @Validation(required = true)
    public java.util.List<String> appNames;

    // 统一熔断模型
    // "circuit_breaker_rule_items": [
    //             {
    //                 "ruleType": "avgRt",
    //                 "action": {
    //                     "type": "REJECT"
    //                 },
    //                 "configs": {
    //                     "totalMetricWindow": 10,
    //                     "requestVolumeThreshold": 10,
    //                     "averageRtThreshold": 50,
    //                     "sleepWindow": 1000
    //                 },
    //                 "trafficConditions": [
    //                     {
    //                         "type": "system",
    //                         "field": "trafficType",
    //                         "operation": "EQUAL",
    //                         "value": [
    //                             "online"
    //                         ]
    //                     }
    //                 ]
    //             }
    //         ],
    @NameInMap("circuit_breaker_rule_items")
    public java.util.List<CircuitBreakerRuleItemModel> circuitBreakerRuleItems;

    // 熔断生效条件
    @NameInMap("conditions")
    public java.util.List<CircuitRuleBaseConditionModel> conditions;

    // 熔断配置
    @NameInMap("config")
    public CircuitBreakerConfigModel config;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 取值GET、POST、DELETE、PUT(serviceType为SPRINGCLOUD时才有值)
    @NameInMap("http_method")
    public String httpMethod;

    // 可以传*表示通配符(serviceType为SPRINGCLOUD时才有值)
    @NameInMap("http_path")
    public String httpPath;

    // 数据库自增id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 方法名称(serviceType为SPRINGCLOUD时不传)
    @NameInMap("method_name")
    public String methodName;

    // 熔断生效模式
    @NameInMap("mode")
    public String mode;

    // 熔断规则名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // dataId.methodName:trfficType:resType(当serviceType类型为SPRINGCLOUD时结构为dataId:trfficType:resType)
    @NameInMap("resource")
    public String resource;

    // res的类型(r-rpc,g-gateway,q-mq)
    @NameInMap("res_type")
    public String resType;

    // 服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 规则是否生效
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 流量方向(i-inbound,o-outbound)
    @NameInMap("traffic_type")
    public String trafficType;

    public static CircuitBreakerRuleModel build(java.util.Map<String, ?> map) throws Exception {
        CircuitBreakerRuleModel self = new CircuitBreakerRuleModel();
        return TeaModel.build(map, self);
    }

    public CircuitBreakerRuleModel setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

    public CircuitBreakerRuleModel setCircuitBreakerRuleItems(java.util.List<CircuitBreakerRuleItemModel> circuitBreakerRuleItems) {
        this.circuitBreakerRuleItems = circuitBreakerRuleItems;
        return this;
    }
    public java.util.List<CircuitBreakerRuleItemModel> getCircuitBreakerRuleItems() {
        return this.circuitBreakerRuleItems;
    }

    public CircuitBreakerRuleModel setConditions(java.util.List<CircuitRuleBaseConditionModel> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<CircuitRuleBaseConditionModel> getConditions() {
        return this.conditions;
    }

    public CircuitBreakerRuleModel setConfig(CircuitBreakerConfigModel config) {
        this.config = config;
        return this;
    }
    public CircuitBreakerConfigModel getConfig() {
        return this.config;
    }

    public CircuitBreakerRuleModel setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CircuitBreakerRuleModel setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CircuitBreakerRuleModel setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public CircuitBreakerRuleModel setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public CircuitBreakerRuleModel setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CircuitBreakerRuleModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CircuitBreakerRuleModel setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public CircuitBreakerRuleModel setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CircuitBreakerRuleModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CircuitBreakerRuleModel setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CircuitBreakerRuleModel setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CircuitBreakerRuleModel setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public CircuitBreakerRuleModel setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CircuitBreakerRuleModel setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CircuitBreakerRuleModel setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
