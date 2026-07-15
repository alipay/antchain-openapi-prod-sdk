// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class SnapshotDocumentItem extends TeaModel {
    // 节点ID
    /**
     * <strong>example:</strong>
     * <p>node_id</p>
     */
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 文档ID
    /**
     * <strong>example:</strong>
     * <p>document_id</p>
     */
    @NameInMap("document_id")
    @Validation(required = true)
    public String documentId;

    // 文档名称
    /**
     * <strong>example:</strong>
     * <p>document_name</p>
     */
    @NameInMap("document_name")
    @Validation(required = true)
    public String documentName;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>file_type</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 下载原文的链接
    /**
     * <strong>example:</strong>
     * <p>oss_url</p>
     */
    @NameInMap("oss_url")
    @Validation(required = true)
    public String ossUrl;

    // 原文的md5
    /**
     * <strong>example:</strong>
     * <p>md5</p>
     */
    @NameInMap("md5")
    public String md5;

    // 向量文档ID
    /**
     * <strong>example:</strong>
     * <p>vector_store_map_id</p>
     */
    @NameInMap("vector_store_map_id")
    @Validation(required = true)
    public String vectorStoreMapId;

    // 文档来源
    /**
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 文档来源附带的额外信息
    /**
     * <strong>example:</strong>
     * <p>source_ext</p>
     */
    @NameInMap("source_ext")
    @Validation(required = true)
    public String sourceExt;

    // 标签
    /**
     * <strong>example:</strong>
     * <p>tags</p>
     */
    @NameInMap("tags")
    @Validation(required = true)
    public java.util.List<String> tags;

    public static SnapshotDocumentItem build(java.util.Map<String, ?> map) throws Exception {
        SnapshotDocumentItem self = new SnapshotDocumentItem();
        return TeaModel.build(map, self);
    }

    public SnapshotDocumentItem setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SnapshotDocumentItem setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public SnapshotDocumentItem setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public SnapshotDocumentItem setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public SnapshotDocumentItem setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public SnapshotDocumentItem setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public SnapshotDocumentItem setVectorStoreMapId(String vectorStoreMapId) {
        this.vectorStoreMapId = vectorStoreMapId;
        return this;
    }
    public String getVectorStoreMapId() {
        return this.vectorStoreMapId;
    }

    public SnapshotDocumentItem setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SnapshotDocumentItem setSourceExt(String sourceExt) {
        this.sourceExt = sourceExt;
        return this;
    }
    public String getSourceExt() {
        return this.sourceExt;
    }

    public SnapshotDocumentItem setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
