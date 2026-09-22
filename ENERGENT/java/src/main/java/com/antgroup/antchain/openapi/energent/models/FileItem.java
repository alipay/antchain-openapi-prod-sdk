// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class FileItem extends TeaModel {
    // 文件 id
    /**
     * <strong>example:</strong>
     * <p>文件 id</p>
     */
    @NameInMap("document_id")
    @Validation(required = true)
    public String documentId;

    // 文件名
    /**
     * <strong>example:</strong>
     * <p>文件名</p>
     */
    @NameInMap("file_name")
    public String fileName;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("file_type")
    public String fileType;

    // OSS文件地址
    /**
     * <strong>example:</strong>
     * <p>oss地址</p>
     */
    @NameInMap("oss_url")
    public String ossUrl;

    // OSS提供方
    /**
     * <strong>example:</strong>
     * <p>OSS提供方</p>
     */
    @NameInMap("oss_provider")
    public String ossProvider;

    // 文档来源
    /**
     * <strong>example:</strong>
     * <p>文档来源</p>
     */
    @NameInMap("source")
    public String source;

    // 文档来源方对文档的额外描述信息
    /**
     * <strong>example:</strong>
     * <p>文档来源方对文档的额外描述信息</p>
     */
    @NameInMap("source_ext")
    public String sourceExt;

    public static FileItem build(java.util.Map<String, ?> map) throws Exception {
        FileItem self = new FileItem();
        return TeaModel.build(map, self);
    }

    public FileItem setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public FileItem setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileItem setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public FileItem setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public FileItem setOssProvider(String ossProvider) {
        this.ossProvider = ossProvider;
        return this;
    }
    public String getOssProvider() {
        return this.ossProvider;
    }

    public FileItem setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public FileItem setSourceExt(String sourceExt) {
        this.sourceExt = sourceExt;
        return this;
    }
    public String getSourceExt() {
        return this.sourceExt;
    }

}
