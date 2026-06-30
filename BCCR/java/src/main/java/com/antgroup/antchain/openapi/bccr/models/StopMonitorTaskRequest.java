// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class StopMonitorTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 监测任务Id
    // 
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    public static StopMonitorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMonitorTaskRequest self = new StopMonitorTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopMonitorTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopMonitorTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StopMonitorTaskRequest setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

}
