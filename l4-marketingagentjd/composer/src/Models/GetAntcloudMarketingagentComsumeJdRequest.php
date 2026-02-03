<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENTJD\Models;

use AlibabaCloud\Tea\Model;

class GetAntcloudMarketingagentComsumeJdRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 券ID
    /**
     * @var string
     */
    public $couponId;

    // 券状态
    // UNUSED_=未使用
    // _USED_ 已使用
    // _EXPIRED_ 过期
    /**
     * @var string
     */
    public $prizeStatus;

    // 使用时间
    // 时间格式“yyyy-mm-dd
    // hh:mm:ss”
    /**
     * @var string
     */
    public $consumeTime;

    // 回传类型
    // _1_-实时 ‘_2_-批量
    /**
     * @var int
     */
    public $writeOffType;

    // 银行流水号
    /**
     * @var string
     */
    public $bankFlowNo;

    // 交易订单号
    /**
     * @var string
     */
    public $transactionId;

    // 交易金额(分)
    /**
     * @var int
     */
    public $tradeAmount;

    // 消耗商户号（本期不传）
    /**
     * @var string
     */
    public $merchantNo;
    protected $_name = [
        'authToken'     => 'auth_token',
        'projectId'     => 'project_id',
        'userId'        => 'user_id',
        'couponId'      => 'coupon_id',
        'prizeStatus'   => 'prize_status',
        'consumeTime'   => 'consume_time',
        'writeOffType'  => 'write_off_type',
        'bankFlowNo'    => 'bank_flow_no',
        'transactionId' => 'transaction_id',
        'tradeAmount'   => 'trade_amount',
        'merchantNo'    => 'merchant_no',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('couponId', $this->couponId, true);
        Model::validateRequired('prizeStatus', $this->prizeStatus, true);
        Model::validateRequired('consumeTime', $this->consumeTime, true);
        Model::validateRequired('writeOffType', $this->writeOffType, true);
        Model::validateRequired('bankFlowNo', $this->bankFlowNo, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('tradeAmount', $this->tradeAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->prizeStatus) {
            $res['prize_status'] = $this->prizeStatus;
        }
        if (null !== $this->consumeTime) {
            $res['consume_time'] = $this->consumeTime;
        }
        if (null !== $this->writeOffType) {
            $res['write_off_type'] = $this->writeOffType;
        }
        if (null !== $this->bankFlowNo) {
            $res['bank_flow_no'] = $this->bankFlowNo;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->tradeAmount) {
            $res['trade_amount'] = $this->tradeAmount;
        }
        if (null !== $this->merchantNo) {
            $res['merchant_no'] = $this->merchantNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntcloudMarketingagentComsumeJdRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }
        if (isset($map['prize_status'])) {
            $model->prizeStatus = $map['prize_status'];
        }
        if (isset($map['consume_time'])) {
            $model->consumeTime = $map['consume_time'];
        }
        if (isset($map['write_off_type'])) {
            $model->writeOffType = $map['write_off_type'];
        }
        if (isset($map['bank_flow_no'])) {
            $model->bankFlowNo = $map['bank_flow_no'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['trade_amount'])) {
            $model->tradeAmount = $map['trade_amount'];
        }
        if (isset($map['merchant_no'])) {
            $model->merchantNo = $map['merchant_no'];
        }

        return $model;
    }
}
