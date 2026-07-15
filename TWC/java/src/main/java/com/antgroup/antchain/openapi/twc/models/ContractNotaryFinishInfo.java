// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryFinishInfo extends TeaModel {
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

    // 发起人ID
    /**
     * <strong>example:</strong>
     * <p>account_id_of_initiator</p>
     */
    @NameInMap("initiator")
    @Validation(required = true)
    public String initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开）
    /**
     * <strong>example:</strong>
     * <p>account_id_1,account_id_2</p>
     */
    @NameInMap("signatories")
    @Validation(required = true)
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

    // signatories对应的用户类型
    /**
     * <strong>example:</strong>
     * <p>PERSON,ENTERPRISE,PERSON</p>
     */
    @NameInMap("user_types")
    public String userTypes;

    // 签署合同所属行业
    /**
     * <strong>example:</strong>
     * <p>finance</p>
     */
    @NameInMap("business_type")
    public String businessType;

    // 合同对应的金额，如果不涉及金额，填充为0，个数与file_num对应
    /**
     * <strong>example:</strong>
     * <p>888,0,888</p>
     */
    @NameInMap("amounts")
    public String amounts;

    // 签署方数量
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("sign_party_count")
    public Long signPartyCount;

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
     * <p>a91a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1cqa</p>
     */
    @NameInMap("detail_info_file_hash")
    public String detailInfoFileHash;

    public static ContractNotaryFinishInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryFinishInfo self = new ContractNotaryFinishInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryFinishInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContractNotaryFinishInfo setFileNum(Long fileNum) {
        this.fileNum = fileNum;
        return this;
    }
    public Long getFileNum() {
        return this.fileNum;
    }

    public ContractNotaryFinishInfo setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public ContractNotaryFinishInfo setSignatories(String signatories) {
        this.signatories = signatories;
        return this;
    }
    public String getSignatories() {
        return this.signatories;
    }

    public ContractNotaryFinishInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotaryFinishInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractNotaryFinishInfo setUserTypes(String userTypes) {
        this.userTypes = userTypes;
        return this;
    }
    public String getUserTypes() {
        return this.userTypes;
    }

    public ContractNotaryFinishInfo setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ContractNotaryFinishInfo setAmounts(String amounts) {
        this.amounts = amounts;
        return this;
    }
    public String getAmounts() {
        return this.amounts;
    }

    public ContractNotaryFinishInfo setSignPartyCount(Long signPartyCount) {
        this.signPartyCount = signPartyCount;
        return this;
    }
    public Long getSignPartyCount() {
        return this.signPartyCount;
    }

    public ContractNotaryFinishInfo setIntiatorName(String intiatorName) {
        this.intiatorName = intiatorName;
        return this;
    }
    public String getIntiatorName() {
        return this.intiatorName;
    }

    public ContractNotaryFinishInfo setSignatorNames(String signatorNames) {
        this.signatorNames = signatorNames;
        return this;
    }
    public String getSignatorNames() {
        return this.signatorNames;
    }

    public ContractNotaryFinishInfo setDetailInfoFileHash(String detailInfoFileHash) {
        this.detailInfoFileHash = detailInfoFileHash;
        return this;
    }
    public String getDetailInfoFileHash() {
        return this.detailInfoFileHash;
    }

}
