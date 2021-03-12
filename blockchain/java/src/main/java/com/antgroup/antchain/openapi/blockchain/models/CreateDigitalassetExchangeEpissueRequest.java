// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDigitalassetExchangeEpissueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 版通锚定物
    @NameInMap("ep_anchor")
    @Validation(required = true)
    public String epAnchor;

    // 版通代码
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    // 版通首发量
    @NameInMap("ep_first_amount")
    @Validation(required = true)
    public Long epFirstAmount;

    // 版通发行方账户
    @NameInMap("ep_issue_account")
    @Validation(required = true)
    public String epIssueAccount;

    // 版通发行时间戳
    @NameInMap("ep_issue_date")
    @Validation(required = true)
    public Long epIssueDate;

    // 版通名称
    @NameInMap("ep_name")
    @Validation(required = true)
    public String epName;

    // 版通线下发行配额
    @NameInMap("ep_offline_issue_amount")
    @Validation(required = true)
    public Long epOfflineIssueAmount;

    // 版通线下日解限比例
    @NameInMap("ep_offline_unfreeze")
    @Validation(required = true)
    public Long epOfflineUnfreeze;

    // 版通线上发行配额
    @NameInMap("ep_online_issue_amount")
    @Validation(required = true)
    public Long epOnlineIssueAmount;

    // 发行方版通自持量
    @NameInMap("ep_self_amount")
    @Validation(required = true)
    public Long epSelfAmount;

    // 发行方版通日解限比例
    @NameInMap("ep_self_unfreeze")
    @Validation(required = true)
    public Long epSelfUnfreeze;

    // 版通发行数量
    @NameInMap("ep_total_amount")
    @Validation(required = true)
    public Long epTotalAmount;

    // 版通类型
    @NameInMap("ep_type")
    @Validation(required = true)
    public String epType;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 预留扩展字段
    @NameInMap("extend")
    public String extend;

    public static CreateDigitalassetExchangeEpissueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalassetExchangeEpissueRequest self = new CreateDigitalassetExchangeEpissueRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalassetExchangeEpissueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalassetExchangeEpissueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpAnchor(String epAnchor) {
        this.epAnchor = epAnchor;
        return this;
    }
    public String getEpAnchor() {
        return this.epAnchor;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpFirstAmount(Long epFirstAmount) {
        this.epFirstAmount = epFirstAmount;
        return this;
    }
    public Long getEpFirstAmount() {
        return this.epFirstAmount;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpIssueAccount(String epIssueAccount) {
        this.epIssueAccount = epIssueAccount;
        return this;
    }
    public String getEpIssueAccount() {
        return this.epIssueAccount;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpIssueDate(Long epIssueDate) {
        this.epIssueDate = epIssueDate;
        return this;
    }
    public Long getEpIssueDate() {
        return this.epIssueDate;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpOfflineIssueAmount(Long epOfflineIssueAmount) {
        this.epOfflineIssueAmount = epOfflineIssueAmount;
        return this;
    }
    public Long getEpOfflineIssueAmount() {
        return this.epOfflineIssueAmount;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpOfflineUnfreeze(Long epOfflineUnfreeze) {
        this.epOfflineUnfreeze = epOfflineUnfreeze;
        return this;
    }
    public Long getEpOfflineUnfreeze() {
        return this.epOfflineUnfreeze;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpOnlineIssueAmount(Long epOnlineIssueAmount) {
        this.epOnlineIssueAmount = epOnlineIssueAmount;
        return this;
    }
    public Long getEpOnlineIssueAmount() {
        return this.epOnlineIssueAmount;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpSelfAmount(Long epSelfAmount) {
        this.epSelfAmount = epSelfAmount;
        return this;
    }
    public Long getEpSelfAmount() {
        return this.epSelfAmount;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpSelfUnfreeze(Long epSelfUnfreeze) {
        this.epSelfUnfreeze = epSelfUnfreeze;
        return this;
    }
    public Long getEpSelfUnfreeze() {
        return this.epSelfUnfreeze;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpTotalAmount(Long epTotalAmount) {
        this.epTotalAmount = epTotalAmount;
        return this;
    }
    public Long getEpTotalAmount() {
        return this.epTotalAmount;
    }

    public CreateDigitalassetExchangeEpissueRequest setEpType(String epType) {
        this.epType = epType;
        return this;
    }
    public String getEpType() {
        return this.epType;
    }

    public CreateDigitalassetExchangeEpissueRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public CreateDigitalassetExchangeEpissueRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

}
