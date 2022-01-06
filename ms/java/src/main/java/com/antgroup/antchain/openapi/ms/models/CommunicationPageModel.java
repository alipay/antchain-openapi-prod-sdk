// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CommunicationPageModel extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

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

    public static CommunicationPageModel build(java.util.Map<String, ?> map) throws Exception {
        CommunicationPageModel self = new CommunicationPageModel();
        return TeaModel.build(map, self);
    }

    public CommunicationPageModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CommunicationPageModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CommunicationPageModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommunicationPageModel setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public CommunicationPageModel setMode(Long mode) {
        this.mode = mode;
        return this;
    }
    public Long getMode() {
        return this.mode;
    }

    public CommunicationPageModel setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public CommunicationPageModel setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public CommunicationPageModel setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public CommunicationPageModel setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CommunicationPageModel setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

}
