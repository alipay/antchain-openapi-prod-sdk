// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class BatchSendTaskData extends TeaModel {
    // 批量发送任务id
    /**
     * <strong>example:</strong>
     * <p>202409050005000000019020</p>
     */
    @NameInMap("batch_task_id")
    @Validation(required = true)
    public String batchTaskId;

    public static BatchSendTaskData build(java.util.Map<String, ?> map) throws Exception {
        BatchSendTaskData self = new BatchSendTaskData();
        return TeaModel.build(map, self);
    }

    public BatchSendTaskData setBatchTaskId(String batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public String getBatchTaskId() {
        return this.batchTaskId;
    }

}
