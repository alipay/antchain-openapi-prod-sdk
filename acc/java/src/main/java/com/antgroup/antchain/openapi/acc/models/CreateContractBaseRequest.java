// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateContractBaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目编号 
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 合同信息id
    @NameInMap("contract_info_id")
    @Validation(required = true)
    public Long contractInfoId;

    // 合同编号
    @NameInMap("contract_info_code")
    @Validation(required = true)
    public String contractInfoCode;

    // 合同名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合同版本,从1起
    @NameInMap("contract_version")
    @Validation(required = true)
    public Long contractVersion;

    // 变更原因（第一版不传值）
    @NameInMap("change_reason")
    public String changeReason;

    // 合同类型
    @NameInMap("contract_type")
    @Validation(required = true)
    public String contractType;

    // 甲方统一社会信用代码
    @NameInMap("party_a_bidder_code")
    @Validation(required = true)
    public String partyABidderCode;

    // 甲方名称
    @NameInMap("party_a_name")
    @Validation(required = true)
    public String partyAName;

    // 甲方授权代表Did
    @NameInMap("party_a_audit_did")
    @Validation(required = true)
    public String partyAAuditDid;

    // 乙方集合
    @NameInMap("party_b_firm_dto_list")
    @Validation(required = true)
    public java.util.List<PartyBFirmDto> partyBFirmDtoList;

    // 合同金额
    @NameInMap("contract_money")
    @Validation(required = true)
    public String contractMoney;

    // 金额币种代码
    @NameInMap("price_currency")
    @Validation(required = true)
    public String priceCurrency;

    // 金额单位
    @NameInMap("price_unit")
    @Validation(required = true)
    public String priceUnit;

    // 拟开工时间
    @NameInMap("start_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startDate;

    // 拟建成时间
    @NameInMap("end_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endDate;

    // 合同签署时间
    @NameInMap("contract_sign_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String contractSignTime;

    // 创建人Did
    @NameInMap("created_did")
    @Validation(required = true)
    public String createdDid;

    // 合同文件
    @NameInMap("contract_file")
    @Validation(required = true)
    public String contractFile;

    // 文件存证
    @NameInMap("evidence")
    @Validation(required = true)
    public String evidence;

    // 存证txHash
    @NameInMap("tx_hash")
    public String txHash;

    // 数据时间戳
    @NameInMap("data_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dataTimestamp;

    // 保证金对象集合
    @NameInMap("security_fund_dto_list")
    public java.util.List<SecurityFundDto> securityFundDtoList;

    public static CreateContractBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractBaseRequest self = new CreateContractBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractBaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractBaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractBaseRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateContractBaseRequest setContractInfoId(Long contractInfoId) {
        this.contractInfoId = contractInfoId;
        return this;
    }
    public Long getContractInfoId() {
        return this.contractInfoId;
    }

    public CreateContractBaseRequest setContractInfoCode(String contractInfoCode) {
        this.contractInfoCode = contractInfoCode;
        return this;
    }
    public String getContractInfoCode() {
        return this.contractInfoCode;
    }

    public CreateContractBaseRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateContractBaseRequest setContractVersion(Long contractVersion) {
        this.contractVersion = contractVersion;
        return this;
    }
    public Long getContractVersion() {
        return this.contractVersion;
    }

    public CreateContractBaseRequest setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }
    public String getChangeReason() {
        return this.changeReason;
    }

    public CreateContractBaseRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public CreateContractBaseRequest setPartyABidderCode(String partyABidderCode) {
        this.partyABidderCode = partyABidderCode;
        return this;
    }
    public String getPartyABidderCode() {
        return this.partyABidderCode;
    }

    public CreateContractBaseRequest setPartyAName(String partyAName) {
        this.partyAName = partyAName;
        return this;
    }
    public String getPartyAName() {
        return this.partyAName;
    }

    public CreateContractBaseRequest setPartyAAuditDid(String partyAAuditDid) {
        this.partyAAuditDid = partyAAuditDid;
        return this;
    }
    public String getPartyAAuditDid() {
        return this.partyAAuditDid;
    }

    public CreateContractBaseRequest setPartyBFirmDtoList(java.util.List<PartyBFirmDto> partyBFirmDtoList) {
        this.partyBFirmDtoList = partyBFirmDtoList;
        return this;
    }
    public java.util.List<PartyBFirmDto> getPartyBFirmDtoList() {
        return this.partyBFirmDtoList;
    }

    public CreateContractBaseRequest setContractMoney(String contractMoney) {
        this.contractMoney = contractMoney;
        return this;
    }
    public String getContractMoney() {
        return this.contractMoney;
    }

    public CreateContractBaseRequest setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }
    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    public CreateContractBaseRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public CreateContractBaseRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateContractBaseRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateContractBaseRequest setContractSignTime(String contractSignTime) {
        this.contractSignTime = contractSignTime;
        return this;
    }
    public String getContractSignTime() {
        return this.contractSignTime;
    }

    public CreateContractBaseRequest setCreatedDid(String createdDid) {
        this.createdDid = createdDid;
        return this;
    }
    public String getCreatedDid() {
        return this.createdDid;
    }

    public CreateContractBaseRequest setContractFile(String contractFile) {
        this.contractFile = contractFile;
        return this;
    }
    public String getContractFile() {
        return this.contractFile;
    }

    public CreateContractBaseRequest setEvidence(String evidence) {
        this.evidence = evidence;
        return this;
    }
    public String getEvidence() {
        return this.evidence;
    }

    public CreateContractBaseRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public CreateContractBaseRequest setDataTimestamp(String dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
        return this;
    }
    public String getDataTimestamp() {
        return this.dataTimestamp;
    }

    public CreateContractBaseRequest setSecurityFundDtoList(java.util.List<SecurityFundDto> securityFundDtoList) {
        this.securityFundDtoList = securityFundDtoList;
        return this;
    }
    public java.util.List<SecurityFundDto> getSecurityFundDtoList() {
        return this.securityFundDtoList;
    }

}
