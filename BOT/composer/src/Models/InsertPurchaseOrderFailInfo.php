<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class InsertPurchaseOrderFailInfo extends Model
{
    // 订单ID
    /**
     * @example safsafafafa
     *
     * @var string
     */
    public $orderId;

    // 订单保存失败的原因
    /**
     * @example fasfasfasfa
     *
     * @var string
     */
    public $failReason;
    protected $_name = [
        'orderId'    => 'order_id',
        'failReason' => 'fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('failReason', $this->failReason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsertPurchaseOrderFailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
