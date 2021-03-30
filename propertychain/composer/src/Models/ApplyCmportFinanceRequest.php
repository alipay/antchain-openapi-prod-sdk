<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyCmportFinanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 来源方
    /**
     * @var string
     */
    public $source;

    // 融资编号（粮达生成）
    /**
     * @var string
     */
    public $financialNo;

    // 融资编号（粮达生成）
    /**
     * @var string
     */
    public $merchantFinancialNo;

    // 交易编号（粮达生成）
    /**
     * @var string
     */
    public $tradeNo;

    // 融资企业名称
    /**
     * @var string
     */
    public $companyName;

    // 融资企业编码
    /**
     * @var string
     */
    public $companyCode;

    // 统一信用代码
    /**
     * @var string
     */
    public $uniCreditCode;

    // 法人名称
    /**
     * @var string
     */
    public $legalPerson;

    // 法人身份号码
    /**
     * @var string
     */
    public $legalPersonIdNo;

    // 融资企业联系人
    /**
     * @var string
     */
    public $companyContactPerson;

    // 融资企业联系号码
    /**
     * @var string
     */
    public $companyContactPhone;

    // 企业办公地址
    /**
     * @var string
     */
    public $companyAddr;

    // 对手编号
    /**
     * @var string
     */
    public $buyerCode;

    // 对手企业名称
    /**
     * @var string
     */
    public $buyerName;

    // 对手统一信用代码
    /**
     * @var string
     */
    public $buyerUniCreditCode;

    // 对手法人
    /**
     * @var string
     */
    public $buyerLegalPerson;

    // 对手法人身份证号码
    /**
     * @var string
     */
    public $buyerLegalPersonIdNo;

    // 对手联系人
    /**
     * @var string
     */
    public $buyerContactPerson;

    // 对手联系人手机
    /**
     * @var string
     */
    public $buyerContactPhone;

    // 融资标的（采购合同关联的货权编号: 多个编号，隔开）
    /**
     * @var string
     */
    public $financingTarget;

    // 融资金额（分）
    /**
     * @var int
     */
    public $financialAmount;

    // 融资周期（天）
    /**
     * @var int
     */
    public $financialPeriod;

    // 融资利率列表
    /**
     * @var FinancialRateInfo[]
     */
    public $financialRateList;

    // 罚息利率列表
    /**
     * @var PenaltyRateInfo[]
     */
    public $penaltyRateList;

    // 操作费类型 1->标准收费; 2->阶梯收费
    /**
     * @var int
     */
    public $opeFeeType;

    // 操作费单价列表
    /**
     * @var OpeUnitPriceInfo[]
     */
    public $opeUnitPriceList;

    // 货物品种
    /**
     * @var string
     */
    public $cargoType;

    // 货物吨数 (单位 t)
    /**
     * @var string
     */
    public $cargoWeight;

    // 货物单价（分）
    /**
     * @var int
     */
    public $cargoUnitPrice;

    // 货物单价类型
    /**
     * @var string
     */
    public $cargoUnitPriceType;

    // 货物总价
    /**
     * @var int
     */
    public $cargoTotalPrice;

    // 融资申请日期
    /**
     * @var string
     */
    public $applyDate;

    // 产品编号
    /**
     * @var string
     */
    public $productNo;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 产品类别：1->买方保理;2->卖方保理;3->仓单融资
    /**
     * @var int
     */
    public $productType;

    // 确权方编码
    /**
     * @var string
     */
    public $authenticRightCode;

    // 确权方名称
    /**
     * @var string
     */
    public $authenticRightName;

    // 确权状态 1->已确权; 2->未确权。粮达网默认是 1
    /**
     * @var int
     */
    public $authenticRightStatus;

    // 确权时间
    /**
     * @var string
     */
    public $authenticRightTime;

    // 仓储服务商/物流服务商
    /**
     * @var string
     */
    public $storageServiceProvider;

    // 仓储地址/物流地址
    /**
     * @var string
     */
    public $warehouseAddr;

    // 仓储联系方式/物流联系方式
    /**
     * @var string
     */
    public $storageContactPhone;

    // 金融机构编码
    /**
     * @var string
     */
    public $bankInstiCode;

    // 金融机构名称
    /**
     * @var string
     */
    public $bankInstiName;

    // 是否缴纳保证金 1->缴纳;2->不缴纳
    /**
     * @var int
     */
    public $isPaySecurityDeposit;

    // 保证金缴纳金额
    /**
     * @var int
     */
    public $securityDepositAmount;

    // 保证金缴纳比例
    /**
     * @var string
     */
    public $securityDepositRate;

    // 融资额度协议编号
    /**
     * @var string
     */
    public $financingLimitAgreeNo;

    // 电子章认证机构
    /**
     * @var string
     */
    public $elecCertInsti;

    // 签署日期
    /**
     * @var string
     */
    public $signDate;

    // 保理协议编号
    /**
     * @var string
     */
    public $factoringAgreementNo;

    // 卖方保理专户（回款账户）
    /**
     * @var string
     */
    public $sellerFactoringAccount;

    // 服务类型: 1->应收账款保理
    /**
     * @var string
     */
    public $serviceType;

    // 业务类型: 1-> 买断循环后收息
    /**
     * @var string
     */
    public $businessType;

    // 费用收取方式: 1-> 融资时收取
    /**
     * @var string
     */
    public $feeCollectType;

    // 利息收取方式: 1-> 预扣
    /**
     * @var string
     */
    public $interestCollectType;

    // 电子凭证编号
    /**
     * @var string
     */
    public $elecCertNo;

    // 电子凭证开立日
    /**
     * @var string
     */
    public $elecCertSetUpDate;

    // 电子凭证付款到期日
    /**
     * @var string
     */
    public $elecCertExpireDate;

    // 转让电子凭证金额
    /**
     * @var int
     */
    public $elecCertAmount;

    // 交易合同发票编号
    /**
     * @var string
     */
    public $tradeContractInvoNo;

    // 交易合同发票金额
    /**
     * @var int
     */
    public $tradeContractInvoAmount;

    // 交易合同名称
    /**
     * @var string
     */
    public $tradeContractName;

    // 交易合同编号
    /**
     * @var string
     */
    public $tradeContractNo;

    // 交易合同买方名称
    /**
     * @var string
     */
    public $tradeContractBuyerName;

    // 磅单凭证（多个的话-分号分割）
    /**
     * @var string
     */
    public $poundProofs;

    // 入库凭证（多个的话-分号分割）
    /**
     * @var string
     */
    public $storageProofs;

    // 借款合同（多个的话-分号分割）
    /**
     * @var string
     */
    public $loanContract;

    // 采购合同（多个的话-分号分割）
    /**
     * @var string
     */
    public $purchaseContract;

    // 销售合同（多个的话-分号分割）
    /**
     * @var string
     */
    public $sellContract;

    // 寄售合同（多个的话-分号分割）
    /**
     * @var string
     */
    public $consignmentContract;

    // 融资方营业执照
    /**
     * @var string
     */
    public $bussLicense;

    // 法人身份证（正）
    /**
     * @var string
     */
    public $legalPersonFront;

    // 法人身份证（反）
    /**
     * @var string
     */
    public $legalPersonReverse;

    // 银行侧融资利率
    /**
     * @var string
     */
    public $bankFinancialRate;

    // 银行侧罚息
    /**
     * @var string
     */
    public $bankPenaltyRate;

    // 融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    /**
     * @var int
     */
    public $financialStatus;

    // 撤销申请日期
    /**
     * @var string
     */
    public $cancelApplyDate;

    // 撤销申请描述
    /**
     * @var string
     */
    public $cancelApplyDesc;

    // 审核人
    /**
     * @var string
     */
    public $auditor;

    // 审核时间
    /**
     * @var string
     */
    public $auditDate;

    // 审核评论
    /**
     * @var string
     */
    public $auditComment;

    // 确认放款日期
    /**
     * @var string
     */
    public $confirmLoanDate;

    // 确认放款评论
    /**
     * @var string
     */
    public $confirmLoanComment;

    // 流程标记：
    // 1->流程通过;2->流程打回到上一级;3->直接拒绝
    /**
     * @var int
     */
    public $confirmLoanFlag;

    // Date
    /**
     * @var string
     */
    public $contractSignTime;

    // 待签署评论
    /**
     * @var string
     */
    public $contractSignComment;

    // 流程标记：
    // 1->流程通过;2->流程打回到上一级;3->直接拒绝
    /**
     * @var int
     */
    public $contractSignFlag;

    // 上链账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // Channel 名称
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'source'                  => 'source',
        'financialNo'             => 'financial_no',
        'merchantFinancialNo'     => 'merchant_financial_no',
        'tradeNo'                 => 'trade_no',
        'companyName'             => 'company_name',
        'companyCode'             => 'company_code',
        'uniCreditCode'           => 'uni_credit_code',
        'legalPerson'             => 'legal_person',
        'legalPersonIdNo'         => 'legal_person_id_no',
        'companyContactPerson'    => 'company_contact_person',
        'companyContactPhone'     => 'company_contact_phone',
        'companyAddr'             => 'company_addr',
        'buyerCode'               => 'buyer_code',
        'buyerName'               => 'buyer_name',
        'buyerUniCreditCode'      => 'buyer_uni_credit_code',
        'buyerLegalPerson'        => 'buyer_legal_person',
        'buyerLegalPersonIdNo'    => 'buyer_legal_person_id_no',
        'buyerContactPerson'      => 'buyer_contact_person',
        'buyerContactPhone'       => 'buyer_contact_phone',
        'financingTarget'         => 'financing_target',
        'financialAmount'         => 'financial_amount',
        'financialPeriod'         => 'financial_period',
        'financialRateList'       => 'financial_rate_list',
        'penaltyRateList'         => 'penalty_rate_list',
        'opeFeeType'              => 'ope_fee_type',
        'opeUnitPriceList'        => 'ope_unit_price_list',
        'cargoType'               => 'cargo_type',
        'cargoWeight'             => 'cargo_weight',
        'cargoUnitPrice'          => 'cargo_unit_price',
        'cargoUnitPriceType'      => 'cargo_unit_price_type',
        'cargoTotalPrice'         => 'cargo_total_price',
        'applyDate'               => 'apply_date',
        'productNo'               => 'product_no',
        'productName'             => 'product_name',
        'productType'             => 'product_type',
        'authenticRightCode'      => 'authentic_right_code',
        'authenticRightName'      => 'authentic_right_name',
        'authenticRightStatus'    => 'authentic_right_status',
        'authenticRightTime'      => 'authentic_right_time',
        'storageServiceProvider'  => 'storage_service_provider',
        'warehouseAddr'           => 'warehouse_addr',
        'storageContactPhone'     => 'storage_contact_phone',
        'bankInstiCode'           => 'bank_insti_code',
        'bankInstiName'           => 'bank_insti_name',
        'isPaySecurityDeposit'    => 'is_pay_security_deposit',
        'securityDepositAmount'   => 'security_deposit_amount',
        'securityDepositRate'     => 'security_deposit_rate',
        'financingLimitAgreeNo'   => 'financing_limit_agree_no',
        'elecCertInsti'           => 'elec_cert_insti',
        'signDate'                => 'sign_date',
        'factoringAgreementNo'    => 'factoring_agreement_no',
        'sellerFactoringAccount'  => 'seller_factoring_account',
        'serviceType'             => 'service_type',
        'businessType'            => 'business_type',
        'feeCollectType'          => 'fee_collect_type',
        'interestCollectType'     => 'interest_collect_type',
        'elecCertNo'              => 'elec_cert_no',
        'elecCertSetUpDate'       => 'elec_cert_set_up_date',
        'elecCertExpireDate'      => 'elec_cert_expire_date',
        'elecCertAmount'          => 'elec_cert_amount',
        'tradeContractInvoNo'     => 'trade_contract_invo_no',
        'tradeContractInvoAmount' => 'trade_contract_invo_amount',
        'tradeContractName'       => 'trade_contract_name',
        'tradeContractNo'         => 'trade_contract_no',
        'tradeContractBuyerName'  => 'trade_contract_buyer_name',
        'poundProofs'             => 'pound_proofs',
        'storageProofs'           => 'storage_proofs',
        'loanContract'            => 'loan_contract',
        'purchaseContract'        => 'purchase_contract',
        'sellContract'            => 'sell_contract',
        'consignmentContract'     => 'consignment_contract',
        'bussLicense'             => 'buss_license',
        'legalPersonFront'        => 'legal_person_front',
        'legalPersonReverse'      => 'legal_person_reverse',
        'bankFinancialRate'       => 'bank_financial_rate',
        'bankPenaltyRate'         => 'bank_penalty_rate',
        'financialStatus'         => 'financial_status',
        'cancelApplyDate'         => 'cancel_apply_date',
        'cancelApplyDesc'         => 'cancel_apply_desc',
        'auditor'                 => 'auditor',
        'auditDate'               => 'audit_date',
        'auditComment'            => 'audit_comment',
        'confirmLoanDate'         => 'confirm_loan_date',
        'confirmLoanComment'      => 'confirm_loan_comment',
        'confirmLoanFlag'         => 'confirm_loan_flag',
        'contractSignTime'        => 'contract_sign_time',
        'contractSignComment'     => 'contract_sign_comment',
        'contractSignFlag'        => 'contract_sign_flag',
        'userDid'                 => 'user_did',
        'unionId'                 => 'union_id',
        'channelName'             => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('merchantFinancialNo', $this->merchantFinancialNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('companyCode', $this->companyCode, true);
        Model::validateRequired('uniCreditCode', $this->uniCreditCode, true);
        Model::validateRequired('legalPerson', $this->legalPerson, true);
        Model::validateRequired('legalPersonIdNo', $this->legalPersonIdNo, true);
        Model::validateRequired('companyContactPerson', $this->companyContactPerson, true);
        Model::validateRequired('companyContactPhone', $this->companyContactPhone, true);
        Model::validateRequired('companyAddr', $this->companyAddr, true);
        Model::validateRequired('buyerCode', $this->buyerCode, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('buyerUniCreditCode', $this->buyerUniCreditCode, true);
        Model::validateRequired('financingTarget', $this->financingTarget, true);
        Model::validateRequired('financialAmount', $this->financialAmount, true);
        Model::validateRequired('financialPeriod', $this->financialPeriod, true);
        Model::validateRequired('financialRateList', $this->financialRateList, true);
        Model::validateRequired('penaltyRateList', $this->penaltyRateList, true);
        Model::validateRequired('opeFeeType', $this->opeFeeType, true);
        Model::validateRequired('opeUnitPriceList', $this->opeUnitPriceList, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('cargoWeight', $this->cargoWeight, true);
        Model::validateRequired('cargoUnitPrice', $this->cargoUnitPrice, true);
        Model::validateRequired('cargoUnitPriceType', $this->cargoUnitPriceType, true);
        Model::validateRequired('cargoTotalPrice', $this->cargoTotalPrice, true);
        Model::validateRequired('productNo', $this->productNo, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('authenticRightCode', $this->authenticRightCode, true);
        Model::validateRequired('authenticRightName', $this->authenticRightName, true);
        Model::validateRequired('authenticRightStatus', $this->authenticRightStatus, true);
        Model::validateRequired('authenticRightTime', $this->authenticRightTime, true);
        Model::validateRequired('storageServiceProvider', $this->storageServiceProvider, true);
        Model::validateRequired('warehouseAddr', $this->warehouseAddr, true);
        Model::validateRequired('storageContactPhone', $this->storageContactPhone, true);
        Model::validateRequired('bankInstiCode', $this->bankInstiCode, true);
        Model::validateRequired('bankInstiName', $this->bankInstiName, true);
        Model::validateRequired('isPaySecurityDeposit', $this->isPaySecurityDeposit, true);
        Model::validateRequired('securityDepositAmount', $this->securityDepositAmount, true);
        Model::validateRequired('securityDepositRate', $this->securityDepositRate, true);
        Model::validateRequired('financingLimitAgreeNo', $this->financingLimitAgreeNo, true);
        Model::validateRequired('elecCertInsti', $this->elecCertInsti, true);
        Model::validateRequired('signDate', $this->signDate, true);
        Model::validateRequired('factoringAgreementNo', $this->factoringAgreementNo, true);
        Model::validateRequired('sellerFactoringAccount', $this->sellerFactoringAccount, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
        Model::validateRequired('businessType', $this->businessType, true);
        Model::validateRequired('feeCollectType', $this->feeCollectType, true);
        Model::validateRequired('interestCollectType', $this->interestCollectType, true);
        Model::validateRequired('elecCertNo', $this->elecCertNo, true);
        Model::validateRequired('elecCertSetUpDate', $this->elecCertSetUpDate, true);
        Model::validateRequired('elecCertExpireDate', $this->elecCertExpireDate, true);
        Model::validateRequired('elecCertAmount', $this->elecCertAmount, true);
        Model::validateRequired('tradeContractInvoNo', $this->tradeContractInvoNo, true);
        Model::validateRequired('tradeContractInvoAmount', $this->tradeContractInvoAmount, true);
        Model::validateRequired('tradeContractName', $this->tradeContractName, true);
        Model::validateRequired('tradeContractNo', $this->tradeContractNo, true);
        Model::validateRequired('tradeContractBuyerName', $this->tradeContractBuyerName, true);
        Model::validateRequired('storageProofs', $this->storageProofs, true);
        Model::validateRequired('loanContract', $this->loanContract, true);
        Model::validateRequired('purchaseContract', $this->purchaseContract, true);
        Model::validateRequired('sellContract', $this->sellContract, true);
        Model::validateRequired('bankFinancialRate', $this->bankFinancialRate, true);
        Model::validateRequired('bankPenaltyRate', $this->bankPenaltyRate, true);
        Model::validateRequired('financialStatus', $this->financialStatus, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validatePattern('applyDate', $this->applyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('authenticRightTime', $this->authenticRightTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('signDate', $this->signDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('elecCertSetUpDate', $this->elecCertSetUpDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('elecCertExpireDate', $this->elecCertExpireDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('cancelApplyDate', $this->cancelApplyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('auditDate', $this->auditDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('confirmLoanDate', $this->confirmLoanDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('contractSignTime', $this->contractSignTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->merchantFinancialNo) {
            $res['merchant_financial_no'] = $this->merchantFinancialNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyCode) {
            $res['company_code'] = $this->companyCode;
        }
        if (null !== $this->uniCreditCode) {
            $res['uni_credit_code'] = $this->uniCreditCode;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonIdNo) {
            $res['legal_person_id_no'] = $this->legalPersonIdNo;
        }
        if (null !== $this->companyContactPerson) {
            $res['company_contact_person'] = $this->companyContactPerson;
        }
        if (null !== $this->companyContactPhone) {
            $res['company_contact_phone'] = $this->companyContactPhone;
        }
        if (null !== $this->companyAddr) {
            $res['company_addr'] = $this->companyAddr;
        }
        if (null !== $this->buyerCode) {
            $res['buyer_code'] = $this->buyerCode;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->buyerUniCreditCode) {
            $res['buyer_uni_credit_code'] = $this->buyerUniCreditCode;
        }
        if (null !== $this->buyerLegalPerson) {
            $res['buyer_legal_person'] = $this->buyerLegalPerson;
        }
        if (null !== $this->buyerLegalPersonIdNo) {
            $res['buyer_legal_person_id_no'] = $this->buyerLegalPersonIdNo;
        }
        if (null !== $this->buyerContactPerson) {
            $res['buyer_contact_person'] = $this->buyerContactPerson;
        }
        if (null !== $this->buyerContactPhone) {
            $res['buyer_contact_phone'] = $this->buyerContactPhone;
        }
        if (null !== $this->financingTarget) {
            $res['financing_target'] = $this->financingTarget;
        }
        if (null !== $this->financialAmount) {
            $res['financial_amount'] = $this->financialAmount;
        }
        if (null !== $this->financialPeriod) {
            $res['financial_period'] = $this->financialPeriod;
        }
        if (null !== $this->financialRateList) {
            $res['financial_rate_list'] = [];
            if (null !== $this->financialRateList && \is_array($this->financialRateList)) {
                $n = 0;
                foreach ($this->financialRateList as $item) {
                    $res['financial_rate_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->penaltyRateList) {
            $res['penalty_rate_list'] = [];
            if (null !== $this->penaltyRateList && \is_array($this->penaltyRateList)) {
                $n = 0;
                foreach ($this->penaltyRateList as $item) {
                    $res['penalty_rate_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opeFeeType) {
            $res['ope_fee_type'] = $this->opeFeeType;
        }
        if (null !== $this->opeUnitPriceList) {
            $res['ope_unit_price_list'] = [];
            if (null !== $this->opeUnitPriceList && \is_array($this->opeUnitPriceList)) {
                $n = 0;
                foreach ($this->opeUnitPriceList as $item) {
                    $res['ope_unit_price_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
        }
        if (null !== $this->cargoUnitPrice) {
            $res['cargo_unit_price'] = $this->cargoUnitPrice;
        }
        if (null !== $this->cargoUnitPriceType) {
            $res['cargo_unit_price_type'] = $this->cargoUnitPriceType;
        }
        if (null !== $this->cargoTotalPrice) {
            $res['cargo_total_price'] = $this->cargoTotalPrice;
        }
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->productNo) {
            $res['product_no'] = $this->productNo;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->authenticRightCode) {
            $res['authentic_right_code'] = $this->authenticRightCode;
        }
        if (null !== $this->authenticRightName) {
            $res['authentic_right_name'] = $this->authenticRightName;
        }
        if (null !== $this->authenticRightStatus) {
            $res['authentic_right_status'] = $this->authenticRightStatus;
        }
        if (null !== $this->authenticRightTime) {
            $res['authentic_right_time'] = $this->authenticRightTime;
        }
        if (null !== $this->storageServiceProvider) {
            $res['storage_service_provider'] = $this->storageServiceProvider;
        }
        if (null !== $this->warehouseAddr) {
            $res['warehouse_addr'] = $this->warehouseAddr;
        }
        if (null !== $this->storageContactPhone) {
            $res['storage_contact_phone'] = $this->storageContactPhone;
        }
        if (null !== $this->bankInstiCode) {
            $res['bank_insti_code'] = $this->bankInstiCode;
        }
        if (null !== $this->bankInstiName) {
            $res['bank_insti_name'] = $this->bankInstiName;
        }
        if (null !== $this->isPaySecurityDeposit) {
            $res['is_pay_security_deposit'] = $this->isPaySecurityDeposit;
        }
        if (null !== $this->securityDepositAmount) {
            $res['security_deposit_amount'] = $this->securityDepositAmount;
        }
        if (null !== $this->securityDepositRate) {
            $res['security_deposit_rate'] = $this->securityDepositRate;
        }
        if (null !== $this->financingLimitAgreeNo) {
            $res['financing_limit_agree_no'] = $this->financingLimitAgreeNo;
        }
        if (null !== $this->elecCertInsti) {
            $res['elec_cert_insti'] = $this->elecCertInsti;
        }
        if (null !== $this->signDate) {
            $res['sign_date'] = $this->signDate;
        }
        if (null !== $this->factoringAgreementNo) {
            $res['factoring_agreement_no'] = $this->factoringAgreementNo;
        }
        if (null !== $this->sellerFactoringAccount) {
            $res['seller_factoring_account'] = $this->sellerFactoringAccount;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->feeCollectType) {
            $res['fee_collect_type'] = $this->feeCollectType;
        }
        if (null !== $this->interestCollectType) {
            $res['interest_collect_type'] = $this->interestCollectType;
        }
        if (null !== $this->elecCertNo) {
            $res['elec_cert_no'] = $this->elecCertNo;
        }
        if (null !== $this->elecCertSetUpDate) {
            $res['elec_cert_set_up_date'] = $this->elecCertSetUpDate;
        }
        if (null !== $this->elecCertExpireDate) {
            $res['elec_cert_expire_date'] = $this->elecCertExpireDate;
        }
        if (null !== $this->elecCertAmount) {
            $res['elec_cert_amount'] = $this->elecCertAmount;
        }
        if (null !== $this->tradeContractInvoNo) {
            $res['trade_contract_invo_no'] = $this->tradeContractInvoNo;
        }
        if (null !== $this->tradeContractInvoAmount) {
            $res['trade_contract_invo_amount'] = $this->tradeContractInvoAmount;
        }
        if (null !== $this->tradeContractName) {
            $res['trade_contract_name'] = $this->tradeContractName;
        }
        if (null !== $this->tradeContractNo) {
            $res['trade_contract_no'] = $this->tradeContractNo;
        }
        if (null !== $this->tradeContractBuyerName) {
            $res['trade_contract_buyer_name'] = $this->tradeContractBuyerName;
        }
        if (null !== $this->poundProofs) {
            $res['pound_proofs'] = $this->poundProofs;
        }
        if (null !== $this->storageProofs) {
            $res['storage_proofs'] = $this->storageProofs;
        }
        if (null !== $this->loanContract) {
            $res['loan_contract'] = $this->loanContract;
        }
        if (null !== $this->purchaseContract) {
            $res['purchase_contract'] = $this->purchaseContract;
        }
        if (null !== $this->sellContract) {
            $res['sell_contract'] = $this->sellContract;
        }
        if (null !== $this->consignmentContract) {
            $res['consignment_contract'] = $this->consignmentContract;
        }
        if (null !== $this->bussLicense) {
            $res['buss_license'] = $this->bussLicense;
        }
        if (null !== $this->legalPersonFront) {
            $res['legal_person_front'] = $this->legalPersonFront;
        }
        if (null !== $this->legalPersonReverse) {
            $res['legal_person_reverse'] = $this->legalPersonReverse;
        }
        if (null !== $this->bankFinancialRate) {
            $res['bank_financial_rate'] = $this->bankFinancialRate;
        }
        if (null !== $this->bankPenaltyRate) {
            $res['bank_penalty_rate'] = $this->bankPenaltyRate;
        }
        if (null !== $this->financialStatus) {
            $res['financial_status'] = $this->financialStatus;
        }
        if (null !== $this->cancelApplyDate) {
            $res['cancel_apply_date'] = $this->cancelApplyDate;
        }
        if (null !== $this->cancelApplyDesc) {
            $res['cancel_apply_desc'] = $this->cancelApplyDesc;
        }
        if (null !== $this->auditor) {
            $res['auditor'] = $this->auditor;
        }
        if (null !== $this->auditDate) {
            $res['audit_date'] = $this->auditDate;
        }
        if (null !== $this->auditComment) {
            $res['audit_comment'] = $this->auditComment;
        }
        if (null !== $this->confirmLoanDate) {
            $res['confirm_loan_date'] = $this->confirmLoanDate;
        }
        if (null !== $this->confirmLoanComment) {
            $res['confirm_loan_comment'] = $this->confirmLoanComment;
        }
        if (null !== $this->confirmLoanFlag) {
            $res['confirm_loan_flag'] = $this->confirmLoanFlag;
        }
        if (null !== $this->contractSignTime) {
            $res['contract_sign_time'] = $this->contractSignTime;
        }
        if (null !== $this->contractSignComment) {
            $res['contract_sign_comment'] = $this->contractSignComment;
        }
        if (null !== $this->contractSignFlag) {
            $res['contract_sign_flag'] = $this->contractSignFlag;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCmportFinanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['merchant_financial_no'])) {
            $model->merchantFinancialNo = $map['merchant_financial_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_code'])) {
            $model->companyCode = $map['company_code'];
        }
        if (isset($map['uni_credit_code'])) {
            $model->uniCreditCode = $map['uni_credit_code'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }
        if (isset($map['legal_person_id_no'])) {
            $model->legalPersonIdNo = $map['legal_person_id_no'];
        }
        if (isset($map['company_contact_person'])) {
            $model->companyContactPerson = $map['company_contact_person'];
        }
        if (isset($map['company_contact_phone'])) {
            $model->companyContactPhone = $map['company_contact_phone'];
        }
        if (isset($map['company_addr'])) {
            $model->companyAddr = $map['company_addr'];
        }
        if (isset($map['buyer_code'])) {
            $model->buyerCode = $map['buyer_code'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['buyer_uni_credit_code'])) {
            $model->buyerUniCreditCode = $map['buyer_uni_credit_code'];
        }
        if (isset($map['buyer_legal_person'])) {
            $model->buyerLegalPerson = $map['buyer_legal_person'];
        }
        if (isset($map['buyer_legal_person_id_no'])) {
            $model->buyerLegalPersonIdNo = $map['buyer_legal_person_id_no'];
        }
        if (isset($map['buyer_contact_person'])) {
            $model->buyerContactPerson = $map['buyer_contact_person'];
        }
        if (isset($map['buyer_contact_phone'])) {
            $model->buyerContactPhone = $map['buyer_contact_phone'];
        }
        if (isset($map['financing_target'])) {
            $model->financingTarget = $map['financing_target'];
        }
        if (isset($map['financial_amount'])) {
            $model->financialAmount = $map['financial_amount'];
        }
        if (isset($map['financial_period'])) {
            $model->financialPeriod = $map['financial_period'];
        }
        if (isset($map['financial_rate_list'])) {
            if (!empty($map['financial_rate_list'])) {
                $model->financialRateList = [];
                $n                        = 0;
                foreach ($map['financial_rate_list'] as $item) {
                    $model->financialRateList[$n++] = null !== $item ? FinancialRateInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['penalty_rate_list'])) {
            if (!empty($map['penalty_rate_list'])) {
                $model->penaltyRateList = [];
                $n                      = 0;
                foreach ($map['penalty_rate_list'] as $item) {
                    $model->penaltyRateList[$n++] = null !== $item ? PenaltyRateInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ope_fee_type'])) {
            $model->opeFeeType = $map['ope_fee_type'];
        }
        if (isset($map['ope_unit_price_list'])) {
            if (!empty($map['ope_unit_price_list'])) {
                $model->opeUnitPriceList = [];
                $n                       = 0;
                foreach ($map['ope_unit_price_list'] as $item) {
                    $model->opeUnitPriceList[$n++] = null !== $item ? OpeUnitPriceInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
        }
        if (isset($map['cargo_unit_price'])) {
            $model->cargoUnitPrice = $map['cargo_unit_price'];
        }
        if (isset($map['cargo_unit_price_type'])) {
            $model->cargoUnitPriceType = $map['cargo_unit_price_type'];
        }
        if (isset($map['cargo_total_price'])) {
            $model->cargoTotalPrice = $map['cargo_total_price'];
        }
        if (isset($map['apply_date'])) {
            $model->applyDate = $map['apply_date'];
        }
        if (isset($map['product_no'])) {
            $model->productNo = $map['product_no'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['authentic_right_code'])) {
            $model->authenticRightCode = $map['authentic_right_code'];
        }
        if (isset($map['authentic_right_name'])) {
            $model->authenticRightName = $map['authentic_right_name'];
        }
        if (isset($map['authentic_right_status'])) {
            $model->authenticRightStatus = $map['authentic_right_status'];
        }
        if (isset($map['authentic_right_time'])) {
            $model->authenticRightTime = $map['authentic_right_time'];
        }
        if (isset($map['storage_service_provider'])) {
            $model->storageServiceProvider = $map['storage_service_provider'];
        }
        if (isset($map['warehouse_addr'])) {
            $model->warehouseAddr = $map['warehouse_addr'];
        }
        if (isset($map['storage_contact_phone'])) {
            $model->storageContactPhone = $map['storage_contact_phone'];
        }
        if (isset($map['bank_insti_code'])) {
            $model->bankInstiCode = $map['bank_insti_code'];
        }
        if (isset($map['bank_insti_name'])) {
            $model->bankInstiName = $map['bank_insti_name'];
        }
        if (isset($map['is_pay_security_deposit'])) {
            $model->isPaySecurityDeposit = $map['is_pay_security_deposit'];
        }
        if (isset($map['security_deposit_amount'])) {
            $model->securityDepositAmount = $map['security_deposit_amount'];
        }
        if (isset($map['security_deposit_rate'])) {
            $model->securityDepositRate = $map['security_deposit_rate'];
        }
        if (isset($map['financing_limit_agree_no'])) {
            $model->financingLimitAgreeNo = $map['financing_limit_agree_no'];
        }
        if (isset($map['elec_cert_insti'])) {
            $model->elecCertInsti = $map['elec_cert_insti'];
        }
        if (isset($map['sign_date'])) {
            $model->signDate = $map['sign_date'];
        }
        if (isset($map['factoring_agreement_no'])) {
            $model->factoringAgreementNo = $map['factoring_agreement_no'];
        }
        if (isset($map['seller_factoring_account'])) {
            $model->sellerFactoringAccount = $map['seller_factoring_account'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }
        if (isset($map['fee_collect_type'])) {
            $model->feeCollectType = $map['fee_collect_type'];
        }
        if (isset($map['interest_collect_type'])) {
            $model->interestCollectType = $map['interest_collect_type'];
        }
        if (isset($map['elec_cert_no'])) {
            $model->elecCertNo = $map['elec_cert_no'];
        }
        if (isset($map['elec_cert_set_up_date'])) {
            $model->elecCertSetUpDate = $map['elec_cert_set_up_date'];
        }
        if (isset($map['elec_cert_expire_date'])) {
            $model->elecCertExpireDate = $map['elec_cert_expire_date'];
        }
        if (isset($map['elec_cert_amount'])) {
            $model->elecCertAmount = $map['elec_cert_amount'];
        }
        if (isset($map['trade_contract_invo_no'])) {
            $model->tradeContractInvoNo = $map['trade_contract_invo_no'];
        }
        if (isset($map['trade_contract_invo_amount'])) {
            $model->tradeContractInvoAmount = $map['trade_contract_invo_amount'];
        }
        if (isset($map['trade_contract_name'])) {
            $model->tradeContractName = $map['trade_contract_name'];
        }
        if (isset($map['trade_contract_no'])) {
            $model->tradeContractNo = $map['trade_contract_no'];
        }
        if (isset($map['trade_contract_buyer_name'])) {
            $model->tradeContractBuyerName = $map['trade_contract_buyer_name'];
        }
        if (isset($map['pound_proofs'])) {
            $model->poundProofs = $map['pound_proofs'];
        }
        if (isset($map['storage_proofs'])) {
            $model->storageProofs = $map['storage_proofs'];
        }
        if (isset($map['loan_contract'])) {
            $model->loanContract = $map['loan_contract'];
        }
        if (isset($map['purchase_contract'])) {
            $model->purchaseContract = $map['purchase_contract'];
        }
        if (isset($map['sell_contract'])) {
            $model->sellContract = $map['sell_contract'];
        }
        if (isset($map['consignment_contract'])) {
            $model->consignmentContract = $map['consignment_contract'];
        }
        if (isset($map['buss_license'])) {
            $model->bussLicense = $map['buss_license'];
        }
        if (isset($map['legal_person_front'])) {
            $model->legalPersonFront = $map['legal_person_front'];
        }
        if (isset($map['legal_person_reverse'])) {
            $model->legalPersonReverse = $map['legal_person_reverse'];
        }
        if (isset($map['bank_financial_rate'])) {
            $model->bankFinancialRate = $map['bank_financial_rate'];
        }
        if (isset($map['bank_penalty_rate'])) {
            $model->bankPenaltyRate = $map['bank_penalty_rate'];
        }
        if (isset($map['financial_status'])) {
            $model->financialStatus = $map['financial_status'];
        }
        if (isset($map['cancel_apply_date'])) {
            $model->cancelApplyDate = $map['cancel_apply_date'];
        }
        if (isset($map['cancel_apply_desc'])) {
            $model->cancelApplyDesc = $map['cancel_apply_desc'];
        }
        if (isset($map['auditor'])) {
            $model->auditor = $map['auditor'];
        }
        if (isset($map['audit_date'])) {
            $model->auditDate = $map['audit_date'];
        }
        if (isset($map['audit_comment'])) {
            $model->auditComment = $map['audit_comment'];
        }
        if (isset($map['confirm_loan_date'])) {
            $model->confirmLoanDate = $map['confirm_loan_date'];
        }
        if (isset($map['confirm_loan_comment'])) {
            $model->confirmLoanComment = $map['confirm_loan_comment'];
        }
        if (isset($map['confirm_loan_flag'])) {
            $model->confirmLoanFlag = $map['confirm_loan_flag'];
        }
        if (isset($map['contract_sign_time'])) {
            $model->contractSignTime = $map['contract_sign_time'];
        }
        if (isset($map['contract_sign_comment'])) {
            $model->contractSignComment = $map['contract_sign_comment'];
        }
        if (isset($map['contract_sign_flag'])) {
            $model->contractSignFlag = $map['contract_sign_flag'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
