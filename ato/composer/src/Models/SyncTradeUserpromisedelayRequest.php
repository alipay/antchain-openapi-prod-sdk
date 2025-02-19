<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncTradeUserpromisedelayRequest extends Model
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

    // order_id
    /**
     * @var string
     */
    public $orderId;

    // merchant_id
    /**
     * @var string
     */
    public $merchantId;

    // 1
    /**
     * @var int
     */
    public $delayStartPeriod;

    // 延期时间单位
    /**
     * @var string
     */
    public $delayTimeUnit;

    // 延期时间数值
    /**
     * @var int
     */
    public $delayTimeValue;

    // 原因描述
    /**
     * @var string
     */
    public $reason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'delayStartPeriod'  => 'delay_start_period',
        'delayTimeUnit'     => 'delay_time_unit',
        'delayTimeValue'    => 'delay_time_value',
        'reason'            => 'reason',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('delayStartPeriod', $this->delayStartPeriod, true);
        Model::validateRequired('delayTimeUnit', $this->delayTimeUnit, true);
        Model::validateRequired('delayTimeValue', $this->delayTimeValue, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('delayTimeUnit', $this->delayTimeUnit, 1);
        Model::validateMinLength('reason', $this->reason, 1);
        Model::validateMinimum('delayStartPeriod', $this->delayStartPeriod, 1);
        Model::validateMinimum('delayTimeValue', $this->delayTimeValue, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->delayStartPeriod) {
            $res['delay_start_period'] = $this->delayStartPeriod;
        }
        if (null !== $this->delayTimeUnit) {
            $res['delay_time_unit'] = $this->delayTimeUnit;
        }
        if (null !== $this->delayTimeValue) {
            $res['delay_time_value'] = $this->delayTimeValue;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncTradeUserpromisedelayRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['delay_start_period'])) {
            $model->delayStartPeriod = $map['delay_start_period'];
        }
        if (isset($map['delay_time_unit'])) {
            $model->delayTimeUnit = $map['delay_time_unit'];
        }
        if (isset($map['delay_time_value'])) {
            $model->delayTimeValue = $map['delay_time_value'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }

        return $model;
    }
}
