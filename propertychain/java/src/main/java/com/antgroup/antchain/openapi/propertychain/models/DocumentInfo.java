// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class DocumentInfo extends TeaModel {
    // 文档Id
    @NameInMap("document_id")
    public String documentId;

    // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
    @NameInMap("file_type")
    public String fileType;

    // 文档名
    @NameInMap("name")
    public String name;

    // 存证哈希
    @NameInMap("tx_hash")
    public String txHash;

    // 存证时间
    @NameInMap("tx_time")
    public Long txTime;

    // 文件Url
    @NameInMap("url")
    public String url;

    public static DocumentInfo build(java.util.Map<String, ?> map) throws Exception {
        DocumentInfo self = new DocumentInfo();
        return TeaModel.build(map, self);
    }

    public DocumentInfo setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public DocumentInfo setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DocumentInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DocumentInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public DocumentInfo setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

    public DocumentInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
