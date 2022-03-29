<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StackAlarmRule extends Model
{
    // ID
    /**
     * @example 15
     *
     * @var int
     */
    public $id;

    // 告警套餐配置
    /**
     * @example {"alarmPkgs":[]}
     *
     * @var string
     */
    public $config;

    // 栈 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $stackId;

    // 指标 ID (如pv对应的ID)
    /**
     * @example 5
     *
     * @var int
     */
    public $stackMetricId;

    // 关联报警relation (如果未关联，默认为-1)
    /**
     * @example -1
     *
     * @var int
     */
    public $stackRelationId;

    // 实体对象复合 ID
    /**
     * @example sofacloud*sofa_app*1*3*MS-antscheduler
     *
     * @var string
     */
    public $stackUniversalTableId;
    protected $_name = [
        'id'                    => 'id',
        'config'                => 'config',
        'stackId'               => 'stack_id',
        'stackMetricId'         => 'stack_metric_id',
        'stackRelationId'       => 'stack_relation_id',
        'stackUniversalTableId' => 'stack_universal_table_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('stackMetricId', $this->stackMetricId, true);
        Model::validateRequired('stackRelationId', $this->stackRelationId, true);
        Model::validateRequired('stackUniversalTableId', $this->stackUniversalTableId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->stackMetricId) {
            $res['stack_metric_id'] = $this->stackMetricId;
        }
        if (null !== $this->stackRelationId) {
            $res['stack_relation_id'] = $this->stackRelationId;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StackAlarmRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['stack_metric_id'])) {
            $model->stackMetricId = $map['stack_metric_id'];
        }
        if (isset($map['stack_relation_id'])) {
            $model->stackRelationId = $map['stack_relation_id'];
        }
        if (isset($map['stack_universal_table_id'])) {
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }

        return $model;
    }
}
