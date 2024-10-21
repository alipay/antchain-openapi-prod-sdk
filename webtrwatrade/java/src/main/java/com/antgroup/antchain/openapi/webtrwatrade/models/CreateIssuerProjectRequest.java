// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class CreateIssuerProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 项目名称
    @NameInMap("info")
    @Validation(required = true)
    public String info;

    // 代币名称
    @NameInMap("token_name")
    @Validation(required = true)
    public String tokenName;

    // 最大供应量
    @NameInMap("capacity")
    @Validation(required = true)
    public String capacity;

    // 净值
    @NameInMap("net_value")
    public String netValue;

    // 币种(目前支持USD、HKD、CNY)
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 项目参与者列表(代销机构，最多3个)
    @NameInMap("participants")
    @Validation(required = true)
    public java.util.List<ParticipantInfo> participants;

    // 发行密钥ID列表(最多3个)
    @NameInMap("mint_keys")
    @Validation(required = true)
    public java.util.List<String> mintKeys;

    // 赎回密钥ID列表(最多3个)
    @NameInMap("burn_keys")
    @Validation(required = true)
    public java.util.List<String> burnKeys;

    // 转账密钥ID列表(最多3个)
    @NameInMap("transfer_keys")
    @Validation(required = true)
    public java.util.List<String> transferKeys;

    // 管理密钥ID列表(最多3个)
    @NameInMap("manager_keys")
    @Validation(required = true)
    public java.util.List<String> managerKeys;

    public static CreateIssuerProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIssuerProjectRequest self = new CreateIssuerProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateIssuerProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIssuerProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIssuerProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIssuerProjectRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public CreateIssuerProjectRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public CreateIssuerProjectRequest setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public CreateIssuerProjectRequest setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public CreateIssuerProjectRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateIssuerProjectRequest setParticipants(java.util.List<ParticipantInfo> participants) {
        this.participants = participants;
        return this;
    }
    public java.util.List<ParticipantInfo> getParticipants() {
        return this.participants;
    }

    public CreateIssuerProjectRequest setMintKeys(java.util.List<String> mintKeys) {
        this.mintKeys = mintKeys;
        return this;
    }
    public java.util.List<String> getMintKeys() {
        return this.mintKeys;
    }

    public CreateIssuerProjectRequest setBurnKeys(java.util.List<String> burnKeys) {
        this.burnKeys = burnKeys;
        return this;
    }
    public java.util.List<String> getBurnKeys() {
        return this.burnKeys;
    }

    public CreateIssuerProjectRequest setTransferKeys(java.util.List<String> transferKeys) {
        this.transferKeys = transferKeys;
        return this;
    }
    public java.util.List<String> getTransferKeys() {
        return this.transferKeys;
    }

    public CreateIssuerProjectRequest setManagerKeys(java.util.List<String> managerKeys) {
        this.managerKeys = managerKeys;
        return this;
    }
    public java.util.List<String> getManagerKeys() {
        return this.managerKeys;
    }

}
