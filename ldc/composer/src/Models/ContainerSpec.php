<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerSpec extends Model
{
    // 最大CPU限制，格式 1/1m。
    /**
     * @example 1
     *
     * @var string
     */
    public $cpuLimit;

    // 最少需要的CPU核数，格式 1/1m。
    /**
     * @example 100m
     *
     * @var string
     */
    public $cpuRequest;

    // 启动命令。
    /**
     * @example [_/bin/bash_]
     *
     * @var string[]
     */
    public $entryPoints;

    // 环境变量。
    /**
     * @example []
     *
     * @var EnvVar[]
     */
    public $envs;

    // 容器环境变量配置覆盖。
    /**
     * @example [{}]
     *
     * @var EnvVarOverride[]
     */
    public $envOverrides;

    // 健康检查配置
    //
    /**
     * @example
     *
     * @var HealthCheckConfig
     */
    public $healthCheckConfig;

    // 地址，格式形如 repository:tag。
    /**
     * @example nginx:latest
     *
     * @var string
     */
    public $image;

    // 镜像构建名。
    /**
     * @example test_build
     *
     * @var string
     */
    public $imageBuildName;

    // image pull secret
    /**
     * @example secret
     *
     * @var string
     */
    public $imagePullSecret;

    // 镜像来源，构建/普通镜像。
    /**
     * @example BUILD_CFG/RAW_IMAGE
     *
     * @var string
     */
    public $imageSource;

    // 生命周期钩子。
    /**
     * @example {}
     *
     * @var LifecycleHook
     */
    public $lifecycleHook;

    // 日志服务配置
    /**
     * @example
     *
     * @var LogConfigEntity[]
     */
    public $logConfigs;

    // 最大内存限制，单位 Byte/Ki/Mi/Gi/Ti/Pi。
    /**
     * @example 1G
     *
     * @var string
     */
    public $memoryLimit;

    // 最小需要的内存大小，单位 Byte/Ki/Mi/Gi/Ti/Pi。
    /**
     * @example 500M
     *
     * @var string
     */
    public $memoryRequest;

    // 容器名称。
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 重启策略。
    /**
     * @example Always/OnFailure/Never
     *
     * @var string
     */
    public $restartPolicy;

    // 容器类型。
    /**
     * @example APP/INIT/SIDECAR
     *
     * @var string
     */
    public $type;

    // 存储卷
    //
    /**
     * @example
     *
     * @var VolumeMount[]
     */
    public $volumeMounts;

    // volumeMountV2, json格式，方便扩展, 与volumes_str搭配使用，启用后废弃volume_mount字段
    // {
    // "volumeMounts": [{
    // "mountPath": "/container/config",
    // "name": "aarm-base-configmap-volume",
    // "readOnly": true
    // }, {
    // "mountPath": "/container/scrt",
    // "name": "panling-secret-volume",
    // "readOnly": true
    // }, {
    // "mountPath": "/container/pvc",
    // "name": "afa-public-data-pv",
    // "readOnly": true
    // }, {
    // "mountPath": "/container/local",
    // "name": "container-local-host-volume",
    // "readOnly": true
    // }]
    // }
    // 这里会兼容原来OpenAPI传过来的volume_mount字段
    /**
     * @example {}
     *
     * @var string
     */
    public $volumeMountsStr;

    // 与volume_mounts_str搭配使用，描述pod的volume部分
    // {
    // "volumes": [{
    // "configMap": {
    // "defaultMode": 256,
    // "name": "aarm-base"
    // },
    // "name": "aarm-base-configmap-volume"
    // },
    // {
    // "name": "panling-secret-volume",
    // "secret": {
    // "defaultMode": 256,
    // "secretName": "panling"
    // }
    // },
    // {
    // "name": "afa-public-data-pv",
    // "persistentVolumeClaim": {
    // "claimName": "afa-public-data"
    // }
    // },
    // {
    // "hostPath": {
    // "path": "/local"
    // },
    // "name": "container-local-host-volume"
    // }
    // ]
    // }
    /**
     * @example {}
     *
     * @var string
     */
    public $volumesStr;

    // 基础字段覆盖
    /**
     * @example
     *
     * @var FieldOverride[]
     */
    public $fieldOverrides;
    protected $_name = [
        'cpuLimit'          => 'cpu_limit',
        'cpuRequest'        => 'cpu_request',
        'entryPoints'       => 'entry_points',
        'envs'              => 'envs',
        'envOverrides'      => 'env_overrides',
        'healthCheckConfig' => 'health_check_config',
        'image'             => 'image',
        'imageBuildName'    => 'image_build_name',
        'imagePullSecret'   => 'image_pull_secret',
        'imageSource'       => 'image_source',
        'lifecycleHook'     => 'lifecycle_hook',
        'logConfigs'        => 'log_configs',
        'memoryLimit'       => 'memory_limit',
        'memoryRequest'     => 'memory_request',
        'name'              => 'name',
        'restartPolicy'     => 'restart_policy',
        'type'              => 'type',
        'volumeMounts'      => 'volume_mounts',
        'volumeMountsStr'   => 'volume_mounts_str',
        'volumesStr'        => 'volumes_str',
        'fieldOverrides'    => 'field_overrides',
    ];

    public function validate()
    {
        Model::validateRequired('cpuLimit', $this->cpuLimit, true);
        Model::validateRequired('cpuRequest', $this->cpuRequest, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('imageSource', $this->imageSource, true);
        Model::validateRequired('memoryLimit', $this->memoryLimit, true);
        Model::validateRequired('memoryRequest', $this->memoryRequest, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('restartPolicy', $this->restartPolicy, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpuLimit) {
            $res['cpu_limit'] = $this->cpuLimit;
        }
        if (null !== $this->cpuRequest) {
            $res['cpu_request'] = $this->cpuRequest;
        }
        if (null !== $this->entryPoints) {
            $res['entry_points'] = $this->entryPoints;
        }
        if (null !== $this->envs) {
            $res['envs'] = [];
            if (null !== $this->envs && \is_array($this->envs)) {
                $n = 0;
                foreach ($this->envs as $item) {
                    $res['envs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->envOverrides) {
            $res['env_overrides'] = [];
            if (null !== $this->envOverrides && \is_array($this->envOverrides)) {
                $n = 0;
                foreach ($this->envOverrides as $item) {
                    $res['env_overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->healthCheckConfig) {
            $res['health_check_config'] = null !== $this->healthCheckConfig ? $this->healthCheckConfig->toMap() : null;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->imageBuildName) {
            $res['image_build_name'] = $this->imageBuildName;
        }
        if (null !== $this->imagePullSecret) {
            $res['image_pull_secret'] = $this->imagePullSecret;
        }
        if (null !== $this->imageSource) {
            $res['image_source'] = $this->imageSource;
        }
        if (null !== $this->lifecycleHook) {
            $res['lifecycle_hook'] = null !== $this->lifecycleHook ? $this->lifecycleHook->toMap() : null;
        }
        if (null !== $this->logConfigs) {
            $res['log_configs'] = [];
            if (null !== $this->logConfigs && \is_array($this->logConfigs)) {
                $n = 0;
                foreach ($this->logConfigs as $item) {
                    $res['log_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->memoryLimit) {
            $res['memory_limit'] = $this->memoryLimit;
        }
        if (null !== $this->memoryRequest) {
            $res['memory_request'] = $this->memoryRequest;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->restartPolicy) {
            $res['restart_policy'] = $this->restartPolicy;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->volumeMounts) {
            $res['volume_mounts'] = [];
            if (null !== $this->volumeMounts && \is_array($this->volumeMounts)) {
                $n = 0;
                foreach ($this->volumeMounts as $item) {
                    $res['volume_mounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->volumeMountsStr) {
            $res['volume_mounts_str'] = $this->volumeMountsStr;
        }
        if (null !== $this->volumesStr) {
            $res['volumes_str'] = $this->volumesStr;
        }
        if (null !== $this->fieldOverrides) {
            $res['field_overrides'] = [];
            if (null !== $this->fieldOverrides && \is_array($this->fieldOverrides)) {
                $n = 0;
                foreach ($this->fieldOverrides as $item) {
                    $res['field_overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cpu_limit'])) {
            $model->cpuLimit = $map['cpu_limit'];
        }
        if (isset($map['cpu_request'])) {
            $model->cpuRequest = $map['cpu_request'];
        }
        if (isset($map['entry_points'])) {
            if (!empty($map['entry_points'])) {
                $model->entryPoints = $map['entry_points'];
            }
        }
        if (isset($map['envs'])) {
            if (!empty($map['envs'])) {
                $model->envs = [];
                $n           = 0;
                foreach ($map['envs'] as $item) {
                    $model->envs[$n++] = null !== $item ? EnvVar::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['env_overrides'])) {
            if (!empty($map['env_overrides'])) {
                $model->envOverrides = [];
                $n                   = 0;
                foreach ($map['env_overrides'] as $item) {
                    $model->envOverrides[$n++] = null !== $item ? EnvVarOverride::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['health_check_config'])) {
            $model->healthCheckConfig = HealthCheckConfig::fromMap($map['health_check_config']);
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['image_build_name'])) {
            $model->imageBuildName = $map['image_build_name'];
        }
        if (isset($map['image_pull_secret'])) {
            $model->imagePullSecret = $map['image_pull_secret'];
        }
        if (isset($map['image_source'])) {
            $model->imageSource = $map['image_source'];
        }
        if (isset($map['lifecycle_hook'])) {
            $model->lifecycleHook = LifecycleHook::fromMap($map['lifecycle_hook']);
        }
        if (isset($map['log_configs'])) {
            if (!empty($map['log_configs'])) {
                $model->logConfigs = [];
                $n                 = 0;
                foreach ($map['log_configs'] as $item) {
                    $model->logConfigs[$n++] = null !== $item ? LogConfigEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['memory_limit'])) {
            $model->memoryLimit = $map['memory_limit'];
        }
        if (isset($map['memory_request'])) {
            $model->memoryRequest = $map['memory_request'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['restart_policy'])) {
            $model->restartPolicy = $map['restart_policy'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['volume_mounts'])) {
            if (!empty($map['volume_mounts'])) {
                $model->volumeMounts = [];
                $n                   = 0;
                foreach ($map['volume_mounts'] as $item) {
                    $model->volumeMounts[$n++] = null !== $item ? VolumeMount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['volume_mounts_str'])) {
            $model->volumeMountsStr = $map['volume_mounts_str'];
        }
        if (isset($map['volumes_str'])) {
            $model->volumesStr = $map['volumes_str'];
        }
        if (isset($map['field_overrides'])) {
            if (!empty($map['field_overrides'])) {
                $model->fieldOverrides = [];
                $n                     = 0;
                foreach ($map['field_overrides'] as $item) {
                    $model->fieldOverrides[$n++] = null !== $item ? FieldOverride::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
