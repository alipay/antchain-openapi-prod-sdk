// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiTransferResult extends TeaModel {
    // api配置
    @NameInMap("api_transfer_list")
    public java.util.List<ApiInfoVO> apiTransferList;

    // 批量转移结果
    @NameInMap("batch_action_result")
    public BatchActionResult batchActionResult;

    // file_name
    @NameInMap("file_name")
    public String fileName;

    // 流程编排列表
    @NameInMap("apiflow_list")
    public java.util.List<ApiInfoVO> apiflowList;

    public static ApiTransferResult build(java.util.Map<String, ?> map) throws Exception {
        ApiTransferResult self = new ApiTransferResult();
        return TeaModel.build(map, self);
    }

    public ApiTransferResult setApiTransferList(java.util.List<ApiInfoVO> apiTransferList) {
        this.apiTransferList = apiTransferList;
        return this;
    }
    public java.util.List<ApiInfoVO> getApiTransferList() {
        return this.apiTransferList;
    }

    public ApiTransferResult setBatchActionResult(BatchActionResult batchActionResult) {
        this.batchActionResult = batchActionResult;
        return this;
    }
    public BatchActionResult getBatchActionResult() {
        return this.batchActionResult;
    }

    public ApiTransferResult setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ApiTransferResult setApiflowList(java.util.List<ApiInfoVO> apiflowList) {
        this.apiflowList = apiflowList;
        return this;
    }
    public java.util.List<ApiInfoVO> getApiflowList() {
        return this.apiflowList;
    }

}
