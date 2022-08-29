// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CancelUmktDataaccessOfflinetaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 离线批量任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    public static CancelUmktDataaccessOfflinetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUmktDataaccessOfflinetaskRequest self = new CancelUmktDataaccessOfflinetaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelUmktDataaccessOfflinetaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelUmktDataaccessOfflinetaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelUmktDataaccessOfflinetaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
