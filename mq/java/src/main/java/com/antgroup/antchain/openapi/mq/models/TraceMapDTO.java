// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TraceMapDTO extends TeaModel {
    // 消息发送方的客户端地址
    @NameInMap("born_host")
    @Validation(required = true)
    public String bornHost;

    // 生产端的cell name
    @NameInMap("cell")
    public String cell;

    // 发送耗时，单位毫秒
    @NameInMap("cost_time")
    @Validation(required = true)
    public Long costTime;

    // 消息的 ID，即 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    //  消息的 Key ，即 Message Key
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 发送方客户端配置的 Group ID
    @NameInMap("pub_group_name")
    @Validation(required = true)
    public String pubGroupName;

    // 消息发送时间
    @NameInMap("pub_time")
    @Validation(required = true)
    public Long pubTime;

    // 发送状态。取值说明如下：
    // 
    // SEND_SUCCESS：发送成功
    // SEND_FAILED：发送失败
    // SEND_ROLLBACK：事务消息回滚
    // SEND_UNKNOWN：事务消息未提交
    // SEND_DELAY：定时(延时)消息定时中
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 消息的消费轨迹列表
    @NameInMap("sub_list")
    @Validation(required = true)
    public java.util.List<SubMapDTO> subList;

    // 消息的 Tag，即 Message Tag
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    // 消息的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static TraceMapDTO build(java.util.Map<String, ?> map) throws Exception {
        TraceMapDTO self = new TraceMapDTO();
        return TeaModel.build(map, self);
    }

    public TraceMapDTO setBornHost(String bornHost) {
        this.bornHost = bornHost;
        return this;
    }
    public String getBornHost() {
        return this.bornHost;
    }

    public TraceMapDTO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public TraceMapDTO setCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }
    public Long getCostTime() {
        return this.costTime;
    }

    public TraceMapDTO setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public TraceMapDTO setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public TraceMapDTO setPubGroupName(String pubGroupName) {
        this.pubGroupName = pubGroupName;
        return this;
    }
    public String getPubGroupName() {
        return this.pubGroupName;
    }

    public TraceMapDTO setPubTime(Long pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public Long getPubTime() {
        return this.pubTime;
    }

    public TraceMapDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceMapDTO setSubList(java.util.List<SubMapDTO> subList) {
        this.subList = subList;
        return this;
    }
    public java.util.List<SubMapDTO> getSubList() {
        return this.subList;
    }

    public TraceMapDTO setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public TraceMapDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
