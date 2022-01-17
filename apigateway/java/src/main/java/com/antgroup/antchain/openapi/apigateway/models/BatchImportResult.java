// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class BatchImportResult extends TeaModel {
    // failed_count
    @NameInMap("failed_count")
    public Long failedCount;

    // 重复的API列表
    @NameInMap("repeat_api_list")
    public java.util.List<ApiTransferVO> repeatApiList;

    // results
    @NameInMap("results")
    public java.util.List<ImportResult> results;

    // success_count
    @NameInMap("success_count")
    public Long successCount;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    // 导入成功的API列表
    @NameInMap("success_api_list")
    public java.util.List<ApiInfoVO> successApiList;

    public static BatchImportResult build(java.util.Map<String, ?> map) throws Exception {
        BatchImportResult self = new BatchImportResult();
        return TeaModel.build(map, self);
    }

    public BatchImportResult setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public BatchImportResult setRepeatApiList(java.util.List<ApiTransferVO> repeatApiList) {
        this.repeatApiList = repeatApiList;
        return this;
    }
    public java.util.List<ApiTransferVO> getRepeatApiList() {
        return this.repeatApiList;
    }

    public BatchImportResult setResults(java.util.List<ImportResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ImportResult> getResults() {
        return this.results;
    }

    public BatchImportResult setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public BatchImportResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public BatchImportResult setSuccessApiList(java.util.List<ApiInfoVO> successApiList) {
        this.successApiList = successApiList;
        return this;
    }
    public java.util.List<ApiInfoVO> getSuccessApiList() {
        return this.successApiList;
    }

}
