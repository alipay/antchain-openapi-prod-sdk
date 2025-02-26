// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class RefuseBlockchainBccrDciRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 复审失败原因
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 失败详情
    @NameInMap("fail_detail")
    @Validation(required = true)
    public String failDetail;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static RefuseBlockchainBccrDciRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseBlockchainBccrDciRegistrationRequest self = new RefuseBlockchainBccrDciRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public RefuseBlockchainBccrDciRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefuseBlockchainBccrDciRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefuseBlockchainBccrDciRegistrationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RefuseBlockchainBccrDciRegistrationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefuseBlockchainBccrDciRegistrationRequest setFailDetail(String failDetail) {
        this.failDetail = failDetail;
        return this;
    }
    public String getFailDetail() {
        return this.failDetail;
    }

    public RefuseBlockchainBccrDciRegistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
