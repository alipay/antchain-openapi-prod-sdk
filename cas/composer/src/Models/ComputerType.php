<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ComputerType extends Model
{
    // cpu core count
    /**
     * @example 4
     *
     * @var int
     */
    public $cpuCoreCount;

    // instance type id
    /**
     * @example ecs.d1ne.xlarge
     *
     * @var string
     */
    public $id;

    // 实例规格族
    /**
     * @example ecs.ic5
     *
     * @var string
     */
    public $instanceTypeFamily;

    // memory size
    /**
     * @example 4.0
     *
     * @var int
     */
    public $memorySize;

    // 实例状态，可能值： Available：资源充足 Sold...
    /**
     * @example Available
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'cpuCoreCount'       => 'cpu_core_count',
        'id'                 => 'id',
        'instanceTypeFamily' => 'instance_type_family',
        'memorySize'         => 'memory_size',
        'status'             => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpuCoreCount) {
            $res['cpu_core_count'] = $this->cpuCoreCount;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceTypeFamily) {
            $res['instance_type_family'] = $this->instanceTypeFamily;
        }
        if (null !== $this->memorySize) {
            $res['memory_size'] = $this->memorySize;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cpu_core_count'])) {
            $model->cpuCoreCount = $map['cpu_core_count'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_type_family'])) {
            $model->instanceTypeFamily = $map['instance_type_family'];
        }
        if (isset($map['memory_size'])) {
            $model->memorySize = $map['memory_size'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
