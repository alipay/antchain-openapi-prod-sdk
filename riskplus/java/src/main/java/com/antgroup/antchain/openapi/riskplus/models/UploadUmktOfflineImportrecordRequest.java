// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UploadUmktOfflineImportrecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件上传后返回的fileId
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

    // 文件内手机号类型 
    @NameInMap("file_template")
    @Validation(required = true)
    public String fileTemplate;

    public static UploadUmktOfflineImportrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadUmktOfflineImportrecordRequest self = new UploadUmktOfflineImportrecordRequest();
        return TeaModel.build(map, self);
    }

    public UploadUmktOfflineImportrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadUmktOfflineImportrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadUmktOfflineImportrecordRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadUmktOfflineImportrecordRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadUmktOfflineImportrecordRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadUmktOfflineImportrecordRequest setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
        return this;
    }
    public String getFileTemplate() {
        return this.fileTemplate;
    }

}
