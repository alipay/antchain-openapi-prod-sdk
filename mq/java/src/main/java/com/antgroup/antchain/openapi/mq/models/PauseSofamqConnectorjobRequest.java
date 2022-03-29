// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PauseSofamqConnectorjobRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 所属Connector任务名
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    public static PauseSofamqConnectorjobRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseSofamqConnectorjobRequest self = new PauseSofamqConnectorjobRequest();
        return TeaModel.build(map, self);
    }

    public PauseSofamqConnectorjobRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PauseSofamqConnectorjobRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PauseSofamqConnectorjobRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PauseSofamqConnectorjobRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

}
