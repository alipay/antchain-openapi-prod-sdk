<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class GetConsumecardOrderwithdrawresultResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 提现任务期望提现的金额(单位:元,精确到分)
    /**
     * @var string
     */
    public $expectedWithdrawAmount;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 需要审批后才能提现的交易订单数量
    /**
     * @var int
     */
    public $withdrawApprovalOrderCount;

    // 提现单编号
    /**
     * @var string
     */
    public $withdrawBizId;

    // 提现成功的总金额(单位:元,精确到分)
    /**
     * @var string
     */
    public $withdrawTotalAmount;

    // 提现成功的总笔数
    /**
     * @var int
     */
    public $withdrawTotalCount;
    protected $_name = [
        'reqMsgId'                   => 'req_msg_id',
        'resultCode'                 => 'result_code',
        'resultMsg'                  => 'result_msg',
        'expectedWithdrawAmount'     => 'expected_withdraw_amount',
        'status'                     => 'status',
        'withdrawApprovalOrderCount' => 'withdraw_approval_order_count',
        'withdrawBizId'              => 'withdraw_biz_id',
        'withdrawTotalAmount'        => 'withdraw_total_amount',
        'withdrawTotalCount'         => 'withdraw_total_count',
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
        if (null !== $this->expectedWithdrawAmount) {
            $res['expected_withdraw_amount'] = $this->expectedWithdrawAmount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->withdrawApprovalOrderCount) {
            $res['withdraw_approval_order_count'] = $this->withdrawApprovalOrderCount;
        }
        if (null !== $this->withdrawBizId) {
            $res['withdraw_biz_id'] = $this->withdrawBizId;
        }
        if (null !== $this->withdrawTotalAmount) {
            $res['withdraw_total_amount'] = $this->withdrawTotalAmount;
        }
        if (null !== $this->withdrawTotalCount) {
            $res['withdraw_total_count'] = $this->withdrawTotalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetConsumecardOrderwithdrawresultResponse
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
        if (isset($map['expected_withdraw_amount'])) {
            $model->expectedWithdrawAmount = $map['expected_withdraw_amount'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['withdraw_approval_order_count'])) {
            $model->withdrawApprovalOrderCount = $map['withdraw_approval_order_count'];
        }
        if (isset($map['withdraw_biz_id'])) {
            $model->withdrawBizId = $map['withdraw_biz_id'];
        }
        if (isset($map['withdraw_total_amount'])) {
            $model->withdrawTotalAmount = $map['withdraw_total_amount'];
        }
        if (isset($map['withdraw_total_count'])) {
            $model->withdrawTotalCount = $map['withdraw_total_count'];
        }

        return $model;
    }
}
