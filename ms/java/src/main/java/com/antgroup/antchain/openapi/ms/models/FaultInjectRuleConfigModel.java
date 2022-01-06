// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultInjectRuleConfigModel extends TeaModel {
    // 方法名
    @NameInMap("method_name")
    public String methodName;

    // 请求类型
    @NameInMap("http_method")
    public String httpMethod;

    // 请求路径
    @NameInMap("http_path")
    public String httpPath;

    // 故障注入生效端（o:客户端生效/ i:服务端生效）
    @NameInMap("traffic_type")
    public String trafficType;

    // 资源标识
    @NameInMap("resource")
    public String resource;

    // 配置项
    @NameInMap("fault_inject_rule_items")
    public java.util.List<FaultInjectRuleItemModel> faultInjectRuleItems;

    public static FaultInjectRuleConfigModel build(java.util.Map<String, ?> map) throws Exception {
        FaultInjectRuleConfigModel self = new FaultInjectRuleConfigModel();
        return TeaModel.build(map, self);
    }

    public FaultInjectRuleConfigModel setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public FaultInjectRuleConfigModel setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public FaultInjectRuleConfigModel setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public FaultInjectRuleConfigModel setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

    public FaultInjectRuleConfigModel setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public FaultInjectRuleConfigModel setFaultInjectRuleItems(java.util.List<FaultInjectRuleItemModel> faultInjectRuleItems) {
        this.faultInjectRuleItems = faultInjectRuleItems;
        return this;
    }
    public java.util.List<FaultInjectRuleItemModel> getFaultInjectRuleItems() {
        return this.faultInjectRuleItems;
    }

}
