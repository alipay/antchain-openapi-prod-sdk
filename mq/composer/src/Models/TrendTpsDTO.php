<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TrendTpsDTO extends Model
{
    // 数据集合
    /**
     * @example
     *
     * @var StatsDataDTO[]
     */
    public $records;

    // Table 的名称
    /**
     * @example MQ_INST_111111111111_DOxxxxxx%test 接收 总量 趋势图
     *
     * @var string
     */
    public $title;

    // 时间戳，单位毫秒
    /**
     * @example time
     *
     * @var string
     */
    public $xUnit;

    // 纵轴单位
    //
    /**
     * @example msg
     *
     * @var string
     */
    public $yUnit;
    protected $_name = [
        'records' => 'records',
        'title'   => 'title',
        'xUnit'   => 'x_unit',
        'yUnit'   => 'y_unit',
    ];

    public function validate()
    {
        Model::validateRequired('records', $this->records, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('xUnit', $this->xUnit, true);
        Model::validateRequired('yUnit', $this->yUnit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->records) {
            $res['records'] = [];
            if (null !== $this->records && \is_array($this->records)) {
                $n = 0;
                foreach ($this->records as $item) {
                    $res['records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->xUnit) {
            $res['x_unit'] = $this->xUnit;
        }
        if (null !== $this->yUnit) {
            $res['y_unit'] = $this->yUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrendTpsDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['records'])) {
            if (!empty($map['records'])) {
                $model->records = [];
                $n              = 0;
                foreach ($map['records'] as $item) {
                    $model->records[$n++] = null !== $item ? StatsDataDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['x_unit'])) {
            $model->xUnit = $map['x_unit'];
        }
        if (isset($map['y_unit'])) {
            $model->yUnit = $map['y_unit'];
        }

        return $model;
    }
}
