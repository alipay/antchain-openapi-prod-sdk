<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellWeight extends Model
{
    // 统一接入或负载均衡名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 部署单元权重详情
    /**
     * @example []
     *
     * @var CellWeightInfo[]
     */
    public $cellWeightInfos;
    protected $_name = [
        'name'            => 'name',
        'cellWeightInfos' => 'cell_weight_infos',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('cellWeightInfos', $this->cellWeightInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cellWeightInfos) {
            $res['cell_weight_infos'] = [];
            if (null !== $this->cellWeightInfos && \is_array($this->cellWeightInfos)) {
                $n = 0;
                foreach ($this->cellWeightInfos as $item) {
                    $res['cell_weight_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellWeight
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cell_weight_infos'])) {
            if (!empty($map['cell_weight_infos'])) {
                $model->cellWeightInfos = [];
                $n                      = 0;
                foreach ($map['cell_weight_infos'] as $item) {
                    $model->cellWeightInfos[$n++] = null !== $item ? CellWeightInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
