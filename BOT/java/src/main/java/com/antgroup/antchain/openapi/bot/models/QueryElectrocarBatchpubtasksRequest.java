// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarBatchpubtasksRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次ID
    @NameInMap("batch_id")
    public String batchId;

    // 任务状态过滤（可选，如 PENDING/SUCCESS/FAILED/CANCELLED）
    @NameInMap("status")
    public String status;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryElectrocarBatchpubtasksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarBatchpubtasksRequest self = new QueryElectrocarBatchpubtasksRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarBatchpubtasksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarBatchpubtasksRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarBatchpubtasksRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryElectrocarBatchpubtasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryElectrocarBatchpubtasksRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarBatchpubtasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
