// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TraceDTO extends TeaModel {
    // 查询的 Cell
    @NameInMap("cell")
    public String cell;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息查询所用的 Message ID
    @NameInMap("msg_id")
    public String msgId;

    // 消息查询所用的 Message Key
    @NameInMap("msg_key")
    public String msgKey;

    // 查询 ID
    @NameInMap("query_id")
    @Validation(required = true)
    public String queryId;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 查询的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static TraceDTO build(java.util.Map<String, ?> map) throws Exception {
        TraceDTO self = new TraceDTO();
        return TeaModel.build(map, self);
    }

    public TraceDTO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public TraceDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public TraceDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public TraceDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TraceDTO setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public TraceDTO setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public TraceDTO setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public TraceDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
