<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceOrderResult extends Model
{
    // 上链id
    /**
     * @example amdfgs
     *
     * @var string
     */
    public $antchainId;

    // 订单id
    /**
     * @example 34
     *
     * @var string
     */
    public $orderId;
    protected $_name = [
        'antchainId' => 'antchain_id',
        'orderId'    => 'order_id',
    ];

    public function validate()
    {
        Model::validateRequired('antchainId', $this->antchainId, true);
        Model::validateRequired('orderId', $this->orderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antchainId) {
            $res['antchain_id'] = $this->antchainId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceOrderResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['antchain_id'])) {
            $model->antchainId = $map['antchain_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }

        return $model;
    }
}
