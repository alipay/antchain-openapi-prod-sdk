// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class KbUploadFileItem extends TeaModel {
    // document ID
    /**
     * <strong>example:</strong>
     * <p>D1</p>
     */
    @NameInMap("document_id")
    @Validation(required = true)
    public String documentId;

    // file名称
    /**
     * <strong>example:</strong>
     * <p>a.pdf</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // original名称
    /**
     * <strong>example:</strong>
     * <p>a.pdf</p>
     */
    @NameInMap("original_name")
    @Validation(required = true)
    public String originalName;

    // file类型
    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // file md5
    /**
     * <strong>example:</strong>
     * <p>m1</p>
     */
    @NameInMap("file_md5")
    @Validation(required = true)
    public String fileMd5;

    // oss url
    /**
     * <strong>example:</strong>
     * <p><a href="https://oss.example/a.pdf">https://oss.example/a.pdf</a></p>
     */
    @NameInMap("oss_url")
    @Validation(required = true)
    public String ossUrl;

    // oss provider
    /**
     * <strong>example:</strong>
     * <p>antUpload</p>
     */
    @NameInMap("oss_provider")
    @Validation(required = true)
    public String ossProvider;

    // source
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // source ext
    @NameInMap("source_ext")
    @Validation(required = true)
    public String sourceExt;

    public static KbUploadFileItem build(java.util.Map<String, ?> map) throws Exception {
        KbUploadFileItem self = new KbUploadFileItem();
        return TeaModel.build(map, self);
    }

    public KbUploadFileItem setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public KbUploadFileItem setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public KbUploadFileItem setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public KbUploadFileItem setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public KbUploadFileItem setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public KbUploadFileItem setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public KbUploadFileItem setOssProvider(String ossProvider) {
        this.ossProvider = ossProvider;
        return this;
    }
    public String getOssProvider() {
        return this.ossProvider;
    }

    public KbUploadFileItem setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public KbUploadFileItem setSourceExt(String sourceExt) {
        this.sourceExt = sourceExt;
        return this;
    }
    public String getSourceExt() {
        return this.sourceExt;
    }

}
