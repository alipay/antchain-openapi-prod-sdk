// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class BatchSendTaskData extends TeaModel {
    // 批量发送任务id
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
