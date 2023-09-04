// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateOnlinepressuretestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产线压测任务对象
    // 
    @NameInMap("test_task")
    @Validation(required = true)
    public OnlinePressureTestTask testTask;

    // 项目ID
    @NameInMap("project_id")
    public String projectId;

    public static CreateOnlinepressuretestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlinepressuretestRequest self = new CreateOnlinepressuretestRequest();
        return TeaModel.build(map, self);
    }

    public CreateOnlinepressuretestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOnlinepressuretestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateOnlinepressuretestRequest setTestTask(OnlinePressureTestTask testTask) {
        this.testTask = testTask;
        return this;
    }
    public OnlinePressureTestTask getTestTask() {
        return this.testTask;
    }

    public CreateOnlinepressuretestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
