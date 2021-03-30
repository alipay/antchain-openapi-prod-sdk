// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class RepayAssetpledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请方
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 质押id
    @NameInMap("pledge_id")
    @Validation(required = true)
    public String pledgeId;

    // 收款方银行
    @NameInMap("recipient_bank")
    @Validation(required = true)
    public String recipientBank;

    // 收款方账号
    @NameInMap("recipient_account")
    @Validation(required = true)
    public String recipientAccount;

    // 金额
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 还款时间
    @NameInMap("repay_date")
    @Validation(required = true)
    public Long repayDate;

    public static RepayAssetpledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayAssetpledgeRequest self = new RepayAssetpledgeRequest();
        return TeaModel.build(map, self);
    }

    public RepayAssetpledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayAssetpledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayAssetpledgeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RepayAssetpledgeRequest setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
        return this;
    }
    public String getPledgeId() {
        return this.pledgeId;
    }

    public RepayAssetpledgeRequest setRecipientBank(String recipientBank) {
        this.recipientBank = recipientBank;
        return this;
    }
    public String getRecipientBank() {
        return this.recipientBank;
    }

    public RepayAssetpledgeRequest setRecipientAccount(String recipientAccount) {
        this.recipientAccount = recipientAccount;
        return this;
    }
    public String getRecipientAccount() {
        return this.recipientAccount;
    }

    public RepayAssetpledgeRequest setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public RepayAssetpledgeRequest setRepayDate(Long repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public Long getRepayDate() {
        return this.repayDate;
    }

}
