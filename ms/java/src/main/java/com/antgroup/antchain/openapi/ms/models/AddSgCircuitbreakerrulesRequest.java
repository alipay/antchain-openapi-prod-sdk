// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgCircuitbreakerrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_names")
    @Validation(required = true)
    public String appNames;

    // 熔断配置信息，json串。例: [{
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

    // 生效场景
    @NameInMap("conditions")
    public String conditions;

    // 熔断规则
    @NameInMap("config")
    public String config;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 当service_type的值为SPRINGCLOUD时必传，后端拼接到trafficCondition中。
    // 取值范围(GET,POST,PUT,DELETE)
    @NameInMap("http_method")
    public String httpMethod;

    // http的路径值，当service_type的值为SPRINGCLOUD时必填,后端拼接到trafficCondition中
    @NameInMap("http_path")
    public String httpPath;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 方法名称，"*"代表全部方法,当serviceType为SPRINGCLOUD时不传
    @NameInMap("method_name")
    public String methodName;

    // 运行模式
    @NameInMap("mode")
    public String mode;

    // 规则名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 资源标识，资源格式是serviceId:trafficType:resType
    @NameInMap("resource")
    public String resource;

    // resType，resource组成的一部分
    // r-rpc(默认), g-gateway, q-mq
    @NameInMap("res_type")
    public String resType;

    // serviceType，取值(SPRINGCLOUD,SOFA,DUBBO)
    @NameInMap("service_type")
    public String serviceType;

    // 流量方法(o-outbind消费端,i-inbind服务端)
    @NameInMap("traffic_type")
    public String trafficType;

    public static AddSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgCircuitbreakerrulesRequest self = new AddSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public AddSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgCircuitbreakerrulesRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public AddSgCircuitbreakerrulesRequest setCircuitBreakerRuleItems(String circuitBreakerRuleItems) {
        this.circuitBreakerRuleItems = circuitBreakerRuleItems;
        return this;
    }
    public String getCircuitBreakerRuleItems() {
        return this.circuitBreakerRuleItems;
    }

    public AddSgCircuitbreakerrulesRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public AddSgCircuitbreakerrulesRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AddSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddSgCircuitbreakerrulesRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public AddSgCircuitbreakerrulesRequest setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public AddSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgCircuitbreakerrulesRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public AddSgCircuitbreakerrulesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddSgCircuitbreakerrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSgCircuitbreakerrulesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public AddSgCircuitbreakerrulesRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public AddSgCircuitbreakerrulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AddSgCircuitbreakerrulesRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
