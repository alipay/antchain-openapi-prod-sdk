<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyPfWaybillfinancingRequest extends Model
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

    // 承运商did
    /**
     * @var string
     */
    public $carrierDid;

    // 融资支用金额；总长度最长15位，保留2位小数，四舍五入
    /**
     * @var string
     */
    public $financingAmount;

    // 支用币种，支持 CNY,USD
    /**
     * @var string
     */
    public $financingCurrency;

    // 融资授信主体公司分布式数字身份
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 贷款期限，值为2~6，单位为月
    /**
     * @var string
     */
    public $loanTerm;

    // 收款方开户行总行联行号
    /**
     * @var string
     */
    public $payeeBankNumber;

    // 收款方开户行名称
    /**
     * @var string
     */
    public $payeeBcb;

    // 收款方开户行银行卡号
    /**
     * @var string
     */
    public $payeeBcbCardNo;

    // 收款方证件号
    //
    //
    /**
     * @var string
     */
    public $payeeIdNumber;

    // 收款方证件类型
    /**
     * @var string
     */
    public $payeeIdType;

    // 收款方名称
    /**
     * @var string
     */
    public $payeeName;

    // 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2
    /**
     * @var string
     */
    public $purpose;

    // 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
    /**
     * @var string
     */
    public $requestNo;

    // 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
    /**
     * @var string
     */
    public $signature;

    // 转账附言
    // 1: 工资、奖金收入
    // 2：稿费、演出费等劳务收入
    // 3：债券、期货、信托等投资的本金和收益
    // 4：个人债券或产权转让收益
    // 该字段建议填写 2
    /**
     * @var string
     */
    public $transferPostscript;

    // 凭证类型，支持 WAYBILL,PAYABLE
    /**
     * @var string
     */
    public $voucherCategory;

    // 支用凭证ids，支持多个，逗号隔开；
    /**
     * @var string
     */
    public $voucherIds;

    // 8位发票号，支持多个，逗号分隔
    /**
     * @var string
     */
    public $voucherInvoiceCodes;

    // 提款确认书hash
    /**
     * @var string
     */
    public $confirmationHash;

    // 提款确认书 osskey
    /**
     * @var string
     */
    public $confirmationOssKey;

    // 签名公钥
    /**
     * @var string
     */
    public $signaturePubKey;

    // 网银操作员账号
    //
    //
    /**
     * @var string
     */
    public $onlineBankOperatorAccount;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'carrierDid'                => 'carrier_did',
        'financingAmount'           => 'financing_amount',
        'financingCurrency'         => 'financing_currency',
        'financingSubjectDid'       => 'financing_subject_did',
        'loanTerm'                  => 'loan_term',
        'payeeBankNumber'           => 'payee_bank_number',
        'payeeBcb'                  => 'payee_bcb',
        'payeeBcbCardNo'            => 'payee_bcb_card_no',
        'payeeIdNumber'             => 'payee_id_number',
        'payeeIdType'               => 'payee_id_type',
        'payeeName'                 => 'payee_name',
        'purpose'                   => 'purpose',
        'requestNo'                 => 'request_no',
        'signature'                 => 'signature',
        'transferPostscript'        => 'transfer_postscript',
        'voucherCategory'           => 'voucher_category',
        'voucherIds'                => 'voucher_ids',
        'voucherInvoiceCodes'       => 'voucher_invoice_codes',
        'confirmationHash'          => 'confirmation_hash',
        'confirmationOssKey'        => 'confirmation_oss_key',
        'signaturePubKey'           => 'signature_pub_key',
        'onlineBankOperatorAccount' => 'online_bank_operator_account',
    ];

    public function validate()
    {
        Model::validateRequired('carrierDid', $this->carrierDid, true);
        Model::validateRequired('financingAmount', $this->financingAmount, true);
        Model::validateRequired('financingCurrency', $this->financingCurrency, true);
        Model::validateRequired('financingSubjectDid', $this->financingSubjectDid, true);
        Model::validateRequired('loanTerm', $this->loanTerm, true);
        Model::validateRequired('payeeBankNumber', $this->payeeBankNumber, true);
        Model::validateRequired('payeeBcb', $this->payeeBcb, true);
        Model::validateRequired('payeeBcbCardNo', $this->payeeBcbCardNo, true);
        Model::validateRequired('payeeIdNumber', $this->payeeIdNumber, true);
        Model::validateRequired('payeeIdType', $this->payeeIdType, true);
        Model::validateRequired('payeeName', $this->payeeName, true);
        Model::validateRequired('purpose', $this->purpose, true);
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('transferPostscript', $this->transferPostscript, true);
        Model::validateRequired('voucherCategory', $this->voucherCategory, true);
        Model::validateRequired('voucherIds', $this->voucherIds, true);
        Model::validateMaxLength('carrierDid', $this->carrierDid, 80);
        Model::validateMaxLength('financingSubjectDid', $this->financingSubjectDid, 80);
        Model::validateMaxLength('loanTerm', $this->loanTerm, 6);
        Model::validateMaxLength('payeeBankNumber', $this->payeeBankNumber, 32);
        Model::validateMaxLength('payeeBcb', $this->payeeBcb, 200);
        Model::validateMaxLength('payeeIdNumber', $this->payeeIdNumber, 40);
        Model::validateMaxLength('payeeIdType', $this->payeeIdType, 5);
        Model::validateMaxLength('payeeName', $this->payeeName, 200);
        Model::validateMaxLength('requestNo', $this->requestNo, 23);
        Model::validateMaxLength('signature', $this->signature, 800);
        Model::validateMaxLength('transferPostscript', $this->transferPostscript, 3);
        Model::validateMaxLength('voucherIds', $this->voucherIds, 2000);
        Model::validateMaxLength('voucherInvoiceCodes', $this->voucherInvoiceCodes, 800);
        Model::validateMinLength('loanTerm', $this->loanTerm, 2);
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
        if (null !== $this->carrierDid) {
            $res['carrier_did'] = $this->carrierDid;
        }
        if (null !== $this->financingAmount) {
            $res['financing_amount'] = $this->financingAmount;
        }
        if (null !== $this->financingCurrency) {
            $res['financing_currency'] = $this->financingCurrency;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->loanTerm) {
            $res['loan_term'] = $this->loanTerm;
        }
        if (null !== $this->payeeBankNumber) {
            $res['payee_bank_number'] = $this->payeeBankNumber;
        }
        if (null !== $this->payeeBcb) {
            $res['payee_bcb'] = $this->payeeBcb;
        }
        if (null !== $this->payeeBcbCardNo) {
            $res['payee_bcb_card_no'] = $this->payeeBcbCardNo;
        }
        if (null !== $this->payeeIdNumber) {
            $res['payee_id_number'] = $this->payeeIdNumber;
        }
        if (null !== $this->payeeIdType) {
            $res['payee_id_type'] = $this->payeeIdType;
        }
        if (null !== $this->payeeName) {
            $res['payee_name'] = $this->payeeName;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->transferPostscript) {
            $res['transfer_postscript'] = $this->transferPostscript;
        }
        if (null !== $this->voucherCategory) {
            $res['voucher_category'] = $this->voucherCategory;
        }
        if (null !== $this->voucherIds) {
            $res['voucher_ids'] = $this->voucherIds;
        }
        if (null !== $this->voucherInvoiceCodes) {
            $res['voucher_invoice_codes'] = $this->voucherInvoiceCodes;
        }
        if (null !== $this->confirmationHash) {
            $res['confirmation_hash'] = $this->confirmationHash;
        }
        if (null !== $this->confirmationOssKey) {
            $res['confirmation_oss_key'] = $this->confirmationOssKey;
        }
        if (null !== $this->signaturePubKey) {
            $res['signature_pub_key'] = $this->signaturePubKey;
        }
        if (null !== $this->onlineBankOperatorAccount) {
            $res['online_bank_operator_account'] = $this->onlineBankOperatorAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPfWaybillfinancingRequest
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
        if (isset($map['carrier_did'])) {
            $model->carrierDid = $map['carrier_did'];
        }
        if (isset($map['financing_amount'])) {
            $model->financingAmount = $map['financing_amount'];
        }
        if (isset($map['financing_currency'])) {
            $model->financingCurrency = $map['financing_currency'];
        }
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if (isset($map['loan_term'])) {
            $model->loanTerm = $map['loan_term'];
        }
        if (isset($map['payee_bank_number'])) {
            $model->payeeBankNumber = $map['payee_bank_number'];
        }
        if (isset($map['payee_bcb'])) {
            $model->payeeBcb = $map['payee_bcb'];
        }
        if (isset($map['payee_bcb_card_no'])) {
            $model->payeeBcbCardNo = $map['payee_bcb_card_no'];
        }
        if (isset($map['payee_id_number'])) {
            $model->payeeIdNumber = $map['payee_id_number'];
        }
        if (isset($map['payee_id_type'])) {
            $model->payeeIdType = $map['payee_id_type'];
        }
        if (isset($map['payee_name'])) {
            $model->payeeName = $map['payee_name'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['transfer_postscript'])) {
            $model->transferPostscript = $map['transfer_postscript'];
        }
        if (isset($map['voucher_category'])) {
            $model->voucherCategory = $map['voucher_category'];
        }
        if (isset($map['voucher_ids'])) {
            $model->voucherIds = $map['voucher_ids'];
        }
        if (isset($map['voucher_invoice_codes'])) {
            $model->voucherInvoiceCodes = $map['voucher_invoice_codes'];
        }
        if (isset($map['confirmation_hash'])) {
            $model->confirmationHash = $map['confirmation_hash'];
        }
        if (isset($map['confirmation_oss_key'])) {
            $model->confirmationOssKey = $map['confirmation_oss_key'];
        }
        if (isset($map['signature_pub_key'])) {
            $model->signaturePubKey = $map['signature_pub_key'];
        }
        if (isset($map['online_bank_operator_account'])) {
            $model->onlineBankOperatorAccount = $map['online_bank_operator_account'];
        }

        return $model;
    }
}
