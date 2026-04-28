// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarBatchpubjobsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户Id
    @NameInMap("tenant_id")
    public String tenantId;

    // 批次Id
    @NameInMap("batch_id")
    public String batchId;

    // 批次状态过滤（可选，如 PENDING/EXECUTING/COMPLETED/CANCELLED/PARTIAL_FAILED）
    @NameInMap("status")
    public String status;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryElectrocarBatchpubjobsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarBatchpubjobsRequest self = new QueryElectrocarBatchpubjobsRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarBatchpubjobsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarBatchpubjobsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarBatchpubjobsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryElectrocarBatchpubjobsRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryElectrocarBatchpubjobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryElectrocarBatchpubjobsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarBatchpubjobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
