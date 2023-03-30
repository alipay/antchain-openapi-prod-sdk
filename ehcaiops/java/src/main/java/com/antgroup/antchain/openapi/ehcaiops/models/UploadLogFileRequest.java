// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ehcaiops.models;

import com.aliyun.tea.*;

public class UploadLogFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 文件参数
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    // 待上传文件名
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 业务码
    @NameInMap("bus_code")
    @Validation(required = true)
    public String busCode;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 行内日志分隔符
    @NameInMap("element_separator")
    @Validation(required = true)
    public String elementSeparator;

    public static UploadLogFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLogFileRequest self = new UploadLogFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadLogFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadLogFileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadLogFileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadLogFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadLogFileRequest setBusCode(String busCode) {
        this.busCode = busCode;
        return this;
    }
    public String getBusCode() {
        return this.busCode;
    }

    public UploadLogFileRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadLogFileRequest setElementSeparator(String elementSeparator) {
        this.elementSeparator = elementSeparator;
        return this;
    }
    public String getElementSeparator() {
        return this.elementSeparator;
    }

}
