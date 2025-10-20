// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class OperateAgentTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为 task_event_req 对象的json字符串
    @NameInMap("task_event_req")
    @Validation(required = true)
    public String taskEventReq;

    public static OperateAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentTaskRequest self = new OperateAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public OperateAgentTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateAgentTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateAgentTaskRequest setTaskEventReq(String taskEventReq) {
        this.taskEventReq = taskEventReq;
        return this;
    }
    public String getTaskEventReq() {
        return this.taskEventReq;
    }

}
