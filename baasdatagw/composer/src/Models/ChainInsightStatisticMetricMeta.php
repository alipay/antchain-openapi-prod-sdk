<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightStatisticMetricMeta extends Model
{
    // 统计指标的类型；枚举：Table，Histogram
    /**
     * @example Table
     *
     * @var string
     */
    public $type;

    // 指标的展示名称
    /**
     * @example GasUsedByContractFunction
     *
     * @var string
     */
    public $name;

    // 指标的实际名称（自定义指标ID）
    /**
     * @example jasrq2-uadsfkhj23
     *
     * @var string
     */
    public $metricName;
    protected $_name = [
        'type'       => 'type',
        'name'       => 'name',
        'metricName' => 'metric_name',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('metricName', $this->metricName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->metricName) {
            $res['metric_name'] = $this->metricName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightStatisticMetricMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['metric_name'])) {
            $model->metricName = $map['metric_name'];
        }

        return $model;
    }
}
