// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgCircuitbreakerrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_names")
    @Validation(required = true)
    public String appNames;

    // 熔断规则配置  [{
    //         "ruleType": "",//熔断规则类型 ce,crt,pe,prt(c代表消费方,p代表服务方,e代表错误率,rt响应时间)
    //         "configs": {
    //             "errorPercentThreshold": 50,//请求错误率阈值
    //             "requestVolumeThreshold": 100,//请求数阈值
    //             "averageRtThreshold":50,//平均RT阈值
    //             "providerTimeout": 100,//服务超时时间
    //             "sleepWindow": 10000,//熔断时间段
    //             "totalMetricWindow": 60,//熔断指标窗口
    //             "codeType": "error/success",
    //             "codes": [
    //                 "200",
    //                 "201",
    //                 "202"
    //             ]
    //         },
    //         "trafficConditions": [{
    //             "field": "sourceApp",//sourceApp,trafficType(此时value取online,test),header
    //             "operation": "EQUAL",//EQUAL,NOT_EQUAL,IN,NOT_IN,REGEX
    //             "type": "system",//system,tracer,header_info
    //             "value": [//当field取trafficType时value取online,test
    //                 "cloudinc"
    //             ]
    //         }],
    //         "action": {
    //             "type": "REJECT/PASS"
    //         }
    //     }]
    @NameInMap("circuit_breaker_rule_items")
    public String circuitBreakerRuleItems;

    // 生效条件，JSON数组
    @NameInMap("conditions")
    public String conditions;

    // 熔断配置
    @NameInMap("config")
    public String config;

    // 资源id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 当service_type的值为SPRINGCLOUD时必传，值取(GET、POST、PUT、DELETE)，后端拼接到trafficConditions中
    @NameInMap("http_method")
    public String httpMethod;

    // 当service_type的值为SPRINGCLOUD时必传，后端拼接到trafficConditions中
    @NameInMap("http_path")
    public String httpPath;

    // 	
    // 熔断规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 方法名称，当service_type的值为SPRINGCLOUD时不传
    @NameInMap("method_name")
    public String methodName;

    // 熔断规则运行模式
    @NameInMap("mode")
    public String mode;

    // 规则名
    @NameInMap("name")
    public String name;

    // 资源标识，资源格式是serviceId:trafficType:resType
    @NameInMap("resource")
    public String resource;

    // res的type,组成resource，取值r-rpc(默认), g-gateway, q-mq
    @NameInMap("res_type")
    public String resType;

    // 取值i-inbound, o-outbound,组成resource的部分
    // i代表服务端，o代表消费端
    @NameInMap("traffic_type")
    public String trafficType;

    public static UpdateSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgCircuitbreakerrulesRequest self = new UpdateSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgCircuitbreakerrulesRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public UpdateSgCircuitbreakerrulesRequest setCircuitBreakerRuleItems(String circuitBreakerRuleItems) {
        this.circuitBreakerRuleItems = circuitBreakerRuleItems;
        return this;
    }
    public String getCircuitBreakerRuleItems() {
        return this.circuitBreakerRuleItems;
    }

    public UpdateSgCircuitbreakerrulesRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateSgCircuitbreakerrulesRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateSgCircuitbreakerrulesRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public UpdateSgCircuitbreakerrulesRequest setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public UpdateSgCircuitbreakerrulesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgCircuitbreakerrulesRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateSgCircuitbreakerrulesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateSgCircuitbreakerrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSgCircuitbreakerrulesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public UpdateSgCircuitbreakerrulesRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public UpdateSgCircuitbreakerrulesRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
