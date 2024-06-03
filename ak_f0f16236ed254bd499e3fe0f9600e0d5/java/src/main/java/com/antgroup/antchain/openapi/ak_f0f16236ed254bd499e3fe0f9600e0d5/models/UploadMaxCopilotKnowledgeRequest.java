// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f0f16236ed254bd499e3fe0f9600e0d5.models;

import com.aliyun.tea.*;

public class UploadMaxCopilotKnowledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 上传文件
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 默认是财报模式，设置common时是通用模式
    @NameInMap("scene")
    public String scene;

    public static UploadMaxCopilotKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMaxCopilotKnowledgeRequest self = new UploadMaxCopilotKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public UploadMaxCopilotKnowledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadMaxCopilotKnowledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadMaxCopilotKnowledgeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UploadMaxCopilotKnowledgeRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadMaxCopilotKnowledgeRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadMaxCopilotKnowledgeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadMaxCopilotKnowledgeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
