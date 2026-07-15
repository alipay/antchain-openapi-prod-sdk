// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NotaryInfo extends TeaModel {
    // 存证内容的哈希值，默认采用SHA256算法
    /**
     * <strong>example:</strong>
     * <p>6b7966f4a30a7fec43a6b5ca8e4610f63d320f03ee698945014c0bbc13c6beba</p>
     */
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // 合作人（版权存证函专用），会展示在存证证明中
    /**
     * <strong>example:</strong>
     * <p>合作人</p>
     */
    @NameInMap("cooperation")
    public String cooperation;

    // 作品名称类型（版权存证函使用），会展示在存证证明中
    /**
     * <strong>example:</strong>
     * <p>音乐/视频/小说等</p>
     */
    @NameInMap("creation_type")
    public String creationType;

    // 如果是文件存证，可填写文件名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("file_name")
    public String fileName;

    // 计算content_hash的哈希算法，目前只支持SHA256
    /**
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 申请平台名，用于在存证函上显示用名称
    /**
     * <strong>example:</strong>
     * <p>某某平台</p>
     */
    @NameInMap("platform")
    public String platform;

    // 文件容量，默认为0
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("size")
    public Long size;

    // 发起存证成功后，返回的存证凭据
    /**
     * <strong>example:</strong>
     * <p>a89495ddd334870a58686afe48a8eb83efe2dd51e4c06da7220eb1cde0f995e2</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 存证事务ID
    /**
     * <strong>example:</strong>
     * <p>7bc888d8-1384-425c-9355-630cef0f4120</p>
     */
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    public static NotaryInfo build(java.util.Map<String, ?> map) throws Exception {
        NotaryInfo self = new NotaryInfo();
        return TeaModel.build(map, self);
    }

    public NotaryInfo setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public NotaryInfo setCooperation(String cooperation) {
        this.cooperation = cooperation;
        return this;
    }
    public String getCooperation() {
        return this.cooperation;
    }

    public NotaryInfo setCreationType(String creationType) {
        this.creationType = creationType;
        return this;
    }
    public String getCreationType() {
        return this.creationType;
    }

    public NotaryInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public NotaryInfo setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public NotaryInfo setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public NotaryInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public NotaryInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public NotaryInfo setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
