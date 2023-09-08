// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class GetAshieldHardeningresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加固任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static GetAshieldHardeningresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAshieldHardeningresultRequest self = new GetAshieldHardeningresultRequest();
        return TeaModel.build(map, self);
    }

    public GetAshieldHardeningresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAshieldHardeningresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAshieldHardeningresultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
