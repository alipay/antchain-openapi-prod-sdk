// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class BindingDO extends TeaModel {
    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // exchange_type
    @NameInMap("exchange_type")
    @Validation(required = true)
    public String exchangeType;

    // expression
    @NameInMap("expression")
    public String expression;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // group
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // persistence
    @NameInMap("persistence")
    @Validation(required = true)
    public Boolean persistence;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static BindingDO build(java.util.Map<String, ?> map) throws Exception {
        BindingDO self = new BindingDO();
        return TeaModel.build(map, self);
    }

    public BindingDO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BindingDO setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public BindingDO setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public BindingDO setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public BindingDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public BindingDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public BindingDO setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public BindingDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BindingDO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindingDO setPersistence(Boolean persistence) {
        this.persistence = persistence;
        return this;
    }
    public Boolean getPersistence() {
        return this.persistence;
    }

    public BindingDO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
