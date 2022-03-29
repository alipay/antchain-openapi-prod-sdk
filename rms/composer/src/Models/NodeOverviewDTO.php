<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NodeOverviewDTO extends Model
{
    // 磁盘 top排序应用
    /**
     * @example
     *
     * @var NodeTopItem[]
     */
    public $diskTopNodes;

    //
    // cpu top排序应用
    /**
     * @example cpu_top_apps
     *
     * @var NodeTopItem[]
     */
    public $cpuTopNodes;

    // mem top排序应用
    /**
     * @example mem_top_apps
     *
     * @var NodeTopItem[]
     */
    public $memTopNodes;
    protected $_name = [
        'diskTopNodes' => 'disk_top_nodes',
        'cpuTopNodes'  => 'cpu_top_nodes',
        'memTopNodes'  => 'mem_top_nodes',
    ];

    public function validate()
    {
        Model::validateRequired('diskTopNodes', $this->diskTopNodes, true);
        Model::validateRequired('cpuTopNodes', $this->cpuTopNodes, true);
        Model::validateRequired('memTopNodes', $this->memTopNodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->diskTopNodes) {
            $res['disk_top_nodes'] = [];
            if (null !== $this->diskTopNodes && \is_array($this->diskTopNodes)) {
                $n = 0;
                foreach ($this->diskTopNodes as $item) {
                    $res['disk_top_nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cpuTopNodes) {
            $res['cpu_top_nodes'] = [];
            if (null !== $this->cpuTopNodes && \is_array($this->cpuTopNodes)) {
                $n = 0;
                foreach ($this->cpuTopNodes as $item) {
                    $res['cpu_top_nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->memTopNodes) {
            $res['mem_top_nodes'] = [];
            if (null !== $this->memTopNodes && \is_array($this->memTopNodes)) {
                $n = 0;
                foreach ($this->memTopNodes as $item) {
                    $res['mem_top_nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeOverviewDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['disk_top_nodes'])) {
            if (!empty($map['disk_top_nodes'])) {
                $model->diskTopNodes = [];
                $n                   = 0;
                foreach ($map['disk_top_nodes'] as $item) {
                    $model->diskTopNodes[$n++] = null !== $item ? NodeTopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cpu_top_nodes'])) {
            if (!empty($map['cpu_top_nodes'])) {
                $model->cpuTopNodes = [];
                $n                  = 0;
                foreach ($map['cpu_top_nodes'] as $item) {
                    $model->cpuTopNodes[$n++] = null !== $item ? NodeTopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['mem_top_nodes'])) {
            if (!empty($map['mem_top_nodes'])) {
                $model->memTopNodes = [];
                $n                  = 0;
                foreach ($map['mem_top_nodes'] as $item) {
                    $model->memTopNodes[$n++] = null !== $item ? NodeTopItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
