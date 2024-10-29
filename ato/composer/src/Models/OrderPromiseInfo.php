<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderPromiseInfo extends Model
{
    // 订单还款策略
    /**
     * @example
     *
     * @var OrderRepayStrategy[]
     */
    public $repayStrategyList;
    protected $_name = [
        'repayStrategyList' => 'repay_strategy_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
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
     * @return OrderPromiseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['repay_strategy_list'])) {
            if (!empty($map['repay_strategy_list'])) {
                $model->repayStrategyList = [];
                $n                        = 0;
                foreach ($map['repay_strategy_list'] as $item) {
                    $model->repayStrategyList[$n++] = null !== $item ? OrderRepayStrategy::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
