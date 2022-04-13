<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateFederationDeploymentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属应用
    /**
     * @var string
     */
    public $app;

    // clusters
    /**
     * @var string[]
     */
    public $clusters;

    // FedDeploymentClusterOverride描述
    /**
     * @var FedDeploymentClusterOverride[]
     */
    public $clusterOverrides;

    // DNS配置
    /**
     * @var string
     */
    public $dnsPolicy;

    // Host networking requested for this pod
    /**
     * @var bool
     */
    public $hostNetwork;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // Pod模板描述
    /**
     * @var PodSpec
     */
    public $podSpec;

    // Deployment 副本数
    /**
     * @var int
     */
    public $replicas;

    // Pod volume list
    /**
     * @var Volume[]
     */
    public $volumes;

    // 环境组名称
    /**
     * @var string
     */
    public $workspaceGroupName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'app'                => 'app',
        'clusters'           => 'clusters',
        'clusterOverrides'   => 'cluster_overrides',
        'dnsPolicy'          => 'dns_policy',
        'hostNetwork'        => 'host_network',
        'name'               => 'name',
        'namespace'          => 'namespace',
        'podSpec'            => 'pod_spec',
        'replicas'           => 'replicas',
        'volumes'            => 'volumes',
        'workspaceGroupName' => 'workspace_group_name',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('clusters', $this->clusters, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('podSpec', $this->podSpec, true);
        Model::validateRequired('replicas', $this->replicas, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->clusters) {
            $res['clusters'] = $this->clusters;
        }
        if (null !== $this->clusterOverrides) {
            $res['cluster_overrides'] = [];
            if (null !== $this->clusterOverrides && \is_array($this->clusterOverrides)) {
                $n = 0;
                foreach ($this->clusterOverrides as $item) {
                    $res['cluster_overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dnsPolicy) {
            $res['dns_policy'] = $this->dnsPolicy;
        }
        if (null !== $this->hostNetwork) {
            $res['host_network'] = $this->hostNetwork;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->podSpec) {
            $res['pod_spec'] = null !== $this->podSpec ? $this->podSpec->toMap() : null;
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
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFederationDeploymentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['clusters'])) {
            if (!empty($map['clusters'])) {
                $model->clusters = $map['clusters'];
            }
        }
        if (isset($map['cluster_overrides'])) {
            if (!empty($map['cluster_overrides'])) {
                $model->clusterOverrides = [];
                $n                       = 0;
                foreach ($map['cluster_overrides'] as $item) {
                    $model->clusterOverrides[$n++] = null !== $item ? FedDeploymentClusterOverride::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['dns_policy'])) {
            $model->dnsPolicy = $map['dns_policy'];
        }
        if (isset($map['host_network'])) {
            $model->hostNetwork = $map['host_network'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['pod_spec'])) {
            $model->podSpec = PodSpec::fromMap($map['pod_spec']);
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }
        if (isset($map['volumes'])) {
            if (!empty($map['volumes'])) {
                $model->volumes = [];
                $n              = 0;
                foreach ($map['volumes'] as $item) {
                    $model->volumes[$n++] = null !== $item ? Volume::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }

        return $model;
    }
}
