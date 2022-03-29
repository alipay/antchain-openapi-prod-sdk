// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateDmsBindingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

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

    public static UpdateDmsBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDmsBindingRequest self = new UpdateDmsBindingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDmsBindingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDmsBindingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDmsBindingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDmsBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDmsBindingRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public UpdateDmsBindingRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public UpdateDmsBindingRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateDmsBindingRequest setPersistence(Boolean persistence) {
        this.persistence = persistence;
        return this;
    }
    public Boolean getPersistence() {
        return this.persistence;
    }

}
