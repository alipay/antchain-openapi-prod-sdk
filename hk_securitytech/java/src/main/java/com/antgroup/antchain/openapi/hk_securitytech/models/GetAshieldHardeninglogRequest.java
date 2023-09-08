// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class GetAshieldHardeninglogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加固任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static GetAshieldHardeninglogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAshieldHardeninglogRequest self = new GetAshieldHardeninglogRequest();
        return TeaModel.build(map, self);
    }

    public GetAshieldHardeninglogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAshieldHardeninglogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAshieldHardeninglogRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
