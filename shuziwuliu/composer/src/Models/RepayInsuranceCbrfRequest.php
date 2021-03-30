<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class RepayInsuranceCbrfRequest extends Model
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

    // 物流公司业务线的简称
    /**
     * @var string
     */
    public $businessId;

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCode;

    // 险种
    /**
     * @var string
     */
    public $productCode;

    // 客户的订单编号
    /**
     * @var string
     */
    public $relatedOrderNo;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 投保响应编码
    /**
     * @var string
     */
    public $insuredReceiptNo;

    // 2位ISO国家编码
    /**
     * @var string
     */
    public $destCountry;

    // 理赔时间
    /**
     * @var string
     */
    public $claimTime;

    // 理赔金额，单位为元，依据实际情况计算的理赔金额，最多小数点后2位
    /**
     * @var string
     */
    public $claimAmount;

    // 达到国内仓库时间
    /**
     * @var string
     */
    public $dwaTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessId'        => 'business_id',
        'insuranceCode'     => 'insurance_code',
        'productCode'       => 'product_code',
        'relatedOrderNo'    => 'related_order_no',
        'policyNo'          => 'policy_no',
        'insuredReceiptNo'  => 'insured_receipt_no',
        'destCountry'       => 'dest_country',
        'claimTime'         => 'claim_time',
        'claimAmount'       => 'claim_amount',
        'dwaTime'           => 'dwa_time',
    ];

    public function validate()
    {
        Model::validateMaxLength('businessId', $this->businessId, 50);
        Model::validateMaxLength('insuranceCode', $this->insuranceCode, 16);
        Model::validateMaxLength('productCode', $this->productCode, 2);
        Model::validateMaxLength('relatedOrderNo', $this->relatedOrderNo, 256);
        Model::validateMaxLength('policyNo', $this->policyNo, 50);
        Model::validateMaxLength('insuredReceiptNo', $this->insuredReceiptNo, 40);
        Model::validateMaxLength('destCountry', $this->destCountry, 256);
        Model::validateMaxLength('claimAmount', $this->claimAmount, 20);
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('relatedOrderNo', $this->relatedOrderNo, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('insuredReceiptNo', $this->insuredReceiptNo, true);
        Model::validateRequired('destCountry', $this->destCountry, true);
        Model::validateRequired('claimTime', $this->claimTime, true);
        Model::validateRequired('claimAmount', $this->claimAmount, true);
        Model::validatePattern('claimTime', $this->claimTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->insuranceCode) {
            $res['insurance_code'] = $this->insuranceCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->relatedOrderNo) {
            $res['related_order_no'] = $this->relatedOrderNo;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->insuredReceiptNo) {
            $res['insured_receipt_no'] = $this->insuredReceiptNo;
        }
        if (null !== $this->destCountry) {
            $res['dest_country'] = $this->destCountry;
        }
        if (null !== $this->claimTime) {
            $res['claim_time'] = $this->claimTime;
        }
        if (null !== $this->claimAmount) {
            $res['claim_amount'] = $this->claimAmount;
        }
        if (null !== $this->dwaTime) {
            $res['dwa_time'] = $this->dwaTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayInsuranceCbrfRequest
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
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['insurance_code'])) {
            $model->insuranceCode = $map['insurance_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['related_order_no'])) {
            $model->relatedOrderNo = $map['related_order_no'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['insured_receipt_no'])) {
            $model->insuredReceiptNo = $map['insured_receipt_no'];
        }
        if (isset($map['dest_country'])) {
            $model->destCountry = $map['dest_country'];
        }
        if (isset($map['claim_time'])) {
            $model->claimTime = $map['claim_time'];
        }
        if (isset($map['claim_amount'])) {
            $model->claimAmount = $map['claim_amount'];
        }
        if (isset($map['dwa_time'])) {
            $model->dwaTime = $map['dwa_time'];
        }

        return $model;
    }
}
