// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UploadApplicationAuthfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集id，开发者提供
    // 
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 文件md5
    @NameInMap("file_md5")
    @Validation(required = true)
    public String fileMd5;

    // 文件id
    // 
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

    public static UploadApplicationAuthfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadApplicationAuthfileRequest self = new UploadApplicationAuthfileRequest();
        return TeaModel.build(map, self);
    }

    public UploadApplicationAuthfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadApplicationAuthfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadApplicationAuthfileRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public UploadApplicationAuthfileRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public UploadApplicationAuthfileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadApplicationAuthfileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadApplicationAuthfileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadApplicationAuthfileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadApplicationAuthfileRequest setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public String getFileVersion() {
        return this.fileVersion;
    }

}
