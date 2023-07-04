<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ResourceSpec extends Model
{
    // cpu规格
    /**
     * @example 1
     *
     * @var string
     */
    public $cpu;

    // gpu规格
    /**
     * @example 0
     *
     * @var string
     */
    public $gpu;

    // memory
    /**
     * @example 2
     *
     * @var string
     */
    public $memory;

    // 规格名称
    /**
     * @example 标准单机房
     *
     * @var string
     */
    public $name;

    // 应用副本数
    /**
     * @example 2
     *
     * @var int
     */
    public $replicas;

    // 数据卷规格
    /**
     * @example
     *
     * @var VolumeSpec[]
     */
    public $volumes;
    protected $_name = [
        'cpu'      => 'cpu',
        'gpu'      => 'gpu',
        'memory'   => 'memory',
        'name'     => 'name',
        'replicas' => 'replicas',
        'volumes'  => 'volumes',
    ];

    public function validate()
    {
        Model::validateRequired('cpu', $this->cpu, true);
        Model::validateRequired('memory', $this->memory, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('replicas', $this->replicas, true);
        Model::validateRequired('volumes', $this->volumes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->gpu) {
            $res['gpu'] = $this->gpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->replicas) {
            $res['replicas'] = $this->replicas;
        }
        if (null !== $this->volumes) {
            $res['volumes'] = [];
            if (null !== $this->volumes && \is_array($this->volumes)) {
                $n = 0;
                foreach ($this->volumes as $item) {
                    $res['volumes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['gpu'])) {
            $model->gpu = $map['gpu'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }
        if (isset($map['volumes'])) {
            if (!empty($map['volumes'])) {
                $model->volumes = [];
                $n              = 0;
                foreach ($map['volumes'] as $item) {
                    $model->volumes[$n++] = null !== $item ? VolumeSpec::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
