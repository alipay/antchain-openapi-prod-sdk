// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class GetAshieldHardeningtaskprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加固任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static GetAshieldHardeningtaskprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAshieldHardeningtaskprocessRequest self = new GetAshieldHardeningtaskprocessRequest();
        return TeaModel.build(map, self);
    }

    public GetAshieldHardeningtaskprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAshieldHardeningtaskprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAshieldHardeningtaskprocessRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
