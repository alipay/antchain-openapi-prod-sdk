// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryInitInfo extends TeaModel {
    // 本阶段存证内容哈希值
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签署文件份数
    @NameInMap("file_num")
    @Validation(required = true)
    public Long fileNum;

    // 签署流程发起人ID
    @NameInMap("initiator")
    @Validation(required = true)
    public String initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
    @NameInMap("signatories")
    public String signatories;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 存证凭据，仅在批量核验时需要填写
    @NameInMap("tx_hash")
    public String txHash;

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

}
