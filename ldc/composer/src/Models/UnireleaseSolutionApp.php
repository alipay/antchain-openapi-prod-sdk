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

    // 中间件配置diff信息
    /**
     * @example []
     *
     * @var string[]
     */
    public $middlewareConfigDiffs;

    // 工作空间组
    /**
     * @example test
     *
     * @var string
     */
    public $workspaceGroup;

    // 命名空间
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // 中间件配置变更diff摘要
    /**
     * @example xxx
     *
     * @var string
     */
    public $middlewareConfigDiffSummary;

    // 风险等级: ORDINARY-一般、HIGH-高危
    /**
     * @example ORDINARY
     *
     * @var string
     */
    public $riskLevel;
    protected $_name = [
        'app'                         => 'app',
        'dependsOn'                   => 'depends_on',
        'releaseConfig'               => 'release_config',
        'middlewareConfigs'           => 'middleware_configs',
        'tenant'                      => 'tenant',
        'middlewareConfigDiffs'       => 'middleware_config_diffs',
        'workspaceGroup'              => 'workspace_group',
        'namespace'                   => 'namespace',
        'middlewareConfigDiffSummary' => 'middleware_config_diff_summary',
        'riskLevel'                   => 'risk_level',
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
        if (null !== $this->middlewareConfigDiffs) {
            $res['middleware_config_diffs'] = $this->middlewareConfigDiffs;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->middlewareConfigDiffSummary) {
            $res['middleware_config_diff_summary'] = $this->middlewareConfigDiffSummary;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
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
        if (isset($map['middleware_config_diffs'])) {
            if (!empty($map['middleware_config_diffs'])) {
                $model->middlewareConfigDiffs = $map['middleware_config_diffs'];
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['middleware_config_diff_summary'])) {
            $model->middlewareConfigDiffSummary = $map['middleware_config_diff_summary'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }

        return $model;
    }
}
