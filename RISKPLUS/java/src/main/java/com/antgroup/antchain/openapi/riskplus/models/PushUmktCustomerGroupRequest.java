// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushUmktCustomerGroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 事件ID
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 数据属性
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    public static PushUmktCustomerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUmktCustomerGroupRequest self = new PushUmktCustomerGroupRequest();
        return TeaModel.build(map, self);
    }

    public PushUmktCustomerGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushUmktCustomerGroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushUmktCustomerGroupRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public PushUmktCustomerGroupRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
