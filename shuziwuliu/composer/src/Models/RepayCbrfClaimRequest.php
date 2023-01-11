<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class RepayCbrfClaimRequest extends Model
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

    // 申请报案人的名称
    /**
     * @var string
     */
    public $reporterName;

    // 申请报案人的联系方式
    /**
     * @var string
     */
    public $reporterPhoneNum;

    // 理赔时间，yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $claimTime;

    // 依据实际情况计算的理赔金额，单位元
    /**
     * @var string
     */
    public $claimAmount;

    // 部分保司所需关联的投保响应编码
    /**
     * @var string
     */
    public $insuredReceiptNo;

    // PICC-人保
    /**
     * @var string
     */
    public $insuranceCode;

    // 02-跨境退货运费险
    /**
     * @var string
     */
    public $productCode;

    // 保司出具的保单编号
    /**
     * @var string
     */
    public $policyNo;

    // 客户的订单编号
    /**
     * @var string
     */
    public $relatedOrderNo;

    // 此包裹的成交撮合的电商平台名称
    /**
     * @var string
     */
    public $ecommercePlatformName;

    // 承运此包裹的物流CP商名称
    /**
     * @var string
     */
    public $logisticsProvider;

    // 商家唯一脱敏的编码
    /**
     * @var string
     */
    public $merchantId;

    // 买家唯一脱敏的编码
    /**
     * @var string
     */
    public $buyerId;

    // 货物重量，单位（kg）
    /**
     * @var string
     */
    public $cargoWeight;

    // 货物类型的大类
    /**
     * @var string
     */
    public $cargoType;

    // 实际的货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 到达国内仓时间 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $dwaTime;

    // 2位ISO缩写
    /**
     * @var string
     */
    public $destCountry;

    // 索赔材料信息
    // 数组内最多10项，url长度限制最大500，name长度限制最大200
    /**
     * @var ClaimInformation[]
     */
    public $claimInformations;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'reporterName'          => 'reporter_name',
        'reporterPhoneNum'      => 'reporter_phone_num',
        'claimTime'             => 'claim_time',
        'claimAmount'           => 'claim_amount',
        'insuredReceiptNo'      => 'insured_receipt_no',
        'insuranceCode'         => 'insurance_code',
        'productCode'           => 'product_code',
        'policyNo'              => 'policy_no',
        'relatedOrderNo'        => 'related_order_no',
        'ecommercePlatformName' => 'ecommerce_platform_name',
        'logisticsProvider'     => 'logistics_provider',
        'merchantId'            => 'merchant_id',
        'buyerId'               => 'buyer_id',
        'cargoWeight'           => 'cargo_weight',
        'cargoType'             => 'cargo_type',
        'cargoName'             => 'cargo_name',
        'dwaTime'               => 'dwa_time',
        'destCountry'           => 'dest_country',
        'claimInformations'     => 'claim_informations',
    ];

    public function validate()
    {
        Model::validateMaxLength('reporterName', $this->reporterName, 200);
        Model::validateMaxLength('reporterPhoneNum', $this->reporterPhoneNum, 20);
        Model::validateMaxLength('claimTime', $this->claimTime, 50);
        Model::validateMaxLength('claimAmount', $this->claimAmount, 20);
        Model::validateMaxLength('insuredReceiptNo', $this->insuredReceiptNo, 200);
        Model::validateMaxLength('insuranceCode', $this->insuranceCode, 32);
        Model::validateMaxLength('productCode', $this->productCode, 2);
        Model::validateMaxLength('policyNo', $this->policyNo, 50);
        Model::validateMaxLength('relatedOrderNo', $this->relatedOrderNo, 150);
        Model::validateMaxLength('ecommercePlatformName', $this->ecommercePlatformName, 200);
        Model::validateMaxLength('logisticsProvider', $this->logisticsProvider, 200);
        Model::validateMaxLength('merchantId', $this->merchantId, 200);
        Model::validateMaxLength('buyerId', $this->buyerId, 200);
        Model::validateMaxLength('cargoWeight', $this->cargoWeight, 50);
        Model::validateMaxLength('cargoType', $this->cargoType, 200);
        Model::validateMaxLength('cargoName', $this->cargoName, 200);
        Model::validateMaxLength('dwaTime', $this->dwaTime, 50);
        Model::validateMaxLength('destCountry', $this->destCountry, 32);
        Model::validateRequired('claimTime', $this->claimTime, true);
        Model::validateRequired('claimAmount', $this->claimAmount, true);
        Model::validateRequired('insuredReceiptNo', $this->insuredReceiptNo, true);
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('relatedOrderNo', $this->relatedOrderNo, true);
        Model::validateRequired('ecommercePlatformName', $this->ecommercePlatformName, true);
        Model::validateRequired('logisticsProvider', $this->logisticsProvider, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('cargoWeight', $this->cargoWeight, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('destCountry', $this->destCountry, true);
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
        if (null !== $this->reporterName) {
            $res['reporter_name'] = $this->reporterName;
        }
        if (null !== $this->reporterPhoneNum) {
            $res['reporter_phone_num'] = $this->reporterPhoneNum;
        }
        if (null !== $this->claimTime) {
            $res['claim_time'] = $this->claimTime;
        }
        if (null !== $this->claimAmount) {
            $res['claim_amount'] = $this->claimAmount;
        }
        if (null !== $this->insuredReceiptNo) {
            $res['insured_receipt_no'] = $this->insuredReceiptNo;
        }
        if (null !== $this->insuranceCode) {
            $res['insurance_code'] = $this->insuranceCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->relatedOrderNo) {
            $res['related_order_no'] = $this->relatedOrderNo;
        }
        if (null !== $this->ecommercePlatformName) {
            $res['ecommerce_platform_name'] = $this->ecommercePlatformName;
        }
        if (null !== $this->logisticsProvider) {
            $res['logistics_provider'] = $this->logisticsProvider;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->dwaTime) {
            $res['dwa_time'] = $this->dwaTime;
        }
        if (null !== $this->destCountry) {
            $res['dest_country'] = $this->destCountry;
        }
        if (null !== $this->claimInformations) {
            $res['claim_informations'] = [];
            if (null !== $this->claimInformations && \is_array($this->claimInformations)) {
                $n = 0;
                foreach ($this->claimInformations as $item) {
                    $res['claim_informations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayCbrfClaimRequest
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
        if (isset($map['reporter_name'])) {
            $model->reporterName = $map['reporter_name'];
        }
        if (isset($map['reporter_phone_num'])) {
            $model->reporterPhoneNum = $map['reporter_phone_num'];
        }
        if (isset($map['claim_time'])) {
            $model->claimTime = $map['claim_time'];
        }
        if (isset($map['claim_amount'])) {
            $model->claimAmount = $map['claim_amount'];
        }
        if (isset($map['insured_receipt_no'])) {
            $model->insuredReceiptNo = $map['insured_receipt_no'];
        }
        if (isset($map['insurance_code'])) {
            $model->insuranceCode = $map['insurance_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['related_order_no'])) {
            $model->relatedOrderNo = $map['related_order_no'];
        }
        if (isset($map['ecommerce_platform_name'])) {
            $model->ecommercePlatformName = $map['ecommerce_platform_name'];
        }
        if (isset($map['logistics_provider'])) {
            $model->logisticsProvider = $map['logistics_provider'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
        }
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['dwa_time'])) {
            $model->dwaTime = $map['dwa_time'];
        }
        if (isset($map['dest_country'])) {
            $model->destCountry = $map['dest_country'];
        }
        if (isset($map['claim_informations'])) {
            if (!empty($map['claim_informations'])) {
                $model->claimInformations = [];
                $n                        = 0;
                foreach ($map['claim_informations'] as $item) {
                    $model->claimInformations[$n++] = null !== $item ? ClaimInformation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
