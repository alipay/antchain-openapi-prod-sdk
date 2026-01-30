<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class ProvisionOption extends Model
{
    // 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
    /**
     * @example 2025-08-22T07:05:49.441Z
     *
     * @var string
     */
    public $orderStartTime;
    protected $_name = [
        'orderStartTime' => 'order_start_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderStartTime) {
            $res['order_start_time'] = $this->orderStartTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProvisionOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_start_time'])) {
            $model->orderStartTime = $map['order_start_time'];
        }

        return $model;
    }
}
