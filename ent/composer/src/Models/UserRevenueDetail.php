<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class UserRevenueDetail extends Model
{
    // 累计收益
    /**
     * @example
     *
     * @var Revenue
     */
    public $accumulativeRevenue;

    // 待发放粉丝粒数量，单位分个。
    /**
     * @example 100
     *
     * @var int
     */
    public $pendingTokenAmount;

    // 作品名称
    /**
     * @example 玩具总动员
     *
     * @var string
     */
    public $projectName;

    // 可兑现粉丝粒数量，单位分个。
    /**
     * @example 20
     *
     * @var int
     */
    public $redeemableTokenAmount;

    // 已兑现粉丝粒数量，单位分个
    /**
     * @example 12
     *
     * @var int
     */
    public $redeemedTokenAmount;

    // 已发放粉丝粒数量，单位分个。
    /**
     * @example 100
     *
     * @var int
     */
    public $releasedTokenAmount;

    // 粉丝粒单价，单位分
    /**
     * @example 61
     *
     * @var int
     */
    public $tokenPrice;

    // 可零收益
    /**
     * @example
     *
     * @var Revenue
     */
    public $withdrawRevenue;
    protected $_name = [
        'accumulativeRevenue'   => 'accumulative_revenue',
        'pendingTokenAmount'    => 'pending_token_amount',
        'projectName'           => 'project_name',
        'redeemableTokenAmount' => 'redeemable_token_amount',
        'redeemedTokenAmount'   => 'redeemed_token_amount',
        'releasedTokenAmount'   => 'released_token_amount',
        'tokenPrice'            => 'token_price',
        'withdrawRevenue'       => 'withdraw_revenue',
    ];

    public function validate()
    {
        Model::validateRequired('accumulativeRevenue', $this->accumulativeRevenue, true);
        Model::validateRequired('pendingTokenAmount', $this->pendingTokenAmount, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('redeemableTokenAmount', $this->redeemableTokenAmount, true);
        Model::validateRequired('redeemedTokenAmount', $this->redeemedTokenAmount, true);
        Model::validateRequired('releasedTokenAmount', $this->releasedTokenAmount, true);
        Model::validateRequired('tokenPrice', $this->tokenPrice, true);
        Model::validateRequired('withdrawRevenue', $this->withdrawRevenue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accumulativeRevenue) {
            $res['accumulative_revenue'] = null !== $this->accumulativeRevenue ? $this->accumulativeRevenue->toMap() : null;
        }
        if (null !== $this->pendingTokenAmount) {
            $res['pending_token_amount'] = $this->pendingTokenAmount;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->redeemableTokenAmount) {
            $res['redeemable_token_amount'] = $this->redeemableTokenAmount;
        }
        if (null !== $this->redeemedTokenAmount) {
            $res['redeemed_token_amount'] = $this->redeemedTokenAmount;
        }
        if (null !== $this->releasedTokenAmount) {
            $res['released_token_amount'] = $this->releasedTokenAmount;
        }
        if (null !== $this->tokenPrice) {
            $res['token_price'] = $this->tokenPrice;
        }
        if (null !== $this->withdrawRevenue) {
            $res['withdraw_revenue'] = null !== $this->withdrawRevenue ? $this->withdrawRevenue->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserRevenueDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['accumulative_revenue'])) {
            $model->accumulativeRevenue = Revenue::fromMap($map['accumulative_revenue']);
        }
        if (isset($map['pending_token_amount'])) {
            $model->pendingTokenAmount = $map['pending_token_amount'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['redeemable_token_amount'])) {
            $model->redeemableTokenAmount = $map['redeemable_token_amount'];
        }
        if (isset($map['redeemed_token_amount'])) {
            $model->redeemedTokenAmount = $map['redeemed_token_amount'];
        }
        if (isset($map['released_token_amount'])) {
            $model->releasedTokenAmount = $map['released_token_amount'];
        }
        if (isset($map['token_price'])) {
            $model->tokenPrice = $map['token_price'];
        }
        if (isset($map['withdraw_revenue'])) {
            $model->withdrawRevenue = Revenue::fromMap($map['withdraw_revenue']);
        }

        return $model;
    }
}
