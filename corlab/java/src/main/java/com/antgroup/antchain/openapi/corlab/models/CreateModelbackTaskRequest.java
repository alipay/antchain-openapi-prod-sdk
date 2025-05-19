// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class CreateModelbackTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件唯一ID
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 创建任务时回溯的产品
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    // 样本记录名，不传为file_id
    @NameInMap("sample_file_name")
    public String sampleFileName;

    public static CreateModelbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelbackTaskRequest self = new CreateModelbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelbackTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateModelbackTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateModelbackTaskRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateModelbackTaskRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateModelbackTaskRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateModelbackTaskRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public CreateModelbackTaskRequest setSampleFileName(String sampleFileName) {
        this.sampleFileName = sampleFileName;
        return this;
    }
    public String getSampleFileName() {
        return this.sampleFileName;
    }

}
