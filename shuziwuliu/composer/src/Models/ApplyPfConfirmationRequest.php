<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyPfConfirmationRequest extends Model
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

    // 请求号
    /**
     * @var string
     */
    public $requestNo;

    // 客户号
    /**
     * @var string
     */
    public $clientNo;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 借款人证件类型
    /**
     * @var string
     */
    public $borrowerCardType;

    // 借款人证件号码
    //
    //
    /**
     * @var string
     */
    public $borrowerCardNo;

    // 融资金额
    //
    //
    /**
     * @var string
     */
    public $financingAmount;

    // 支用币种
    //
    //
    /**
     * @var string
     */
    public $currency;

    // 贷款期限（月）
    /**
     * @var string
     */
    public $loanTerm;

    // 收款方开户行总行联行号
    //
    //
    /**
     * @var string
     */
    public $payeeBankUnionNumber;

    // 收款方开户行名称
    //
    //
    /**
     * @var string
     */
    public $payeeBankName;

    // 收款方户名
    //
    //
    /**
     * @var string
     */
    public $payeeName;

    // 收款方银行卡账号
    //
    //
    /**
     * @var string
     */
    public $payeeBankNo;

    // 收款人证件类型
    //
    //
    /**
     * @var string
     */
    public $payeeCardType;

    // 收款人证件号码
    //
    //
    /**
     * @var string
     */
    public $payeeCardNo;

    // 贷款用途
    //
    //
    /**
     * @var string
     */
    public $purpose;

    // 附言
    /**
     * @var string
     */
    public $postscript;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'requestNo'            => 'request_no',
        'clientNo'             => 'client_no',
        'financingSubjectDid'  => 'financing_subject_did',
        'borrowerCardType'     => 'borrower_card_type',
        'borrowerCardNo'       => 'borrower_card_no',
        'financingAmount'      => 'financing_amount',
        'currency'             => 'currency',
        'loanTerm'             => 'loan_term',
        'payeeBankUnionNumber' => 'payee_bank_union_number',
        'payeeBankName'        => 'payee_bank_name',
        'payeeName'            => 'payee_name',
        'payeeBankNo'          => 'payee_bank_no',
        'payeeCardType'        => 'payee_card_type',
        'payeeCardNo'          => 'payee_card_no',
        'purpose'              => 'purpose',
        'postscript'           => 'postscript',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('clientNo', $this->clientNo, true);
        Model::validateRequired('financingSubjectDid', $this->financingSubjectDid, true);
        Model::validateRequired('borrowerCardType', $this->borrowerCardType, true);
        Model::validateRequired('borrowerCardNo', $this->borrowerCardNo, true);
        Model::validateRequired('financingAmount', $this->financingAmount, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('loanTerm', $this->loanTerm, true);
        Model::validateRequired('payeeBankUnionNumber', $this->payeeBankUnionNumber, true);
        Model::validateRequired('payeeBankName', $this->payeeBankName, true);
        Model::validateRequired('payeeName', $this->payeeName, true);
        Model::validateRequired('payeeBankNo', $this->payeeBankNo, true);
        Model::validateRequired('purpose', $this->purpose, true);
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
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->clientNo) {
            $res['client_no'] = $this->clientNo;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->borrowerCardType) {
            $res['borrower_card_type'] = $this->borrowerCardType;
        }
        if (null !== $this->borrowerCardNo) {
            $res['borrower_card_no'] = $this->borrowerCardNo;
        }
        if (null !== $this->financingAmount) {
            $res['financing_amount'] = $this->financingAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->loanTerm) {
            $res['loan_term'] = $this->loanTerm;
        }
        if (null !== $this->payeeBankUnionNumber) {
            $res['payee_bank_union_number'] = $this->payeeBankUnionNumber;
        }
        if (null !== $this->payeeBankName) {
            $res['payee_bank_name'] = $this->payeeBankName;
        }
        if (null !== $this->payeeName) {
            $res['payee_name'] = $this->payeeName;
        }
        if (null !== $this->payeeBankNo) {
            $res['payee_bank_no'] = $this->payeeBankNo;
        }
        if (null !== $this->payeeCardType) {
            $res['payee_card_type'] = $this->payeeCardType;
        }
        if (null !== $this->payeeCardNo) {
            $res['payee_card_no'] = $this->payeeCardNo;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->postscript) {
            $res['postscript'] = $this->postscript;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPfConfirmationRequest
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
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['client_no'])) {
            $model->clientNo = $map['client_no'];
        }
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if (isset($map['borrower_card_type'])) {
            $model->borrowerCardType = $map['borrower_card_type'];
        }
        if (isset($map['borrower_card_no'])) {
            $model->borrowerCardNo = $map['borrower_card_no'];
        }
        if (isset($map['financing_amount'])) {
            $model->financingAmount = $map['financing_amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['loan_term'])) {
            $model->loanTerm = $map['loan_term'];
        }
        if (isset($map['payee_bank_union_number'])) {
            $model->payeeBankUnionNumber = $map['payee_bank_union_number'];
        }
        if (isset($map['payee_bank_name'])) {
            $model->payeeBankName = $map['payee_bank_name'];
        }
        if (isset($map['payee_name'])) {
            $model->payeeName = $map['payee_name'];
        }
        if (isset($map['payee_bank_no'])) {
            $model->payeeBankNo = $map['payee_bank_no'];
        }
        if (isset($map['payee_card_type'])) {
            $model->payeeCardType = $map['payee_card_type'];
        }
        if (isset($map['payee_card_no'])) {
            $model->payeeCardNo = $map['payee_card_no'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['postscript'])) {
            $model->postscript = $map['postscript'];
        }

        return $model;
    }
}
