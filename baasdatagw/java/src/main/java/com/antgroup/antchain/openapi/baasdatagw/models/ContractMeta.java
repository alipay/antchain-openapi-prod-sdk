// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ContractMeta extends TeaModel {
    // MetaID
    @NameInMap("id")
    public Long id;

    // 合约Meta创建时间
    @NameInMap("create_time")
    public Long createTime;

    // 合约Meta更新时间
    @NameInMap("update_time")
    public Long updateTime;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合约名称对应的Hex编码合约地址
    @NameInMap("contract_addr")
    @Validation(required = true)
    public String contractAddr;

    // 合约版本号，用于助记
    @NameInMap("contract_version")
    @Validation(required = true)
    public String contractVersion;

    // 合约Meta的类型，枚举类型；
    @NameInMap("meta_type")
    @Validation(required = true)
    public String metaType;

    // 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
    @NameInMap("start_block")
    public Long startBlock;

    // 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
    @NameInMap("end_block")
    public Long endBlock;

    // 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
    @NameInMap("public_flag")
    public Long publicFlag;

    // 合约Meta对应类型的数据
    @NameInMap("meta_content")
    @Validation(required = true)
    public String metaContent;

    public static ContractMeta build(java.util.Map<String, ?> map) throws Exception {
        ContractMeta self = new ContractMeta();
        return TeaModel.build(map, self);
    }

    public ContractMeta setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ContractMeta setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ContractMeta setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public ContractMeta setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public ContractMeta setContractAddr(String contractAddr) {
        this.contractAddr = contractAddr;
        return this;
    }
    public String getContractAddr() {
        return this.contractAddr;
    }

    public ContractMeta setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
        return this;
    }
    public String getContractVersion() {
        return this.contractVersion;
    }

    public ContractMeta setMetaType(String metaType) {
        this.metaType = metaType;
        return this;
    }
    public String getMetaType() {
        return this.metaType;
    }

    public ContractMeta setStartBlock(Long startBlock) {
        this.startBlock = startBlock;
        return this;
    }
    public Long getStartBlock() {
        return this.startBlock;
    }

    public ContractMeta setEndBlock(Long endBlock) {
        this.endBlock = endBlock;
        return this;
    }
    public Long getEndBlock() {
        return this.endBlock;
    }

    public ContractMeta setPublicFlag(Long publicFlag) {
        this.publicFlag = publicFlag;
        return this;
    }
    public Long getPublicFlag() {
        return this.publicFlag;
    }

    public ContractMeta setMetaContent(String metaContent) {
        this.metaContent = metaContent;
        return this;
    }
    public String getMetaContent() {
        return this.metaContent;
    }

}
