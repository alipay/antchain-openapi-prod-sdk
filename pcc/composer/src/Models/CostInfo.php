<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class CostInfo extends Model
{
    // 成本法原因
    /**
     * @example test
     *
     * @var string
     */
    public $costReason;

    // 预期毛利率
    /**
     * @example test
     *
     * @var string
     */
    public $predictProfit;
    protected $_name = [
        'costReason'    => 'cost_reason',
        'predictProfit' => 'predict_profit',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->costReason) {
            $res['cost_reason'] = $this->costReason;
        }
        if (null !== $this->predictProfit) {
            $res['predict_profit'] = $this->predictProfit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CostInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cost_reason'])) {
            $model->costReason = $map['cost_reason'];
        }
        if (isset($map['predict_profit'])) {
            $model->predictProfit = $map['predict_profit'];
        }

        return $model;
    }
}
