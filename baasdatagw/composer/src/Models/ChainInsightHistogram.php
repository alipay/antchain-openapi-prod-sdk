<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightHistogram extends Model
{
    // 横坐标名称
    /**
     * @example XName
     *
     * @var string
     */
    public $xLabel;

    // 纵坐标名称
    /**
     * @example YName
     *
     * @var string
     */
    public $yLabel;

    // 坐标集，按x增序
    /**
     * @example
     *
     * @var ChainInsightPoint[]
     */
    public $points;

    // 表格的名称或维度名称
    /**
     * @example FuncA
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'xLabel' => 'x_label',
        'yLabel' => 'y_label',
        'points' => 'points',
        'name'   => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('points', $this->points, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->xLabel) {
            $res['x_label'] = $this->xLabel;
        }
        if (null !== $this->yLabel) {
            $res['y_label'] = $this->yLabel;
        }
        if (null !== $this->points) {
            $res['points'] = [];
            if (null !== $this->points && \is_array($this->points)) {
                $n = 0;
                foreach ($this->points as $item) {
                    $res['points'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightHistogram
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['x_label'])) {
            $model->xLabel = $map['x_label'];
        }
        if (isset($map['y_label'])) {
            $model->yLabel = $map['y_label'];
        }
        if (isset($map['points'])) {
            if (!empty($map['points'])) {
                $model->points = [];
                $n             = 0;
                foreach ($map['points'] as $item) {
                    $model->points[$n++] = null !== $item ? ChainInsightPoint::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
