// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateDocumentFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 原文件md5
    @NameInMap("file_md5")
    @Validation(required = true)
    public String fileMd5;

    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 原文件大小
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 文件类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 原文件url
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static UpdateDocumentFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentFileRequest self = new UpdateDocumentFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDocumentFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDocumentFileRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public UpdateDocumentFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateDocumentFileRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public UpdateDocumentFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UpdateDocumentFileRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
