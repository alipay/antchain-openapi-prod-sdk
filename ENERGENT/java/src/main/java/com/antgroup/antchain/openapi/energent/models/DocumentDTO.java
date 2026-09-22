// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DocumentDTO extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    // 文件名
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("name")
    public String name;

    // 文件大小
    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("file_size")
    public String fileSize;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("file_type")
    public String fileType;

    // 文件地址
    /**
     * <strong>example:</strong>
     * <p>文件地址</p>
     */
    @NameInMap("oss_url")
    public String ossUrl;

    // md5
    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("md5")
    public String md5;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public String status;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 文件提供方
    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("oss_provider")
    public String ossProvider;

    // 向量库映射ID
    /**
     * <strong>example:</strong>
     * <p>向量库映射ID</p>
     */
    @NameInMap("vector_store_map_id")
    public String vectorStoreMapId;

    public static DocumentDTO build(java.util.Map<String, ?> map) throws Exception {
        DocumentDTO self = new DocumentDTO();
        return TeaModel.build(map, self);
    }

    public DocumentDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DocumentDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DocumentDTO setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
        return this.fileSize;
    }

    public DocumentDTO setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DocumentDTO setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public DocumentDTO setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public DocumentDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DocumentDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DocumentDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DocumentDTO setOssProvider(String ossProvider) {
        this.ossProvider = ossProvider;
        return this;
    }
    public String getOssProvider() {
        return this.ossProvider;
    }

    public DocumentDTO setVectorStoreMapId(String vectorStoreMapId) {
        this.vectorStoreMapId = vectorStoreMapId;
        return this;
    }
    public String getVectorStoreMapId() {
        return this.vectorStoreMapId;
    }

}
