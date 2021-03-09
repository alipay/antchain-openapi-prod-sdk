<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class LbCluster extends Model
{
    // container_cpu
    /**
     * @example 1
     *
     * @var int
     */
    public $containerCpu;

    // container_cpu_exclusive
    /**
     * @example
     *
     * @var bool
     */
    public $containerCpuExclusive;

    // container_device_type
    /**
     * @example container_device_type
     *
     * @var string
     */
    public $containerDeviceType;

    // container_disk
    /**
     * @example 1
     *
     * @var int
     */
    public $containerDisk;

    // container_mem
    /**
     * @example 1
     *
     * @var int
     */
    public $containerMem;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // image
    /**
     * @example image
     *
     * @var string
     */
    public $image;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // status
    /**
     * @example status
     *
     * @var int
     */
    public $status;

    // unit_infos
    /**
     * @example
     *
     * @var AcsClusterUnit[]
     */
    public $unitInfos;

    // unit_type
    /**
     * @example 1
     *
     * @var int
     */
    public $unitType;

    // used_ports
    /**
     * @example
     *
     * @var int[]
     */
    public $usedPorts;
    protected $_name = [
        'containerCpu'          => 'container_cpu',
        'containerCpuExclusive' => 'container_cpu_exclusive',
        'containerDeviceType'   => 'container_device_type',
        'containerDisk'         => 'container_disk',
        'containerMem'          => 'container_mem',
        'id'                    => 'id',
        'image'                 => 'image',
        'name'                  => 'name',
        'status'                => 'status',
        'unitInfos'             => 'unit_infos',
        'unitType'              => 'unit_type',
        'usedPorts'             => 'used_ports',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerCpu) {
            $res['container_cpu'] = $this->containerCpu;
        }
        if (null !== $this->containerCpuExclusive) {
            $res['container_cpu_exclusive'] = $this->containerCpuExclusive;
        }
        if (null !== $this->containerDeviceType) {
            $res['container_device_type'] = $this->containerDeviceType;
        }
        if (null !== $this->containerDisk) {
            $res['container_disk'] = $this->containerDisk;
        }
        if (null !== $this->containerMem) {
            $res['container_mem'] = $this->containerMem;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->unitInfos) {
            $res['unit_infos'] = [];
            if (null !== $this->unitInfos && \is_array($this->unitInfos)) {
                $n = 0;
                foreach ($this->unitInfos as $item) {
                    $res['unit_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->unitType) {
            $res['unit_type'] = $this->unitType;
        }
        if (null !== $this->usedPorts) {
            $res['used_ports'] = $this->usedPorts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LbCluster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_cpu'])) {
            $model->containerCpu = $map['container_cpu'];
        }
        if (isset($map['container_cpu_exclusive'])) {
            $model->containerCpuExclusive = $map['container_cpu_exclusive'];
        }
        if (isset($map['container_device_type'])) {
            $model->containerDeviceType = $map['container_device_type'];
        }
        if (isset($map['container_disk'])) {
            $model->containerDisk = $map['container_disk'];
        }
        if (isset($map['container_mem'])) {
            $model->containerMem = $map['container_mem'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['unit_infos'])) {
            if (!empty($map['unit_infos'])) {
                $model->unitInfos = [];
                $n                = 0;
                foreach ($map['unit_infos'] as $item) {
                    $model->unitInfos[$n++] = null !== $item ? AcsClusterUnit::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['unit_type'])) {
            $model->unitType = $map['unit_type'];
        }
        if (isset($map['used_ports'])) {
            if (!empty($map['used_ports'])) {
                $model->usedPorts = $map['used_ports'];
            }
        }

        return $model;
    }
}
