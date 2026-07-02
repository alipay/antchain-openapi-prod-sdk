// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarBatchpubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备tuid列表
    @NameInMap("tuid_list")
    @Validation(required = true)
    public java.util.List<String> tuidList;

    // 用户自定义Topic
    @NameInMap("user_topic")
    @Validation(required = true)
    public String userTopic;

    // 消息类型
    @NameInMap("message_type")
    @Validation(required = true)
    public String messageType;

    // 消息内容
    @NameInMap("message_content")
    @Validation(required = true)
    public String messageContent;

    // 触发模式（IMMEDIATE/SCHEDULED）
    @NameInMap("trigger_mode")
    @Validation(required = true)
    public String triggerMode;

    // 定时执行时间戳（triggerMode为SCHEDULED时必填）
    @NameInMap("schedule_time")
    public Long scheduleTime;

    // 批次名称
    @NameInMap("batch_name")
    public String batchName;

    // 重试次数
    @NameInMap("retry_count")
    public Long retryCount;

    // 操作人
    @NameInMap("operator")
    public String operator;

    public static ExecElectrocarBatchpubRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarBatchpubRequest self = new ExecElectrocarBatchpubRequest();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarBatchpubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecElectrocarBatchpubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecElectrocarBatchpubRequest setTuidList(java.util.List<String> tuidList) {
        this.tuidList = tuidList;
        return this;
    }
    public java.util.List<String> getTuidList() {
        return this.tuidList;
    }

    public ExecElectrocarBatchpubRequest setUserTopic(String userTopic) {
        this.userTopic = userTopic;
        return this;
    }
    public String getUserTopic() {
        return this.userTopic;
    }

    public ExecElectrocarBatchpubRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public ExecElectrocarBatchpubRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public ExecElectrocarBatchpubRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public ExecElectrocarBatchpubRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public ExecElectrocarBatchpubRequest setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public ExecElectrocarBatchpubRequest setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

    public ExecElectrocarBatchpubRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
