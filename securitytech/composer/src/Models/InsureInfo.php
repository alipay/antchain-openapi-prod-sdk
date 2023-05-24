<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class InsureInfo extends Model
{
    // 保单时间
    /**
     * @example 2023-04-23 12:00:01
     *
     * @var string
     */
    public $modifyTime;

    // 蚂蚁L5产品code
    /**
     * @example base
     *
     * @var string
     */
    public $productCode;

    // 保险产品code
    /**
     * @example A
     *
     * @var string
     */
    public $insureProduct;

    // 保险产品价格
    /**
     * @example 54
     *
     * @var string
     */
    public $insurePrice;

    // 保险品种
    /**
     * @example 基础险
     *
     * @var string
     */
    public $insureType;

    // 付款方式
    /**
     * @example 年付
     *
     * @var string
     */
    public $payType;

    // 保险期数
    /**
     * @example 12
     *
     * @var string
     */
    public $insurePeriod;

    // 保单状态
    /**
     * @example 生效中
     *
     * @var string
     */
    public $policyStatus;

    // 操作类型
    /**
     * @example 投保
     *
     * @var string
     */
    public $operateType;

    // 保司信用代码
    /**
     * @example 91440300892305861T
     *
     * @var string
     */
    public $insureCompCreditNo;
    protected $_name = [
        'modifyTime'         => 'modify_time',
        'productCode'        => 'product_code',
        'insureProduct'      => 'insure_product',
        'insurePrice'        => 'insure_price',
        'insureType'         => 'insure_type',
        'payType'            => 'pay_type',
        'insurePeriod'       => 'insure_period',
        'policyStatus'       => 'policy_status',
        'operateType'        => 'operate_type',
        'insureCompCreditNo' => 'insure_comp_credit_no',
    ];

    public function validate()
    {
        Model::validateRequired('modifyTime', $this->modifyTime, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('insureProduct', $this->insureProduct, true);
        Model::validateRequired('insurePrice', $this->insurePrice, true);
        Model::validateRequired('insureType', $this->insureType, true);
        Model::validateRequired('payType', $this->payType, true);
        Model::validateRequired('insurePeriod', $this->insurePeriod, true);
        Model::validateRequired('policyStatus', $this->policyStatus, true);
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('insureCompCreditNo', $this->insureCompCreditNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->insureProduct) {
            $res['insure_product'] = $this->insureProduct;
        }
        if (null !== $this->insurePrice) {
            $res['insure_price'] = $this->insurePrice;
        }
        if (null !== $this->insureType) {
            $res['insure_type'] = $this->insureType;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->insurePeriod) {
            $res['insure_period'] = $this->insurePeriod;
        }
        if (null !== $this->policyStatus) {
            $res['policy_status'] = $this->policyStatus;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->insureCompCreditNo) {
            $res['insure_comp_credit_no'] = $this->insureCompCreditNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsureInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['insure_product'])) {
            $model->insureProduct = $map['insure_product'];
        }
        if (isset($map['insure_price'])) {
            $model->insurePrice = $map['insure_price'];
        }
        if (isset($map['insure_type'])) {
            $model->insureType = $map['insure_type'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['insure_period'])) {
            $model->insurePeriod = $map['insure_period'];
        }
        if (isset($map['policy_status'])) {
            $model->policyStatus = $map['policy_status'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['insure_comp_credit_no'])) {
            $model->insureCompCreditNo = $map['insure_comp_credit_no'];
        }

        return $model;
    }
}
