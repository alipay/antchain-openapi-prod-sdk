// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.workbenchphaseiia.models;

import com.aliyun.tea.*;

public class ApiaCliCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static ApiaCliCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiaCliCreateRequest self = new ApiaCliCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiaCliCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiaCliCreateRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ApiaCliCreateRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ApiaCliCreateRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ApiaCliCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
