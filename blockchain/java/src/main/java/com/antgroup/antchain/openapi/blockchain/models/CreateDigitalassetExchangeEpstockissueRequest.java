// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDigitalassetExchangeEpstockissueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 版通代码
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    // 版通发行方账户
    @NameInMap("ep_issue_account")
    @Validation(required = true)
    public String epIssueAccount;

    // 版通存量发行线下量
    @NameInMap("ep_offline_issue_amount")
    @Validation(required = true)
    public Long epOfflineIssueAmount;

    // 版通存量发行线上量
    @NameInMap("ep_online_issue_amount")
    @Validation(required = true)
    public Long epOnlineIssueAmount;

    // 版通存量发行自持量
    @NameInMap("ep_self_issue_amount")
    @Validation(required = true)
    public Long epSelfIssueAmount;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    public static CreateDigitalassetExchangeEpstockissueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalassetExchangeEpstockissueRequest self = new CreateDigitalassetExchangeEpstockissueRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalassetExchangeEpstockissueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setEpIssueAccount(String epIssueAccount) {
        this.epIssueAccount = epIssueAccount;
        return this;
    }
    public String getEpIssueAccount() {
        return this.epIssueAccount;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setEpOfflineIssueAmount(Long epOfflineIssueAmount) {
        this.epOfflineIssueAmount = epOfflineIssueAmount;
        return this;
    }
    public Long getEpOfflineIssueAmount() {
        return this.epOfflineIssueAmount;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setEpOnlineIssueAmount(Long epOnlineIssueAmount) {
        this.epOnlineIssueAmount = epOnlineIssueAmount;
        return this;
    }
    public Long getEpOnlineIssueAmount() {
        return this.epOnlineIssueAmount;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setEpSelfIssueAmount(Long epSelfIssueAmount) {
        this.epSelfIssueAmount = epSelfIssueAmount;
        return this;
    }
    public Long getEpSelfIssueAmount() {
        return this.epSelfIssueAmount;
    }

    public CreateDigitalassetExchangeEpstockissueRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

}
