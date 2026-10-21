// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class SnapshotDocumentItem extends TeaModel {
    // 节点 id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("node_id")
    public String nodeId;

    // 文档 id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("document_id")
    public String documentId;

    // 文档名
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("document_name")
    public String documentName;

    // 文档类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("file_type")
    public String fileType;

    // ossurl
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("oss_url")
    public String ossUrl;

    // md5
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("md5")
    public String md5;

    // 向量文档ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("vector_store_map_id")
    public String vectorStoreMapId;

    // 来源
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("source")
    public String source;

    // 来源扩展
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("source_ext")
    public String sourceExt;

    // 标签
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("tags")
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
