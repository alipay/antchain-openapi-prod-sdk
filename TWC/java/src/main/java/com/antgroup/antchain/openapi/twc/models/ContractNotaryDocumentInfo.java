// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDocumentInfo extends TeaModel {
    // 签署完成的合同hash
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签署人ID（支持多个，不同ID间用“,”分隔开）
    @NameInMap("signatories")
    @Validation(required = true)
    public String signatories;

    // 存证结束时间，UNIX时间戳(毫秒)
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 存证凭据，仅在批量核验时需要填写
    @NameInMap("tx_hash")
    public String txHash;

    // 签署的文件ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static ContractNotaryDocumentInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryDocumentInfo self = new ContractNotaryDocumentInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryDocumentInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContractNotaryDocumentInfo setSignatories(String signatories) {
        this.signatories = signatories;
        return this;
    }
    public String getSignatories() {
        return this.signatories;
    }

    public ContractNotaryDocumentInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotaryDocumentInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractNotaryDocumentInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
