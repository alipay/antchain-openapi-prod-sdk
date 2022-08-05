// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class DigitalProject extends TeaModel {
    // 数字权证项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 模版类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public Long bizType;

    // 数字权证项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 合约symbol
    @NameInMap("symbol")
    @Validation(required = true)
    public String symbol;

    // 数字权证项目描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 项目状态：
    // deploy：已部署(可更新)
    // issue：已发布(不可更新)
    @NameInMap("project_status")
    @Validation(required = true)
    public String projectStatus;

    // 项目发行权证的总数
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 权证的uri信息（共享tokenuri模式有该字段）
    @NameInMap("asset_uri")
    public String assetUri;

    // 项目发行后权证数量是否可增发
    // 
    @NameInMap("limited_amount")
    @Validation(required = true)
    public Boolean limitedAmount;

    // 项目权证是否可核销
    @NameInMap("write_offable")
    @Validation(required = true)
    public Boolean writeOffable;

    // 项目权证是否可销毁
    @NameInMap("burnable")
    @Validation(required = true)
    public Boolean burnable;

    // 项目管理员账户地址
    @NameInMap("owner_account")
    @Validation(required = true)
    public String ownerAccount;

    // 项目核销员账户地址列表
    @NameInMap("issuer_list")
    public java.util.List<String> issuerList;

    // 项目核销员账户地址列表
    @NameInMap("writeoff_list")
    public java.util.List<String> writeoffList;

    // 合约创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    public static DigitalProject build(java.util.Map<String, ?> map) throws Exception {
        DigitalProject self = new DigitalProject();
        return TeaModel.build(map, self);
    }

    public DigitalProject setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DigitalProject setBizType(Long bizType) {
        this.bizType = bizType;
        return this;
    }
    public Long getBizType() {
        return this.bizType;
    }

    public DigitalProject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DigitalProject setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public DigitalProject setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DigitalProject setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public DigitalProject setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public DigitalProject setAssetUri(String assetUri) {
        this.assetUri = assetUri;
        return this;
    }
    public String getAssetUri() {
        return this.assetUri;
    }

    public DigitalProject setLimitedAmount(Boolean limitedAmount) {
        this.limitedAmount = limitedAmount;
        return this;
    }
    public Boolean getLimitedAmount() {
        return this.limitedAmount;
    }

    public DigitalProject setWriteOffable(Boolean writeOffable) {
        this.writeOffable = writeOffable;
        return this;
    }
    public Boolean getWriteOffable() {
        return this.writeOffable;
    }

    public DigitalProject setBurnable(Boolean burnable) {
        this.burnable = burnable;
        return this;
    }
    public Boolean getBurnable() {
        return this.burnable;
    }

    public DigitalProject setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DigitalProject setIssuerList(java.util.List<String> issuerList) {
        this.issuerList = issuerList;
        return this;
    }
    public java.util.List<String> getIssuerList() {
        return this.issuerList;
    }

    public DigitalProject setWriteoffList(java.util.List<String> writeoffList) {
        this.writeoffList = writeoffList;
        return this;
    }
    public java.util.List<String> getWriteoffList() {
        return this.writeoffList;
    }

    public DigitalProject setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
