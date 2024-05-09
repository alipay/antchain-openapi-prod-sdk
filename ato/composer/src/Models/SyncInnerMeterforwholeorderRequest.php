<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerMeterforwholeorderRequest extends Model
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

    // 商户租户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 商户统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商户购买的产品code
    /**
     * @var string
     */
    public $meterProductCode;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单关联的商品id
    /**
     * @var string
     */
    public $orderProductId;

    // 商品的版本
    /**
     * @var string
     */
    public $orderProductVersion;

    // 订单总租期
    /**
     * @var int
     */
    public $orderRentTerm;

    // 订单总租金，单位为分
    /**
     * @var int
     */
    public $orderTotalMoney;

    // 系统名称
    /**
     * @var string
     */
    public $sysName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'merchantTenantId'    => 'merchant_tenant_id',
        'merchantId'          => 'merchant_id',
        'meterProductCode'    => 'meter_product_code',
        'orderId'             => 'order_id',
        'orderProductId'      => 'order_product_id',
        'orderProductVersion' => 'order_product_version',
        'orderRentTerm'       => 'order_rent_term',
        'orderTotalMoney'     => 'order_total_money',
        'sysName'             => 'sys_name',
    ];

    public function validate()
    {
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('meterProductCode', $this->meterProductCode, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderProductId', $this->orderProductId, true);
        Model::validateRequired('orderProductVersion', $this->orderProductVersion, true);
        Model::validateRequired('orderRentTerm', $this->orderRentTerm, true);
        Model::validateRequired('orderTotalMoney', $this->orderTotalMoney, true);
        Model::validateRequired('sysName', $this->sysName, true);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 32);
        Model::validateMaxLength('merchantId', $this->merchantId, 199);
        Model::validateMaxLength('meterProductCode', $this->meterProductCode, 64);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('orderProductId', $this->orderProductId, 32);
        Model::validateMaxLength('orderProductVersion', $this->orderProductVersion, 10);
        Model::validateMaxLength('sysName', $this->sysName, 32);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('meterProductCode', $this->meterProductCode, 1);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('orderProductId', $this->orderProductId, 1);
        Model::validateMinLength('orderProductVersion', $this->orderProductVersion, 1);
        Model::validateMinLength('sysName', $this->sysName, 1);
        Model::validateMaximum('orderRentTerm', $this->orderRentTerm, 200);
        Model::validateMinimum('orderRentTerm', $this->orderRentTerm, 1);
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
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->meterProductCode) {
            $res['meter_product_code'] = $this->meterProductCode;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderProductId) {
            $res['order_product_id'] = $this->orderProductId;
        }
        if (null !== $this->orderProductVersion) {
            $res['order_product_version'] = $this->orderProductVersion;
        }
        if (null !== $this->orderRentTerm) {
            $res['order_rent_term'] = $this->orderRentTerm;
        }
        if (null !== $this->orderTotalMoney) {
            $res['order_total_money'] = $this->orderTotalMoney;
        }
        if (null !== $this->sysName) {
            $res['sys_name'] = $this->sysName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerMeterforwholeorderRequest
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
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['meter_product_code'])) {
            $model->meterProductCode = $map['meter_product_code'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_product_id'])) {
            $model->orderProductId = $map['order_product_id'];
        }
        if (isset($map['order_product_version'])) {
            $model->orderProductVersion = $map['order_product_version'];
        }
        if (isset($map['order_rent_term'])) {
            $model->orderRentTerm = $map['order_rent_term'];
        }
        if (isset($map['order_total_money'])) {
            $model->orderTotalMoney = $map['order_total_money'];
        }
        if (isset($map['sys_name'])) {
            $model->sysName = $map['sys_name'];
        }

        return $model;
    }
}
