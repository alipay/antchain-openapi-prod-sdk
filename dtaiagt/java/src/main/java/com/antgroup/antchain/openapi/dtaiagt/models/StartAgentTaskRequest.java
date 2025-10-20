// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class StartAgentTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为 TaskChatReq 对象的json字符串
    @NameInMap("task_chat_req")
    @Validation(required = true)
    public String taskChatReq;

    public static StartAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAgentTaskRequest self = new StartAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartAgentTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAgentTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAgentTaskRequest setTaskChatReq(String taskChatReq) {
        this.taskChatReq = taskChatReq;
        return this;
    }
    public String getTaskChatReq() {
        return this.taskChatReq;
    }

}
