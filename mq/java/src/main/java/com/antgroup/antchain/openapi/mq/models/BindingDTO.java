// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class BindingDTO extends TeaModel {
    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // group
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

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

    // persistence
    @NameInMap("persistence")
    @Validation(required = true)
    public Boolean persistence;

    public static BindingDTO build(java.util.Map<String, ?> map) throws Exception {
        BindingDTO self = new BindingDTO();
        return TeaModel.build(map, self);
    }

    public BindingDTO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BindingDTO setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public BindingDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public BindingDTO setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public BindingDTO setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public BindingDTO setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public BindingDTO setPersistence(Boolean persistence) {
        this.persistence = persistence;
        return this;
    }
    public Boolean getPersistence() {
        return this.persistence;
    }

}
