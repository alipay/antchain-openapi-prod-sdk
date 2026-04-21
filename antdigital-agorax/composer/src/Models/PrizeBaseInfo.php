<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class PrizeBaseInfo extends Model
{
    // 奖品ID
    /**
     * @example 110000199001011234
     *
     * @var string
     */
    public $prizeId;

    // 奖品名称
    /**
     * @example xx面馆
     *
     * @var string
     */
    public $prizeName;

    // 奖品类型
    /**
     * @example VIRTUAL_PRIZE
     *
     * @var string
     */
    public $prizeType;

    // 奖品状态
    /**
     * @example PRIZE_CREATED
     *
     * @var string
     */
    public $prizeStatus;

    // 预算金额
    /**
     * @example 354.22
     *
     * @var int
     */
    public $budgetAmount;
    protected $_name = [
        'prizeId'      => 'prize_id',
        'prizeName'    => 'prize_name',
        'prizeType'    => 'prize_type',
        'prizeStatus'  => 'prize_status',
        'budgetAmount' => 'budget_amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->prizeId) {
            $res['prize_id'] = $this->prizeId;
        }
        if (null !== $this->prizeName) {
            $res['prize_name'] = $this->prizeName;
        }
        if (null !== $this->prizeType) {
            $res['prize_type'] = $this->prizeType;
        }
        if (null !== $this->prizeStatus) {
            $res['prize_status'] = $this->prizeStatus;
        }
        if (null !== $this->budgetAmount) {
            $res['budget_amount'] = $this->budgetAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PrizeBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['prize_id'])) {
            $model->prizeId = $map['prize_id'];
        }
        if (isset($map['prize_name'])) {
            $model->prizeName = $map['prize_name'];
        }
        if (isset($map['prize_type'])) {
            $model->prizeType = $map['prize_type'];
        }
        if (isset($map['prize_status'])) {
            $model->prizeStatus = $map['prize_status'];
        }
        if (isset($map['budget_amount'])) {
            $model->budgetAmount = $map['budget_amount'];
        }

        return $model;
    }
}
