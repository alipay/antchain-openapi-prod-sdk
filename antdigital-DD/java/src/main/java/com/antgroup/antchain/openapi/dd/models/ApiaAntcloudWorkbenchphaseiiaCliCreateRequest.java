// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ApiaAntcloudWorkbenchphaseiiaCliCreateRequest extends TeaModel {
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

    public static ApiaAntcloudWorkbenchphaseiiaCliCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiaAntcloudWorkbenchphaseiiaCliCreateRequest self = new ApiaAntcloudWorkbenchphaseiiaCliCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiaAntcloudWorkbenchphaseiiaCliCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiaAntcloudWorkbenchphaseiiaCliCreateRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ApiaAntcloudWorkbenchphaseiiaCliCreateRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ApiaAntcloudWorkbenchphaseiiaCliCreateRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ApiaAntcloudWorkbenchphaseiiaCliCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
