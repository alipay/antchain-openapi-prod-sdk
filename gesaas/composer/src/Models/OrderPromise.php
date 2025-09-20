<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OrderPromise extends Model
{
    // 宽限期/天
    // 不传默认为0
    /**
     * @example 1233
     *
     * @var int
     */
    public $gracePeriodDays;

    // 罚息类型
    // NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
    /**
     * @example NONE
     *
     * @var string
     */
    public $punishmentType;

    // 租期
    // 租期最小值为1
    /**
     * @example 11
     *
     * @var int
     */
    public $payPeriod;

    // 租赁公司支付宝UID
    /**
     * @example 2088Id
     *
     * @var string
     */
    public $leaseAlipayUid;

    // 还款策略
    // repayStrategyList长度 == payPeriod
    /**
     * @example
     *
     * @var RepayStrategy[]
     */
    public $repayStrategyList;
    protected $_name = [
        'gracePeriodDays'   => 'grace_period_days',
        'punishmentType'    => 'punishment_type',
        'payPeriod'         => 'pay_period',
        'leaseAlipayUid'    => 'lease_alipay_uid',
        'repayStrategyList' => 'repay_strategy_list',
    ];

    public function validate()
    {
        Model::validateRequired('punishmentType', $this->punishmentType, true);
        Model::validateRequired('payPeriod', $this->payPeriod, true);
        Model::validateRequired('leaseAlipayUid', $this->leaseAlipayUid, true);
        Model::validateRequired('repayStrategyList', $this->repayStrategyList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gracePeriodDays) {
            $res['grace_period_days'] = $this->gracePeriodDays;
        }
        if (null !== $this->punishmentType) {
            $res['punishment_type'] = $this->punishmentType;
        }
        if (null !== $this->payPeriod) {
            $res['pay_period'] = $this->payPeriod;
        }
        if (null !== $this->leaseAlipayUid) {
            $res['lease_alipay_uid'] = $this->leaseAlipayUid;
        }
        if (null !== $this->repayStrategyList) {
            $res['repay_strategy_list'] = [];
            if (null !== $this->repayStrategyList && \is_array($this->repayStrategyList)) {
                $n = 0;
                foreach ($this->repayStrategyList as $item) {
                    $res['repay_strategy_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderPromise
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['grace_period_days'])) {
            $model->gracePeriodDays = $map['grace_period_days'];
        }
        if (isset($map['punishment_type'])) {
            $model->punishmentType = $map['punishment_type'];
        }
        if (isset($map['pay_period'])) {
            $model->payPeriod = $map['pay_period'];
        }
        if (isset($map['lease_alipay_uid'])) {
            $model->leaseAlipayUid = $map['lease_alipay_uid'];
        }
        if (isset($map['repay_strategy_list'])) {
            if (!empty($map['repay_strategy_list'])) {
                $model->repayStrategyList = [];
                $n                        = 0;
                foreach ($map['repay_strategy_list'] as $item) {
                    $model->repayStrategyList[$n++] = null !== $item ? RepayStrategy::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
