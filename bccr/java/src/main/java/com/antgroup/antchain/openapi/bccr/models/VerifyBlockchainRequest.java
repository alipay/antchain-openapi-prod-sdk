// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyBlockchainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 统一证据编号（存证交易HASH）
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
    // 
    // (和fileId 二选一，必传一个，都传按fileHash为准)
    @NameInMap("file_hash")
    public String fileHash;

    // 文件OSS Id（上传文件有大小限制，文本文件最大100M，图片最大1G，视频和压缩包最大2G）
    // 
    // (和fileHash 二选一，必传一个，都传按fileHash为准)
    @NameInMap("file_id")
    public String fileId;

    // 证件名称
    @NameInMap("cert_name")
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    public static VerifyBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBlockchainRequest self = new VerifyBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBlockchainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyBlockchainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyBlockchainRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public VerifyBlockchainRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public VerifyBlockchainRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public VerifyBlockchainRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public VerifyBlockchainRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public VerifyBlockchainRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

}
