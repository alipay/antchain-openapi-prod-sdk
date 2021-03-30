// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ApplyCmportFinanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 来源方
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 融资编号（粮达生成）
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 融资编号（粮达生成）
    @NameInMap("merchant_financial_no")
    @Validation(required = true)
    public String merchantFinancialNo;

    // 交易编号（粮达生成）
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 融资企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 融资企业编码
    @NameInMap("company_code")
    @Validation(required = true)
    public String companyCode;

    // 统一信用代码
    @NameInMap("uni_credit_code")
    @Validation(required = true)
    public String uniCreditCode;

    // 法人名称
    @NameInMap("legal_person")
    @Validation(required = true)
    public String legalPerson;

    // 法人身份号码
    @NameInMap("legal_person_id_no")
    @Validation(required = true)
    public String legalPersonIdNo;

    // 融资企业联系人
    @NameInMap("company_contact_person")
    @Validation(required = true)
    public String companyContactPerson;

    // 融资企业联系号码
    @NameInMap("company_contact_phone")
    @Validation(required = true)
    public String companyContactPhone;

    // 企业办公地址
    @NameInMap("company_addr")
    @Validation(required = true)
    public String companyAddr;

    // 对手编号
    @NameInMap("buyer_code")
    @Validation(required = true)
    public String buyerCode;

    // 对手企业名称
    @NameInMap("buyer_name")
    @Validation(required = true)
    public String buyerName;

    // 对手统一信用代码
    @NameInMap("buyer_uni_credit_code")
    @Validation(required = true)
    public String buyerUniCreditCode;

    // 对手法人
    @NameInMap("buyer_legal_person")
    public String buyerLegalPerson;

    // 对手法人身份证号码
    @NameInMap("buyer_legal_person_id_no")
    public String buyerLegalPersonIdNo;

    // 对手联系人
    @NameInMap("buyer_contact_person")
    public String buyerContactPerson;

    // 对手联系人手机
    @NameInMap("buyer_contact_phone")
    public String buyerContactPhone;

    // 融资标的（采购合同关联的货权编号: 多个编号，隔开）
    @NameInMap("financing_target")
    @Validation(required = true)
    public String financingTarget;

    // 融资金额（分）
    @NameInMap("financial_amount")
    @Validation(required = true)
    public Long financialAmount;

    // 融资周期（天）
    @NameInMap("financial_period")
    @Validation(required = true)
    public Long financialPeriod;

    // 融资利率列表
    @NameInMap("financial_rate_list")
    @Validation(required = true)
    public java.util.List<FinancialRateInfo> financialRateList;

    // 罚息利率列表
    @NameInMap("penalty_rate_list")
    @Validation(required = true)
    public java.util.List<PenaltyRateInfo> penaltyRateList;

    // 操作费类型 1->标准收费; 2->阶梯收费
    @NameInMap("ope_fee_type")
    @Validation(required = true)
    public Long opeFeeType;

    // 操作费单价列表
    @NameInMap("ope_unit_price_list")
    @Validation(required = true)
    public java.util.List<OpeUnitPriceInfo> opeUnitPriceList;

    // 货物品种
    @NameInMap("cargo_type")
    @Validation(required = true)
    public String cargoType;

    // 货物吨数 (单位 t)
    @NameInMap("cargo_weight")
    @Validation(required = true)
    public String cargoWeight;

    // 货物单价（分）
    @NameInMap("cargo_unit_price")
    @Validation(required = true)
    public Long cargoUnitPrice;

    // 货物单价类型
    @NameInMap("cargo_unit_price_type")
    @Validation(required = true)
    public String cargoUnitPriceType;

    // 货物总价
    @NameInMap("cargo_total_price")
    @Validation(required = true)
    public Long cargoTotalPrice;

    // 融资申请日期
    @NameInMap("apply_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String applyDate;

    // 产品编号
    @NameInMap("product_no")
    @Validation(required = true)
    public String productNo;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品类别：1->买方保理;2->卖方保理;3->仓单融资
    @NameInMap("product_type")
    @Validation(required = true)
    public Long productType;

    // 确权方编码
    @NameInMap("authentic_right_code")
    @Validation(required = true)
    public String authenticRightCode;

    // 确权方名称
    @NameInMap("authentic_right_name")
    @Validation(required = true)
    public String authenticRightName;

    // 确权状态 1->已确权; 2->未确权。粮达网默认是 1
    @NameInMap("authentic_right_status")
    @Validation(required = true)
    public Long authenticRightStatus;

    // 确权时间
    @NameInMap("authentic_right_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String authenticRightTime;

    // 仓储服务商/物流服务商
    @NameInMap("storage_service_provider")
    @Validation(required = true)
    public String storageServiceProvider;

    // 仓储地址/物流地址
    @NameInMap("warehouse_addr")
    @Validation(required = true)
    public String warehouseAddr;

    // 仓储联系方式/物流联系方式
    @NameInMap("storage_contact_phone")
    @Validation(required = true)
    public String storageContactPhone;

    // 金融机构编码
    @NameInMap("bank_insti_code")
    @Validation(required = true)
    public String bankInstiCode;

    // 金融机构名称
    @NameInMap("bank_insti_name")
    @Validation(required = true)
    public String bankInstiName;

    // 是否缴纳保证金 1->缴纳;2->不缴纳
    @NameInMap("is_pay_security_deposit")
    @Validation(required = true)
    public Long isPaySecurityDeposit;

    // 保证金缴纳金额
    @NameInMap("security_deposit_amount")
    @Validation(required = true)
    public Long securityDepositAmount;

    // 保证金缴纳比例
    @NameInMap("security_deposit_rate")
    @Validation(required = true)
    public String securityDepositRate;

    // 融资额度协议编号
    @NameInMap("financing_limit_agree_no")
    @Validation(required = true)
    public String financingLimitAgreeNo;

    // 电子章认证机构
    @NameInMap("elec_cert_insti")
    @Validation(required = true)
    public String elecCertInsti;

    // 签署日期
    @NameInMap("sign_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signDate;

    // 保理协议编号
    @NameInMap("factoring_agreement_no")
    @Validation(required = true)
    public String factoringAgreementNo;

    // 卖方保理专户（回款账户）
    @NameInMap("seller_factoring_account")
    @Validation(required = true)
    public String sellerFactoringAccount;

    // 服务类型: 1->应收账款保理
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 业务类型: 1-> 买断循环后收息
    @NameInMap("business_type")
    @Validation(required = true)
    public String businessType;

    // 费用收取方式: 1-> 融资时收取
    @NameInMap("fee_collect_type")
    @Validation(required = true)
    public String feeCollectType;

    // 利息收取方式: 1-> 预扣
    @NameInMap("interest_collect_type")
    @Validation(required = true)
    public String interestCollectType;

    // 电子凭证编号
    @NameInMap("elec_cert_no")
    @Validation(required = true)
    public String elecCertNo;

    // 电子凭证开立日
    @NameInMap("elec_cert_set_up_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String elecCertSetUpDate;

    // 电子凭证付款到期日
    @NameInMap("elec_cert_expire_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String elecCertExpireDate;

    // 转让电子凭证金额
    @NameInMap("elec_cert_amount")
    @Validation(required = true)
    public Long elecCertAmount;

    // 交易合同发票编号
    @NameInMap("trade_contract_invo_no")
    @Validation(required = true)
    public String tradeContractInvoNo;

    // 交易合同发票金额
    @NameInMap("trade_contract_invo_amount")
    @Validation(required = true)
    public Long tradeContractInvoAmount;

    // 交易合同名称
    @NameInMap("trade_contract_name")
    @Validation(required = true)
    public String tradeContractName;

    // 交易合同编号
    @NameInMap("trade_contract_no")
    @Validation(required = true)
    public String tradeContractNo;

    // 交易合同买方名称
    @NameInMap("trade_contract_buyer_name")
    @Validation(required = true)
    public String tradeContractBuyerName;

    // 磅单凭证（多个的话-分号分割）
    @NameInMap("pound_proofs")
    public String poundProofs;

    // 入库凭证（多个的话-分号分割）
    @NameInMap("storage_proofs")
    @Validation(required = true)
    public String storageProofs;

    // 借款合同（多个的话-分号分割）
    @NameInMap("loan_contract")
    @Validation(required = true)
    public String loanContract;

    // 采购合同（多个的话-分号分割）
    @NameInMap("purchase_contract")
    @Validation(required = true)
    public String purchaseContract;

    // 销售合同（多个的话-分号分割）
    @NameInMap("sell_contract")
    @Validation(required = true)
    public String sellContract;

    // 寄售合同（多个的话-分号分割）
    @NameInMap("consignment_contract")
    public String consignmentContract;

    // 融资方营业执照
    @NameInMap("buss_license")
    public String bussLicense;

    // 法人身份证（正）
    @NameInMap("legal_person_front")
    public String legalPersonFront;

    // 法人身份证（反）
    @NameInMap("legal_person_reverse")
    public String legalPersonReverse;

    // 银行侧融资利率
    @NameInMap("bank_financial_rate")
    @Validation(required = true)
    public String bankFinancialRate;

    // 银行侧罚息
    @NameInMap("bank_penalty_rate")
    @Validation(required = true)
    public String bankPenaltyRate;

    // 融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    @NameInMap("financial_status")
    @Validation(required = true)
    public Long financialStatus;

    // 撤销申请日期
    @NameInMap("cancel_apply_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String cancelApplyDate;

    // 撤销申请描述
    @NameInMap("cancel_apply_desc")
    public String cancelApplyDesc;

    // 审核人
    @NameInMap("auditor")
    public String auditor;

    // 审核时间
    @NameInMap("audit_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String auditDate;

    // 审核评论
    @NameInMap("audit_comment")
    public String auditComment;

    // 确认放款日期
    @NameInMap("confirm_loan_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String confirmLoanDate;

    // 确认放款评论
    @NameInMap("confirm_loan_comment")
    public String confirmLoanComment;

    // 流程标记：
    // 1->流程通过;2->流程打回到上一级;3->直接拒绝
    @NameInMap("confirm_loan_flag")
    public Long confirmLoanFlag;

    // Date
    @NameInMap("contract_sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String contractSignTime;

    // 待签署评论
    @NameInMap("contract_sign_comment")
    public String contractSignComment;

    // 流程标记：
    // 1->流程通过;2->流程打回到上一级;3->直接拒绝
    @NameInMap("contract_sign_flag")
    public Long contractSignFlag;

    // 上链账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟id
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // Channel 名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    public static ApplyCmportFinanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCmportFinanceRequest self = new ApplyCmportFinanceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCmportFinanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCmportFinanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCmportFinanceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyCmportFinanceRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public ApplyCmportFinanceRequest setMerchantFinancialNo(String merchantFinancialNo) {
        this.merchantFinancialNo = merchantFinancialNo;
        return this;
    }
    public String getMerchantFinancialNo() {
        return this.merchantFinancialNo;
    }

    public ApplyCmportFinanceRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyCmportFinanceRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public ApplyCmportFinanceRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public ApplyCmportFinanceRequest setUniCreditCode(String uniCreditCode) {
        this.uniCreditCode = uniCreditCode;
        return this;
    }
    public String getUniCreditCode() {
        return this.uniCreditCode;
    }

    public ApplyCmportFinanceRequest setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public ApplyCmportFinanceRequest setLegalPersonIdNo(String legalPersonIdNo) {
        this.legalPersonIdNo = legalPersonIdNo;
        return this;
    }
    public String getLegalPersonIdNo() {
        return this.legalPersonIdNo;
    }

    public ApplyCmportFinanceRequest setCompanyContactPerson(String companyContactPerson) {
        this.companyContactPerson = companyContactPerson;
        return this;
    }
    public String getCompanyContactPerson() {
        return this.companyContactPerson;
    }

    public ApplyCmportFinanceRequest setCompanyContactPhone(String companyContactPhone) {
        this.companyContactPhone = companyContactPhone;
        return this;
    }
    public String getCompanyContactPhone() {
        return this.companyContactPhone;
    }

    public ApplyCmportFinanceRequest setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
        return this;
    }
    public String getCompanyAddr() {
        return this.companyAddr;
    }

    public ApplyCmportFinanceRequest setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
        return this;
    }
    public String getBuyerCode() {
        return this.buyerCode;
    }

    public ApplyCmportFinanceRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public ApplyCmportFinanceRequest setBuyerUniCreditCode(String buyerUniCreditCode) {
        this.buyerUniCreditCode = buyerUniCreditCode;
        return this;
    }
    public String getBuyerUniCreditCode() {
        return this.buyerUniCreditCode;
    }

    public ApplyCmportFinanceRequest setBuyerLegalPerson(String buyerLegalPerson) {
        this.buyerLegalPerson = buyerLegalPerson;
        return this;
    }
    public String getBuyerLegalPerson() {
        return this.buyerLegalPerson;
    }

    public ApplyCmportFinanceRequest setBuyerLegalPersonIdNo(String buyerLegalPersonIdNo) {
        this.buyerLegalPersonIdNo = buyerLegalPersonIdNo;
        return this;
    }
    public String getBuyerLegalPersonIdNo() {
        return this.buyerLegalPersonIdNo;
    }

    public ApplyCmportFinanceRequest setBuyerContactPerson(String buyerContactPerson) {
        this.buyerContactPerson = buyerContactPerson;
        return this;
    }
    public String getBuyerContactPerson() {
        return this.buyerContactPerson;
    }

    public ApplyCmportFinanceRequest setBuyerContactPhone(String buyerContactPhone) {
        this.buyerContactPhone = buyerContactPhone;
        return this;
    }
    public String getBuyerContactPhone() {
        return this.buyerContactPhone;
    }

    public ApplyCmportFinanceRequest setFinancingTarget(String financingTarget) {
        this.financingTarget = financingTarget;
        return this;
    }
    public String getFinancingTarget() {
        return this.financingTarget;
    }

    public ApplyCmportFinanceRequest setFinancialAmount(Long financialAmount) {
        this.financialAmount = financialAmount;
        return this;
    }
    public Long getFinancialAmount() {
        return this.financialAmount;
    }

    public ApplyCmportFinanceRequest setFinancialPeriod(Long financialPeriod) {
        this.financialPeriod = financialPeriod;
        return this;
    }
    public Long getFinancialPeriod() {
        return this.financialPeriod;
    }

    public ApplyCmportFinanceRequest setFinancialRateList(java.util.List<FinancialRateInfo> financialRateList) {
        this.financialRateList = financialRateList;
        return this;
    }
    public java.util.List<FinancialRateInfo> getFinancialRateList() {
        return this.financialRateList;
    }

    public ApplyCmportFinanceRequest setPenaltyRateList(java.util.List<PenaltyRateInfo> penaltyRateList) {
        this.penaltyRateList = penaltyRateList;
        return this;
    }
    public java.util.List<PenaltyRateInfo> getPenaltyRateList() {
        return this.penaltyRateList;
    }

    public ApplyCmportFinanceRequest setOpeFeeType(Long opeFeeType) {
        this.opeFeeType = opeFeeType;
        return this;
    }
    public Long getOpeFeeType() {
        return this.opeFeeType;
    }

    public ApplyCmportFinanceRequest setOpeUnitPriceList(java.util.List<OpeUnitPriceInfo> opeUnitPriceList) {
        this.opeUnitPriceList = opeUnitPriceList;
        return this;
    }
    public java.util.List<OpeUnitPriceInfo> getOpeUnitPriceList() {
        return this.opeUnitPriceList;
    }

    public ApplyCmportFinanceRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public ApplyCmportFinanceRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public ApplyCmportFinanceRequest setCargoUnitPrice(Long cargoUnitPrice) {
        this.cargoUnitPrice = cargoUnitPrice;
        return this;
    }
    public Long getCargoUnitPrice() {
        return this.cargoUnitPrice;
    }

    public ApplyCmportFinanceRequest setCargoUnitPriceType(String cargoUnitPriceType) {
        this.cargoUnitPriceType = cargoUnitPriceType;
        return this;
    }
    public String getCargoUnitPriceType() {
        return this.cargoUnitPriceType;
    }

    public ApplyCmportFinanceRequest setCargoTotalPrice(Long cargoTotalPrice) {
        this.cargoTotalPrice = cargoTotalPrice;
        return this;
    }
    public Long getCargoTotalPrice() {
        return this.cargoTotalPrice;
    }

    public ApplyCmportFinanceRequest setApplyDate(String applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public String getApplyDate() {
        return this.applyDate;
    }

    public ApplyCmportFinanceRequest setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }
    public String getProductNo() {
        return this.productNo;
    }

    public ApplyCmportFinanceRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ApplyCmportFinanceRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

    public ApplyCmportFinanceRequest setAuthenticRightCode(String authenticRightCode) {
        this.authenticRightCode = authenticRightCode;
        return this;
    }
    public String getAuthenticRightCode() {
        return this.authenticRightCode;
    }

    public ApplyCmportFinanceRequest setAuthenticRightName(String authenticRightName) {
        this.authenticRightName = authenticRightName;
        return this;
    }
    public String getAuthenticRightName() {
        return this.authenticRightName;
    }

    public ApplyCmportFinanceRequest setAuthenticRightStatus(Long authenticRightStatus) {
        this.authenticRightStatus = authenticRightStatus;
        return this;
    }
    public Long getAuthenticRightStatus() {
        return this.authenticRightStatus;
    }

    public ApplyCmportFinanceRequest setAuthenticRightTime(String authenticRightTime) {
        this.authenticRightTime = authenticRightTime;
        return this;
    }
    public String getAuthenticRightTime() {
        return this.authenticRightTime;
    }

    public ApplyCmportFinanceRequest setStorageServiceProvider(String storageServiceProvider) {
        this.storageServiceProvider = storageServiceProvider;
        return this;
    }
    public String getStorageServiceProvider() {
        return this.storageServiceProvider;
    }

    public ApplyCmportFinanceRequest setWarehouseAddr(String warehouseAddr) {
        this.warehouseAddr = warehouseAddr;
        return this;
    }
    public String getWarehouseAddr() {
        return this.warehouseAddr;
    }

    public ApplyCmportFinanceRequest setStorageContactPhone(String storageContactPhone) {
        this.storageContactPhone = storageContactPhone;
        return this;
    }
    public String getStorageContactPhone() {
        return this.storageContactPhone;
    }

    public ApplyCmportFinanceRequest setBankInstiCode(String bankInstiCode) {
        this.bankInstiCode = bankInstiCode;
        return this;
    }
    public String getBankInstiCode() {
        return this.bankInstiCode;
    }

    public ApplyCmportFinanceRequest setBankInstiName(String bankInstiName) {
        this.bankInstiName = bankInstiName;
        return this;
    }
    public String getBankInstiName() {
        return this.bankInstiName;
    }

    public ApplyCmportFinanceRequest setIsPaySecurityDeposit(Long isPaySecurityDeposit) {
        this.isPaySecurityDeposit = isPaySecurityDeposit;
        return this;
    }
    public Long getIsPaySecurityDeposit() {
        return this.isPaySecurityDeposit;
    }

    public ApplyCmportFinanceRequest setSecurityDepositAmount(Long securityDepositAmount) {
        this.securityDepositAmount = securityDepositAmount;
        return this;
    }
    public Long getSecurityDepositAmount() {
        return this.securityDepositAmount;
    }

    public ApplyCmportFinanceRequest setSecurityDepositRate(String securityDepositRate) {
        this.securityDepositRate = securityDepositRate;
        return this;
    }
    public String getSecurityDepositRate() {
        return this.securityDepositRate;
    }

    public ApplyCmportFinanceRequest setFinancingLimitAgreeNo(String financingLimitAgreeNo) {
        this.financingLimitAgreeNo = financingLimitAgreeNo;
        return this;
    }
    public String getFinancingLimitAgreeNo() {
        return this.financingLimitAgreeNo;
    }

    public ApplyCmportFinanceRequest setElecCertInsti(String elecCertInsti) {
        this.elecCertInsti = elecCertInsti;
        return this;
    }
    public String getElecCertInsti() {
        return this.elecCertInsti;
    }

    public ApplyCmportFinanceRequest setSignDate(String signDate) {
        this.signDate = signDate;
        return this;
    }
    public String getSignDate() {
        return this.signDate;
    }

    public ApplyCmportFinanceRequest setFactoringAgreementNo(String factoringAgreementNo) {
        this.factoringAgreementNo = factoringAgreementNo;
        return this;
    }
    public String getFactoringAgreementNo() {
        return this.factoringAgreementNo;
    }

    public ApplyCmportFinanceRequest setSellerFactoringAccount(String sellerFactoringAccount) {
        this.sellerFactoringAccount = sellerFactoringAccount;
        return this;
    }
    public String getSellerFactoringAccount() {
        return this.sellerFactoringAccount;
    }

    public ApplyCmportFinanceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ApplyCmportFinanceRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ApplyCmportFinanceRequest setFeeCollectType(String feeCollectType) {
        this.feeCollectType = feeCollectType;
        return this;
    }
    public String getFeeCollectType() {
        return this.feeCollectType;
    }

    public ApplyCmportFinanceRequest setInterestCollectType(String interestCollectType) {
        this.interestCollectType = interestCollectType;
        return this;
    }
    public String getInterestCollectType() {
        return this.interestCollectType;
    }

    public ApplyCmportFinanceRequest setElecCertNo(String elecCertNo) {
        this.elecCertNo = elecCertNo;
        return this;
    }
    public String getElecCertNo() {
        return this.elecCertNo;
    }

    public ApplyCmportFinanceRequest setElecCertSetUpDate(String elecCertSetUpDate) {
        this.elecCertSetUpDate = elecCertSetUpDate;
        return this;
    }
    public String getElecCertSetUpDate() {
        return this.elecCertSetUpDate;
    }

    public ApplyCmportFinanceRequest setElecCertExpireDate(String elecCertExpireDate) {
        this.elecCertExpireDate = elecCertExpireDate;
        return this;
    }
    public String getElecCertExpireDate() {
        return this.elecCertExpireDate;
    }

    public ApplyCmportFinanceRequest setElecCertAmount(Long elecCertAmount) {
        this.elecCertAmount = elecCertAmount;
        return this;
    }
    public Long getElecCertAmount() {
        return this.elecCertAmount;
    }

    public ApplyCmportFinanceRequest setTradeContractInvoNo(String tradeContractInvoNo) {
        this.tradeContractInvoNo = tradeContractInvoNo;
        return this;
    }
    public String getTradeContractInvoNo() {
        return this.tradeContractInvoNo;
    }

    public ApplyCmportFinanceRequest setTradeContractInvoAmount(Long tradeContractInvoAmount) {
        this.tradeContractInvoAmount = tradeContractInvoAmount;
        return this;
    }
    public Long getTradeContractInvoAmount() {
        return this.tradeContractInvoAmount;
    }

    public ApplyCmportFinanceRequest setTradeContractName(String tradeContractName) {
        this.tradeContractName = tradeContractName;
        return this;
    }
    public String getTradeContractName() {
        return this.tradeContractName;
    }

    public ApplyCmportFinanceRequest setTradeContractNo(String tradeContractNo) {
        this.tradeContractNo = tradeContractNo;
        return this;
    }
    public String getTradeContractNo() {
        return this.tradeContractNo;
    }

    public ApplyCmportFinanceRequest setTradeContractBuyerName(String tradeContractBuyerName) {
        this.tradeContractBuyerName = tradeContractBuyerName;
        return this;
    }
    public String getTradeContractBuyerName() {
        return this.tradeContractBuyerName;
    }

    public ApplyCmportFinanceRequest setPoundProofs(String poundProofs) {
        this.poundProofs = poundProofs;
        return this;
    }
    public String getPoundProofs() {
        return this.poundProofs;
    }

    public ApplyCmportFinanceRequest setStorageProofs(String storageProofs) {
        this.storageProofs = storageProofs;
        return this;
    }
    public String getStorageProofs() {
        return this.storageProofs;
    }

    public ApplyCmportFinanceRequest setLoanContract(String loanContract) {
        this.loanContract = loanContract;
        return this;
    }
    public String getLoanContract() {
        return this.loanContract;
    }

    public ApplyCmportFinanceRequest setPurchaseContract(String purchaseContract) {
        this.purchaseContract = purchaseContract;
        return this;
    }
    public String getPurchaseContract() {
        return this.purchaseContract;
    }

    public ApplyCmportFinanceRequest setSellContract(String sellContract) {
        this.sellContract = sellContract;
        return this;
    }
    public String getSellContract() {
        return this.sellContract;
    }

    public ApplyCmportFinanceRequest setConsignmentContract(String consignmentContract) {
        this.consignmentContract = consignmentContract;
        return this;
    }
    public String getConsignmentContract() {
        return this.consignmentContract;
    }

    public ApplyCmportFinanceRequest setBussLicense(String bussLicense) {
        this.bussLicense = bussLicense;
        return this;
    }
    public String getBussLicense() {
        return this.bussLicense;
    }

    public ApplyCmportFinanceRequest setLegalPersonFront(String legalPersonFront) {
        this.legalPersonFront = legalPersonFront;
        return this;
    }
    public String getLegalPersonFront() {
        return this.legalPersonFront;
    }

    public ApplyCmportFinanceRequest setLegalPersonReverse(String legalPersonReverse) {
        this.legalPersonReverse = legalPersonReverse;
        return this;
    }
    public String getLegalPersonReverse() {
        return this.legalPersonReverse;
    }

    public ApplyCmportFinanceRequest setBankFinancialRate(String bankFinancialRate) {
        this.bankFinancialRate = bankFinancialRate;
        return this;
    }
    public String getBankFinancialRate() {
        return this.bankFinancialRate;
    }

    public ApplyCmportFinanceRequest setBankPenaltyRate(String bankPenaltyRate) {
        this.bankPenaltyRate = bankPenaltyRate;
        return this;
    }
    public String getBankPenaltyRate() {
        return this.bankPenaltyRate;
    }

    public ApplyCmportFinanceRequest setFinancialStatus(Long financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }
    public Long getFinancialStatus() {
        return this.financialStatus;
    }

    public ApplyCmportFinanceRequest setCancelApplyDate(String cancelApplyDate) {
        this.cancelApplyDate = cancelApplyDate;
        return this;
    }
    public String getCancelApplyDate() {
        return this.cancelApplyDate;
    }

    public ApplyCmportFinanceRequest setCancelApplyDesc(String cancelApplyDesc) {
        this.cancelApplyDesc = cancelApplyDesc;
        return this;
    }
    public String getCancelApplyDesc() {
        return this.cancelApplyDesc;
    }

    public ApplyCmportFinanceRequest setAuditor(String auditor) {
        this.auditor = auditor;
        return this;
    }
    public String getAuditor() {
        return this.auditor;
    }

    public ApplyCmportFinanceRequest setAuditDate(String auditDate) {
        this.auditDate = auditDate;
        return this;
    }
    public String getAuditDate() {
        return this.auditDate;
    }

    public ApplyCmportFinanceRequest setAuditComment(String auditComment) {
        this.auditComment = auditComment;
        return this;
    }
    public String getAuditComment() {
        return this.auditComment;
    }

    public ApplyCmportFinanceRequest setConfirmLoanDate(String confirmLoanDate) {
        this.confirmLoanDate = confirmLoanDate;
        return this;
    }
    public String getConfirmLoanDate() {
        return this.confirmLoanDate;
    }

    public ApplyCmportFinanceRequest setConfirmLoanComment(String confirmLoanComment) {
        this.confirmLoanComment = confirmLoanComment;
        return this;
    }
    public String getConfirmLoanComment() {
        return this.confirmLoanComment;
    }

    public ApplyCmportFinanceRequest setConfirmLoanFlag(Long confirmLoanFlag) {
        this.confirmLoanFlag = confirmLoanFlag;
        return this;
    }
    public Long getConfirmLoanFlag() {
        return this.confirmLoanFlag;
    }

    public ApplyCmportFinanceRequest setContractSignTime(String contractSignTime) {
        this.contractSignTime = contractSignTime;
        return this;
    }
    public String getContractSignTime() {
        return this.contractSignTime;
    }

    public ApplyCmportFinanceRequest setContractSignComment(String contractSignComment) {
        this.contractSignComment = contractSignComment;
        return this;
    }
    public String getContractSignComment() {
        return this.contractSignComment;
    }

    public ApplyCmportFinanceRequest setContractSignFlag(Long contractSignFlag) {
        this.contractSignFlag = contractSignFlag;
        return this;
    }
    public Long getContractSignFlag() {
        return this.contractSignFlag;
    }

    public ApplyCmportFinanceRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public ApplyCmportFinanceRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public ApplyCmportFinanceRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
