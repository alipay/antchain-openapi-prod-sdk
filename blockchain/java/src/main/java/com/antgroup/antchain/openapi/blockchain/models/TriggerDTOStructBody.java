// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TriggerDTOStructBody extends TeaModel {
    // 名称
    /**
     * <strong>example:</strong>
     * <p>9481b612d6ca4cfdbecc5c5d395eda4237c749fa-97fc-4156-9c23-e21cd6060669</p>
     */
    @NameInMap("name")
    public String name;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>&quot;BLOCK&quot;</p>
     */
    @NameInMap("type")
    public String type;

    // 源
    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("source")
    public String source;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>103422</p>
     */
    @NameInMap("create_time")
    public String createTime;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>&quot;error&quot;</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>“success”</p>
     */
    @NameInMap("status")
    public String status;

    // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
    /**
     * <strong>example:</strong>
     * <p>{a:&quot;123&quot;,  b:&quot;123&quot;}</p>
     */
    @NameInMap("option")
    public String option;

    // checkpoint类
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("checkpoint")
    public CheckPointStructBody checkpoint;

    // 待处理的错误事件总数
    /**
     * <strong>example:</strong>
     * <p>待处理的错误事件总数</p>
     */
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
