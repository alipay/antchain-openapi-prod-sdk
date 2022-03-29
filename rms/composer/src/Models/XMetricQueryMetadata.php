<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XMetricQueryMetadata extends Model
{
    // query clause name
    /**
     * @example a
     *
     * @var string
     */
    public $name;

    // 32位datasource uuid
    /**
     * @example a
     *
     * @var string
     */
    public $datasourceUuid;

    // metric name
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
    protected $_name = [
        'name'           => 'name',
        'datasourceUuid' => 'datasource_uuid',
        'metricName'     => 'metric_name',
        'tableName'      => 'table_name',
        'conditions'     => 'conditions',
    ];

    public function validate()
    {
        Model::validateRequired('datasourceUuid', $this->datasourceUuid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMetricQueryMetadata
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
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

        return $model;
    }
}
