<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SpannerClusterInfo extends Model
{
    // 容器的CPU个数
    /**
     * @example 4
     *
     * @var int
     */
    public $containerCpu;

    // 容器是否独占CPU
    /**
     * @example false
     *
     * @var bool
     */
    public $containerCpuExclusive;

    // 容器所在物理机节点的标签
    /**
     * @example server
     *
     * @var string
     */
    public $containerDeviceType;

    // 容器的磁盘大小
    /**
     * @example 20
     *
     * @var int
     */
    public $containerDisk;

    // 容器的内存大小(G)
    /**
     * @example 16
     *
     * @var int
     */
    public $containerMem;

    // 容器网络
    /**
     * @example driver:vlan
     *
     * @var string
     */
    public $containerNetwork;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 扩展属性，json字符串
    /**
     * @example "{"key": "value"}"
     *
     * @var string
     */
    public $extendProperties;

    // ID
    /**
     * @example 072a69abe6362f140643cedb32b30e7152068ae499b025a31074dab44d77cb2f
     *
     * @var string
     */
    public $id;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // 集群名称
    /**
     * @example testover
     *
     * @var string
     */
    public $name;

    // 集群的状态： 1 运行状态  2 维护状态
    /**
     * @example 1，2
     *
     * @var int
     */
    public $status;

    // 集群单元信息
    /**
     * @example
     *
     * @var SpannerClusterUnitInfo[]
     */
    public $unitInfos;

    // 0 表示集群单元类型为容器
    /**
     * @example 0
     *
     * @var int
     */
    public $unitType;

    // 已使用的端口
    /**
     * @example [7777, 8888]
     *
     * @var int[]
     */
    public $usedPorts;

    // internet/intranet/multidomain/office
    /**
     * @example internet
     *
     * @var string
     */
    public $addressType;
    protected $_name = [
        'containerCpu'          => 'container_cpu',
        'containerCpuExclusive' => 'container_cpu_exclusive',
        'containerDeviceType'   => 'container_device_type',
        'containerDisk'         => 'container_disk',
        'containerMem'          => 'container_mem',
        'containerNetwork'      => 'container_network',
        'createdTime'           => 'created_time',
        'extendProperties'      => 'extend_properties',
        'id'                    => 'id',
        'modifiedTime'          => 'modified_time',
        'name'                  => 'name',
        'status'                => 'status',
        'unitInfos'             => 'unit_infos',
        'unitType'              => 'unit_type',
        'usedPorts'             => 'used_ports',
        'addressType'           => 'address_type',
    ];

    public function validate()
    {
        Model::validateRequired('containerCpu', $this->containerCpu, true);
        Model::validateRequired('containerCpuExclusive', $this->containerCpuExclusive, true);
        Model::validateRequired('containerDeviceType', $this->containerDeviceType, true);
        Model::validateRequired('containerDisk', $this->containerDisk, true);
        Model::validateRequired('containerMem', $this->containerMem, true);
        Model::validateRequired('containerNetwork', $this->containerNetwork, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('unitInfos', $this->unitInfos, true);
        Model::validateRequired('unitType', $this->unitType, true);
        Model::validateRequired('addressType', $this->addressType, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->containerNetwork) {
            $res['container_network'] = $this->containerNetwork;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
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
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpannerClusterInfo
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
        if (isset($map['container_network'])) {
            $model->containerNetwork = $map['container_network'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
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
                    $model->unitInfos[$n++] = null !== $item ? SpannerClusterUnitInfo::fromMap($item) : $item;
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
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }

        return $model;
    }
}
