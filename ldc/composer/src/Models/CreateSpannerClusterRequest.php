<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateSpannerClusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 容器的CPU个数(Core)
    /**
     * @var int
     */
    public $containerCpu;

    // 容器是否独占CPU
    /**
     * @var bool
     */
    public $containerCpuExclusive;

    // 容器所在的物理机节点标签
    /**
     * @var string
     */
    public $containerDeviceType;

    // 容器的磁盘大小(G)
    /**
     * @var int
     */
    public $containerDisk;

    // 容器的内存大小（G）
    /**
     * @var int
     */
    public $containerMem;

    // 容器网络
    /**
     * @var string
     */
    public $containerNetwork;

    // 集群名称
    /**
     * @var string
     */
    public $name;

    // 集群单元类型，默认为 0 :
    // 0 - 容器
    /**
     * @var int
     */
    public $unitType;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 集群网络类型，internet/intranet/multidomain/office
    /**
     * @var string
     */
    public $addressType;
    protected $_name = [
        'authToken'             => 'auth_token',
        'containerCpu'          => 'container_cpu',
        'containerCpuExclusive' => 'container_cpu_exclusive',
        'containerDeviceType'   => 'container_device_type',
        'containerDisk'         => 'container_disk',
        'containerMem'          => 'container_mem',
        'containerNetwork'      => 'container_network',
        'name'                  => 'name',
        'unitType'              => 'unit_type',
        'workspaceGroup'        => 'workspace_group',
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
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('addressType', $this->addressType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->unitType) {
            $res['unit_type'] = $this->unitType;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSpannerClusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['unit_type'])) {
            $model->unitType = $map['unit_type'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }

        return $model;
    }
}
