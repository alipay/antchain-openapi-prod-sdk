// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class AssetProjectDetail extends TeaModel {
    // 项目参与的代销机构列表
    @NameInMap("participant_infos")
    @Validation(required = true)
    public java.util.List<ParticipantInfo> participantInfos;

    // 发行密钥列表
    @NameInMap("mint_keys")
    @Validation(required = true)
    public java.util.List<KeyInfo> mintKeys;

    // 赎回密钥列表
    @NameInMap("burn_keys")
    @Validation(required = true)
    public java.util.List<KeyInfo> burnKeys;

    // 转账密钥列表
    @NameInMap("transfer_keys")
    @Validation(required = true)
    public java.util.List<KeyInfo> transferKeys;

    // 管理密钥列表
    @NameInMap("manager_keys")
    @Validation(required = true)
    public java.util.List<KeyInfo> managerKeys;

    // 历史净值列表
    @NameInMap("history_net_value_list")
    @Validation(required = true)
    public java.util.List<NetValueInfo> historyNetValueList;

    // 项目报告列表
    @NameInMap("report_list")
    @Validation(required = true)
    public java.util.List<ReportInfo> reportList;

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

    // 供应量比例(supply/capacity * 100，保留2位小数）
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
    public String gmtCreated;

    // 项目修改时间戳
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static AssetProjectDetail build(java.util.Map<String, ?> map) throws Exception {
        AssetProjectDetail self = new AssetProjectDetail();
        return TeaModel.build(map, self);
    }

    public AssetProjectDetail setParticipantInfos(java.util.List<ParticipantInfo> participantInfos) {
        this.participantInfos = participantInfos;
        return this;
    }
    public java.util.List<ParticipantInfo> getParticipantInfos() {
        return this.participantInfos;
    }

    public AssetProjectDetail setMintKeys(java.util.List<KeyInfo> mintKeys) {
        this.mintKeys = mintKeys;
        return this;
    }
    public java.util.List<KeyInfo> getMintKeys() {
        return this.mintKeys;
    }

    public AssetProjectDetail setBurnKeys(java.util.List<KeyInfo> burnKeys) {
        this.burnKeys = burnKeys;
        return this;
    }
    public java.util.List<KeyInfo> getBurnKeys() {
        return this.burnKeys;
    }

    public AssetProjectDetail setTransferKeys(java.util.List<KeyInfo> transferKeys) {
        this.transferKeys = transferKeys;
        return this;
    }
    public java.util.List<KeyInfo> getTransferKeys() {
        return this.transferKeys;
    }

    public AssetProjectDetail setManagerKeys(java.util.List<KeyInfo> managerKeys) {
        this.managerKeys = managerKeys;
        return this;
    }
    public java.util.List<KeyInfo> getManagerKeys() {
        return this.managerKeys;
    }

    public AssetProjectDetail setHistoryNetValueList(java.util.List<NetValueInfo> historyNetValueList) {
        this.historyNetValueList = historyNetValueList;
        return this;
    }
    public java.util.List<NetValueInfo> getHistoryNetValueList() {
        return this.historyNetValueList;
    }

    public AssetProjectDetail setReportList(java.util.List<ReportInfo> reportList) {
        this.reportList = reportList;
        return this;
    }
    public java.util.List<ReportInfo> getReportList() {
        return this.reportList;
    }

    public AssetProjectDetail setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssetProjectDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AssetProjectDetail setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public AssetProjectDetail setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public AssetProjectDetail setSupply(String supply) {
        this.supply = supply;
        return this;
    }
    public String getSupply() {
        return this.supply;
    }

    public AssetProjectDetail setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public AssetProjectDetail setRadio(Long radio) {
        this.radio = radio;
        return this;
    }
    public Long getRadio() {
        return this.radio;
    }

    public AssetProjectDetail setUserNumber(Long userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public Long getUserNumber() {
        return this.userNumber;
    }

    public AssetProjectDetail setAssetTokenAddress(String assetTokenAddress) {
        this.assetTokenAddress = assetTokenAddress;
        return this;
    }
    public String getAssetTokenAddress() {
        return this.assetTokenAddress;
    }

    public AssetProjectDetail setRuleEngineAddress(String ruleEngineAddress) {
        this.ruleEngineAddress = ruleEngineAddress;
        return this;
    }
    public String getRuleEngineAddress() {
        return this.ruleEngineAddress;
    }

    public AssetProjectDetail setMemberListRuleAddress(String memberListRuleAddress) {
        this.memberListRuleAddress = memberListRuleAddress;
        return this;
    }
    public String getMemberListRuleAddress() {
        return this.memberListRuleAddress;
    }

    public AssetProjectDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AssetProjectDetail setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public AssetProjectDetail setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public AssetProjectDetail setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public AssetProjectDetail setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
