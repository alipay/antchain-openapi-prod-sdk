// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class IssueTransferData extends TeaModel {
    // 凭证id
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 转出方did
    @NameInMap("payer_did")
    @Validation(required = true)
    public String payerDid;

    // 接收方did
    @NameInMap("rcv_did")
    @Validation(required = true)
    public String rcvDid;

    public static IssueTransferData build(java.util.Map<String, ?> map) throws Exception {
        IssueTransferData self = new IssueTransferData();
        return TeaModel.build(map, self);
    }

    public IssueTransferData setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public IssueTransferData setPayerDid(String payerDid) {
        this.payerDid = payerDid;
        return this;
    }
    public String getPayerDid() {
        return this.payerDid;
    }

    public IssueTransferData setRcvDid(String rcvDid) {
        this.rcvDid = rcvDid;
        return this;
    }
    public String getRcvDid() {
        return this.rcvDid;
    }

}
