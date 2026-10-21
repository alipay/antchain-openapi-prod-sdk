// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DocumentInfoDTO extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    // name
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("name")
    public String name;

    // 文件大小
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("file_size")
    public String fileSize;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("file_type")
    public String fileType;

    // 文件 ossurl
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("oss_url")
    public String ossUrl;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("md5")
    public String md5;

    // source
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("source")
    public String source;

    // sourceExt
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("source_ext")
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

    public DocumentInfoDTO setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
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
