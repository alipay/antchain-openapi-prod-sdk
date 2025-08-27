<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderLogisticInfo extends Model
{
    // 物流单号
    /**
     * @example xxx
     *
     * @var string
     */
    public $logisticOrderId;

    // 物流状态
    /**
     * @example 1
     *
     * @var string
     */
    public $logisticStatus;
    protected $_name = [
        'logisticOrderId' => 'logistic_order_id',
        'logisticStatus'  => 'logistic_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->logisticOrderId) {
            $res['logistic_order_id'] = $this->logisticOrderId;
        }
        if (null !== $this->logisticStatus) {
            $res['logistic_status'] = $this->logisticStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderLogisticInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['logistic_order_id'])) {
            $model->logisticOrderId = $map['logistic_order_id'];
        }
        if (isset($map['logistic_status'])) {
            $model->logisticStatus = $map['logistic_status'];
        }

        return $model;
    }
}
