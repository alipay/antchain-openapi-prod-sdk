<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class OrderByParams extends Model
{
    // 排序字段
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $orderName;

    // asc 正序  desc 倒序
    /**
     * @example asc
     *
     * @var string
     */
    public $orderType;
    protected $_name = [
        'orderName' => 'order_name',
        'orderType' => 'order_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderName', $this->orderName, true);
        Model::validateRequired('orderType', $this->orderType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderName) {
            $res['order_name'] = $this->orderName;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderByParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_name'])) {
            $model->orderName = $map['order_name'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }

        return $model;
    }
}
