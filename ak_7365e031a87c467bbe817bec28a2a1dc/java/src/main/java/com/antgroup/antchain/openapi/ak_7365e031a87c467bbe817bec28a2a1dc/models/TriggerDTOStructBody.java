// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class TriggerDTOStructBody extends TeaModel {
    // 名称
    @NameInMap("name")
    public String name;

    // 类型
    @NameInMap("type")
    public String type;

    // 源
    @NameInMap("source")
    public String source;

    // 创建时间
    @NameInMap("create_time")
    public String createTime;

    // 错误信息
    @NameInMap("error_message")
    public String errorMessage;

    // 状态
    @NameInMap("status")
    public String status;

    // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
    @NameInMap("option")
    public String option;

    // checkpoint类
    @NameInMap("checkpoint")
    public CheckPointStructBody checkpoint;

    // 待处理的错误事件总数
    @NameInMap("pending_error_logs")
    public String pendingErrorLogs;

    public static TriggerDTOStructBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerDTOStructBody self = new TriggerDTOStructBody();
        return TeaModel.build(map, self);
    }

    public TriggerDTOStructBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TriggerDTOStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TriggerDTOStructBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TriggerDTOStructBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TriggerDTOStructBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TriggerDTOStructBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TriggerDTOStructBody setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public TriggerDTOStructBody setCheckpoint(CheckPointStructBody checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public CheckPointStructBody getCheckpoint() {
        return this.checkpoint;
    }

    public TriggerDTOStructBody setPendingErrorLogs(String pendingErrorLogs) {
        this.pendingErrorLogs = pendingErrorLogs;
        return this;
    }
    public String getPendingErrorLogs() {
        return this.pendingErrorLogs;
    }

}
