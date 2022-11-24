// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务类型枚举值
    //   文件解密上传任务，FILE_DECRYPT_ESIGN_UPLOAD
    @NameInMap("task_type")
    @Validation(required = true)
    public String taskType;

    // 文件内容文件解密上传任务时，为原始文件id
    @NameInMap("task_content")
    @Validation(required = true)
    public String taskContent;

    public static CreateContractTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractTaskRequest self = new CreateContractTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateContractTaskRequest setTaskContent(String taskContent) {
        this.taskContent = taskContent;
        return this;
    }
    public String getTaskContent() {
        return this.taskContent;
    }

}
