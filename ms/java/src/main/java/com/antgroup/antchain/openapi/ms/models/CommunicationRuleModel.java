// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CommunicationRuleModel extends TeaModel {
    // [{"key":"aa","value":"bb","type":1}]
    @NameInMap("labels")
    public java.util.List<CommunicationLabelModel> labels;

    // 对labels取的hash值
    @NameInMap("label_code")
    public String labelCode;

    // id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 	
    // 规则名称
    @NameInMap("name")
    public String name;

    // 取值(0-客户端,1-服务端)
    @NameInMap("direction")
    public Long direction;

    // 模式(0-tls,1-mtls)
    @NameInMap("mode")
    public Long mode;

    // 策略(0-普通,1-国密)
    @NameInMap("strategy")
    public String strategy;

    // 	
    // 状态(0-关闭,1-开启)
    @NameInMap("enabled")
    public Long enabled;

    // 分类(0-应用,1-标签)
    @NameInMap("scope")
    public Long scope;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 操作时间
    @NameInMap("operate_time")
    public String operateTime;

    public static CommunicationRuleModel build(java.util.Map<String, ?> map) throws Exception {
        CommunicationRuleModel self = new CommunicationRuleModel();
        return TeaModel.build(map, self);
    }

    public CommunicationRuleModel setLabels(java.util.List<CommunicationLabelModel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CommunicationLabelModel> getLabels() {
        return this.labels;
    }

    public CommunicationRuleModel setLabelCode(String labelCode) {
        this.labelCode = labelCode;
        return this;
    }
    public String getLabelCode() {
        return this.labelCode;
    }

    public CommunicationRuleModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CommunicationRuleModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CommunicationRuleModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommunicationRuleModel setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public CommunicationRuleModel setMode(Long mode) {
        this.mode = mode;
        return this;
    }
    public Long getMode() {
        return this.mode;
    }

    public CommunicationRuleModel setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public CommunicationRuleModel setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public CommunicationRuleModel setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public CommunicationRuleModel setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CommunicationRuleModel setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

}
