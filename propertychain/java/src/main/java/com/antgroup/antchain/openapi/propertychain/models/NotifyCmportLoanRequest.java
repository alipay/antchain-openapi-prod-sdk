// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class NotifyCmportLoanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台融资编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 确认放款日期
    @NameInMap("confirm_loan_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String confirmLoanDate;

    // 放款描述
    @NameInMap("confirm_loan_comment")
    @Validation(required = true)
    public String confirmLoanComment;

    // 流程标记： 1->流程通过;2->流程打回到上一级;3->直接拒绝
    @NameInMap("confirm_loan_flag")
    @Validation(required = true)
    public Long confirmLoanFlag;

    //  融资状态:
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

    public static NotifyCmportLoanRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyCmportLoanRequest self = new NotifyCmportLoanRequest();
        return TeaModel.build(map, self);
    }

    public NotifyCmportLoanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyCmportLoanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyCmportLoanRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public NotifyCmportLoanRequest setConfirmLoanDate(String confirmLoanDate) {
        this.confirmLoanDate = confirmLoanDate;
        return this;
    }
    public String getConfirmLoanDate() {
        return this.confirmLoanDate;
    }

    public NotifyCmportLoanRequest setConfirmLoanComment(String confirmLoanComment) {
        this.confirmLoanComment = confirmLoanComment;
        return this;
    }
    public String getConfirmLoanComment() {
        return this.confirmLoanComment;
    }

    public NotifyCmportLoanRequest setConfirmLoanFlag(Long confirmLoanFlag) {
        this.confirmLoanFlag = confirmLoanFlag;
        return this;
    }
    public Long getConfirmLoanFlag() {
        return this.confirmLoanFlag;
    }

    public NotifyCmportLoanRequest setFinancialStatus(Long financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }
    public Long getFinancialStatus() {
        return this.financialStatus;
    }

    public NotifyCmportLoanRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public NotifyCmportLoanRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public NotifyCmportLoanRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
