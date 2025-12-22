// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotarySignInfo extends TeaModel {
    // 本阶段存证内容哈希值
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
    /**
     * <strong>example:</strong>
     * <p>hash1,hash2</p>
     */
    @NameInMap("contract_hash")
    @Validation(required = true)
    public String contractHash;

    // 签署人ID
    /**
     * <strong>example:</strong>
     * <p>account_id_of_signatory</p>
     */
    @NameInMap("signatory")
    @Validation(required = true)
    public String signatory;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
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

    // 发起人名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("intiator_name")
    public String intiatorName;

    // 签署人名称,多个逗号隔开
    /**
     * <strong>example:</strong>
     * <p>李四,王五</p>
     */
    @NameInMap("signator_names")
    public String signatorNames;

    // 详细文件哈希
    /**
     * <strong>example:</strong>
     * <p>91a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1cqa </p>
     */
    @NameInMap("detail_info_file_hash")
    public String detailInfoFileHash;

    public static ContractNotarySignInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotarySignInfo self = new ContractNotarySignInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotarySignInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContractNotarySignInfo setContractHash(String contractHash) {
        this.contractHash = contractHash;
        return this;
    }
    public String getContractHash() {
        return this.contractHash;
    }

    public ContractNotarySignInfo setSignatory(String signatory) {
        this.signatory = signatory;
        return this;
    }
    public String getSignatory() {
        return this.signatory;
    }

    public ContractNotarySignInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotarySignInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractNotarySignInfo setIntiatorName(String intiatorName) {
        this.intiatorName = intiatorName;
        return this;
    }
    public String getIntiatorName() {
        return this.intiatorName;
    }

    public ContractNotarySignInfo setSignatorNames(String signatorNames) {
        this.signatorNames = signatorNames;
        return this;
    }
    public String getSignatorNames() {
        return this.signatorNames;
    }

    public ContractNotarySignInfo setDetailInfoFileHash(String detailInfoFileHash) {
        this.detailInfoFileHash = detailInfoFileHash;
        return this;
    }
    public String getDetailInfoFileHash() {
        return this.detailInfoFileHash;
    }

}
