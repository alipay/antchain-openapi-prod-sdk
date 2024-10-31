// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UploadServiceAuthfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待获取数据类型的服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 文件md5
    @NameInMap("file_md5")
    @Validation(required = true)
    public String fileMd5;

    // 文件id
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

    // 协议名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 授权协议文件版本号
    @NameInMap("file_version")
    @Validation(required = true)
    public String fileVersion;

    public static UploadServiceAuthfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadServiceAuthfileRequest self = new UploadServiceAuthfileRequest();
        return TeaModel.build(map, self);
    }

    public UploadServiceAuthfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadServiceAuthfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadServiceAuthfileRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UploadServiceAuthfileRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public UploadServiceAuthfileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadServiceAuthfileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadServiceAuthfileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadServiceAuthfileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadServiceAuthfileRequest setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public String getFileVersion() {
        return this.fileVersion;
    }

}
