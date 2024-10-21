// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class RedeemIssuerSubusertradeRequest extends TeaModel {
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

    // 赎回数量
    @NameInMap("redeem_amount")
    @Validation(required = true)
    public String redeemAmount;

    // 资产项目ID
    @NameInMap("asset_project_id")
    @Validation(required = true)
    public String assetProjectId;

    // 资产项目链上合约地址
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    public static RedeemIssuerSubusertradeRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeemIssuerSubusertradeRequest self = new RedeemIssuerSubusertradeRequest();
        return TeaModel.build(map, self);
    }

    public RedeemIssuerSubusertradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RedeemIssuerSubusertradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RedeemIssuerSubusertradeRequest setSubUserAddress(String subUserAddress) {
        this.subUserAddress = subUserAddress;
        return this;
    }
    public String getSubUserAddress() {
        return this.subUserAddress;
    }

    public RedeemIssuerSubusertradeRequest setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public RedeemIssuerSubusertradeRequest setRedeemAmount(String redeemAmount) {
        this.redeemAmount = redeemAmount;
        return this;
    }
    public String getRedeemAmount() {
        return this.redeemAmount;
    }

    public RedeemIssuerSubusertradeRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public RedeemIssuerSubusertradeRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

}
