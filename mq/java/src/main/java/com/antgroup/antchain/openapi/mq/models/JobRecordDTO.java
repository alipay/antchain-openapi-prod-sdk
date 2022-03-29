// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class JobRecordDTO extends TeaModel {
    // 结束时间
    @NameInMap("end")
    public String end;

    // 任务执行id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 执行总进度
    // 
    // 总的进度为100，这里的进度条如何配置需要，前端同学定一下，我来改
    @NameInMap("progress")
    @Validation(required = true)
    public Long progress;

    // 任务执行状态
    @NameInMap("run_type")
    @Validation(required = true)
    public String runType;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public String start;

    // 任务执行记录集合
    @NameInMap("task_records")
    @Validation(required = true)
    public java.util.List<TaskRecordDTO> taskRecords;

    // 执行耗时
    @NameInMap("time")
    public Long time;

    // 触发类型
    @NameInMap("trigger_type")
    @Validation(required = true)
    public String triggerType;

    // 分区信息
    @NameInMap("partition")
    @Validation(required = true)
    public String partition;

    // 触发上下文
    @NameInMap("context")
    public String context;

    public static JobRecordDTO build(java.util.Map<String, ?> map) throws Exception {
        JobRecordDTO self = new JobRecordDTO();
        return TeaModel.build(map, self);
    }

    public JobRecordDTO setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public JobRecordDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public JobRecordDTO setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public JobRecordDTO setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public JobRecordDTO setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public JobRecordDTO setTaskRecords(java.util.List<TaskRecordDTO> taskRecords) {
        this.taskRecords = taskRecords;
        return this;
    }
    public java.util.List<TaskRecordDTO> getTaskRecords() {
        return this.taskRecords;
    }

    public JobRecordDTO setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public JobRecordDTO setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public JobRecordDTO setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public JobRecordDTO setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
