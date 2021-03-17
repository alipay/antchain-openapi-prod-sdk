// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryFinishInfo extends TeaModel {
    // 本阶段存证内容哈希值
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签署文件份数
    @NameInMap("file_num")
    @Validation(required = true)
    public Long fileNum;

    // 发起人ID
    @NameInMap("initiator")
    @Validation(required = true)
    public String initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开）
    @NameInMap("signatories")
    @Validation(required = true)
    public String signatories;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 存证凭据，仅在批量核验时需要填写
    @NameInMap("tx_hash")
    public String txHash;

    // signatories对应的用户类型
    @NameInMap("user_types")
    public String userTypes;

    // 签署合同所属行业
    @NameInMap("business_type")
    public String businessType;

    // 合同对应的金额，如果不涉及金额，填充为0，个数与file_num对应
    @NameInMap("amounts")
    public String amounts;

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

}
