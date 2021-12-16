<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PaidSpecInstance extends Model
{
    // 规格实例id
    /**
     * @example 暂无
     *
     * @var string
     */
    public $specInstanceId;

    // 规格名称
    /**
     * @example 腾信酒旅宝
     *
     * @var string
     */
    public $specName;

    // 规格配置(描述)
    /**
     * @example 暂无
     *
     * @var string
     */
    public $specConf;

    // 实例开始时间
    /**
     * @example 2018.10.10
     *
     * @var string
     */
    public $startTime;

    // 实例到期时间
    /**
     * @example 2019.10.11
     *
     * @var string
     */
    public $endTime;

    // 规格实例的运行状态
    /**
     * @example 正常有效
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'specInstanceId' => 'spec_instance_id',
        'specName'       => 'spec_name',
        'specConf'       => 'spec_conf',
        'startTime'      => 'start_time',
        'endTime'        => 'end_time',
        'status'         => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('specInstanceId', $this->specInstanceId, true);
        Model::validateRequired('specName', $this->specName, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specInstanceId) {
            $res['spec_instance_id'] = $this->specInstanceId;
        }
        if (null !== $this->specName) {
            $res['spec_name'] = $this->specName;
        }
        if (null !== $this->specConf) {
            $res['spec_conf'] = $this->specConf;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaidSpecInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_instance_id'])) {
            $model->specInstanceId = $map['spec_instance_id'];
        }
        if (isset($map['spec_name'])) {
            $model->specName = $map['spec_name'];
        }
        if (isset($map['spec_conf'])) {
            $model->specConf = $map['spec_conf'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
