// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateBindingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // application name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // message type: eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // binding: exchangeType, "DIRECT" or "HEADER"
    @NameInMap("exchange_type")
    @Validation(required = true)
    public String exchangeType;

    // binding: expression
    @NameInMap("expression")
    public String expression;

    // group of subscriber
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // binding: expression
    @NameInMap("persistence")
    @Validation(required = true)
    public Boolean persistence;

    // tenant id
    @NameInMap("tenant")
    public String tenant;

    // message type: topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // workspace id
    @NameInMap("workspace")
    public String workspace;

    // zone info
    @NameInMap("zone")
    public String zone;

    // zone mode
    @NameInMap("zone_mode")
    public String zoneMode;

    public static UpdateBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBindingRequest self = new UpdateBindingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBindingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBindingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBindingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateBindingRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public UpdateBindingRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public UpdateBindingRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateBindingRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpdateBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateBindingRequest setPersistence(Boolean persistence) {
        this.persistence = persistence;
        return this;
    }
    public Boolean getPersistence() {
        return this.persistence;
    }

    public UpdateBindingRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateBindingRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateBindingRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UpdateBindingRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public UpdateBindingRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

}
