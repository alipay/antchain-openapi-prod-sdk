// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class OcpxAdDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 见对接文档中【Industry行业枚举】部分
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 归因渠道编码，见对接文档中的【渠道枚举】部分
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 归因广告账号id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 见对接文档中【转化事件event_code枚举】部分
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // unix时间戳
    @NameInMap("event_time")
    @Validation(required = true)
    public Long eventTime;

    // 转化用户/设备标识
    @NameInMap("user_info")
    public UserInfo userInfo;

    // 如有去重需求，可传递业务事件id， 唯一标识当前事件。如下单事件中的订单id
    @NameInMap("out_event_id")
    public String outEventId;

    // android/ios/web
    @NameInMap("os_type")
    @Validation(required = true)
    public String osType;

    // 点击id和user_info二者至少传一个
    @NameInMap("click_id")
    public String clickId;

    // 媒体监测链接下发的callback原值
    @NameInMap("callback")
    @Validation(required = true)
    public String callback;

    public static OcpxAdDataRequest build(java.util.Map<String, ?> map) throws Exception {
        OcpxAdDataRequest self = new OcpxAdDataRequest();
        return TeaModel.build(map, self);
    }

    public OcpxAdDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OcpxAdDataRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public OcpxAdDataRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public OcpxAdDataRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public OcpxAdDataRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public OcpxAdDataRequest setEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public Long getEventTime() {
        return this.eventTime;
    }

    public OcpxAdDataRequest setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public OcpxAdDataRequest setOutEventId(String outEventId) {
        this.outEventId = outEventId;
        return this;
    }
    public String getOutEventId() {
        return this.outEventId;
    }

    public OcpxAdDataRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public OcpxAdDataRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public OcpxAdDataRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

}
