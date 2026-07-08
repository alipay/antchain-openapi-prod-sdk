<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CountEcarGreenoperationResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 绿色行为产生的绿色能量总量
    /**
     * @var int
     */
    public $greenEnergyTotal;

    // 绿色能量单位，默认为g
    /**
     * @var string
     */
    public $greenEnergyUnit;

    // 绿色行为记录数据
    /**
     * @var int
     */
    public $greenOperationRecords;

    // 按频率统计的绿色行为数据列表
    /**
     * @var GreenOperationStatisticsByFrequence[]
     */
    public $statisticsByFrequenceList;

    // 按绿色行为类型统计的绿色行为数据列表
    /**
     * @var GreenOperationStatisticsByType[]
     */
    public $statisticsByTypeList;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'greenEnergyTotal'          => 'green_energy_total',
        'greenEnergyUnit'           => 'green_energy_unit',
        'greenOperationRecords'     => 'green_operation_records',
        'statisticsByFrequenceList' => 'statistics_by_frequence_list',
        'statisticsByTypeList'      => 'statistics_by_type_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->greenEnergyTotal) {
            $res['green_energy_total'] = $this->greenEnergyTotal;
        }
        if (null !== $this->greenEnergyUnit) {
            $res['green_energy_unit'] = $this->greenEnergyUnit;
        }
        if (null !== $this->greenOperationRecords) {
            $res['green_operation_records'] = $this->greenOperationRecords;
        }
        if (null !== $this->statisticsByFrequenceList) {
            $res['statistics_by_frequence_list'] = [];
            if (null !== $this->statisticsByFrequenceList && \is_array($this->statisticsByFrequenceList)) {
                $n = 0;
                foreach ($this->statisticsByFrequenceList as $item) {
                    $res['statistics_by_frequence_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->statisticsByTypeList) {
            $res['statistics_by_type_list'] = [];
            if (null !== $this->statisticsByTypeList && \is_array($this->statisticsByTypeList)) {
                $n = 0;
                foreach ($this->statisticsByTypeList as $item) {
                    $res['statistics_by_type_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountEcarGreenoperationResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['green_energy_total'])) {
            $model->greenEnergyTotal = $map['green_energy_total'];
        }
        if (isset($map['green_energy_unit'])) {
            $model->greenEnergyUnit = $map['green_energy_unit'];
        }
        if (isset($map['green_operation_records'])) {
            $model->greenOperationRecords = $map['green_operation_records'];
        }
        if (isset($map['statistics_by_frequence_list'])) {
            if (!empty($map['statistics_by_frequence_list'])) {
                $model->statisticsByFrequenceList = [];
                $n                                = 0;
                foreach ($map['statistics_by_frequence_list'] as $item) {
                    $model->statisticsByFrequenceList[$n++] = null !== $item ? GreenOperationStatisticsByFrequence::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['statistics_by_type_list'])) {
            if (!empty($map['statistics_by_type_list'])) {
                $model->statisticsByTypeList = [];
                $n                           = 0;
                foreach ($map['statistics_by_type_list'] as $item) {
                    $model->statisticsByTypeList[$n++] = null !== $item ? GreenOperationStatisticsByType::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
