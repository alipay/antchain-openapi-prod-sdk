// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class BatchActionResult extends TeaModel {
    // 批量挂载结果
    @NameInMap("results")
    public java.util.List<ActionResult> results;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    // success_count
    @NameInMap("success_count")
    public Long successCount;

    // failed_count
    @NameInMap("failed_count")
    public Long failedCount;

    public static BatchActionResult build(java.util.Map<String, ?> map) throws Exception {
        BatchActionResult self = new BatchActionResult();
        return TeaModel.build(map, self);
    }

    public BatchActionResult setResults(java.util.List<ActionResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ActionResult> getResults() {
        return this.results;
    }

    public BatchActionResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public BatchActionResult setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public BatchActionResult setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

}
