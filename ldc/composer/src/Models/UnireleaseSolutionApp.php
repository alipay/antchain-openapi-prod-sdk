<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnireleaseSolutionApp extends Model
{
    // 应用名称
    /**
     * @example antcloud
     *
     * @var string
     */
    public $app;

    // 应用依赖信息
    /**
     * @example ["unimetaservice"]
     *
     * @var string[]
     */
    public $dependsOn;

    // 应用发布配置
    /**
     * @example
     *
     * @var AppReleaseConfig
     */
    public $releaseConfig;

    // 中间件配置
    /**
     * @example 中间件配置信息，列表内容为OAM类型的yaml列表
     *
     * @var string[]
     */
    public $middlewareConfigs;

    // 机构/租户信息
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $tenant;
    protected $_name = [
        'app'               => 'app',
        'dependsOn'         => 'depends_on',
        'releaseConfig'     => 'release_config',
        'middlewareConfigs' => 'middleware_configs',
        'tenant'            => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('dependsOn', $this->dependsOn, true);
        Model::validateRequired('releaseConfig', $this->releaseConfig, true);
        Model::validateRequired('middlewareConfigs', $this->middlewareConfigs, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->dependsOn) {
            $res['depends_on'] = $this->dependsOn;
        }
        if (null !== $this->releaseConfig) {
            $res['release_config'] = null !== $this->releaseConfig ? $this->releaseConfig->toMap() : null;
        }
        if (null !== $this->middlewareConfigs) {
            $res['middleware_configs'] = $this->middlewareConfigs;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnireleaseSolutionApp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['depends_on'])) {
            if (!empty($map['depends_on'])) {
                $model->dependsOn = $map['depends_on'];
            }
        }
        if (isset($map['release_config'])) {
            $model->releaseConfig = AppReleaseConfig::fromMap($map['release_config']);
        }
        if (isset($map['middleware_configs'])) {
            if (!empty($map['middleware_configs'])) {
                $model->middlewareConfigs = $map['middleware_configs'];
            }
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
