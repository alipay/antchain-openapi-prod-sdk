// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class IssueIssuerSubusertradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 二级用户地址
    @NameInMap("sub_user_address")
    @Validation(required = true)
    public String subUserAddress;

    // 二级用户账户ID
    @NameInMap("sub_user_account_id")
    @Validation(required = true)
    public String subUserAccountId;

    // 发行数量
    @NameInMap("issue_amount")
    @Validation(required = true)
    public String issueAmount;

    // 资产项目ID
    @NameInMap("asset_project_id")
    @Validation(required = true)
    public String assetProjectId;

    // 资产项目链上合约地址
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    public static IssueIssuerSubusertradeRequest build(java.util.Map<String, ?> map) throws Exception {
        IssueIssuerSubusertradeRequest self = new IssueIssuerSubusertradeRequest();
        return TeaModel.build(map, self);
    }

    public IssueIssuerSubusertradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public IssueIssuerSubusertradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public IssueIssuerSubusertradeRequest setSubUserAddress(String subUserAddress) {
        this.subUserAddress = subUserAddress;
        return this;
    }
    public String getSubUserAddress() {
        return this.subUserAddress;
    }

    public IssueIssuerSubusertradeRequest setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public IssueIssuerSubusertradeRequest setIssueAmount(String issueAmount) {
        this.issueAmount = issueAmount;
        return this;
    }
    public String getIssueAmount() {
        return this.issueAmount;
    }

    public IssueIssuerSubusertradeRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public IssueIssuerSubusertradeRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

}
