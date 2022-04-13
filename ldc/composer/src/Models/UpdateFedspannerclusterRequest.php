<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFedspannerclusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用于描述联邦spanner 集群内容器实例采用内网还是外网
    /**
     * @var string
     */
    public $addressType;

    // 集群名称
    /**
     * @var string
     */
    public $clusterName;

    // 用于描述联邦spanner 集群内容器实例 cpu大小， 单位core
    /**
     * @var string
     */
    public $cpu;

    // 用于描述联邦spanner 集群内容器实例disk大小， 单位Gi
    /**
     * @var string
     */
    public $disk;

    // 用于描述联邦spanner 集群内容器实例的网络是否采用host网络
    /**
     * @var bool
     */
    public $hostNetwork;

    // 用于描述联邦spanner 集群内容器实例mem 大小， 单位 Gi
    /**
     * @var string
     */
    public $mem;

    // 用于描述联邦spanner 集群名称
    /**
     * @var string
     */
    public $name;

    // 描述集群状态
    /**
     * @var string
     */
    public $state;

    // 定义了sub cluster的config信息，包含多版本，镜像，副本数，标签等
    /**
     * @var string
     */
    public $subClustersConfig;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'         => 'auth_token',
        'addressType'       => 'address_type',
        'clusterName'       => 'cluster_name',
        'cpu'               => 'cpu',
        'disk'              => 'disk',
        'hostNetwork'       => 'host_network',
        'mem'               => 'mem',
        'name'              => 'name',
        'state'             => 'state',
        'subClustersConfig' => 'sub_clusters_config',
        'workspaceGroup'    => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('addressType', $this->addressType, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('cpu', $this->cpu, true);
        Model::validateRequired('disk', $this->disk, true);
        Model::validateRequired('hostNetwork', $this->hostNetwork, true);
        Model::validateRequired('mem', $this->mem, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('subClustersConfig', $this->subClustersConfig, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->disk) {
            $res['disk'] = $this->disk;
        }
        if (null !== $this->hostNetwork) {
            $res['host_network'] = $this->hostNetwork;
        }
        if (null !== $this->mem) {
            $res['mem'] = $this->mem;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->subClustersConfig) {
            $res['sub_clusters_config'] = $this->subClustersConfig;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFedspannerclusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['disk'])) {
            $model->disk = $map['disk'];
        }
        if (isset($map['host_network'])) {
            $model->hostNetwork = $map['host_network'];
        }
        if (isset($map['mem'])) {
            $model->mem = $map['mem'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['sub_clusters_config'])) {
            $model->subClustersConfig = $map['sub_clusters_config'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
