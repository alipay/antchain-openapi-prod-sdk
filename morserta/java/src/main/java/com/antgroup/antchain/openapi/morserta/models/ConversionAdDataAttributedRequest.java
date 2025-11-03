// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ConversionAdDataAttributedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 广告账户id，如9471147
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 转化归因到的媒体渠道
    @NameInMap("media_type")
    @Validation(required = true)
    public String mediaType;

    // 转化发生的unix事件戳，单位秒
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

    // json字段，包含转化归因到的点击的完整必要信息，如用户设备信息等
    @NameInMap("click_data")
    @Validation(required = true)
    public String clickData;

    // 投放项目
    @NameInMap("project")
    @Validation(required = true)
    public String project;

    public static ConversionAdDataAttributedRequest build(java.util.Map<String, ?> map) throws Exception {
        ConversionAdDataAttributedRequest self = new ConversionAdDataAttributedRequest();
        return TeaModel.build(map, self);
    }

    public ConversionAdDataAttributedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConversionAdDataAttributedRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConversionAdDataAttributedRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ConversionAdDataAttributedRequest setEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public Long getEventTime() {
        return this.eventTime;
    }

    public ConversionAdDataAttributedRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ConversionAdDataAttributedRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ConversionAdDataAttributedRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ConversionAdDataAttributedRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ConversionAdDataAttributedRequest setClickData(String clickData) {
        this.clickData = clickData;
        return this;
    }
    public String getClickData() {
        return this.clickData;
    }

    public ConversionAdDataAttributedRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
