<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class ActivityRecordVO extends Model
{
    // 捐赠类型
    /**
     * @example point
     *
     * @var string
     */
    public $donateType;

    // 捐赠详细（如：积分、金币、豆子）
    /**
     * @example 积分
     *
     * @var string
     */
    public $donateGoodsName;

    // 数量
    /**
     * @example 9999
     *
     * @var int
     */
    public $amount;

    // 单位
    /**
     * @example 个
     *
     * @var string
     */
    public $unit;

    // 捐赠时间
    /**
     * @example 1660629734503
     *
     * @var int
     */
    public $donateTime;
    protected $_name = [
        'donateType'      => 'donate_type',
        'donateGoodsName' => 'donate_goods_name',
        'amount'          => 'amount',
        'unit'            => 'unit',
        'donateTime'      => 'donate_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->donateType) {
            $res['donate_type'] = $this->donateType;
        }
        if (null !== $this->donateGoodsName) {
            $res['donate_goods_name'] = $this->donateGoodsName;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->donateTime) {
            $res['donate_time'] = $this->donateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActivityRecordVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['donate_type'])) {
            $model->donateType = $map['donate_type'];
        }
        if (isset($map['donate_goods_name'])) {
            $model->donateGoodsName = $map['donate_goods_name'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['donate_time'])) {
            $model->donateTime = $map['donate_time'];
        }

        return $model;
    }
}
