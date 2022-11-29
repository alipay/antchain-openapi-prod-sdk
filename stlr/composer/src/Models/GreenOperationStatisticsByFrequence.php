<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GreenOperationStatisticsByFrequence extends Model
{
    // 绿色行为发生时期
    /**
     * @example 2021-09
     *
     * @var string
     */
    public $occurrencePeriod;

    // 绿色行为产生的绿色能量值
    /**
     * @example 11212
     *
     * @var int
     */
    public $greenEnergyAmount;

    // 时期内发生绿色行为的记录条数
    /**
     * @example 111
     *
     * @var int
     */
    public $greenOperationRecords;
    protected $_name = [
        'occurrencePeriod'      => 'occurrence_period',
        'greenEnergyAmount'     => 'green_energy_amount',
        'greenOperationRecords' => 'green_operation_records',
    ];

    public function validate()
    {
        Model::validateRequired('occurrencePeriod', $this->occurrencePeriod, true);
        Model::validateRequired('greenEnergyAmount', $this->greenEnergyAmount, true);
        Model::validateRequired('greenOperationRecords', $this->greenOperationRecords, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->occurrencePeriod) {
            $res['occurrence_period'] = $this->occurrencePeriod;
        }
        if (null !== $this->greenEnergyAmount) {
            $res['green_energy_amount'] = $this->greenEnergyAmount;
        }
        if (null !== $this->greenOperationRecords) {
            $res['green_operation_records'] = $this->greenOperationRecords;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GreenOperationStatisticsByFrequence
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['occurrence_period'])) {
            $model->occurrencePeriod = $map['occurrence_period'];
        }
        if (isset($map['green_energy_amount'])) {
            $model->greenEnergyAmount = $map['green_energy_amount'];
        }
        if (isset($map['green_operation_records'])) {
            $model->greenOperationRecords = $map['green_operation_records'];
        }

        return $model;
    }
}
