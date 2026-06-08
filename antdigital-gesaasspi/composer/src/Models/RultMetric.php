<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class RultMetric extends Model
{
    // 度量编码
    /**
     * @example ori_use_amount
     *
     * @var string
     */
    public $metricCode;

    // 度量聚合结果
    /**
     * @example 21.22
     *
     * @var string
     */
    public $metricValue;
    protected $_name = [
        'metricCode'  => 'metric_code',
        'metricValue' => 'metric_value',
    ];

    public function validate()
    {
        Model::validateRequired('metricCode', $this->metricCode, true);
        Model::validateRequired('metricValue', $this->metricValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metricCode) {
            $res['metric_code'] = $this->metricCode;
        }
        if (null !== $this->metricValue) {
            $res['metric_value'] = $this->metricValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RultMetric
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metric_code'])) {
            $model->metricCode = $map['metric_code'];
        }
        if (isset($map['metric_value'])) {
            $model->metricValue = $map['metric_value'];
        }

        return $model;
    }
}
