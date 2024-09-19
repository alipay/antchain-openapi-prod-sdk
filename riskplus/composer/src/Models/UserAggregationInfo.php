<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UserAggregationInfo extends Model
{
    // 状态
    // 0: 未授信
    // 1: 授信中
    // 2: 已授信未支用
    // 3: 支用中
    // 4: 已支用
    // 5: 借据逾期
    // 6: 授信过期
    // 7: 授信冻结
    // 8: 可重新授信
    // 9: 授信拒绝
    /**
     * @example 0
     *
     * @var string
     */
    public $status;

    // 总额度
    /**
     * @example 100
     *
     * @var int
     */
    public $creditAmount;

    // 可用额度
    /**
     * @example 100
     *
     * @var int
     */
    public $availableAmount;

    // 待还总金额
    /**
     * @example 100
     *
     * @var int
     */
    public $shouldPayAmount;

    // 逾期总金额
    /**
     * @example
     *
     * @var int
     */
    public $overdueAmount;

    // 下一期应还金额
    /**
     * @example
     *
     * @var int
     */
    public $nextPeriodAmount;

    // 下一期还款时间yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $nextPeriodRepayTime;

    // 下次可授信时间yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $nextApplyTime;

    // 优惠券列表
    /**
     * @example
     *
     * @var CouponInfo[]
     */
    public $couponList;
    protected $_name = [
        'status'              => 'status',
        'creditAmount'        => 'credit_amount',
        'availableAmount'     => 'available_amount',
        'shouldPayAmount'     => 'should_pay_amount',
        'overdueAmount'       => 'overdue_amount',
        'nextPeriodAmount'    => 'next_period_amount',
        'nextPeriodRepayTime' => 'next_period_repay_time',
        'nextApplyTime'       => 'next_apply_time',
        'couponList'          => 'coupon_list',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->availableAmount) {
            $res['available_amount'] = $this->availableAmount;
        }
        if (null !== $this->shouldPayAmount) {
            $res['should_pay_amount'] = $this->shouldPayAmount;
        }
        if (null !== $this->overdueAmount) {
            $res['overdue_amount'] = $this->overdueAmount;
        }
        if (null !== $this->nextPeriodAmount) {
            $res['next_period_amount'] = $this->nextPeriodAmount;
        }
        if (null !== $this->nextPeriodRepayTime) {
            $res['next_period_repay_time'] = $this->nextPeriodRepayTime;
        }
        if (null !== $this->nextApplyTime) {
            $res['next_apply_time'] = $this->nextApplyTime;
        }
        if (null !== $this->couponList) {
            $res['coupon_list'] = [];
            if (null !== $this->couponList && \is_array($this->couponList)) {
                $n = 0;
                foreach ($this->couponList as $item) {
                    $res['coupon_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserAggregationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['available_amount'])) {
            $model->availableAmount = $map['available_amount'];
        }
        if (isset($map['should_pay_amount'])) {
            $model->shouldPayAmount = $map['should_pay_amount'];
        }
        if (isset($map['overdue_amount'])) {
            $model->overdueAmount = $map['overdue_amount'];
        }
        if (isset($map['next_period_amount'])) {
            $model->nextPeriodAmount = $map['next_period_amount'];
        }
        if (isset($map['next_period_repay_time'])) {
            $model->nextPeriodRepayTime = $map['next_period_repay_time'];
        }
        if (isset($map['next_apply_time'])) {
            $model->nextApplyTime = $map['next_apply_time'];
        }
        if (isset($map['coupon_list'])) {
            if (!empty($map['coupon_list'])) {
                $model->couponList = [];
                $n                 = 0;
                foreach ($map['coupon_list'] as $item) {
                    $model->couponList[$n++] = null !== $item ? CouponInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
