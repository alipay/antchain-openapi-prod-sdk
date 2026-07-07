// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class NotifyEmbedoemautoinsuranceEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 事件类型
    @NameInMap("event_type")
    @Validation(required = true)
    public String eventType;

    // 事件发生时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("event_time")
    @Validation(required = true)
    public String eventTime;

    // 事件业务数据，JSON格式字符串
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static NotifyEmbedoemautoinsuranceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyEmbedoemautoinsuranceEventRequest self = new NotifyEmbedoemautoinsuranceEventRequest();
        return TeaModel.build(map, self);
    }

    public NotifyEmbedoemautoinsuranceEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyEmbedoemautoinsuranceEventRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyEmbedoemautoinsuranceEventRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public NotifyEmbedoemautoinsuranceEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public NotifyEmbedoemautoinsuranceEventRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public NotifyEmbedoemautoinsuranceEventRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
