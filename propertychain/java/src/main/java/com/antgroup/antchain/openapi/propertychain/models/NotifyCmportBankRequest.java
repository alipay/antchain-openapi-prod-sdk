// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class NotifyCmportBankRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台融资编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 审核人
    @NameInMap("auditor")
    @Validation(required = true)
    public String auditor;

    // 审核时间
    @NameInMap("audit_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String auditDate;

    // 审核评论
    @NameInMap("audit_comment")
    @Validation(required = true)
    public String auditComment;

    // 融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    @NameInMap("financial_status")
    @Validation(required = true)
    public Long financialStatus;

    // 上链账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟id
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // Channel 名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    public static NotifyCmportBankRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyCmportBankRequest self = new NotifyCmportBankRequest();
        return TeaModel.build(map, self);
    }

    public NotifyCmportBankRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyCmportBankRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyCmportBankRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public NotifyCmportBankRequest setAuditor(String auditor) {
        this.auditor = auditor;
        return this;
    }
    public String getAuditor() {
        return this.auditor;
    }

    public NotifyCmportBankRequest setAuditDate(String auditDate) {
        this.auditDate = auditDate;
        return this;
    }
    public String getAuditDate() {
        return this.auditDate;
    }

    public NotifyCmportBankRequest setAuditComment(String auditComment) {
        this.auditComment = auditComment;
        return this;
    }
    public String getAuditComment() {
        return this.auditComment;
    }

    public NotifyCmportBankRequest setFinancialStatus(Long financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }
    public Long getFinancialStatus() {
        return this.financialStatus;
    }

    public NotifyCmportBankRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public NotifyCmportBankRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public NotifyCmportBankRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
