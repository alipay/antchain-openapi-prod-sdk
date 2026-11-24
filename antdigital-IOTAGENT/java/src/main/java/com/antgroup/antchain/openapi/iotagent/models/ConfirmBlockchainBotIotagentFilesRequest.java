// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ConfirmBlockchainBotIotagentFilesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件ID
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

    // 声明字节数（校验一致）
    @NameInMap("size_bytes")
    public String sizeBytes;

    // 声明 SHA-256（校验一致）
    @NameInMap("sha256")
    public String sha256;

    public static ConfirmBlockchainBotIotagentFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmBlockchainBotIotagentFilesRequest self = new ConfirmBlockchainBotIotagentFilesRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmBlockchainBotIotagentFilesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmBlockchainBotIotagentFilesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmBlockchainBotIotagentFilesRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ConfirmBlockchainBotIotagentFilesRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ConfirmBlockchainBotIotagentFilesRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ConfirmBlockchainBotIotagentFilesRequest setSizeBytes(String sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public String getSizeBytes() {
        return this.sizeBytes;
    }

    public ConfirmBlockchainBotIotagentFilesRequest setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }
    public String getSha256() {
        return this.sha256;
    }

}
