<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarOperationTaskContext extends Model
{
    // sidecar开启特性
    /**
     * @example "{"mosn": ["msg"]}"
     *
     * @var string
     */
    public $enabledFeatures;

    // sidecar类型
    /**
     * @example ["mosn", "odp"]
     *
     * @var string[]
     */
    public $sidecarTypes;

    // sidecar版本
    /**
     * @example "{"mosn":"1.9.0_stable"}"
     *
     * @var string
     */
    public $sidecarVersionMap;

    // sidecar支持特性
    /**
     * @example "{"mosn": ["msg", "zqueue", "antq"]}"
     *
     * @var string
     */
    public $supportedFeatures;

    // 变更资源列表
    /**
     * @example
     *
     * @var OperationChangeInstance[]
     */
    public $changeInstances;

    // 应用名称
    /**
     * @example appName
     *
     * @var string
     */
    public $appName;
    protected $_name = [
        'enabledFeatures'   => 'enabled_features',
        'sidecarTypes'      => 'sidecar_types',
        'sidecarVersionMap' => 'sidecar_version_map',
        'supportedFeatures' => 'supported_features',
        'changeInstances'   => 'change_instances',
        'appName'           => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('sidecarTypes', $this->sidecarTypes, true);
        Model::validateRequired('sidecarVersionMap', $this->sidecarVersionMap, true);
        Model::validateRequired('changeInstances', $this->changeInstances, true);
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enabledFeatures) {
            $res['enabled_features'] = $this->enabledFeatures;
        }
        if (null !== $this->sidecarTypes) {
            $res['sidecar_types'] = $this->sidecarTypes;
        }
        if (null !== $this->sidecarVersionMap) {
            $res['sidecar_version_map'] = $this->sidecarVersionMap;
        }
        if (null !== $this->supportedFeatures) {
            $res['supported_features'] = $this->supportedFeatures;
        }
        if (null !== $this->changeInstances) {
            $res['change_instances'] = [];
            if (null !== $this->changeInstances && \is_array($this->changeInstances)) {
                $n = 0;
                foreach ($this->changeInstances as $item) {
                    $res['change_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarOperationTaskContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enabled_features'])) {
            $model->enabledFeatures = $map['enabled_features'];
        }
        if (isset($map['sidecar_types'])) {
            if (!empty($map['sidecar_types'])) {
                $model->sidecarTypes = $map['sidecar_types'];
            }
        }
        if (isset($map['sidecar_version_map'])) {
            $model->sidecarVersionMap = $map['sidecar_version_map'];
        }
        if (isset($map['supported_features'])) {
            $model->supportedFeatures = $map['supported_features'];
        }
        if (isset($map['change_instances'])) {
            if (!empty($map['change_instances'])) {
                $model->changeInstances = [];
                $n                      = 0;
                foreach ($map['change_instances'] as $item) {
                    $model->changeInstances[$n++] = null !== $item ? OperationChangeInstance::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
