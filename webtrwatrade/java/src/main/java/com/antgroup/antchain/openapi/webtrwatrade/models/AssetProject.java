// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class AssetProject extends TeaModel {
    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 项目代币名称
    @NameInMap("token_name")
    @Validation(required = true)
    public String tokenName;

    // 项目介绍
    @NameInMap("info")
    @Validation(required = true)
    public String info;

    // 当前供应量
    @NameInMap("supply")
    @Validation(required = true)
    public String supply;

    // 最大供应量
    @NameInMap("capacity")
    @Validation(required = true)
    public String capacity;

    // 供应量比例(supply/capacity * 100，保留2位小数)
    @NameInMap("radio")
    @Validation(required = true)
    public Long radio;

    // 持有人数量
    @NameInMap("user_number")
    @Validation(required = true)
    public Long userNumber;

    // 资产token合约地址
    @NameInMap("asset_token_address")
    @Validation(required = true)
    public String assetTokenAddress;

    // 资产规则引擎合约地址
    @NameInMap("rule_engine_address")
    @Validation(required = true)
    public String ruleEngineAddress;

    // 资产白名单合约地址
    @NameInMap("member_list_rule_address")
    @Validation(required = true)
    public String memberListRuleAddress;

    // 项目状态(ACTIVE：激活；PAUSED：暂停)
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 项目净值
    @NameInMap("net_value")
    @Validation(required = true)
    public String netValue;

    // 项目币种(目前支持USD、HKD)
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 项目创建时间戳
    @NameInMap("gmt_created")
    @Validation(required = true)
    public Long gmtCreated;

    // 项目修改时间戳
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    public static AssetProject build(java.util.Map<String, ?> map) throws Exception {
        AssetProject self = new AssetProject();
        return TeaModel.build(map, self);
    }

    public AssetProject setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssetProject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AssetProject setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public AssetProject setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public AssetProject setSupply(String supply) {
        this.supply = supply;
        return this;
    }
    public String getSupply() {
        return this.supply;
    }

    public AssetProject setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public AssetProject setRadio(Long radio) {
        this.radio = radio;
        return this;
    }
    public Long getRadio() {
        return this.radio;
    }

    public AssetProject setUserNumber(Long userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public Long getUserNumber() {
        return this.userNumber;
    }

    public AssetProject setAssetTokenAddress(String assetTokenAddress) {
        this.assetTokenAddress = assetTokenAddress;
        return this;
    }
    public String getAssetTokenAddress() {
        return this.assetTokenAddress;
    }

    public AssetProject setRuleEngineAddress(String ruleEngineAddress) {
        this.ruleEngineAddress = ruleEngineAddress;
        return this;
    }
    public String getRuleEngineAddress() {
        return this.ruleEngineAddress;
    }

    public AssetProject setMemberListRuleAddress(String memberListRuleAddress) {
        this.memberListRuleAddress = memberListRuleAddress;
        return this;
    }
    public String getMemberListRuleAddress() {
        return this.memberListRuleAddress;
    }

    public AssetProject setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AssetProject setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public AssetProject setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public AssetProject setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public AssetProject setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
