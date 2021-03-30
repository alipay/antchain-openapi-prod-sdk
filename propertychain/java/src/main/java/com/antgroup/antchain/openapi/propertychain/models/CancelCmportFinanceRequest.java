// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CancelCmportFinanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台融资编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 融资企业编码
    @NameInMap("company_code")
    @Validation(required = true)
    public String companyCode;

    // 融资企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 撤销申请日期
    @NameInMap("cancel_apply_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String cancelApplyDate;

    // 撤销申请描述
    @NameInMap("cancel_apply_desc")
    @Validation(required = true)
    public String cancelApplyDesc;

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

    public static CancelCmportFinanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCmportFinanceRequest self = new CancelCmportFinanceRequest();
        return TeaModel.build(map, self);
    }

    public CancelCmportFinanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelCmportFinanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelCmportFinanceRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public CancelCmportFinanceRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public CancelCmportFinanceRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CancelCmportFinanceRequest setCancelApplyDate(String cancelApplyDate) {
        this.cancelApplyDate = cancelApplyDate;
        return this;
    }
    public String getCancelApplyDate() {
        return this.cancelApplyDate;
    }

    public CancelCmportFinanceRequest setCancelApplyDesc(String cancelApplyDesc) {
        this.cancelApplyDesc = cancelApplyDesc;
        return this;
    }
    public String getCancelApplyDesc() {
        return this.cancelApplyDesc;
    }

    public CancelCmportFinanceRequest setFinancialStatus(Long financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }
    public Long getFinancialStatus() {
        return this.financialStatus;
    }

    public CancelCmportFinanceRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CancelCmportFinanceRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CancelCmportFinanceRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
