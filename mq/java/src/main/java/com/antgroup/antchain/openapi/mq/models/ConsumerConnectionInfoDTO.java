// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerConnectionInfoDTO extends TeaModel {
    // 消费实例的 ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 连接信息
    @NameInMap("connection")
    @Validation(required = true)
    public String connection;

    // PUSH/PULL
    @NameInMap("consume_type")
    @Validation(required = true)
    public String consumeType;

    // Jstack 堆栈信息
    @NameInMap("jstack")
    @Validation(required = true)
    public java.util.List<ThreadTrackDTO> jstack;

    // 客户端语言
    @NameInMap("language")
    @Validation(required = true)
    public String language;

    // 最后更新时间
    @NameInMap("last_timestamp")
    @Validation(required = true)
    public Long lastTimestamp;

    // 消费模型，取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
    @NameInMap("message_model")
    @Validation(required = true)
    public String messageModel;

    // 实时状态统计
    @NameInMap("running_data_list")
    @Validation(required = true)
    public java.util.List<ConsumerRunningDataDTO> runningDataList;

    // 开始时间
    @NameInMap("start_timestamp")
    @Validation(required = true)
    public Long startTimestamp;

    // 订阅关系集合
    @NameInMap("subscription_set")
    @Validation(required = true)
    public java.util.List<SubscriptionDTO> subscriptionSet;

    // 消费线程数
    @NameInMap("thread_count")
    @Validation(required = true)
    public Long threadCount;

    //  客户端版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static ConsumerConnectionInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerConnectionInfoDTO self = new ConsumerConnectionInfoDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerConnectionInfoDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ConsumerConnectionInfoDTO setConnection(String connection) {
        this.connection = connection;
        return this;
    }
    public String getConnection() {
        return this.connection;
    }

    public ConsumerConnectionInfoDTO setConsumeType(String consumeType) {
        this.consumeType = consumeType;
        return this;
    }
    public String getConsumeType() {
        return this.consumeType;
    }

    public ConsumerConnectionInfoDTO setJstack(java.util.List<ThreadTrackDTO> jstack) {
        this.jstack = jstack;
        return this;
    }
    public java.util.List<ThreadTrackDTO> getJstack() {
        return this.jstack;
    }

    public ConsumerConnectionInfoDTO setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ConsumerConnectionInfoDTO setLastTimestamp(Long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public ConsumerConnectionInfoDTO setMessageModel(String messageModel) {
        this.messageModel = messageModel;
        return this;
    }
    public String getMessageModel() {
        return this.messageModel;
    }

    public ConsumerConnectionInfoDTO setRunningDataList(java.util.List<ConsumerRunningDataDTO> runningDataList) {
        this.runningDataList = runningDataList;
        return this;
    }
    public java.util.List<ConsumerRunningDataDTO> getRunningDataList() {
        return this.runningDataList;
    }

    public ConsumerConnectionInfoDTO setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public ConsumerConnectionInfoDTO setSubscriptionSet(java.util.List<SubscriptionDTO> subscriptionSet) {
        this.subscriptionSet = subscriptionSet;
        return this;
    }
    public java.util.List<SubscriptionDTO> getSubscriptionSet() {
        return this.subscriptionSet;
    }

    public ConsumerConnectionInfoDTO setThreadCount(Long threadCount) {
        this.threadCount = threadCount;
        return this;
    }
    public Long getThreadCount() {
        return this.threadCount;
    }

    public ConsumerConnectionInfoDTO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
