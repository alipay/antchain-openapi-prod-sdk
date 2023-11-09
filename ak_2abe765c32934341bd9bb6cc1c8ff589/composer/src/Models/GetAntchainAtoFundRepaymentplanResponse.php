<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class GetAntchainAtoFundRepaymentplanResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 租赁公司支付宝UID
    /**
     * @var string
     */
    public $leaseAlipayUid;

    // 宽限期，天
    /**
     * @var int
     */
    public $gracePeriodDays;

    // 还款策略列表
    /**
     * @var string
     */
    public $repayStrategyList;

    // 处罚策略
    // NONE : 没有处罚
    // PENALTY_FEE： 罚息
    /**
     * @var string
     */
    public $punishmentType;

    // 租期
    /**
     * @var int
     */
    public $payPeriod;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'orderId'           => 'order_id',
        'leaseAlipayUid'    => 'lease_alipay_uid',
        'gracePeriodDays'   => 'grace_period_days',
        'repayStrategyList' => 'repay_strategy_list',
        'punishmentType'    => 'punishment_type',
        'payPeriod'         => 'pay_period',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->leaseAlipayUid) {
            $res['lease_alipay_uid'] = $this->leaseAlipayUid;
        }
        if (null !== $this->gracePeriodDays) {
            $res['grace_period_days'] = $this->gracePeriodDays;
        }
        if (null !== $this->repayStrategyList) {
            $res['repay_strategy_list'] = $this->repayStrategyList;
        }
        if (null !== $this->punishmentType) {
            $res['punishment_type'] = $this->punishmentType;
        }
        if (null !== $this->payPeriod) {
            $res['pay_period'] = $this->payPeriod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntchainAtoFundRepaymentplanResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['lease_alipay_uid'])) {
            $model->leaseAlipayUid = $map['lease_alipay_uid'];
        }
        if (isset($map['grace_period_days'])) {
            $model->gracePeriodDays = $map['grace_period_days'];
        }
        if (isset($map['repay_strategy_list'])) {
            $model->repayStrategyList = $map['repay_strategy_list'];
        }
        if (isset($map['punishment_type'])) {
            $model->punishmentType = $map['punishment_type'];
        }
        if (isset($map['pay_period'])) {
            $model->payPeriod = $map['pay_period'];
        }

        return $model;
    }
}
