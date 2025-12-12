// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMarketingEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 调用方生成的唯一编码
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 128)
    public String requestId;

    // 特征编码
    @NameInMap("click_id")
    @Validation(required = true, maxLength = 64)
    public String clickId;

    // 点击时间
    @NameInMap("click_time")
    @Validation(required = true, maxLength = 20)
    public String clickTime;

    // 事件类型，枚举：
    // RESERVATION_CHECK（留资）；
    // FIRST_PICK_FREE（领增）；
    // LOW_INSURANCE（低价险）；
    // HIGH_INSURANCE（高价险）；
    @NameInMap("event_code")
    @Validation(required = true, maxLength = 20)
    public String eventCode;

    // 事件完成时间（yyyy-MM-dd  HH:mm:ss）
    @NameInMap("event_time")
    @Validation(required = true, maxLength = 20)
    public String eventTime;

    // 固定式，蚂蚁数科
    @NameInMap("first_channel")
    @Validation(required = true, maxLength = 64)
    public String firstChannel;

    // 二级渠道编码
    @NameInMap("second_channel")
    @Validation(required = true, maxLength = 64)
    public String secondChannel;

    // 三级渠道/广告版位
    @NameInMap("advertising_position")
    @Validation(required = true, maxLength = 64)
    public String advertisingPosition;

    // 业务字段，json格式
    @NameInMap("event_info")
    @Validation(required = true)
    public String eventInfo;

    public static CallbackMarketingEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMarketingEventRequest self = new CallbackMarketingEventRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMarketingEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMarketingEventRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMarketingEventRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public CallbackMarketingEventRequest setClickTime(String clickTime) {
        this.clickTime = clickTime;
        return this;
    }
    public String getClickTime() {
        return this.clickTime;
    }

    public CallbackMarketingEventRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CallbackMarketingEventRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public CallbackMarketingEventRequest setFirstChannel(String firstChannel) {
        this.firstChannel = firstChannel;
        return this;
    }
    public String getFirstChannel() {
        return this.firstChannel;
    }

    public CallbackMarketingEventRequest setSecondChannel(String secondChannel) {
        this.secondChannel = secondChannel;
        return this;
    }
    public String getSecondChannel() {
        return this.secondChannel;
    }

    public CallbackMarketingEventRequest setAdvertisingPosition(String advertisingPosition) {
        this.advertisingPosition = advertisingPosition;
        return this;
    }
    public String getAdvertisingPosition() {
        return this.advertisingPosition;
    }

    public CallbackMarketingEventRequest setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public String getEventInfo() {
        return this.eventInfo;
    }

}
