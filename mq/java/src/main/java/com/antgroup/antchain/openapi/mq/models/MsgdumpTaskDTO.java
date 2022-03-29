// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgdumpTaskDTO extends TeaModel {
    // 描述
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 源 eventcode
    @NameInMap("source_event_code")
    @Validation(required = true)
    public String sourceEventCode;

    // 源实例 id
    @NameInMap("source_instance_id")
    @Validation(required = true)
    public String sourceInstanceId;

    // 源 topic
    @NameInMap("source_topic")
    @Validation(required = true)
    public String sourceTopic;

    // 任务状态
    // 0: 初始化中；1: 运行中；2: 停止中；3: 已停止
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 目标实例 id
    @NameInMap("target_instance_id")
    @Validation(required = true)
    public String targetInstanceId;

    // 目标 tag
    @NameInMap("target_tag")
    @Validation(required = true)
    public String targetTag;

    // 目标 topic
    @NameInMap("target_topic")
    @Validation(required = true)
    public String targetTopic;

    // 任务 id
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // 消息同步目标 cell
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    public static MsgdumpTaskDTO build(java.util.Map<String, ?> map) throws Exception {
        MsgdumpTaskDTO self = new MsgdumpTaskDTO();
        return TeaModel.build(map, self);
    }

    public MsgdumpTaskDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public MsgdumpTaskDTO setSourceEventCode(String sourceEventCode) {
        this.sourceEventCode = sourceEventCode;
        return this;
    }
    public String getSourceEventCode() {
        return this.sourceEventCode;
    }

    public MsgdumpTaskDTO setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public MsgdumpTaskDTO setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public MsgdumpTaskDTO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public MsgdumpTaskDTO setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public MsgdumpTaskDTO setTargetTag(String targetTag) {
        this.targetTag = targetTag;
        return this;
    }
    public String getTargetTag() {
        return this.targetTag;
    }

    public MsgdumpTaskDTO setTargetTopic(String targetTopic) {
        this.targetTopic = targetTopic;
        return this;
    }
    public String getTargetTopic() {
        return this.targetTopic;
    }

    public MsgdumpTaskDTO setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public MsgdumpTaskDTO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

}
