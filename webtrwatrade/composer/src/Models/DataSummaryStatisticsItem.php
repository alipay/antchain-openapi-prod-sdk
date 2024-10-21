<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class DataSummaryStatisticsItem extends Model
{
    // 日期
    /**
     * @example 2024-01-01
     *
     * @var string
     */
    public $date;

    // 原始币种资产价值
    /**
     * @example
     *
     * @var MultiCurrencyMoney[]
     */
    public $totalValueList;
    protected $_name = [
        'date'           => 'date',
        'totalValueList' => 'total_value_list',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('totalValueList', $this->totalValueList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->totalValueList) {
            $res['total_value_list'] = [];
            if (null !== $this->totalValueList && \is_array($this->totalValueList)) {
                $n = 0;
                foreach ($this->totalValueList as $item) {
                    $res['total_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataSummaryStatisticsItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['total_value_list'])) {
            if (!empty($map['total_value_list'])) {
                $model->totalValueList = [];
                $n                     = 0;
                foreach ($map['total_value_list'] as $item) {
                    $model->totalValueList[$n++] = null !== $item ? MultiCurrencyMoney::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
