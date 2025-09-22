<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OrderInfoReq extends Model
{
    // 订单创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $orderCreateTime;

    // 订单付款主题
    /**
     * @example 退订、续订,人工客服电话:4006476616商家订单号：
     *
     * @var string
     */
    public $orderPaySubject;

    // 总租期
    // 总租期最小值为1
    // 总租期最大值为60
    /**
     * @example 12
     *
     * @var int
     */
    public $rentTerm;

    // 租期单位
    // MONTH : 月
    // DAY : 天
    /**
     * @example MONTH
     *
     * @var string
     */
    public $rentUnit;

    // 租金总额 单位/分
    // 最小值为1
    /**
     * @example 1234
     *
     * @var int
     */
    public $totalRentMoney;
    protected $_name = [
        'orderCreateTime' => 'order_create_time',
        'orderPaySubject' => 'order_pay_subject',
        'rentTerm'        => 'rent_term',
        'rentUnit'        => 'rent_unit',
        'totalRentMoney'  => 'total_rent_money',
    ];

    public function validate()
    {
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('orderPaySubject', $this->orderPaySubject, true);
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('totalRentMoney', $this->totalRentMoney, true);
        Model::validatePattern('orderCreateTime', $this->orderCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->orderPaySubject) {
            $res['order_pay_subject'] = $this->orderPaySubject;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->rentUnit) {
            $res['rent_unit'] = $this->rentUnit;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderInfoReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['order_pay_subject'])) {
            $model->orderPaySubject = $map['order_pay_subject'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['rent_unit'])) {
            $model->rentUnit = $map['rent_unit'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }

        return $model;
    }
}
