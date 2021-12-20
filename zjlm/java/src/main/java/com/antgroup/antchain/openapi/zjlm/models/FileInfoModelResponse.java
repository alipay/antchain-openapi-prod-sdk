// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zjlm.models;

import com.aliyun.tea.*;

public class FileInfoModelResponse extends TeaModel {
    // 文件名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件别名
    @NameInMap("alias_name")
    @Validation(required = true)
    public String aliasName;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件访问url 地址
    @NameInMap("oss_url")
    @Validation(required = true)
    public String ossUrl;

    public static FileInfoModelResponse build(java.util.Map<String, ?> map) throws Exception {
        FileInfoModelResponse self = new FileInfoModelResponse();
        return TeaModel.build(map, self);
    }

    public FileInfoModelResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileInfoModelResponse setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public FileInfoModelResponse setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public FileInfoModelResponse setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

}
