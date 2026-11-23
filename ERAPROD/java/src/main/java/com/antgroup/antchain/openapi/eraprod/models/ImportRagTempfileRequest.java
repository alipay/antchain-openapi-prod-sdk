// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class ImportRagTempfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // string
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

    // BUC 账号体系传员工工号
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 百灵租户空间唯一标识
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 上传后是否公网可访问，默认 "false"
    @NameInMap("public_access")
    public String publicAccess;

    // 解析超时秒数，默认 "300"
    @NameInMap("timeout")
    public String timeout;

    public static ImportRagTempfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRagTempfileRequest self = new ImportRagTempfileRequest();
        return TeaModel.build(map, self);
    }

    public ImportRagTempfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportRagTempfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportRagTempfileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ImportRagTempfileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ImportRagTempfileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ImportRagTempfileRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ImportRagTempfileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ImportRagTempfileRequest setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public String getPublicAccess() {
        return this.publicAccess;
    }

    public ImportRagTempfileRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
