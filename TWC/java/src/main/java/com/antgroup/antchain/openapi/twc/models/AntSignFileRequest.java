// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignFileRequest extends TeaModel {
    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>测试文字.pdf</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件httpUrl
    /**
     * <strong>example:</strong>
     * <p><a href="http://aaaaa">http://aaaaa</a></p>
     */
    @NameInMap("file_http_url")
    @Validation(required = true)
    public String fileHttpUrl;

    // 单次请求文件唯一id，与CaSystemSignFileRequest中的fileId对应
    /**
     * <strong>example:</strong>
     * <p>79ffa96040044b49b0fde8c3feb4898</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 文件类型（只支持pdf）
    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static AntSignFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AntSignFileRequest self = new AntSignFileRequest();
        return TeaModel.build(map, self);
    }

    public AntSignFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AntSignFileRequest setFileHttpUrl(String fileHttpUrl) {
        this.fileHttpUrl = fileHttpUrl;
        return this;
    }
    public String getFileHttpUrl() {
        return this.fileHttpUrl;
    }

    public AntSignFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AntSignFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
