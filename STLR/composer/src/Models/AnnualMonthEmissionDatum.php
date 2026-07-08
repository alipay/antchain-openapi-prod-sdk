<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AnnualMonthEmissionDatum extends Model
{
    // 统计的年份
    /**
     * @example 2022
     *
     * @var string
     */
    public $year;

    // 统计的月份
    /**
     * @example 12
     *
     * @var string
     */
    public $month;

    // 统计排放量
    /**
     * @example 22.22
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'year'  => 'year',
        'month' => 'month',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('year', $this->year, true);
        Model::validateRequired('month', $this->month, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->year) {
            $res['year'] = $this->year;
        }
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AnnualMonthEmissionDatum
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['year'])) {
            $model->year = $map['year'];
        }
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
