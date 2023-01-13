// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class Trigger extends TeaModel {
    // 导出任务唯一ID
    @NameInMap("name")
    public String name;

    // 导出目标
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 导出的事件类型
    @NameInMap("source")
    public String source;

    // 创建时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 最近的错误描述信息
    @NameInMap("error_message")
    public String errorMessage;

    // 任务的状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 导出任务的待处理错误日志数量
    @NameInMap("pending_error_logs")
    public Long pendingErrorLogs;

    // 检查点信息
    @NameInMap("checkpoint")
    public TriggerCheckpoint checkpoint;

    // 导出任务配置
    @NameInMap("options")
    @Validation(required = true)
    public java.util.List<MapEntry> options;

    public static Trigger build(java.util.Map<String, ?> map) throws Exception {
        Trigger self = new Trigger();
        return TeaModel.build(map, self);
    }

    public Trigger setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Trigger setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Trigger setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public Trigger setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Trigger setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Trigger setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Trigger setPendingErrorLogs(Long pendingErrorLogs) {
        this.pendingErrorLogs = pendingErrorLogs;
        return this;
    }
    public Long getPendingErrorLogs() {
        return this.pendingErrorLogs;
    }

    public Trigger setCheckpoint(TriggerCheckpoint checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public TriggerCheckpoint getCheckpoint() {
        return this.checkpoint;
    }

    public Trigger setOptions(java.util.List<MapEntry> options) {
        this.options = options;
        return this;
    }
    public java.util.List<MapEntry> getOptions() {
        return this.options;
    }

}
