// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class FileInfo extends TeaModel {
    // 业务id
    @NameInMap("biz_id")
    public String bizId;

    // 财报文件，base64
    @NameInMap("file_str")
    @Validation(required = true)
    public String fileStr;

    // 文件名称（企业财报.jpg）
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件大小(byte长度)
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 文件类型(jpg)
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static FileInfo build(java.util.Map<String, ?> map) throws Exception {
        FileInfo self = new FileInfo();
        return TeaModel.build(map, self);
    }

    public FileInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FileInfo setFileStr(String fileStr) {
        this.fileStr = fileStr;
        return this;
    }
    public String getFileStr() {
        return this.fileStr;
    }

    public FileInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileInfo setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public FileInfo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
