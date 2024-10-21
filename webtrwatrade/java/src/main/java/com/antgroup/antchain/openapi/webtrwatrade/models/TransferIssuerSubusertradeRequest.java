// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class TransferIssuerSubusertradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // from二级用户地址
    @NameInMap("from_sub_user_address")
    @Validation(required = true)
    public String fromSubUserAddress;

    // from二级用户账户ID
    @NameInMap("from_sub_user_account_id")
    @Validation(required = true)
    public String fromSubUserAccountId;

    // to二级用户地址
    @NameInMap("to_sub_user_address")
    @Validation(required = true)
    public String toSubUserAddress;

    // to二级用户账户ID
    @NameInMap("to_sub_user_account_id")
    public String toSubUserAccountId;

    // 转移数量
    @NameInMap("transfer_amount")
    @Validation(required = true)
    public String transferAmount;

    // 资产项目ID
    @NameInMap("asset_project_id")
    @Validation(required = true)
    public String assetProjectId;

    // 资产项目链上合约地址
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    public static TransferIssuerSubusertradeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferIssuerSubusertradeRequest self = new TransferIssuerSubusertradeRequest();
        return TeaModel.build(map, self);
    }

    public TransferIssuerSubusertradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferIssuerSubusertradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TransferIssuerSubusertradeRequest setFromSubUserAddress(String fromSubUserAddress) {
        this.fromSubUserAddress = fromSubUserAddress;
        return this;
    }
    public String getFromSubUserAddress() {
        return this.fromSubUserAddress;
    }

    public TransferIssuerSubusertradeRequest setFromSubUserAccountId(String fromSubUserAccountId) {
        this.fromSubUserAccountId = fromSubUserAccountId;
        return this;
    }
    public String getFromSubUserAccountId() {
        return this.fromSubUserAccountId;
    }

    public TransferIssuerSubusertradeRequest setToSubUserAddress(String toSubUserAddress) {
        this.toSubUserAddress = toSubUserAddress;
        return this;
    }
    public String getToSubUserAddress() {
        return this.toSubUserAddress;
    }

    public TransferIssuerSubusertradeRequest setToSubUserAccountId(String toSubUserAccountId) {
        this.toSubUserAccountId = toSubUserAccountId;
        return this;
    }
    public String getToSubUserAccountId() {
        return this.toSubUserAccountId;
    }

    public TransferIssuerSubusertradeRequest setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
        return this;
    }
    public String getTransferAmount() {
        return this.transferAmount;
    }

    public TransferIssuerSubusertradeRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public TransferIssuerSubusertradeRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

}
