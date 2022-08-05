// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String name;

    // 数字合约symbol
    @NameInMap("symbol")
    @Validation(required = true)
    public String symbol;

    // 数字权证项目描述信息
    @NameInMap("description")
    public String description;

    // 模版类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public Long bizType;

    // 项目发行权证数量上限
    @NameInMap("amount")
    @Validation(required = true, minimum = 1)
    public Long amount;

    // 数字权证链接，共享时必须传入
    @NameInMap("asset_uri")
    public String assetUri;

    // 是否可增发
    @NameInMap("limited_amount")
    @Validation(required = true)
    public Boolean limitedAmount;

    // 是否可核销
    @NameInMap("write_offable")
    @Validation(required = true)
    public Boolean writeOffable;

    // 是否可销毁
    @NameInMap("burnable")
    @Validation(required = true)
    public Boolean burnable;

    // 项目管理者，必须是链上已存在的账户，只有管理者可以修改项目信息
    @NameInMap("owner_account")
    @Validation(required = true)
    public String ownerAccount;

    // 发行者列表，必须是链上已经存在的账户，只有发行者具备权证发行权限。
    @NameInMap("issuer_list")
    @Validation(required = true)
    public java.util.List<String> issuerList;

    // 核销者列表，必须是链上已经存在的账户，只有核销者才可以核销权证
    @NameInMap("writeoff_list")
    public java.util.List<String> writeoffList;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProjectRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setBizType(Long bizType) {
        this.bizType = bizType;
        return this;
    }
    public Long getBizType() {
        return this.bizType;
    }

    public CreateProjectRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public CreateProjectRequest setAssetUri(String assetUri) {
        this.assetUri = assetUri;
        return this;
    }
    public String getAssetUri() {
        return this.assetUri;
    }

    public CreateProjectRequest setLimitedAmount(Boolean limitedAmount) {
        this.limitedAmount = limitedAmount;
        return this;
    }
    public Boolean getLimitedAmount() {
        return this.limitedAmount;
    }

    public CreateProjectRequest setWriteOffable(Boolean writeOffable) {
        this.writeOffable = writeOffable;
        return this;
    }
    public Boolean getWriteOffable() {
        return this.writeOffable;
    }

    public CreateProjectRequest setBurnable(Boolean burnable) {
        this.burnable = burnable;
        return this;
    }
    public Boolean getBurnable() {
        return this.burnable;
    }

    public CreateProjectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateProjectRequest setIssuerList(java.util.List<String> issuerList) {
        this.issuerList = issuerList;
        return this;
    }
    public java.util.List<String> getIssuerList() {
        return this.issuerList;
    }

    public CreateProjectRequest setWriteoffList(java.util.List<String> writeoffList) {
        this.writeoffList = writeoffList;
        return this;
    }
    public java.util.List<String> getWriteoffList() {
        return this.writeoffList;
    }

}
