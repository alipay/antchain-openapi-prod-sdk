<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class DwsResult extends Model
{
    // 维度列表
    /**
     * @example
     *
     * @var Dimension[]
     */
    public $dimensionList;

    // 度量列表
    /**
     * @example
     *
     * @var RultMetric[]
     */
    public $metricList;
    protected $_name = [
        'dimensionList' => 'dimension_list',
        'metricList'    => 'metric_list',
    ];

    public function validate()
    {
        Model::validateRequired('dimensionList', $this->dimensionList, true);
        Model::validateRequired('metricList', $this->metricList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimensionList) {
            $res['dimension_list'] = [];
            if (null !== $this->dimensionList && \is_array($this->dimensionList)) {
                $n = 0;
                foreach ($this->dimensionList as $item) {
                    $res['dimension_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->metricList) {
            $res['metric_list'] = [];
            if (null !== $this->metricList && \is_array($this->metricList)) {
                $n = 0;
                foreach ($this->metricList as $item) {
                    $res['metric_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DwsResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dimension_list'])) {
            if (!empty($map['dimension_list'])) {
                $model->dimensionList = [];
                $n                    = 0;
                foreach ($map['dimension_list'] as $item) {
                    $model->dimensionList[$n++] = null !== $item ? Dimension::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['metric_list'])) {
            if (!empty($map['metric_list'])) {
                $model->metricList = [];
                $n                 = 0;
                foreach ($map['metric_list'] as $item) {
                    $model->metricList[$n++] = null !== $item ? RultMetric::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
