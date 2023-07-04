<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ApplicationInstance extends Model
{
    // 应用实例的名字，一般为应用code的小写字母
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $name;

    // 应用版本
    /**
     * @example 1.1.1
     *
     * @var string
     */
    public $appVersion;

    // 应用实例的命名空间，一般：站点code-prodCode小写
    /**
     * @example ant-iam
     *
     * @var string
     */
    public $namespace;

    // 一般为空，系统自动填充默认值
    /**
     * @example yoda-xx
     *
     * @var string
     */
    public $storageClass;

    // 应用部署的拓扑约束，一般为：亲和性、反亲和性、sidecar等
    /**
     * @example
     *
     * @var TopologyConstraints
     */
    public $topologyConstraints;

    // 健康检查、hook配置
    /**
     * @example
     *
     * @var Lifecycle
     */
    public $lifecycle;

    // 应用的环境变量
    /**
     * @example
     *
     * @var AppEnv[]
     */
    public $appEnvs;

    // 依赖的应用名列表
    /**
     * @example
     *
     * @var string[]
     */
    public $applicationDependencies;

    // 应用的规格
    /**
     * @example
     *
     * @var ResourceSpec
     */
    public $resourceSpec;

    // 持久化存储，可为空数组
    /**
     * @example
     *
     * @var PersistentVolumeConfig[]
     */
    public $persistentVolumeConfigs;

    // 运维策略
    /**
     * @example
     *
     * @var OpsSpec
     */
    public $opsSpec;

    // OrderedReady:顺序更新，Parallel：并行更新
    /**
     * @example OrderedReady
     *
     * @var string
     */
    public $podManagementPolicy;

    // 镜像
    /**
     * @example acs-reg.xxxx.com/ccc/xxxx
     *
     * @var string
     */
    public $image;
    protected $_name = [
        'name'                    => 'name',
        'appVersion'              => 'app_version',
        'namespace'               => 'namespace',
        'storageClass'            => 'storage_class',
        'topologyConstraints'     => 'topology_constraints',
        'lifecycle'               => 'lifecycle',
        'appEnvs'                 => 'app_envs',
        'applicationDependencies' => 'application_dependencies',
        'resourceSpec'            => 'resource_spec',
        'persistentVolumeConfigs' => 'persistent_volume_configs',
        'opsSpec'                 => 'ops_spec',
        'podManagementPolicy'     => 'pod_management_policy',
        'image'                   => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('appVersion', $this->appVersion, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('resourceSpec', $this->resourceSpec, true);
        Model::validateRequired('persistentVolumeConfigs', $this->persistentVolumeConfigs, true);
        Model::validateRequired('opsSpec', $this->opsSpec, true);
        Model::validateRequired('podManagementPolicy', $this->podManagementPolicy, true);
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->storageClass) {
            $res['storage_class'] = $this->storageClass;
        }
        if (null !== $this->topologyConstraints) {
            $res['topology_constraints'] = null !== $this->topologyConstraints ? $this->topologyConstraints->toMap() : null;
        }
        if (null !== $this->lifecycle) {
            $res['lifecycle'] = null !== $this->lifecycle ? $this->lifecycle->toMap() : null;
        }
        if (null !== $this->appEnvs) {
            $res['app_envs'] = [];
            if (null !== $this->appEnvs && \is_array($this->appEnvs)) {
                $n = 0;
                foreach ($this->appEnvs as $item) {
                    $res['app_envs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->applicationDependencies) {
            $res['application_dependencies'] = $this->applicationDependencies;
        }
        if (null !== $this->resourceSpec) {
            $res['resource_spec'] = null !== $this->resourceSpec ? $this->resourceSpec->toMap() : null;
        }
        if (null !== $this->persistentVolumeConfigs) {
            $res['persistent_volume_configs'] = [];
            if (null !== $this->persistentVolumeConfigs && \is_array($this->persistentVolumeConfigs)) {
                $n = 0;
                foreach ($this->persistentVolumeConfigs as $item) {
                    $res['persistent_volume_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opsSpec) {
            $res['ops_spec'] = null !== $this->opsSpec ? $this->opsSpec->toMap() : null;
        }
        if (null !== $this->podManagementPolicy) {
            $res['pod_management_policy'] = $this->podManagementPolicy;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['storage_class'])) {
            $model->storageClass = $map['storage_class'];
        }
        if (isset($map['topology_constraints'])) {
            $model->topologyConstraints = TopologyConstraints::fromMap($map['topology_constraints']);
        }
        if (isset($map['lifecycle'])) {
            $model->lifecycle = Lifecycle::fromMap($map['lifecycle']);
        }
        if (isset($map['app_envs'])) {
            if (!empty($map['app_envs'])) {
                $model->appEnvs = [];
                $n              = 0;
                foreach ($map['app_envs'] as $item) {
                    $model->appEnvs[$n++] = null !== $item ? AppEnv::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['application_dependencies'])) {
            if (!empty($map['application_dependencies'])) {
                $model->applicationDependencies = $map['application_dependencies'];
            }
        }
        if (isset($map['resource_spec'])) {
            $model->resourceSpec = ResourceSpec::fromMap($map['resource_spec']);
        }
        if (isset($map['persistent_volume_configs'])) {
            if (!empty($map['persistent_volume_configs'])) {
                $model->persistentVolumeConfigs = [];
                $n                              = 0;
                foreach ($map['persistent_volume_configs'] as $item) {
                    $model->persistentVolumeConfigs[$n++] = null !== $item ? PersistentVolumeConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ops_spec'])) {
            $model->opsSpec = OpsSpec::fromMap($map['ops_spec']);
        }
        if (isset($map['pod_management_policy'])) {
            $model->podManagementPolicy = $map['pod_management_policy'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
