<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XMetricQuery extends Model
{
    /**
     * @example
     *
     * @var int
     */
    public $timeout;

    // start timestamp
    /**
     * @example
     *
     * @var int
     */
    public $start;

    // end timestamp
    /**
     * @example
     *
     * @var int
     */
    public $end;

    // value step
    /**
     * @example
     *
     * @var int
     */
    public $step;

    // instant time
    /**
     * @example
     *
     * @var int
     */
    public $time;

    // query clause
    /**
     * @example
     *
     * @var string
     */
    public $query;

    /**
     * @example
     *
     * @var XMetricQueryMetadata[]
     */
    public $queryMetadatas;

    /**
     * @example
     *
     * @var string
     */
    public $datasourceUuid;

    /**
     * @example
     *
     * @var string
     */
    public $metricName;

    /**
     * @example
     *
     * @var string
     */
    public $tableName;

    /**
     * @example
     *
     * @var XCondition[]
     */
    public $conditions;

    /**
     * @example
     *
     * @var string
     */
    public $tag;

    /**
     * @example
     *
     * @var int
     */
    public $tenantId;

    /**
     * @example
     *
     * @var int
     */
    public $workspaceId;

    /**
     * @example
     *
     * @var string
     */
    public $datasourceType;

    /**
     * @example NULL_AS_NULL
     *
     * @var string
     */
    public $nullValueType;
    protected $_name = [
        'timeout'        => 'timeout',
        'start'          => 'start',
        'end'            => 'end',
        'step'           => 'step',
        'time'           => 'time',
        'query'          => 'query',
        'queryMetadatas' => 'query_metadatas',
        'datasourceUuid' => 'datasource_uuid',
        'metricName'     => 'metric_name',
        'tableName'      => 'table_name',
        'conditions'     => 'conditions',
        'tag'            => 'tag',
        'tenantId'       => 'tenant_id',
        'workspaceId'    => 'workspace_id',
        'datasourceType' => 'datasource_type',
        'nullValueType'  => 'null_value_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->step) {
            $res['step'] = $this->step;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->queryMetadatas) {
            $res['query_metadatas'] = [];
            if (null !== $this->queryMetadatas && \is_array($this->queryMetadatas)) {
                $n = 0;
                foreach ($this->queryMetadatas as $item) {
                    $res['query_metadatas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->datasourceUuid) {
            $res['datasource_uuid'] = $this->datasourceUuid;
        }
        if (null !== $this->metricName) {
            $res['metric_name'] = $this->metricName;
        }
        if (null !== $this->tableName) {
            $res['table_name'] = $this->tableName;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->nullValueType) {
            $res['null_value_type'] = $this->nullValueType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMetricQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['step'])) {
            $model->step = $map['step'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['query_metadatas'])) {
            if (!empty($map['query_metadatas'])) {
                $model->queryMetadatas = [];
                $n                     = 0;
                foreach ($map['query_metadatas'] as $item) {
                    $model->queryMetadatas[$n++] = null !== $item ? XMetricQueryMetadata::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['datasource_uuid'])) {
            $model->datasourceUuid = $map['datasource_uuid'];
        }
        if (isset($map['metric_name'])) {
            $model->metricName = $map['metric_name'];
        }
        if (isset($map['table_name'])) {
            $model->tableName = $map['table_name'];
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? XCondition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['null_value_type'])) {
            $model->nullValueType = $map['null_value_type'];
        }

        return $model;
    }
}
