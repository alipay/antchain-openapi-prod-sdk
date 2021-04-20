<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryUserInfoResponse extends Model
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

    // 已获得粉丝粒总数，单位分个
    /**
     * @var int
     */
    public $gainedTokenAmount;

    // 当前粉丝粒持有数量，单位分个
    /**
     * @var int
     */
    public $currentTokenAmount;

    // 已兑现粉丝粒数量，单位分个
    /**
     * @var int
     */
    public $redeemedTokenAmount;

    // 累计获得奖金
    /**
     * @var Revenue
     */
    public $accumulativeRevenue;

    // 当前可兑奖金
    /**
     * @var Revenue
     */
    public $currentRevenue;

    // 已兑现奖金
    /**
     * @var Revenue
     */
    public $redeemedRevenue;

    // 自购商品数量
    /**
     * @var int
     */
    public $buyAmountFromSelf;

    // 分享购买商品数量
    /**
     * @var int
     */
    public $buyAmountFromShare;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'projectName'         => 'project_name',
        'gainedTokenAmount'   => 'gained_token_amount',
        'currentTokenAmount'  => 'current_token_amount',
        'redeemedTokenAmount' => 'redeemed_token_amount',
        'accumulativeRevenue' => 'accumulative_revenue',
        'currentRevenue'      => 'current_revenue',
        'redeemedRevenue'     => 'redeemed_revenue',
        'buyAmountFromSelf'   => 'buy_amount_from_self',
        'buyAmountFromShare'  => 'buy_amount_from_share',
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
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->gainedTokenAmount) {
            $res['gained_token_amount'] = $this->gainedTokenAmount;
        }
        if (null !== $this->currentTokenAmount) {
            $res['current_token_amount'] = $this->currentTokenAmount;
        }
        if (null !== $this->redeemedTokenAmount) {
            $res['redeemed_token_amount'] = $this->redeemedTokenAmount;
        }
        if (null !== $this->accumulativeRevenue) {
            $res['accumulative_revenue'] = null !== $this->accumulativeRevenue ? $this->accumulativeRevenue->toMap() : null;
        }
        if (null !== $this->currentRevenue) {
            $res['current_revenue'] = null !== $this->currentRevenue ? $this->currentRevenue->toMap() : null;
        }
        if (null !== $this->redeemedRevenue) {
            $res['redeemed_revenue'] = null !== $this->redeemedRevenue ? $this->redeemedRevenue->toMap() : null;
        }
        if (null !== $this->buyAmountFromSelf) {
            $res['buy_amount_from_self'] = $this->buyAmountFromSelf;
        }
        if (null !== $this->buyAmountFromShare) {
            $res['buy_amount_from_share'] = $this->buyAmountFromShare;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserInfoResponse
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
        if (isset($map['gained_token_amount'])) {
            $model->gainedTokenAmount = $map['gained_token_amount'];
        }
        if (isset($map['current_token_amount'])) {
            $model->currentTokenAmount = $map['current_token_amount'];
        }
        if (isset($map['redeemed_token_amount'])) {
            $model->redeemedTokenAmount = $map['redeemed_token_amount'];
        }
        if (isset($map['accumulative_revenue'])) {
            $model->accumulativeRevenue = Revenue::fromMap($map['accumulative_revenue']);
        }
        if (isset($map['current_revenue'])) {
            $model->currentRevenue = Revenue::fromMap($map['current_revenue']);
        }
        if (isset($map['redeemed_revenue'])) {
            $model->redeemedRevenue = Revenue::fromMap($map['redeemed_revenue']);
        }
        if (isset($map['buy_amount_from_self'])) {
            $model->buyAmountFromSelf = $map['buy_amount_from_self'];
        }
        if (isset($map['buy_amount_from_share'])) {
            $model->buyAmountFromShare = $map['buy_amount_from_share'];
        }

        return $model;
    }
}
