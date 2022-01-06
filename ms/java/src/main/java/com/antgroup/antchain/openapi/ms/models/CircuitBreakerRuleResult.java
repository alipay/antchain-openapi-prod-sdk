// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CircuitBreakerRuleResult extends TeaModel {
    // 多个应用名
    @NameInMap("app_names")
    @Validation(required = true)
    public String appNames;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 规则总数
    @NameInMap("rules_num")
    @Validation(required = true)
    public Long rulesNum;

    // 服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    public static CircuitBreakerRuleResult build(java.util.Map<String, ?> map) throws Exception {
        CircuitBreakerRuleResult self = new CircuitBreakerRuleResult();
        return TeaModel.build(map, self);
    }

    public CircuitBreakerRuleResult setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public CircuitBreakerRuleResult setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CircuitBreakerRuleResult setRulesNum(Long rulesNum) {
        this.rulesNum = rulesNum;
        return this;
    }
    public Long getRulesNum() {
        return this.rulesNum;
    }

    public CircuitBreakerRuleResult setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
