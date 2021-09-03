// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BatchInfo extends TeaModel {
    // 修复的批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    public static BatchInfo build(java.util.Map<String, ?> map) throws Exception {
        BatchInfo self = new BatchInfo();
        return TeaModel.build(map, self);
    }

    public BatchInfo setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
