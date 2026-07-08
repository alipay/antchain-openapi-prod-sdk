<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GreenOperationRecordSummary extends Model
{
    // 绿色行为记录编码
    /**
     * @example 20220702111231231212
     *
     * @var string
     */
    public $greenOperationNo;

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

    // 发生绿色行为的相关业务单号
    /**
     * @example 202211131212
     *
     * @var string
     */
    public $enterpriseBizNo;

    // 绿色行为发生时间，格式应如：2021-07-21 12:11:11
    /**
     * @example 2021-08-09 12:22:11
     *
     * @var string
     */
    public $occurrenceTime;

    // 绿色行为的绿色能量值
    /**
     * @example 1111
     *
     * @var int
     */
    public $greenEnergyAmount;
    protected $_name = [
        'greenOperationNo'       => 'green_operation_no',
        'greenOperationType'     => 'green_operation_type',
        'greenOperationTypeName' => 'green_operation_type_name',
        'enterpriseBizNo'        => 'enterprise_biz_no',
        'occurrenceTime'         => 'occurrence_time',
        'greenEnergyAmount'      => 'green_energy_amount',
    ];

    public function validate()
    {
        Model::validateRequired('greenOperationNo', $this->greenOperationNo, true);
        Model::validateRequired('greenOperationType', $this->greenOperationType, true);
        Model::validateRequired('greenOperationTypeName', $this->greenOperationTypeName, true);
        Model::validateRequired('enterpriseBizNo', $this->enterpriseBizNo, true);
        Model::validateRequired('occurrenceTime', $this->occurrenceTime, true);
        Model::validateRequired('greenEnergyAmount', $this->greenEnergyAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->greenOperationNo) {
            $res['green_operation_no'] = $this->greenOperationNo;
        }
        if (null !== $this->greenOperationType) {
            $res['green_operation_type'] = $this->greenOperationType;
        }
        if (null !== $this->greenOperationTypeName) {
            $res['green_operation_type_name'] = $this->greenOperationTypeName;
        }
        if (null !== $this->enterpriseBizNo) {
            $res['enterprise_biz_no'] = $this->enterpriseBizNo;
        }
        if (null !== $this->occurrenceTime) {
            $res['occurrence_time'] = $this->occurrenceTime;
        }
        if (null !== $this->greenEnergyAmount) {
            $res['green_energy_amount'] = $this->greenEnergyAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GreenOperationRecordSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['green_operation_no'])) {
            $model->greenOperationNo = $map['green_operation_no'];
        }
        if (isset($map['green_operation_type'])) {
            $model->greenOperationType = $map['green_operation_type'];
        }
        if (isset($map['green_operation_type_name'])) {
            $model->greenOperationTypeName = $map['green_operation_type_name'];
        }
        if (isset($map['enterprise_biz_no'])) {
            $model->enterpriseBizNo = $map['enterprise_biz_no'];
        }
        if (isset($map['occurrence_time'])) {
            $model->occurrenceTime = $map['occurrence_time'];
        }
        if (isset($map['green_energy_amount'])) {
            $model->greenEnergyAmount = $map['green_energy_amount'];
        }

        return $model;
    }
}
