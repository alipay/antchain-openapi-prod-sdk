<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderSearchInfo extends Model
{
    // 订单id
    /**
     * @example SH20241017184159846222
     *
     * @var string
     */
    public $orderId;

    // 支付宝代扣协议号
    /**
     * @example 20241025944255332
     *
     * @var string
     */
    public $agreementNo;

    // 订单创建时间
    /**
     * @example 2024-10-17 18:41:59
     *
     * @var string
     */
    public $orderCreateTime;

    // 租金总额（单位分）
    /**
     * @example 3500
     *
     * @var int
     */
    public $totalRentMoney;

    // 租期
    /**
     * @example 12
     *
     * @var int
     */
    public $rentTerm;

    // 租期单位
    /**
     * @example MONTH
     *
     * @var string
     */
    public $rentUnit;

    // 订单状态
    /**
     * @example OPEN
     *
     * @var string
     */
    public $orderStatus;

    // 承租人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 承租人手机号
    /**
     * @example 12345678912
     *
     * @var string
     */
    public $userPhoneNumber;
    protected $_name = [
        'orderId'         => 'order_id',
        'agreementNo'     => 'agreement_no',
        'orderCreateTime' => 'order_create_time',
        'totalRentMoney'  => 'total_rent_money',
        'rentTerm'        => 'rent_term',
        'rentUnit'        => 'rent_unit',
        'orderStatus'     => 'order_status',
        'userName'        => 'user_name',
        'userPhoneNumber' => 'user_phone_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->rentUnit) {
            $res['rent_unit'] = $this->rentUnit;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderSearchInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['rent_unit'])) {
            $model->rentUnit = $map['rent_unit'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_phone_number'])) {
            $model->userPhoneNumber = $map['user_phone_number'];
        }

        return $model;
    }
}
