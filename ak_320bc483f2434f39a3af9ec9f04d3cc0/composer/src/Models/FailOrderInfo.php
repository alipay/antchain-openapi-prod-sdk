<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class FailOrderInfo extends Model
{
    // 退保失败订单号
    /**
     * @example 1311313
     *
     * @var string
     */
    public $orderNo;

    // 失败原因
    /**
     * @example 超出退保期限
     *
     * @var string
     */
    public $failReason;
    protected $_name = [
        'orderNo'    => 'order_no',
        'failReason' => 'fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('failReason', $this->failReason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FailOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
