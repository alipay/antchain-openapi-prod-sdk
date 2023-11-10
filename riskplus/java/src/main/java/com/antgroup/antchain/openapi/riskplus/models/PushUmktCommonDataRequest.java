// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushUmktCommonDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据推送事件ID
    @NameInMap("event_id")
    @Validation(required = true)
    public Long eventId;

    // 数据推送属性数据
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    public static PushUmktCommonDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUmktCommonDataRequest self = new PushUmktCommonDataRequest();
        return TeaModel.build(map, self);
    }

    public PushUmktCommonDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushUmktCommonDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushUmktCommonDataRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public PushUmktCommonDataRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
