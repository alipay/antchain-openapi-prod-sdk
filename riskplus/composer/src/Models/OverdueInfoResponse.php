<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class OverdueInfoResponse extends Model
{
    // 逾期标识
    // true：逾期
    // false：未逾期
    /**
     * @example true
     *
     * @var bool
     */
    public $overDueFlag;

    // 逾期天数
    /**
     * @example 50
     *
     * @var int
     */
    public $dpd;

    // 价值逾期天枢
    /**
     * @example 50
     *
     * @var int
     */
    public $cpd;

    // 应还总额
    /**
     * @example 1000
     *
     * @var int
     */
    public $needAmount;

    // 总剩余应还
    /**
     * @example 1000
     *
     * @var int
     */
    public $totalAmount;
    protected $_name = [
        'overDueFlag' => 'over_due_flag',
        'dpd'         => 'dpd',
        'cpd'         => 'cpd',
        'needAmount'  => 'need_amount',
        'totalAmount' => 'total_amount',
    ];

    public function validate()
    {
        Model::validateRequired('overDueFlag', $this->overDueFlag, true);
        Model::validateRequired('dpd', $this->dpd, true);
        Model::validateRequired('cpd', $this->cpd, true);
        Model::validateRequired('needAmount', $this->needAmount, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->overDueFlag) {
            $res['over_due_flag'] = $this->overDueFlag;
        }
        if (null !== $this->dpd) {
            $res['dpd'] = $this->dpd;
        }
        if (null !== $this->cpd) {
            $res['cpd'] = $this->cpd;
        }
        if (null !== $this->needAmount) {
            $res['need_amount'] = $this->needAmount;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OverdueInfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['over_due_flag'])) {
            $model->overDueFlag = $map['over_due_flag'];
        }
        if (isset($map['dpd'])) {
            $model->dpd = $map['dpd'];
        }
        if (isset($map['cpd'])) {
            $model->cpd = $map['cpd'];
        }
        if (isset($map['need_amount'])) {
            $model->needAmount = $map['need_amount'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
