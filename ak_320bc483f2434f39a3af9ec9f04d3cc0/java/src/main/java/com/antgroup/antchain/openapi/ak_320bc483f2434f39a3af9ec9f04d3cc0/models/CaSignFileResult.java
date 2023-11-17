// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignFileResult extends TeaModel {
    // 文件名称
    @NameInMap("file_name")
    public String fileName;

    // 文件osskey
    @NameInMap("file_key")
    public String fileKey;

    // 文件id
    @NameInMap("file_id")
    public String fileId;

    // 文件http链接
    @NameInMap("http_file_url")
    public String httpFileUrl;

    public static CaSignFileResult build(java.util.Map<String, ?> map) throws Exception {
        CaSignFileResult self = new CaSignFileResult();
        return TeaModel.build(map, self);
    }

    public CaSignFileResult setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CaSignFileResult setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CaSignFileResult setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CaSignFileResult setHttpFileUrl(String httpFileUrl) {
        this.httpFileUrl = httpFileUrl;
        return this;
    }
    public String getHttpFileUrl() {
        return this.httpFileUrl;
    }

}
