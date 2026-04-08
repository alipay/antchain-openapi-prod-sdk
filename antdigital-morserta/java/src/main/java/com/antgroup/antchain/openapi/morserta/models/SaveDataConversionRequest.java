// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class SaveDataConversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 追踪ID，每次请求保持唯一
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 客户ID，广告主标识
    @NameInMap("sponsor_code")
    @Validation(required = true)
    public String sponsorCode;

    // 转化对应的产品id，由数科提供，建议填写
    @NameInMap("product_id")
    public String productId;

    // 唯一标识当前转化事件id，用于转化事件的去重避免重复统计，建议填写，可以是订单ID等业务唯一ID。
    @NameInMap("event_id")
    public String eventId;

    // 转化发生的unix事件戳,单位毫秒
    @NameInMap("event_time")
    @Validation(required = true)
    public Long eventTime;

    // 转化事件类型
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // json字符串，转化附加参数
    @NameInMap("event_param")
    public String eventParam;

    // 转化所属用户在客户系统中的用户id，如电话号码Md5 建议填写
    @NameInMap("user_id")
    public String userId;

    // json字段，格式： {"xxx": xxx, "yyyy":"yyyy"}， 
    // H5/小程序类：为投放前与蚂蚁数科约定的在落地页URL中的埋点参数，包含转化对应的媒体侧返回信息，如click_id, gdt_vid, request_id 跳转链接等务必全量提供
    // App类：设备ID（ Android ID、OAID、OAID_MD5、IDFA、IDFA_MD5、CAID），点击ID、请求ID等
    // 数科侧会依据该信息与自行收集到的点击进行匹配归因，务必详尽提供。
    // 此部分字段信息需在接入前双方确认，主要与媒体平台、投放载体（H5、微信小程序、手机App等）有关，需要客户支持采集(如H5 URL拼接埋点参数、小程序path埋点参数）
    // 具体请参考文档
    @NameInMap("trace_info")
    @Validation(required = true)
    public String traceInfo;

    // json扩展字段。保险行业必填insurance_info，见文档
    @NameInMap("ext_info")
    public String extInfo;

    public static SaveDataConversionRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDataConversionRequest self = new SaveDataConversionRequest();
        return TeaModel.build(map, self);
    }

    public SaveDataConversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveDataConversionRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SaveDataConversionRequest setSponsorCode(String sponsorCode) {
        this.sponsorCode = sponsorCode;
        return this;
    }
    public String getSponsorCode() {
        return this.sponsorCode;
    }

    public SaveDataConversionRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SaveDataConversionRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SaveDataConversionRequest setEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public Long getEventTime() {
        return this.eventTime;
    }

    public SaveDataConversionRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public SaveDataConversionRequest setEventParam(String eventParam) {
        this.eventParam = eventParam;
        return this;
    }
    public String getEventParam() {
        return this.eventParam;
    }

    public SaveDataConversionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SaveDataConversionRequest setTraceInfo(String traceInfo) {
        this.traceInfo = traceInfo;
        return this;
    }
    public String getTraceInfo() {
        return this.traceInfo;
    }

    public SaveDataConversionRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
