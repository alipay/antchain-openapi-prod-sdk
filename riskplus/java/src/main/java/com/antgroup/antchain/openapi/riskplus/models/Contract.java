// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class Contract extends TeaModel {
    // 关联编号
    @NameInMap("relation_no")
    @Validation(required = true)
    public String relationNo;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 合同名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合同类型
    @NameInMap("contract_type")
    @Validation(required = true)
    public String contractType;

    // 客户编号
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 合同存放目录
    @NameInMap("save_path")
    @Validation(required = true)
    public String savePath;

    // 合同金额
    @NameInMap("contract_amount")
    @Validation(required = true)
    public Long contractAmount;

    // 用信合同编号
    @NameInMap("disburse_contract_no")
    @Validation(required = true)
    public String disburseContractNo;

    // 授信合同编号
    @NameInMap("credit_contract_no")
    @Validation(required = true)
    public String creditContractNo;

    public static Contract build(java.util.Map<String, ?> map) throws Exception {
        Contract self = new Contract();
        return TeaModel.build(map, self);
    }

    public Contract setRelationNo(String relationNo) {
        this.relationNo = relationNo;
        return this;
    }
    public String getRelationNo() {
        return this.relationNo;
    }

    public Contract setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public Contract setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public Contract setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public Contract setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public Contract setSavePath(String savePath) {
        this.savePath = savePath;
        return this;
    }
    public String getSavePath() {
        return this.savePath;
    }

    public Contract setContractAmount(Long contractAmount) {
        this.contractAmount = contractAmount;
        return this;
    }
    public Long getContractAmount() {
        return this.contractAmount;
    }

    public Contract setDisburseContractNo(String disburseContractNo) {
        this.disburseContractNo = disburseContractNo;
        return this;
    }
    public String getDisburseContractNo() {
        return this.disburseContractNo;
    }

    public Contract setCreditContractNo(String creditContractNo) {
        this.creditContractNo = creditContractNo;
        return this;
    }
    public String getCreditContractNo() {
        return this.creditContractNo;
    }

}
