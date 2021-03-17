<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SaveJointconstraintRecordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 收款账户
    /**
     * @var string
     */
    public $beneficiaryAccountCode;

    // 收款账户类型
    //
    // 1：支付宝
    /**
     * @var int
     */
    public $beneficiaryAccountType;

    // 应收方证件号码
    //
    //
    /**
     * @var string
     */
    public $beneficiaryCertNumber;

    // 应收方证件类型
    //
    // 0：统一社会信用代码
    //
    // 1：身份证号码
    /**
     * @var int
     */
    public $beneficiaryCertType;

    //
    // 应收方类型
    //
    // 0：企业
    //
    // 1：个人
    /**
     * @var int
     */
    public $beneficiaryType;

    // 合同编号
    /**
     * @var string
     */
    public $contractCode;

    // 合同履行记录标签
    /**
     * @var string
     */
    public $contractFulfillmentCode;

    // 合同名称
    /**
     * @var string
     */
    public $contractName;

    // 合同存证哈希
    /**
     * @var string
     */
    public $contractTxhash;

    // 商户端合同链接
    //
    // 从智能合同小程序中跳转至商户端查看合同内容链接
    /**
     * @var string
     */
    public $externalUrl;

    // 所属行业，来自合同
    //
    //
    /**
     * @var string
     */
    public $industryCode;

    // 已付金额
    //
    //
    /**
     * @var string
     */
    public $paidAmount;

    // 支付凭据
    //
    //
    /**
     * @var string
     */
    public $paidProof;

    // 付款时间
    //
    //
    /**
     * @var string
     */
    public $paidTime;

    // 付款账户
    //
    //
    /**
     * @var string
     */
    public $payerAccountCode;

    //
    // 付款账户类型
    //
    // 1：支付宝
    /**
     * @var int
     */
    public $payerAccountType;

    // 应付方证件号码
    //
    //
    /**
     * @var string
     */
    public $payerCertNumber;

    // 应付方证件类型
    //
    // 0：统一社会信用代码
    //
    // 1：身份证号码
    /**
     * @var int
     */
    public $payerCertType;

    // 应付方类型
    //
    // 0：企业
    //
    // 1：个人
    /**
     * @var int
     */
    public $payerType;

    // 履约标的金额
    //
    //
    /**
     * @var string
     */
    public $paymentAmount;

    // 履约宽限期，单位：天
    //
    //
    /**
     * @var int
     */
    public $paymentDateBuffer;

    // 目标履约日期
    //
    //
    /**
     * @var string
     */
    public $paymentDeadline;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'beneficiaryAccountCode'  => 'beneficiary_account_code',
        'beneficiaryAccountType'  => 'beneficiary_account_type',
        'beneficiaryCertNumber'   => 'beneficiary_cert_number',
        'beneficiaryCertType'     => 'beneficiary_cert_type',
        'beneficiaryType'         => 'beneficiary_type',
        'contractCode'            => 'contract_code',
        'contractFulfillmentCode' => 'contract_fulfillment_code',
        'contractName'            => 'contract_name',
        'contractTxhash'          => 'contract_txhash',
        'externalUrl'             => 'external_url',
        'industryCode'            => 'industry_code',
        'paidAmount'              => 'paid_amount',
        'paidProof'               => 'paid_proof',
        'paidTime'                => 'paid_time',
        'payerAccountCode'        => 'payer_account_code',
        'payerAccountType'        => 'payer_account_type',
        'payerCertNumber'         => 'payer_cert_number',
        'payerCertType'           => 'payer_cert_type',
        'payerType'               => 'payer_type',
        'paymentAmount'           => 'payment_amount',
        'paymentDateBuffer'       => 'payment_date_buffer',
        'paymentDeadline'         => 'payment_deadline',
    ];

    public function validate()
    {
        Model::validateRequired('beneficiaryCertNumber', $this->beneficiaryCertNumber, true);
        Model::validateRequired('beneficiaryCertType', $this->beneficiaryCertType, true);
        Model::validateRequired('beneficiaryType', $this->beneficiaryType, true);
        Model::validateRequired('contractCode', $this->contractCode, true);
        Model::validateRequired('contractFulfillmentCode', $this->contractFulfillmentCode, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractTxhash', $this->contractTxhash, true);
        Model::validateRequired('payerCertNumber', $this->payerCertNumber, true);
        Model::validateRequired('payerCertType', $this->payerCertType, true);
        Model::validateRequired('payerType', $this->payerType, true);
        Model::validateRequired('paymentAmount', $this->paymentAmount, true);
        Model::validateRequired('paymentDeadline', $this->paymentDeadline, true);
        Model::validatePattern('paidTime', $this->paidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('paymentDeadline', $this->paymentDeadline, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->beneficiaryAccountCode) {
            $res['beneficiary_account_code'] = $this->beneficiaryAccountCode;
        }
        if (null !== $this->beneficiaryAccountType) {
            $res['beneficiary_account_type'] = $this->beneficiaryAccountType;
        }
        if (null !== $this->beneficiaryCertNumber) {
            $res['beneficiary_cert_number'] = $this->beneficiaryCertNumber;
        }
        if (null !== $this->beneficiaryCertType) {
            $res['beneficiary_cert_type'] = $this->beneficiaryCertType;
        }
        if (null !== $this->beneficiaryType) {
            $res['beneficiary_type'] = $this->beneficiaryType;
        }
        if (null !== $this->contractCode) {
            $res['contract_code'] = $this->contractCode;
        }
        if (null !== $this->contractFulfillmentCode) {
            $res['contract_fulfillment_code'] = $this->contractFulfillmentCode;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractTxhash) {
            $res['contract_txhash'] = $this->contractTxhash;
        }
        if (null !== $this->externalUrl) {
            $res['external_url'] = $this->externalUrl;
        }
        if (null !== $this->industryCode) {
            $res['industry_code'] = $this->industryCode;
        }
        if (null !== $this->paidAmount) {
            $res['paid_amount'] = $this->paidAmount;
        }
        if (null !== $this->paidProof) {
            $res['paid_proof'] = $this->paidProof;
        }
        if (null !== $this->paidTime) {
            $res['paid_time'] = $this->paidTime;
        }
        if (null !== $this->payerAccountCode) {
            $res['payer_account_code'] = $this->payerAccountCode;
        }
        if (null !== $this->payerAccountType) {
            $res['payer_account_type'] = $this->payerAccountType;
        }
        if (null !== $this->payerCertNumber) {
            $res['payer_cert_number'] = $this->payerCertNumber;
        }
        if (null !== $this->payerCertType) {
            $res['payer_cert_type'] = $this->payerCertType;
        }
        if (null !== $this->payerType) {
            $res['payer_type'] = $this->payerType;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }
        if (null !== $this->paymentDateBuffer) {
            $res['payment_date_buffer'] = $this->paymentDateBuffer;
        }
        if (null !== $this->paymentDeadline) {
            $res['payment_deadline'] = $this->paymentDeadline;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveJointconstraintRecordRequest
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
        if (isset($map['beneficiary_account_code'])) {
            $model->beneficiaryAccountCode = $map['beneficiary_account_code'];
        }
        if (isset($map['beneficiary_account_type'])) {
            $model->beneficiaryAccountType = $map['beneficiary_account_type'];
        }
        if (isset($map['beneficiary_cert_number'])) {
            $model->beneficiaryCertNumber = $map['beneficiary_cert_number'];
        }
        if (isset($map['beneficiary_cert_type'])) {
            $model->beneficiaryCertType = $map['beneficiary_cert_type'];
        }
        if (isset($map['beneficiary_type'])) {
            $model->beneficiaryType = $map['beneficiary_type'];
        }
        if (isset($map['contract_code'])) {
            $model->contractCode = $map['contract_code'];
        }
        if (isset($map['contract_fulfillment_code'])) {
            $model->contractFulfillmentCode = $map['contract_fulfillment_code'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_txhash'])) {
            $model->contractTxhash = $map['contract_txhash'];
        }
        if (isset($map['external_url'])) {
            $model->externalUrl = $map['external_url'];
        }
        if (isset($map['industry_code'])) {
            $model->industryCode = $map['industry_code'];
        }
        if (isset($map['paid_amount'])) {
            $model->paidAmount = $map['paid_amount'];
        }
        if (isset($map['paid_proof'])) {
            $model->paidProof = $map['paid_proof'];
        }
        if (isset($map['paid_time'])) {
            $model->paidTime = $map['paid_time'];
        }
        if (isset($map['payer_account_code'])) {
            $model->payerAccountCode = $map['payer_account_code'];
        }
        if (isset($map['payer_account_type'])) {
            $model->payerAccountType = $map['payer_account_type'];
        }
        if (isset($map['payer_cert_number'])) {
            $model->payerCertNumber = $map['payer_cert_number'];
        }
        if (isset($map['payer_cert_type'])) {
            $model->payerCertType = $map['payer_cert_type'];
        }
        if (isset($map['payer_type'])) {
            $model->payerType = $map['payer_type'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }
        if (isset($map['payment_date_buffer'])) {
            $model->paymentDateBuffer = $map['payment_date_buffer'];
        }
        if (isset($map['payment_deadline'])) {
            $model->paymentDeadline = $map['payment_deadline'];
        }

        return $model;
    }
}
