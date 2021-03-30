<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceCbrfRequest extends Model
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

    // 险种编码
    /**
     * @var string
     */
    public $productCode;

    // 起保时间
    /**
     * @var string
     */
    public $insuranceStart;

    // 交付航司确认时间
    /**
     * @var string
     */
    public $deliveryTime;

    // 客户订单编号
    /**
     * @var string
     */
    public $relatedOderNo;

    // 目的国，2位iso缩写
    /**
     * @var string
     */
    public $destCountry;

    // 商家唯一脱敏的编码
    /**
     * @var string
     */
    public $businessMerchantId;

    // 货物的揽收时间
    /**
     * @var string
     */
    public $collectionTime;

    // 货物名称
    /**
     * @var string
     */
    public $goodName;

    // 货值(美金)，货物的美金商品价值
    /**
     * @var string
     */
    public $goodValue;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'businessId'         => 'business_id',
        'insuranceCode'      => 'insurance_code',
        'productCode'        => 'product_code',
        'insuranceStart'     => 'insurance_start',
        'deliveryTime'       => 'delivery_time',
        'relatedOderNo'      => 'related_oder_no',
        'destCountry'        => 'dest_country',
        'businessMerchantId' => 'business_merchant_id',
        'collectionTime'     => 'collection_time',
        'goodName'           => 'good_name',
        'goodValue'          => 'good_value',
    ];

    public function validate()
    {
        Model::validateMaxLength('businessId', $this->businessId, 30);
        Model::validateMaxLength('insuranceCode', $this->insuranceCode, 8);
        Model::validateMaxLength('productCode', $this->productCode, 2);
        Model::validateMaxLength('relatedOderNo', $this->relatedOderNo, 256);
        Model::validateMaxLength('destCountry', $this->destCountry, 256);
        Model::validateMaxLength('businessMerchantId', $this->businessMerchantId, 256);
        Model::validateMaxLength('collectionTime', $this->collectionTime, 50);
        Model::validateMaxLength('goodName', $this->goodName, 200);
        Model::validateMaxLength('goodValue', $this->goodValue, 50);
        Model::validateMinLength('businessId', $this->businessId, 0);
        Model::validateMinLength('relatedOderNo', $this->relatedOderNo, 2);
        Model::validateMinLength('destCountry', $this->destCountry, 2);
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('insuranceStart', $this->insuranceStart, true);
        Model::validateRequired('deliveryTime', $this->deliveryTime, true);
        Model::validateRequired('relatedOderNo', $this->relatedOderNo, true);
        Model::validateRequired('destCountry', $this->destCountry, true);
        Model::validatePattern('insuranceStart', $this->insuranceStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('deliveryTime', $this->deliveryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->insuranceStart) {
            $res['insurance_start'] = $this->insuranceStart;
        }
        if (null !== $this->deliveryTime) {
            $res['delivery_time'] = $this->deliveryTime;
        }
        if (null !== $this->relatedOderNo) {
            $res['related_oder_no'] = $this->relatedOderNo;
        }
        if (null !== $this->destCountry) {
            $res['dest_country'] = $this->destCountry;
        }
        if (null !== $this->businessMerchantId) {
            $res['business_merchant_id'] = $this->businessMerchantId;
        }
        if (null !== $this->collectionTime) {
            $res['collection_time'] = $this->collectionTime;
        }
        if (null !== $this->goodName) {
            $res['good_name'] = $this->goodName;
        }
        if (null !== $this->goodValue) {
            $res['good_value'] = $this->goodValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceCbrfRequest
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
        if (isset($map['insurance_start'])) {
            $model->insuranceStart = $map['insurance_start'];
        }
        if (isset($map['delivery_time'])) {
            $model->deliveryTime = $map['delivery_time'];
        }
        if (isset($map['related_oder_no'])) {
            $model->relatedOderNo = $map['related_oder_no'];
        }
        if (isset($map['dest_country'])) {
            $model->destCountry = $map['dest_country'];
        }
        if (isset($map['business_merchant_id'])) {
            $model->businessMerchantId = $map['business_merchant_id'];
        }
        if (isset($map['collection_time'])) {
            $model->collectionTime = $map['collection_time'];
        }
        if (isset($map['good_name'])) {
            $model->goodName = $map['good_name'];
        }
        if (isset($map['good_value'])) {
            $model->goodValue = $map['good_value'];
        }

        return $model;
    }
}
