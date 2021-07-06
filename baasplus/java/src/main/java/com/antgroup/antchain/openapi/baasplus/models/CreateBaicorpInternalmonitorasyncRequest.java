// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CreateBaicorpInternalmonitorasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景id
    @NameInMap("biz_id")
    public String bizId;

    // 用于内部业务统计的信息
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 监测传播时间，单位暂定天
    @NameInMap("broadcast_time")
    public Long broadcastTime;

    // 基于安全考虑，填充NonceId
    @NameInMap("custom_id")
    public String customId;

    // 待检测内容RAW数据
    @NameInMap("entity_data")
    public String entityData;

    // 待监测内容类型
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
    @NameInMap("entity_url")
    public String entityUrl;

    // 监测输入的多个关键词
    @NameInMap("key_words")
    @Validation(required = true)
    public java.util.List<String> keyWords;

    // 匹配时长，单位秒
    @NameInMap("matched_duration")
    public Long matchedDuration;

    // 监测时长，单位为天
    @NameInMap("monitor_duration")
    public Long monitorDuration;

    // 监测频次，单位暂定天
    @NameInMap("monitor_frequency")
    @Validation(required = true)
    public Long monitorFrequency;

    // 监测范围
    @NameInMap("monitor_scope")
    public java.util.List<String> monitorScope;

    // 监测事件发送时的回调通知URL，若为空则不发送通知，24小时内最少发送成功一次
    @NameInMap("notify_url")
    public String notifyUrl;

    // provider id
    @NameInMap("provider_id")
    public String providerId;

    // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
    @NameInMap("start_date")
    public Long startDate;

    // 业务方任务id，业务方保证唯一
    @NameInMap("task_id")
    public String taskId;

    public static CreateBaicorpInternalmonitorasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaicorpInternalmonitorasyncRequest self = new CreateBaicorpInternalmonitorasyncRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaicorpInternalmonitorasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaicorpInternalmonitorasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaicorpInternalmonitorasyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBaicorpInternalmonitorasyncRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public CreateBaicorpInternalmonitorasyncRequest setBroadcastTime(Long broadcastTime) {
        this.broadcastTime = broadcastTime;
        return this;
    }
    public Long getBroadcastTime() {
        return this.broadcastTime;
    }

    public CreateBaicorpInternalmonitorasyncRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreateBaicorpInternalmonitorasyncRequest setEntityData(String entityData) {
        this.entityData = entityData;
        return this;
    }
    public String getEntityData() {
        return this.entityData;
    }

    public CreateBaicorpInternalmonitorasyncRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateBaicorpInternalmonitorasyncRequest setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
        return this;
    }
    public String getEntityUrl() {
        return this.entityUrl;
    }

    public CreateBaicorpInternalmonitorasyncRequest setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public CreateBaicorpInternalmonitorasyncRequest setMatchedDuration(Long matchedDuration) {
        this.matchedDuration = matchedDuration;
        return this;
    }
    public Long getMatchedDuration() {
        return this.matchedDuration;
    }

    public CreateBaicorpInternalmonitorasyncRequest setMonitorDuration(Long monitorDuration) {
        this.monitorDuration = monitorDuration;
        return this;
    }
    public Long getMonitorDuration() {
        return this.monitorDuration;
    }

    public CreateBaicorpInternalmonitorasyncRequest setMonitorFrequency(Long monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
        return this;
    }
    public Long getMonitorFrequency() {
        return this.monitorFrequency;
    }

    public CreateBaicorpInternalmonitorasyncRequest setMonitorScope(java.util.List<String> monitorScope) {
        this.monitorScope = monitorScope;
        return this;
    }
    public java.util.List<String> getMonitorScope() {
        return this.monitorScope;
    }

    public CreateBaicorpInternalmonitorasyncRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public CreateBaicorpInternalmonitorasyncRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public CreateBaicorpInternalmonitorasyncRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public CreateBaicorpInternalmonitorasyncRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
