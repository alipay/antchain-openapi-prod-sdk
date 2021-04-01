// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeEpwholesaleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批发账户信息列表
    @NameInMap("account_list")
    @Validation(required = true)
    public java.util.List<AccountWholesaleParam> accountList;

    // 版通代码
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    // 版通发行方账户
    @NameInMap("ep_issue_account")
    @Validation(required = true)
    public String epIssueAccount;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    public static StartDigitalassetExchangeEpwholesaleRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeEpwholesaleRequest self = new StartDigitalassetExchangeEpwholesaleRequest();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeEpwholesaleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDigitalassetExchangeEpwholesaleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDigitalassetExchangeEpwholesaleRequest setAccountList(java.util.List<AccountWholesaleParam> accountList) {
        this.accountList = accountList;
        return this;
    }
    public java.util.List<AccountWholesaleParam> getAccountList() {
        return this.accountList;
    }

    public StartDigitalassetExchangeEpwholesaleRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public StartDigitalassetExchangeEpwholesaleRequest setEpIssueAccount(String epIssueAccount) {
        this.epIssueAccount = epIssueAccount;
        return this;
    }
    public String getEpIssueAccount() {
        return this.epIssueAccount;
    }

    public StartDigitalassetExchangeEpwholesaleRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

}
