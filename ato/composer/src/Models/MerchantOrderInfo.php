<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantOrderInfo extends Model
{
    // 支付宝代扣协议号
    /**
     * @example 20241025944255332
     *
     * @var string
     */
    public $agreementNo;

    // 订单id
    /**
     * @example SH20241017184159846222
     *
     * @var string
     */
    public $orderId;

    // 订单创建时间
    /**
     * @example 2024-10-17 18:41:59.000
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
    public $rentRerm;

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
        'agreementNo'     => 'agreement_no',
        'orderId'         => 'order_id',
        'orderCreateTime' => 'order_create_time',
        'totalRentMoney'  => 'total_rent_money',
        'rentRerm'        => 'rent_rerm',
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
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->rentRerm) {
            $res['rent_rerm'] = $this->rentRerm;
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
     * @return MerchantOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['rent_rerm'])) {
            $model->rentRerm = $map['rent_rerm'];
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
