// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushQmpBackflowEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回流事件id，对应租户回流事件id
    @NameInMap("event_id")
    @Validation(required = true)
    public Long eventId;

    // 回流事件记录列表
    @NameInMap("event_records")
    @Validation(required = true)
    public java.util.List<BackflowEventRecord> eventRecords;

    public static PushQmpBackflowEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PushQmpBackflowEventRequest self = new PushQmpBackflowEventRequest();
        return TeaModel.build(map, self);
    }

    public PushQmpBackflowEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushQmpBackflowEventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushQmpBackflowEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public PushQmpBackflowEventRequest setEventRecords(java.util.List<BackflowEventRecord> eventRecords) {
        this.eventRecords = eventRecords;
        return this;
    }
    public java.util.List<BackflowEventRecord> getEventRecords() {
        return this.eventRecords;
    }

}
