// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ConversionAdDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 投放项目
    @NameInMap("project")
    @Validation(required = true)
    public String project;

    // 转化发生的unix事件戳,单位秒
    @NameInMap("event_time")
    @Validation(required = true)
    public Long eventTime;

    // 事件类型编码
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 转化所属用户在客户系统中的用户id
    @NameInMap("user_id")
    public String userId;

    // 转化对应的产品id，如用户购买保险对应的保险产品id，没有可不填
    @NameInMap("product_id")
    public String productId;

    // 唯一标识当前转化事件的一个业务id，如保险下单的订单id，没有可不填
    @NameInMap("event_id")
    public String eventId;

    // json字段， {"xxx": xxx, "yyyy":"yyyy"}， 包含转化对应的媒体侧信息，如click_id, gdt_vid，跳转链接等，数科侧会依据该id与自行收集到的点击进行匹配归因
    @NameInMap("track_info")
    @Validation(required = true)
    public String trackInfo;

    // json扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static ConversionAdDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ConversionAdDataRequest self = new ConversionAdDataRequest();
        return TeaModel.build(map, self);
    }

    public ConversionAdDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConversionAdDataRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ConversionAdDataRequest setEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public Long getEventTime() {
        return this.eventTime;
    }

    public ConversionAdDataRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ConversionAdDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ConversionAdDataRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ConversionAdDataRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ConversionAdDataRequest setTrackInfo(String trackInfo) {
        this.trackInfo = trackInfo;
        return this;
    }
    public String getTrackInfo() {
        return this.trackInfo;
    }

    public ConversionAdDataRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
