<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GreenOperationStatisticsByType extends Model
{
    // 绿色行为类型
    /**
     * @example ElectronicInvoice
     *
     * @var string
     */
    public $greenOperationType;

    // 绿色行为类型名称
    /**
     * @example 电子发票
     *
     * @var string
     */
    public $greenOperationTypeName;

    // 绿色行为产生的绿色能量值
    /**
     * @example 11
     *
     * @var int
     */
    public $greenEnergyAmount;

    // 相关类型的绿色行为记录数
    /**
     * @example 33
     *
     * @var int
     */
    public $greenOperationRecords;
    protected $_name = [
        'greenOperationType'     => 'green_operation_type',
        'greenOperationTypeName' => 'green_operation_type_name',
        'greenEnergyAmount'      => 'green_energy_amount',
        'greenOperationRecords'  => 'green_operation_records',
    ];

    public function validate()
    {
        Model::validateRequired('greenOperationType', $this->greenOperationType, true);
        Model::validateRequired('greenOperationTypeName', $this->greenOperationTypeName, true);
        Model::validateRequired('greenEnergyAmount', $this->greenEnergyAmount, true);
        Model::validateRequired('greenOperationRecords', $this->greenOperationRecords, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->greenOperationType) {
            $res['green_operation_type'] = $this->greenOperationType;
        }
        if (null !== $this->greenOperationTypeName) {
            $res['green_operation_type_name'] = $this->greenOperationTypeName;
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
     * @return GreenOperationStatisticsByType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['green_operation_type'])) {
            $model->greenOperationType = $map['green_operation_type'];
        }
        if (isset($map['green_operation_type_name'])) {
            $model->greenOperationTypeName = $map['green_operation_type_name'];
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
