// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.autoinsurancemkt.models;

import com.aliyun.tea.*;

public class NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一标识
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

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

    public static NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest self = new NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public NotifyAntcloudInsuranceEmbedoemautoinsuranceEventRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
