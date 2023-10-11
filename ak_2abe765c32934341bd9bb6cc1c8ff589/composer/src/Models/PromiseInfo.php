<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class PromiseInfo extends Model
{
    // 订单 id
    /**
     * @example order_v1_test_0918_001
     *
     * @var string
     */
    public $orderId;

    // 宽限期，精确到 毫秒，产生罚息的延迟时间范围。
    /**
     * @example 1000
     *
     * @var int
     */
    public $dateLimit;

    // 应付租金时间，格式为 2019-08-31 12:00:00
    // yyyy-MM-dd HH:mm:ss
    /**
     * @example [_2019-08-31 12:00:00_, _2019-08-31 12:00:00_]
     *
     * @var string[]
     */
    public $payDateList;

    // 租期
    /**
     * @example 12
     *
     * @var int
     */
    public $payPeriod;

    // 应付租金，精确到分，即 1234 表示 12.34 元
    /**
     * @example [1234, 1234]
     *
     * @var int[]
     */
    public $payMoneyList;

    // 租赁公司支付宝 UID
    /**
     * @example 2088******
     *
     * @var string
     */
    public $leaseAlipayUid;
    protected $_name = [
        'orderId'        => 'order_id',
        'dateLimit'      => 'date_limit',
        'payDateList'    => 'pay_date_list',
        'payPeriod'      => 'pay_period',
        'payMoneyList'   => 'pay_money_list',
        'leaseAlipayUid' => 'lease_alipay_uid',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('dateLimit', $this->dateLimit, true);
        Model::validateRequired('payDateList', $this->payDateList, true);
        Model::validateRequired('payPeriod', $this->payPeriod, true);
        Model::validateRequired('payMoneyList', $this->payMoneyList, true);
        Model::validateRequired('leaseAlipayUid', $this->leaseAlipayUid, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('leaseAlipayUid', $this->leaseAlipayUid, 50);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('leaseAlipayUid', $this->leaseAlipayUid, 1);
        Model::validateMinimum('dateLimit', $this->dateLimit, 0);
        Model::validateMinimum('payPeriod', $this->payPeriod, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->dateLimit) {
            $res['date_limit'] = $this->dateLimit;
        }
        if (null !== $this->payDateList) {
            $res['pay_date_list'] = $this->payDateList;
        }
        if (null !== $this->payPeriod) {
            $res['pay_period'] = $this->payPeriod;
        }
        if (null !== $this->payMoneyList) {
            $res['pay_money_list'] = $this->payMoneyList;
        }
        if (null !== $this->leaseAlipayUid) {
            $res['lease_alipay_uid'] = $this->leaseAlipayUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PromiseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['date_limit'])) {
            $model->dateLimit = $map['date_limit'];
        }
        if (isset($map['pay_date_list'])) {
            if (!empty($map['pay_date_list'])) {
                $model->payDateList = $map['pay_date_list'];
            }
        }
        if (isset($map['pay_period'])) {
            $model->payPeriod = $map['pay_period'];
        }
        if (isset($map['pay_money_list'])) {
            if (!empty($map['pay_money_list'])) {
                $model->payMoneyList = $map['pay_money_list'];
            }
        }
        if (isset($map['lease_alipay_uid'])) {
            $model->leaseAlipayUid = $map['lease_alipay_uid'];
        }

        return $model;
    }
}
