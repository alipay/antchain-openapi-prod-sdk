// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TraceMapResultDTO extends TeaModel {
    // 该查询任务的创建时间
    // 
    // 
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    //  实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 该查询任务对应的 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 该查询任务对应的 Message Key
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 查询任务 ID
    @NameInMap("query_id")
    @Validation(required = true)
    public String queryId;

    // 该查询任务的结果。取值说明如下：finish：查询完成；working：查询中；removed：任务已删除。
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 该查询任务的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 该查询任务的匹配轨迹列表
    // 
    @NameInMap("trace_list")
    @Validation(required = true)
    public java.util.List<TraceMapDTO> traceList;

    // 该查询任务的最后更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    //  查询用户 ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static TraceMapResultDTO build(java.util.Map<String, ?> map) throws Exception {
        TraceMapResultDTO self = new TraceMapResultDTO();
        return TeaModel.build(map, self);
    }

    public TraceMapResultDTO setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public TraceMapResultDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TraceMapResultDTO setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public TraceMapResultDTO setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public TraceMapResultDTO setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public TraceMapResultDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceMapResultDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public TraceMapResultDTO setTraceList(java.util.List<TraceMapDTO> traceList) {
        this.traceList = traceList;
        return this;
    }
    public java.util.List<TraceMapDTO> getTraceList() {
        return this.traceList;
    }

    public TraceMapResultDTO setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public TraceMapResultDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
