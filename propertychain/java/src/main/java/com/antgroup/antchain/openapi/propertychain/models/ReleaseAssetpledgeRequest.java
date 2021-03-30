// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ReleaseAssetpledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资金方的id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 质押Id
    @NameInMap("pledge_id")
    @Validation(required = true)
    public String pledgeId;

    // 放款时间
    @NameInMap("lend_date")
    @Validation(required = true)
    public Long lendDate;

    // 放款金额
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 收款方名称
    @NameInMap("borrower_name")
    @Validation(required = true)
    public String borrowerName;

    // 收款方账号
    @NameInMap("borrower_account")
    @Validation(required = true)
    public String borrowerAccount;

    // 收款方银行
    @NameInMap("borrower_bank_info")
    @Validation(required = true)
    public String borrowerBankInfo;

    public static ReleaseAssetpledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAssetpledgeRequest self = new ReleaseAssetpledgeRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAssetpledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseAssetpledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReleaseAssetpledgeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ReleaseAssetpledgeRequest setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
        return this;
    }
    public String getPledgeId() {
        return this.pledgeId;
    }

    public ReleaseAssetpledgeRequest setLendDate(Long lendDate) {
        this.lendDate = lendDate;
        return this;
    }
    public Long getLendDate() {
        return this.lendDate;
    }

    public ReleaseAssetpledgeRequest setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public ReleaseAssetpledgeRequest setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
        return this;
    }
    public String getBorrowerName() {
        return this.borrowerName;
    }

    public ReleaseAssetpledgeRequest setBorrowerAccount(String borrowerAccount) {
        this.borrowerAccount = borrowerAccount;
        return this;
    }
    public String getBorrowerAccount() {
        return this.borrowerAccount;
    }

    public ReleaseAssetpledgeRequest setBorrowerBankInfo(String borrowerBankInfo) {
        this.borrowerBankInfo = borrowerBankInfo;
        return this;
    }
    public String getBorrowerBankInfo() {
        return this.borrowerBankInfo;
    }

}
