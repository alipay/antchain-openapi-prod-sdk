// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDocumentInfo extends TeaModel {
    // 签署完成的合同hash
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签署人ID（支持多个，不同ID间用“,”分隔开）
    /**
     * <strong>example:</strong>
     * <p>account_id_1,account_id_2</p>
     */
    @NameInMap("signatories")
    @Validation(required = true)
    public String signatories;

    // 存证结束时间，UNIX时间戳(毫秒)
    /**
     * <strong>example:</strong>
     * <p>1589198173000</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 存证凭据，仅在批量核验时需要填写
    /**
     * <strong>example:</strong>
     * <p>95a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1c92</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 签署的文件ID
    /**
     * <strong>example:</strong>
     * <p>6afb5aa2679c5284444698a9790099269</p>
     */
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
