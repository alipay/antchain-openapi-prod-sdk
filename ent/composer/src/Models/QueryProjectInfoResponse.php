<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryProjectInfoResponse extends Model
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

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 总粉丝粒数，单位分个
    /**
     * @var int
     */
    public $totalTokenAmount;

    // 未发放粉丝粒数，单位分个
    /**
     * @var int
     */
    public $remainingTokenAmount;

    // 已发放粉丝粒数，单位分个
    /**
     * @var int
     */
    public $releasedTokenAmount;

    // 已提现粉丝粒数，单位分个
    /**
     * @var int
     */
    public $redeemedTokenAmount;

    // 总资金金额，单位分
    /**
     * @var Money
     */
    public $totalPrizeAmount;

    // 未消耗资金金额，单位分
    /**
     * @var Money
     */
    public $unusedPrizeAmount;

    // 已消耗资金金额，单位分
    /**
     * @var Money
     */
    public $usedPrizeAmount;

    // 开始发放时间
    /**
     * @var string
     */
    public $allocationStartTime;

    // 停止发放时间
    /**
     * @var string
     */
    public $allocationEndTime;

    // 开始兑现时间
    /**
     * @var string
     */
    public $redeemStartTime;

    // 停止兑现时间
    /**
     * @var string
     */
    public $redeemEndTime;

    // 发放该项目粉丝粒的订单内票数总和
    /**
     * @var int
     */
    public $ticketNumber;

    // 当前粉丝粒单价，单位分
    /**
     * @var Money
     */
    public $currentTokenPrice;

    // 粉丝粒保底价格，单位分
    /**
     * @var Money
     */
    public $minTokenPrice;

    // 发放区间信息
    /**
     * @var Stage
     */
    public $currentStage;

    // 所有发放区间信息
    /**
     * @var Stage[]
     */
    public $allStages;

    // 项目参与用户数
    /**
     * @var int
     */
    public $projectUserNum;

    // 项目订单总数
    /**
     * @var int
     */
    public $projectOrderNum;

    // 项目已售商品总数
    /**
     * @var int
     */
    public $projectItemNum;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'projectName'          => 'project_name',
        'totalTokenAmount'     => 'total_token_amount',
        'remainingTokenAmount' => 'remaining_token_amount',
        'releasedTokenAmount'  => 'released_token_amount',
        'redeemedTokenAmount'  => 'redeemed_token_amount',
        'totalPrizeAmount'     => 'total_prize_amount',
        'unusedPrizeAmount'    => 'unused_prize_amount',
        'usedPrizeAmount'      => 'used_prize_amount',
        'allocationStartTime'  => 'allocation_start_time',
        'allocationEndTime'    => 'allocation_end_time',
        'redeemStartTime'      => 'redeem_start_time',
        'redeemEndTime'        => 'redeem_end_time',
        'ticketNumber'         => 'ticket_number',
        'currentTokenPrice'    => 'current_token_price',
        'minTokenPrice'        => 'min_token_price',
        'currentStage'         => 'current_stage',
        'allStages'            => 'all_stages',
        'projectUserNum'       => 'project_user_num',
        'projectOrderNum'      => 'project_order_num',
        'projectItemNum'       => 'project_item_num',
    ];

    public function validate()
    {
        Model::validatePattern('allocationStartTime', $this->allocationStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('allocationEndTime', $this->allocationEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('redeemStartTime', $this->redeemStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('redeemEndTime', $this->redeemEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->totalTokenAmount) {
            $res['total_token_amount'] = $this->totalTokenAmount;
        }
        if (null !== $this->remainingTokenAmount) {
            $res['remaining_token_amount'] = $this->remainingTokenAmount;
        }
        if (null !== $this->releasedTokenAmount) {
            $res['released_token_amount'] = $this->releasedTokenAmount;
        }
        if (null !== $this->redeemedTokenAmount) {
            $res['redeemed_token_amount'] = $this->redeemedTokenAmount;
        }
        if (null !== $this->totalPrizeAmount) {
            $res['total_prize_amount'] = null !== $this->totalPrizeAmount ? $this->totalPrizeAmount->toMap() : null;
        }
        if (null !== $this->unusedPrizeAmount) {
            $res['unused_prize_amount'] = null !== $this->unusedPrizeAmount ? $this->unusedPrizeAmount->toMap() : null;
        }
        if (null !== $this->usedPrizeAmount) {
            $res['used_prize_amount'] = null !== $this->usedPrizeAmount ? $this->usedPrizeAmount->toMap() : null;
        }
        if (null !== $this->allocationStartTime) {
            $res['allocation_start_time'] = $this->allocationStartTime;
        }
        if (null !== $this->allocationEndTime) {
            $res['allocation_end_time'] = $this->allocationEndTime;
        }
        if (null !== $this->redeemStartTime) {
            $res['redeem_start_time'] = $this->redeemStartTime;
        }
        if (null !== $this->redeemEndTime) {
            $res['redeem_end_time'] = $this->redeemEndTime;
        }
        if (null !== $this->ticketNumber) {
            $res['ticket_number'] = $this->ticketNumber;
        }
        if (null !== $this->currentTokenPrice) {
            $res['current_token_price'] = null !== $this->currentTokenPrice ? $this->currentTokenPrice->toMap() : null;
        }
        if (null !== $this->minTokenPrice) {
            $res['min_token_price'] = null !== $this->minTokenPrice ? $this->minTokenPrice->toMap() : null;
        }
        if (null !== $this->currentStage) {
            $res['current_stage'] = null !== $this->currentStage ? $this->currentStage->toMap() : null;
        }
        if (null !== $this->allStages) {
            $res['all_stages'] = [];
            if (null !== $this->allStages && \is_array($this->allStages)) {
                $n = 0;
                foreach ($this->allStages as $item) {
                    $res['all_stages'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->projectUserNum) {
            $res['project_user_num'] = $this->projectUserNum;
        }
        if (null !== $this->projectOrderNum) {
            $res['project_order_num'] = $this->projectOrderNum;
        }
        if (null !== $this->projectItemNum) {
            $res['project_item_num'] = $this->projectItemNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProjectInfoResponse
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
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['total_token_amount'])) {
            $model->totalTokenAmount = $map['total_token_amount'];
        }
        if (isset($map['remaining_token_amount'])) {
            $model->remainingTokenAmount = $map['remaining_token_amount'];
        }
        if (isset($map['released_token_amount'])) {
            $model->releasedTokenAmount = $map['released_token_amount'];
        }
        if (isset($map['redeemed_token_amount'])) {
            $model->redeemedTokenAmount = $map['redeemed_token_amount'];
        }
        if (isset($map['total_prize_amount'])) {
            $model->totalPrizeAmount = Money::fromMap($map['total_prize_amount']);
        }
        if (isset($map['unused_prize_amount'])) {
            $model->unusedPrizeAmount = Money::fromMap($map['unused_prize_amount']);
        }
        if (isset($map['used_prize_amount'])) {
            $model->usedPrizeAmount = Money::fromMap($map['used_prize_amount']);
        }
        if (isset($map['allocation_start_time'])) {
            $model->allocationStartTime = $map['allocation_start_time'];
        }
        if (isset($map['allocation_end_time'])) {
            $model->allocationEndTime = $map['allocation_end_time'];
        }
        if (isset($map['redeem_start_time'])) {
            $model->redeemStartTime = $map['redeem_start_time'];
        }
        if (isset($map['redeem_end_time'])) {
            $model->redeemEndTime = $map['redeem_end_time'];
        }
        if (isset($map['ticket_number'])) {
            $model->ticketNumber = $map['ticket_number'];
        }
        if (isset($map['current_token_price'])) {
            $model->currentTokenPrice = Money::fromMap($map['current_token_price']);
        }
        if (isset($map['min_token_price'])) {
            $model->minTokenPrice = Money::fromMap($map['min_token_price']);
        }
        if (isset($map['current_stage'])) {
            $model->currentStage = Stage::fromMap($map['current_stage']);
        }
        if (isset($map['all_stages'])) {
            if (!empty($map['all_stages'])) {
                $model->allStages = [];
                $n                = 0;
                foreach ($map['all_stages'] as $item) {
                    $model->allStages[$n++] = null !== $item ? Stage::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['project_user_num'])) {
            $model->projectUserNum = $map['project_user_num'];
        }
        if (isset($map['project_order_num'])) {
            $model->projectOrderNum = $map['project_order_num'];
        }
        if (isset($map['project_item_num'])) {
            $model->projectItemNum = $map['project_item_num'];
        }

        return $model;
    }
}
