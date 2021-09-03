<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class BatchRepairData extends Model
{
    // "RPBS001":待修复,"RPBS002": 修 复 中 "RPBS003": 已 修 复,"RPBS004":修复失败
    /**
     * @example RPBS001
     *
     * @var string
     */
    public $repairBatchStatus;

    // 修复时间
    /**
     * @example 格式：yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $repairTime;

    // 参见RepairData
    /**
     * @example
     *
     * @var RepairData[]
     */
    public $repairDatas;
    protected $_name = [
        'repairBatchStatus' => 'repair_batch_status',
        'repairTime'        => 'repair_time',
        'repairDatas'       => 'repair_datas',
    ];

    public function validate()
    {
        Model::validateRequired('repairBatchStatus', $this->repairBatchStatus, true);
        Model::validateRequired('repairTime', $this->repairTime, true);
        Model::validateRequired('repairDatas', $this->repairDatas, true);
        Model::validatePattern('repairTime', $this->repairTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->repairBatchStatus) {
            $res['repair_batch_status'] = $this->repairBatchStatus;
        }
        if (null !== $this->repairTime) {
            $res['repair_time'] = $this->repairTime;
        }
        if (null !== $this->repairDatas) {
            $res['repair_datas'] = [];
            if (null !== $this->repairDatas && \is_array($this->repairDatas)) {
                $n = 0;
                foreach ($this->repairDatas as $item) {
                    $res['repair_datas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchRepairData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['repair_batch_status'])) {
            $model->repairBatchStatus = $map['repair_batch_status'];
        }
        if (isset($map['repair_time'])) {
            $model->repairTime = $map['repair_time'];
        }
        if (isset($map['repair_datas'])) {
            if (!empty($map['repair_datas'])) {
                $model->repairDatas = [];
                $n                  = 0;
                foreach ($map['repair_datas'] as $item) {
                    $model->repairDatas[$n++] = null !== $item ? RepairData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
