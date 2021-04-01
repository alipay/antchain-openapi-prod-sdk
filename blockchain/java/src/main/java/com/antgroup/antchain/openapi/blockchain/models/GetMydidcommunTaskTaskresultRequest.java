// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetMydidcommunTaskTaskresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 申请人did（只有任务发起人才能查询执行结果）
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static GetMydidcommunTaskTaskresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMydidcommunTaskTaskresultRequest self = new GetMydidcommunTaskTaskresultRequest();
        return TeaModel.build(map, self);
    }

    public GetMydidcommunTaskTaskresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMydidcommunTaskTaskresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMydidcommunTaskTaskresultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetMydidcommunTaskTaskresultRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
