// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryInitInfo extends TeaModel {
    // 本阶段存证内容哈希值
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签署文件份数
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("file_num")
    @Validation(required = true)
    public Long fileNum;

    // 签署流程发起人ID
    /**
     * <strong>example:</strong>
     * <p>account_id_of_initiator</p>
     */
    @NameInMap("initiator")
    @Validation(required = true)
    public String initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
    /**
     * <strong>example:</strong>
     * <p>account_Id_1,account_id_2</p>
     */
    @NameInMap("signatories")
    public String signatories;

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
     * <p>91a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1cqa</p>
     */
    @NameInMap("detail_info_file_hash")
    public String detailInfoFileHash;

    public static ContractNotaryInitInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryInitInfo self = new ContractNotaryInitInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryInitInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContractNotaryInitInfo setFileNum(Long fileNum) {
        this.fileNum = fileNum;
        return this;
    }
    public Long getFileNum() {
        return this.fileNum;
    }

    public ContractNotaryInitInfo setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public ContractNotaryInitInfo setSignatories(String signatories) {
        this.signatories = signatories;
        return this;
    }
    public String getSignatories() {
        return this.signatories;
    }

    public ContractNotaryInitInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotaryInitInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractNotaryInitInfo setIntiatorName(String intiatorName) {
        this.intiatorName = intiatorName;
        return this;
    }
    public String getIntiatorName() {
        return this.intiatorName;
    }

    public ContractNotaryInitInfo setSignatorNames(String signatorNames) {
        this.signatorNames = signatorNames;
        return this;
    }
    public String getSignatorNames() {
        return this.signatorNames;
    }

    public ContractNotaryInitInfo setDetailInfoFileHash(String detailInfoFileHash) {
        this.detailInfoFileHash = detailInfoFileHash;
        return this;
    }
    public String getDetailInfoFileHash() {
        return this.detailInfoFileHash;
    }

}
