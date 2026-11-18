// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveagent.models;

import com.aliyun.tea.*;

public class ImportCustomerRealtimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次幂等键（≤64 字符)
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 挂靠的任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 名单行 JSON 数组，每个元素为一名单行 JSON 字符串
    @NameInMap("cust_info")
    @Validation(required = true)
    public java.util.List<String> custInfo;

    public static ImportCustomerRealtimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomerRealtimeRequest self = new ImportCustomerRealtimeRequest();
        return TeaModel.build(map, self);
    }

    public ImportCustomerRealtimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportCustomerRealtimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportCustomerRealtimeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportCustomerRealtimeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ImportCustomerRealtimeRequest setCustInfo(java.util.List<String> custInfo) {
        this.custInfo = custInfo;
        return this;
    }
    public java.util.List<String> getCustInfo() {
        return this.custInfo;
    }

}
