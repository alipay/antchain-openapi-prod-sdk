<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnitFlow extends Model
{
    // 部署单元组的名称
    /**
     * @example RZ01
     *
     * @var string
     */
    public $name;

    // 部署单元组的类型
    /**
     * @example RZG
     *
     * @var string
     */
    public $type;

    // 该部署单元组下的部署单元流量规则
    /**
     * @example
     *
     * @var CellFlow[]
     */
    public $cellFlows;

    // 该部署单元组下的部署单元 uid 分配
    /**
     * @example
     *
     * @var UidRange[]
     */
    public $uidRanges;

    // 是否弹性部署单元组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $elastic;
    protected $_name = [
        'name'      => 'name',
        'type'      => 'type',
        'cellFlows' => 'cell_flows',
        'uidRanges' => 'uid_ranges',
        'elastic'   => 'elastic',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('cellFlows', $this->cellFlows, true);
        Model::validateRequired('uidRanges', $this->uidRanges, true);
        Model::validateRequired('elastic', $this->elastic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->cellFlows) {
            $res['cell_flows'] = [];
            if (null !== $this->cellFlows && \is_array($this->cellFlows)) {
                $n = 0;
                foreach ($this->cellFlows as $item) {
                    $res['cell_flows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->uidRanges) {
            $res['uid_ranges'] = [];
            if (null !== $this->uidRanges && \is_array($this->uidRanges)) {
                $n = 0;
                foreach ($this->uidRanges as $item) {
                    $res['uid_ranges'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->elastic) {
            $res['elastic'] = $this->elastic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnitFlow
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['cell_flows'])) {
            if (!empty($map['cell_flows'])) {
                $model->cellFlows = [];
                $n                = 0;
                foreach ($map['cell_flows'] as $item) {
                    $model->cellFlows[$n++] = null !== $item ? CellFlow::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['uid_ranges'])) {
            if (!empty($map['uid_ranges'])) {
                $model->uidRanges = [];
                $n                = 0;
                foreach ($map['uid_ranges'] as $item) {
                    $model->uidRanges[$n++] = null !== $item ? UidRange::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['elastic'])) {
            $model->elastic = $map['elastic'];
        }

        return $model;
    }
}
