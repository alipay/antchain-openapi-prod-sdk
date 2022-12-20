<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceOrderFail extends Model
{
    // 订单id
    /**
     * @example 90
     *
     * @var string
     */
    public $orderId;

    // 设备did
    /**
     * @example asdfg
     *
     * @var string
     */
    public $deviceDid;

    // 返回code
    /**
     * @example Fail
     *
     * @var string
     */
    public $code;

    // 失败
    /**
     * @example 返回信息
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'orderId'   => 'order_id',
        'deviceDid' => 'device_did',
        'code'      => 'code',
        'message'   => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceOrderFail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
