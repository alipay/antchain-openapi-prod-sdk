// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryHealthDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // channel_id
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 设备唯一id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 指标类型 心率:HEART_RATE/血氧:BLOOD_OXYGEN/体温:BODY_TEMP/步数:STEPS/睡眠:SLEEP/呼吸率:RESP_RATE/压力:STRESS/疲劳:FATIGUE/情绪:EMOTION
    @NameInMap("metric_type")
    public String metricType;

    // 查询开始时间(毫秒级时间戳)
    @NameInMap("start_time")
    public Long startTime;

    // 查询结束时间（毫秒级时间戳）
    @NameInMap("end_time")
    public Long endTime;

    // 预留可扩展字段json
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryHealthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthDataRequest self = new QueryHealthDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryHealthDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHealthDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHealthDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryHealthDataRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryHealthDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public QueryHealthDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryHealthDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryHealthDataRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
