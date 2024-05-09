<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerMeterforagsignRequest extends Model
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

    // 商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 计量上报Code
    /**
     * @var string
     */
    public $meterProductCode;

    // 系统名字
    /**
     * @var string
     */
    public $sysName;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 合同编号
    /**
     * @var string
     */
    public $signNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantTenantId'  => 'merchant_tenant_id',
        'merchantId'        => 'merchant_id',
        'meterProductCode'  => 'meter_product_code',
        'sysName'           => 'sys_name',
        'orderId'           => 'order_id',
        'signNo'            => 'sign_no',
    ];

    public function validate()
    {
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('meterProductCode', $this->meterProductCode, true);
        Model::validateRequired('sysName', $this->sysName, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('signNo', $this->signNo, true);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 32);
        Model::validateMaxLength('merchantId', $this->merchantId, 199);
        Model::validateMaxLength('meterProductCode', $this->meterProductCode, 64);
        Model::validateMaxLength('sysName', $this->sysName, 32);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('signNo', $this->signNo, 64);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('meterProductCode', $this->meterProductCode, 1);
        Model::validateMinLength('sysName', $this->sysName, 1);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('signNo', $this->signNo, 1);
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
        if (null !== $this->sysName) {
            $res['sys_name'] = $this->sysName;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerMeterforagsignRequest
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
        if (isset($map['sys_name'])) {
            $model->sysName = $map['sys_name'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }

        return $model;
    }
}
