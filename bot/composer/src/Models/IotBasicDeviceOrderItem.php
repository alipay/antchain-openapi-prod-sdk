<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceOrderItem extends Model
{
    // 蚂蚁链IoT平台设备唯一ID
    /**
     * @example 12321321
     *
     * @var string
     */
    public $deviceDid;

    // 设备唯一编号
    /**
     * @example 12321321
     *
     * @var string
     */
    public $deviceSn;

    // 设备金额，精确到小数后两位
    /**
     * @example 234.01
     *
     * @var string
     */
    public $paymentAmount;
    protected $_name = [
        'deviceDid'     => 'device_did',
        'deviceSn'      => 'device_sn',
        'paymentAmount' => 'payment_amount',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('paymentAmount', $this->paymentAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceOrderItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }

        return $model;
    }
}
