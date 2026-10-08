// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class AddAntdigitalWebttsDacWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 白名单地址
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

    // 区块链网络
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 别名
    @NameInMap("nickname")
    public String nickname;

    // 钱包拥有人名称，若不传则默认取master account name，若传值，只需保证与master account name一致
    @NameInMap("wallet_owner")
    public String walletOwner;

    // 验证类型：SIGNATURE/DEPOSIT，默认SIGNATURE
    @NameInMap("verify_type")
    public String verifyType;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static AddAntdigitalWebttsDacWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAntdigitalWebttsDacWhitelistRequest self = new AddAntdigitalWebttsDacWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddAntdigitalWebttsDacWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setWalletOwner(String walletOwner) {
        this.walletOwner = walletOwner;
        return this;
    }
    public String getWalletOwner() {
        return this.walletOwner;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

    public AddAntdigitalWebttsDacWhitelistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
