<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class FinancialRateInfo extends Model
{
    // 融资利率
    /**
     * @example 12.50
     *
     * @var string
     */
    public $rate;

    // 起始-天
    /**
     * @example 0
     *
     * @var int
     */
    public $startDay;

    // 终止-天
    /**
     * @example 30
     *
     * @var int
     */
    public $endDay;
    protected $_name = [
        'rate'     => 'rate',
        'startDay' => 'start_day',
        'endDay'   => 'end_day',
    ];

    public function validate()
    {
        Model::validateRequired('rate', $this->rate, true);
        Model::validateRequired('startDay', $this->startDay, true);
        Model::validateRequired('endDay', $this->endDay, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->startDay) {
            $res['start_day'] = $this->startDay;
        }
        if (null !== $this->endDay) {
            $res['end_day'] = $this->endDay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinancialRateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['start_day'])) {
            $model->startDay = $map['start_day'];
        }
        if (isset($map['end_day'])) {
            $model->endDay = $map['end_day'];
        }

        return $model;
    }
}
