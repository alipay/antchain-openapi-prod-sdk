// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class DocumentInfoDTO extends TeaModel {
    // 文档id
    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 文档名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 文件大小
    /**
     * <strong>example:</strong>
     * <p>file_size</p>
     */
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>file_type</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // oss下载地址
    /**
     * <strong>example:</strong>
     * <p>oss_url</p>
     */
    @NameInMap("oss_url")
    @Validation(required = true)
    public String ossUrl;

    // 文件md5
    /**
     * <strong>example:</strong>
     * <p>md5</p>
     */
    @NameInMap("md5")
    @Validation(required = true)
    public String md5;

    // 文档来源
    /**
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 文档提供方的附加信息
    /**
     * <strong>example:</strong>
     * <p>source_ext</p>
     */
    @NameInMap("source_ext")
    @Validation(required = true)
    public String sourceExt;

    public static DocumentInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentInfoDTO self = new DocumentInfoDTO();
        return TeaModel.build(map, self);
    }

    public DocumentInfoDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DocumentInfoDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DocumentInfoDTO setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DocumentInfoDTO setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DocumentInfoDTO setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public DocumentInfoDTO setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public DocumentInfoDTO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DocumentInfoDTO setSourceExt(String sourceExt) {
        this.sourceExt = sourceExt;
        return this;
    }
    public String getSourceExt() {
        return this.sourceExt;
    }

}
