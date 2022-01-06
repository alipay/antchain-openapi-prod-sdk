// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultToleranceRuleModel extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // app名称
    @NameInMap("app_name")
    public String appName;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 排序字段
    @NameInMap("orders")
    public java.util.List<BaseOrderDO> orders;

    // 是否启用(0-未启用1启用-2部分启用)
    @NameInMap("enabled")
    public Long enabled;

    // 故障隔离的具体规则项
    // {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
    @NameInMap("rule_item_list")
    public java.util.List<FaultToleranceRuleItemModel> ruleItemList;

    // 取值client,server二选1，默认是client
    @NameInMap("direction")
    public String direction;

    public static FaultToleranceRuleModel build(java.util.Map<String, ?> map) throws Exception {
        FaultToleranceRuleModel self = new FaultToleranceRuleModel();
        return TeaModel.build(map, self);
    }

    public FaultToleranceRuleModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public FaultToleranceRuleModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FaultToleranceRuleModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public FaultToleranceRuleModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FaultToleranceRuleModel setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public FaultToleranceRuleModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public FaultToleranceRuleModel setOrders(java.util.List<BaseOrderDO> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<BaseOrderDO> getOrders() {
        return this.orders;
    }

    public FaultToleranceRuleModel setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public FaultToleranceRuleModel setRuleItemList(java.util.List<FaultToleranceRuleItemModel> ruleItemList) {
        this.ruleItemList = ruleItemList;
        return this;
    }
    public java.util.List<FaultToleranceRuleItemModel> getRuleItemList() {
        return this.ruleItemList;
    }

    public FaultToleranceRuleModel setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

}
