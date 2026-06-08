<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class Metric extends Model
{
    // 度量编码
    /**
     * @example ori_use_amount
     *
     * @var string
     */
    public $metricCode;

    // 计算列
    /**
     * @example ori_use_amount
     *
     * @var string
     */
    public $metricColumn;

    // 计算方式
    /**
     * @example SUM
     *
     * @var string
     */
    public $functionType;
    protected $_name = [
        'metricCode'   => 'metric_code',
        'metricColumn' => 'metric_column',
        'functionType' => 'function_type',
    ];

    public function validate()
    {
        Model::validateRequired('metricCode', $this->metricCode, true);
        Model::validateRequired('metricColumn', $this->metricColumn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metricCode) {
            $res['metric_code'] = $this->metricCode;
        }
        if (null !== $this->metricColumn) {
            $res['metric_column'] = $this->metricColumn;
        }
        if (null !== $this->functionType) {
            $res['function_type'] = $this->functionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Metric
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metric_code'])) {
            $model->metricCode = $map['metric_code'];
        }
        if (isset($map['metric_column'])) {
            $model->metricColumn = $map['metric_column'];
        }
        if (isset($map['function_type'])) {
            $model->functionType = $map['function_type'];
        }

        return $model;
    }
}
