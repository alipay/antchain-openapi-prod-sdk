// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class BatchcreateWorkersBaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目编号
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 农民工基本信息
    @NameInMap("worker_list")
    @Validation(required = true)
    public java.util.List<WorkersBaseInfo> workerList;

    public static BatchcreateWorkersBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateWorkersBaseRequest self = new BatchcreateWorkersBaseRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateWorkersBaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateWorkersBaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateWorkersBaseRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public BatchcreateWorkersBaseRequest setWorkerList(java.util.List<WorkersBaseInfo> workerList) {
        this.workerList = workerList;
        return this;
    }
    public java.util.List<WorkersBaseInfo> getWorkerList() {
        return this.workerList;
    }

}
