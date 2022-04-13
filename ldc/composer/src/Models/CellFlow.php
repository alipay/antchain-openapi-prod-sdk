<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellFlow extends Model
{
    // 部署单元名称
    /**
     * @example RZ01A
     *
     * @var string
     */
    public $name;

    // 蓝绿着色。
    // BLUE：蓝
    // GREEN：绿
    // 非着色单元为 null
    /**
     * @example GREEN
     *
     * @var string
     */
    public $color;

    // 部署单元所占单元组的流量比。
    /**
     * @example 100
     *
     * @var int
     */
    public $percent;
    protected $_name = [
        'name'    => 'name',
        'color'   => 'color',
        'percent' => 'percent',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('percent', $this->percent, true);
        Model::validateMaximum('percent', $this->percent, 100);
        Model::validateMinimum('percent', $this->percent, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->percent) {
            $res['percent'] = $this->percent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellFlow
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['percent'])) {
            $model->percent = $map['percent'];
        }

        return $model;
    }
}
