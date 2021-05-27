// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class ApplyCmportFinanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 来源方
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 融资编号（粮达生成）
        [NameInMap("financial_no")]
        [Validation(Required=true)]
        public string FinancialNo { get; set; }

        // 融资编号（粮达生成）
        [NameInMap("merchant_financial_no")]
        [Validation(Required=true)]
        public string MerchantFinancialNo { get; set; }

        // 交易编号（粮达生成）
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 融资企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 融资企业编码
        [NameInMap("company_code")]
        [Validation(Required=true)]
        public string CompanyCode { get; set; }

        // 统一信用代码
        [NameInMap("uni_credit_code")]
        [Validation(Required=true)]
        public string UniCreditCode { get; set; }

        // 法人名称
        [NameInMap("legal_person")]
        [Validation(Required=true)]
        public string LegalPerson { get; set; }

        // 法人身份号码
        [NameInMap("legal_person_id_no")]
        [Validation(Required=true)]
        public string LegalPersonIdNo { get; set; }

        // 融资企业联系人
        [NameInMap("company_contact_person")]
        [Validation(Required=true)]
        public string CompanyContactPerson { get; set; }

        // 融资企业联系号码
        [NameInMap("company_contact_phone")]
        [Validation(Required=true)]
        public string CompanyContactPhone { get; set; }

        // 企业办公地址
        [NameInMap("company_addr")]
        [Validation(Required=true)]
        public string CompanyAddr { get; set; }

        // 对手编号
        [NameInMap("buyer_code")]
        [Validation(Required=true)]
        public string BuyerCode { get; set; }

        // 对手企业名称
        [NameInMap("buyer_name")]
        [Validation(Required=true)]
        public string BuyerName { get; set; }

        // 对手统一信用代码
        [NameInMap("buyer_uni_credit_code")]
        [Validation(Required=true)]
        public string BuyerUniCreditCode { get; set; }

        // 对手法人
        [NameInMap("buyer_legal_person")]
        [Validation(Required=false)]
        public string BuyerLegalPerson { get; set; }

        // 对手法人身份证号码
        [NameInMap("buyer_legal_person_id_no")]
        [Validation(Required=false)]
        public string BuyerLegalPersonIdNo { get; set; }

        // 对手联系人
        [NameInMap("buyer_contact_person")]
        [Validation(Required=false)]
        public string BuyerContactPerson { get; set; }

        // 对手联系人手机
        [NameInMap("buyer_contact_phone")]
        [Validation(Required=false)]
        public string BuyerContactPhone { get; set; }

        // 融资标的（采购合同关联的货权编号: 多个编号，隔开）
        [NameInMap("financing_target")]
        [Validation(Required=true)]
        public string FinancingTarget { get; set; }

        // 融资金额（分）
        [NameInMap("financial_amount")]
        [Validation(Required=true)]
        public long? FinancialAmount { get; set; }

        // 融资周期（天）
        [NameInMap("financial_period")]
        [Validation(Required=true)]
        public long? FinancialPeriod { get; set; }

        // 融资利率列表
        [NameInMap("financial_rate_list")]
        [Validation(Required=true)]
        public List<FinancialRateInfo> FinancialRateList { get; set; }

        // 罚息利率列表
        [NameInMap("penalty_rate_list")]
        [Validation(Required=true)]
        public List<PenaltyRateInfo> PenaltyRateList { get; set; }

        // 操作费类型 1->标准收费; 2->阶梯收费
        [NameInMap("ope_fee_type")]
        [Validation(Required=true)]
        public long? OpeFeeType { get; set; }

        // 操作费单价列表
        [NameInMap("ope_unit_price_list")]
        [Validation(Required=true)]
        public List<OpeUnitPriceInfo> OpeUnitPriceList { get; set; }

        // 货物品种
        [NameInMap("cargo_type")]
        [Validation(Required=true)]
        public string CargoType { get; set; }

        // 货物吨数 (单位 t)
        [NameInMap("cargo_weight")]
        [Validation(Required=true)]
        public string CargoWeight { get; set; }

        // 货物单价（分）
        [NameInMap("cargo_unit_price")]
        [Validation(Required=true)]
        public long? CargoUnitPrice { get; set; }

        // 货物单价类型
        [NameInMap("cargo_unit_price_type")]
        [Validation(Required=true)]
        public string CargoUnitPriceType { get; set; }

        // 货物总价
        [NameInMap("cargo_total_price")]
        [Validation(Required=true)]
        public long? CargoTotalPrice { get; set; }

        // 融资申请日期
        [NameInMap("apply_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ApplyDate { get; set; }

        // 产品编号
        [NameInMap("product_no")]
        [Validation(Required=true)]
        public string ProductNo { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品类别：1->买方保理;2->卖方保理;3->仓单融资
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public long? ProductType { get; set; }

        // 确权方编码
        [NameInMap("authentic_right_code")]
        [Validation(Required=true)]
        public string AuthenticRightCode { get; set; }

        // 确权方名称
        [NameInMap("authentic_right_name")]
        [Validation(Required=true)]
        public string AuthenticRightName { get; set; }

        // 确权状态 1->已确权; 2->未确权。粮达网默认是 1
        [NameInMap("authentic_right_status")]
        [Validation(Required=true)]
        public long? AuthenticRightStatus { get; set; }

        // 确权时间
        [NameInMap("authentic_right_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AuthenticRightTime { get; set; }

        // 仓储服务商/物流服务商
        [NameInMap("storage_service_provider")]
        [Validation(Required=true)]
        public string StorageServiceProvider { get; set; }

        // 仓储地址/物流地址
        [NameInMap("warehouse_addr")]
        [Validation(Required=true)]
        public string WarehouseAddr { get; set; }

        // 仓储联系方式/物流联系方式
        [NameInMap("storage_contact_phone")]
        [Validation(Required=true)]
        public string StorageContactPhone { get; set; }

        // 金融机构编码
        [NameInMap("bank_insti_code")]
        [Validation(Required=true)]
        public string BankInstiCode { get; set; }

        // 金融机构名称
        [NameInMap("bank_insti_name")]
        [Validation(Required=true)]
        public string BankInstiName { get; set; }

        // 是否缴纳保证金 1->缴纳;2->不缴纳
        [NameInMap("is_pay_security_deposit")]
        [Validation(Required=true)]
        public long? IsPaySecurityDeposit { get; set; }

        // 保证金缴纳金额
        [NameInMap("security_deposit_amount")]
        [Validation(Required=true)]
        public long? SecurityDepositAmount { get; set; }

        // 保证金缴纳比例
        [NameInMap("security_deposit_rate")]
        [Validation(Required=true)]
        public string SecurityDepositRate { get; set; }

        // 融资额度协议编号
        [NameInMap("financing_limit_agree_no")]
        [Validation(Required=true)]
        public string FinancingLimitAgreeNo { get; set; }

        // 电子章认证机构
        [NameInMap("elec_cert_insti")]
        [Validation(Required=true)]
        public string ElecCertInsti { get; set; }

        // 签署日期
        [NameInMap("sign_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SignDate { get; set; }

        // 保理协议编号
        [NameInMap("factoring_agreement_no")]
        [Validation(Required=true)]
        public string FactoringAgreementNo { get; set; }

        // 卖方保理专户（回款账户）
        [NameInMap("seller_factoring_account")]
        [Validation(Required=true)]
        public string SellerFactoringAccount { get; set; }

        // 服务类型: 1->应收账款保理
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 业务类型: 1-> 买断循环后收息
        [NameInMap("business_type")]
        [Validation(Required=true)]
        public string BusinessType { get; set; }

        // 费用收取方式: 1-> 融资时收取
        [NameInMap("fee_collect_type")]
        [Validation(Required=true)]
        public string FeeCollectType { get; set; }

        // 利息收取方式: 1-> 预扣
        [NameInMap("interest_collect_type")]
        [Validation(Required=true)]
        public string InterestCollectType { get; set; }

        // 电子凭证编号
        [NameInMap("elec_cert_no")]
        [Validation(Required=true)]
        public string ElecCertNo { get; set; }

        // 电子凭证开立日
        [NameInMap("elec_cert_set_up_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ElecCertSetUpDate { get; set; }

        // 电子凭证付款到期日
        [NameInMap("elec_cert_expire_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ElecCertExpireDate { get; set; }

        // 转让电子凭证金额
        [NameInMap("elec_cert_amount")]
        [Validation(Required=true)]
        public long? ElecCertAmount { get; set; }

        // 交易合同发票编号
        [NameInMap("trade_contract_invo_no")]
        [Validation(Required=true)]
        public string TradeContractInvoNo { get; set; }

        // 交易合同发票金额
        [NameInMap("trade_contract_invo_amount")]
        [Validation(Required=true)]
        public long? TradeContractInvoAmount { get; set; }

        // 交易合同名称
        [NameInMap("trade_contract_name")]
        [Validation(Required=true)]
        public string TradeContractName { get; set; }

        // 交易合同编号
        [NameInMap("trade_contract_no")]
        [Validation(Required=true)]
        public string TradeContractNo { get; set; }

        // 交易合同买方名称
        [NameInMap("trade_contract_buyer_name")]
        [Validation(Required=true)]
        public string TradeContractBuyerName { get; set; }

        // 磅单凭证（多个的话-分号分割）
        [NameInMap("pound_proofs")]
        [Validation(Required=false)]
        public string PoundProofs { get; set; }

        // 入库凭证（多个的话-分号分割）
        [NameInMap("storage_proofs")]
        [Validation(Required=true)]
        public string StorageProofs { get; set; }

        // 借款合同（多个的话-分号分割）
        [NameInMap("loan_contract")]
        [Validation(Required=true)]
        public string LoanContract { get; set; }

        // 采购合同（多个的话-分号分割）
        [NameInMap("purchase_contract")]
        [Validation(Required=true)]
        public string PurchaseContract { get; set; }

        // 销售合同（多个的话-分号分割）
        [NameInMap("sell_contract")]
        [Validation(Required=true)]
        public string SellContract { get; set; }

        // 寄售合同（多个的话-分号分割）
        [NameInMap("consignment_contract")]
        [Validation(Required=false)]
        public string ConsignmentContract { get; set; }

        // 融资方营业执照
        [NameInMap("buss_license")]
        [Validation(Required=false)]
        public string BussLicense { get; set; }

        // 法人身份证（正）
        [NameInMap("legal_person_front")]
        [Validation(Required=false)]
        public string LegalPersonFront { get; set; }

        // 法人身份证（反）
        [NameInMap("legal_person_reverse")]
        [Validation(Required=false)]
        public string LegalPersonReverse { get; set; }

        // 银行侧融资利率
        [NameInMap("bank_financial_rate")]
        [Validation(Required=true)]
        public string BankFinancialRate { get; set; }

        // 银行侧罚息
        [NameInMap("bank_penalty_rate")]
        [Validation(Required=true)]
        public string BankPenaltyRate { get; set; }

        // 融资状态:
        // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        [NameInMap("financial_status")]
        [Validation(Required=true)]
        public long? FinancialStatus { get; set; }

        // 撤销申请日期
        [NameInMap("cancel_apply_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CancelApplyDate { get; set; }

        // 撤销申请描述
        [NameInMap("cancel_apply_desc")]
        [Validation(Required=false)]
        public string CancelApplyDesc { get; set; }

        // 审核人
        [NameInMap("auditor")]
        [Validation(Required=false)]
        public string Auditor { get; set; }

        // 审核时间
        [NameInMap("audit_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AuditDate { get; set; }

        // 审核评论
        [NameInMap("audit_comment")]
        [Validation(Required=false)]
        public string AuditComment { get; set; }

        // 确认放款日期
        [NameInMap("confirm_loan_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ConfirmLoanDate { get; set; }

        // 确认放款评论
        [NameInMap("confirm_loan_comment")]
        [Validation(Required=false)]
        public string ConfirmLoanComment { get; set; }

        // 流程标记：
        // 1->流程通过;2->流程打回到上一级;3->直接拒绝
        [NameInMap("confirm_loan_flag")]
        [Validation(Required=false)]
        public long? ConfirmLoanFlag { get; set; }

        // Date
        [NameInMap("contract_sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ContractSignTime { get; set; }

        // 待签署评论
        [NameInMap("contract_sign_comment")]
        [Validation(Required=false)]
        public string ContractSignComment { get; set; }

        // 流程标记：
        // 1->流程通过;2->流程打回到上一级;3->直接拒绝
        [NameInMap("contract_sign_flag")]
        [Validation(Required=false)]
        public long? ContractSignFlag { get; set; }

        // 上链账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟id
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // Channel 名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

    }

}
