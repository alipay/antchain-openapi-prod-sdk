// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TaskRecordDTO extends TeaModel {
    // 结束时间
    // 
    // 
    @NameInMap("end")
    public String end;

    // 任务分区名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 开始时间
    // 
    // 
    @NameInMap("start")
    @Validation(required = true)
    public String start;

    // 耗时 s
    // 
    // 
    @NameInMap("time")
    public String time;

    // 任务进度
    // 
    // 
    @NameInMap("progress")
    @Validation(required = true)
    public String progress;

    // 执行成功，执行失败，执行中
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static TaskRecordDTO build(java.util.Map<String, ?> map) throws Exception {
        TaskRecordDTO self = new TaskRecordDTO();
        return TeaModel.build(map, self);
    }

    public TaskRecordDTO setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public TaskRecordDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TaskRecordDTO setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public TaskRecordDTO setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public TaskRecordDTO setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public TaskRecordDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
