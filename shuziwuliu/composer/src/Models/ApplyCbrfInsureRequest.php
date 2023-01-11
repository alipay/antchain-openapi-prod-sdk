<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyCbrfInsureRequest extends Model
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

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCode;

    // 险种编码
    //
    /**
     * @var string
     */
    public $productCode;

    // 保险协议中的投保人全称
    /**
     * @var string
     */
    public $policyholderName;

    // 投保人证件类型，01--居民身份证、03--营业执照
    /**
     * @var string
     */
    public $policyholderIdType;

    // 投保人证件号码
    /**
     * @var string
     */
    public $policyholderIdNo;

    // 被保人姓名，实际的保险被保人名称
    /**
     * @var string
     */
    public $insuredName;

    // 被保人证件类型，01--居民身份证、03--营业执照
    /**
     * @var string
     */
    public $insuredIdType;

    // 被保人证件号码
    /**
     * @var string
     */
    public $insuredIdNo;

    // 受益人名称，实际的保险受益人名称
    /**
     * @var string
     */
    public $beneficiaryName;

    // 受益人证件类型，01--居民身份证、03--营业执照
    /**
     * @var string
     */
    public $beneficiaryIdType;

    // 受益人证件号码
    /**
     * @var string
     */
    public $beneficiaryIdNo;

    // 保司针对当前的项目所给的方案名
    /**
     * @var string
     */
    public $schemeName;

    // 保司针对当前的项目所给的项目名
    /**
     * @var string
     */
    public $projectName;

    // 保险金额，单位（元），最多支持2位小数，超过2位拒绝
    /**
     * @var string
     */
    public $insuranceAmount;

    // 保险起期,yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insureStart;

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

    // 货物的揽收时间
    /**
     * @var string
     */
    public $collectionTime;

    // yyyy-MM-dd HH:mm:ss 交付航司确认的时间
    /**
     * @var string
     */
    public $deliveryTime;

    // 2位ISO缩写
    /**
     * @var string
     */
    public $destCountry;

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

    // 货物的美金商品价值
    /**
     * @var string
     */
    public $cargoValue;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'insuranceCode'         => 'insurance_code',
        'productCode'           => 'product_code',
        'policyholderName'      => 'policyholder_name',
        'policyholderIdType'    => 'policyholder_id_type',
        'policyholderIdNo'      => 'policyholder_id_no',
        'insuredName'           => 'insured_name',
        'insuredIdType'         => 'insured_id_type',
        'insuredIdNo'           => 'insured_id_no',
        'beneficiaryName'       => 'beneficiary_name',
        'beneficiaryIdType'     => 'beneficiary_id_type',
        'beneficiaryIdNo'       => 'beneficiary_id_no',
        'schemeName'            => 'scheme_name',
        'projectName'           => 'project_name',
        'insuranceAmount'       => 'insurance_amount',
        'insureStart'           => 'insure_start',
        'relatedOrderNo'        => 'related_order_no',
        'ecommercePlatformName' => 'ecommerce_platform_name',
        'logisticsProvider'     => 'logistics_provider',
        'collectionTime'        => 'collection_time',
        'deliveryTime'          => 'delivery_time',
        'destCountry'           => 'dest_country',
        'merchantId'            => 'merchant_id',
        'buyerId'               => 'buyer_id',
        'cargoWeight'           => 'cargo_weight',
        'cargoType'             => 'cargo_type',
        'cargoName'             => 'cargo_name',
        'cargoValue'            => 'cargo_value',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('policyholderName', $this->policyholderName, true);
        Model::validateRequired('policyholderIdType', $this->policyholderIdType, true);
        Model::validateRequired('policyholderIdNo', $this->policyholderIdNo, true);
        Model::validateRequired('insuredName', $this->insuredName, true);
        Model::validateRequired('insuredIdType', $this->insuredIdType, true);
        Model::validateRequired('insuredIdNo', $this->insuredIdNo, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('relatedOrderNo', $this->relatedOrderNo, true);
        Model::validateRequired('ecommercePlatformName', $this->ecommercePlatformName, true);
        Model::validateRequired('logisticsProvider', $this->logisticsProvider, true);
        Model::validateRequired('deliveryTime', $this->deliveryTime, true);
        Model::validateRequired('destCountry', $this->destCountry, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('cargoWeight', $this->cargoWeight, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoValue', $this->cargoValue, true);
        Model::validateMaxLength('insuranceCode', $this->insuranceCode, 32);
        Model::validateMaxLength('productCode', $this->productCode, 2);
        Model::validateMaxLength('policyholderName', $this->policyholderName, 200);
        Model::validateMaxLength('policyholderIdType', $this->policyholderIdType, 2);
        Model::validateMaxLength('policyholderIdNo', $this->policyholderIdNo, 50);
        Model::validateMaxLength('insuredName', $this->insuredName, 200);
        Model::validateMaxLength('insuredIdType', $this->insuredIdType, 2);
        Model::validateMaxLength('insuredIdNo', $this->insuredIdNo, 50);
        Model::validateMaxLength('beneficiaryName', $this->beneficiaryName, 200);
        Model::validateMaxLength('beneficiaryIdType', $this->beneficiaryIdType, 2);
        Model::validateMaxLength('beneficiaryIdNo', $this->beneficiaryIdNo, 50);
        Model::validateMaxLength('schemeName', $this->schemeName, 200);
        Model::validateMaxLength('projectName', $this->projectName, 200);
        Model::validateMaxLength('insuranceAmount', $this->insuranceAmount, 20);
        Model::validateMaxLength('insureStart', $this->insureStart, 50);
        Model::validateMaxLength('relatedOrderNo', $this->relatedOrderNo, 150);
        Model::validateMaxLength('ecommercePlatformName', $this->ecommercePlatformName, 200);
        Model::validateMaxLength('logisticsProvider', $this->logisticsProvider, 200);
        Model::validateMaxLength('collectionTime', $this->collectionTime, 50);
        Model::validateMaxLength('deliveryTime', $this->deliveryTime, 50);
        Model::validateMaxLength('destCountry', $this->destCountry, 32);
        Model::validateMaxLength('merchantId', $this->merchantId, 200);
        Model::validateMaxLength('buyerId', $this->buyerId, 200);
        Model::validateMaxLength('cargoWeight', $this->cargoWeight, 50);
        Model::validateMaxLength('cargoType', $this->cargoType, 200);
        Model::validateMaxLength('cargoName', $this->cargoName, 200);
        Model::validateMaxLength('cargoValue', $this->cargoValue, 20);
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
        if (null !== $this->insuranceCode) {
            $res['insurance_code'] = $this->insuranceCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->policyholderName) {
            $res['policyholder_name'] = $this->policyholderName;
        }
        if (null !== $this->policyholderIdType) {
            $res['policyholder_id_type'] = $this->policyholderIdType;
        }
        if (null !== $this->policyholderIdNo) {
            $res['policyholder_id_no'] = $this->policyholderIdNo;
        }
        if (null !== $this->insuredName) {
            $res['insured_name'] = $this->insuredName;
        }
        if (null !== $this->insuredIdType) {
            $res['insured_id_type'] = $this->insuredIdType;
        }
        if (null !== $this->insuredIdNo) {
            $res['insured_id_no'] = $this->insuredIdNo;
        }
        if (null !== $this->beneficiaryName) {
            $res['beneficiary_name'] = $this->beneficiaryName;
        }
        if (null !== $this->beneficiaryIdType) {
            $res['beneficiary_id_type'] = $this->beneficiaryIdType;
        }
        if (null !== $this->beneficiaryIdNo) {
            $res['beneficiary_id_no'] = $this->beneficiaryIdNo;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->insuranceAmount) {
            $res['insurance_amount'] = $this->insuranceAmount;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
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
        if (null !== $this->collectionTime) {
            $res['collection_time'] = $this->collectionTime;
        }
        if (null !== $this->deliveryTime) {
            $res['delivery_time'] = $this->deliveryTime;
        }
        if (null !== $this->destCountry) {
            $res['dest_country'] = $this->destCountry;
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
        if (null !== $this->cargoValue) {
            $res['cargo_value'] = $this->cargoValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCbrfInsureRequest
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
        if (isset($map['insurance_code'])) {
            $model->insuranceCode = $map['insurance_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['policyholder_name'])) {
            $model->policyholderName = $map['policyholder_name'];
        }
        if (isset($map['policyholder_id_type'])) {
            $model->policyholderIdType = $map['policyholder_id_type'];
        }
        if (isset($map['policyholder_id_no'])) {
            $model->policyholderIdNo = $map['policyholder_id_no'];
        }
        if (isset($map['insured_name'])) {
            $model->insuredName = $map['insured_name'];
        }
        if (isset($map['insured_id_type'])) {
            $model->insuredIdType = $map['insured_id_type'];
        }
        if (isset($map['insured_id_no'])) {
            $model->insuredIdNo = $map['insured_id_no'];
        }
        if (isset($map['beneficiary_name'])) {
            $model->beneficiaryName = $map['beneficiary_name'];
        }
        if (isset($map['beneficiary_id_type'])) {
            $model->beneficiaryIdType = $map['beneficiary_id_type'];
        }
        if (isset($map['beneficiary_id_no'])) {
            $model->beneficiaryIdNo = $map['beneficiary_id_no'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['insurance_amount'])) {
            $model->insuranceAmount = $map['insurance_amount'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
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
        if (isset($map['collection_time'])) {
            $model->collectionTime = $map['collection_time'];
        }
        if (isset($map['delivery_time'])) {
            $model->deliveryTime = $map['delivery_time'];
        }
        if (isset($map['dest_country'])) {
            $model->destCountry = $map['dest_country'];
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
        if (isset($map['cargo_value'])) {
            $model->cargoValue = $map['cargo_value'];
        }

        return $model;
    }
}
