// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignFileResult extends TeaModel {
    // fileName	文件名称
    /**
     * <strong>example:</strong>
     * <p>111.pdf</p>
     */
    @NameInMap("file_name")
    public String fileName;

    // 文件osskey
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("file_key")
    public String fileKey;

    // 文件id
    /**
     * <strong>example:</strong>
     * <p>12313124112</p>
     */
    @NameInMap("file_id")
    public String fileId;

    // 文件http链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://aaaa">http://aaaa</a></p>
     */
    @NameInMap("http_file_url")
    public String httpFileUrl;

    public static AntSignFileResult build(java.util.Map<String, ?> map) throws Exception {
        AntSignFileResult self = new AntSignFileResult();
        return TeaModel.build(map, self);
    }

    public AntSignFileResult setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AntSignFileResult setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public AntSignFileResult setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AntSignFileResult setHttpFileUrl(String httpFileUrl) {
        this.httpFileUrl = httpFileUrl;
        return this;
    }
    public String getHttpFileUrl() {
        return this.httpFileUrl;
    }

}
