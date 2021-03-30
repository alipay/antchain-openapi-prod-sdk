<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class OpeUnitPriceInfo extends Model
{
    // 操作费单价 （分）
    /**
     * @example 10000
     *
     * @var int
     */
    public $unitPrice;

    // 起始-天 （-999 表示无日期限制）
    /**
     * @example 1
     *
     * @var int
     */
    public $startDay;

    // 终止-天 （-999 表示无日期限制）
    /**
     * @example 30
     *
     * @var int
     */
    public $endDay;
    protected $_name = [
        'unitPrice' => 'unit_price',
        'startDay'  => 'start_day',
        'endDay'    => 'end_day',
    ];

    public function validate()
    {
        Model::validateRequired('unitPrice', $this->unitPrice, true);
        Model::validateRequired('startDay', $this->startDay, true);
        Model::validateRequired('endDay', $this->endDay, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
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
     * @return OpeUnitPriceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['unit_price'])) {
            $model->unitPrice = $map['unit_price'];
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
