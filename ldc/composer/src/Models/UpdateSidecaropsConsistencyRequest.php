<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateSidecaropsConsistencyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 请求唯一性验证
    /**
     * @var string
     */
    public $clientToken;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 需要更新的cell名称数组
    /**
     * @var string[]
     */
    public $cellNames;

    // 需要更新的sidecar属性
    /**
     * @var SidecarConfig
     */
    public $sidecarConfig;

    // 指定sidecar版本进行升级，不填入此字段时，默认使用对应sidecar的最新版本
    /**
     * @var string
     */
    public $sidecarVersion;

    // 发布单号
    /**
     * @var string
     */
    public $orderNum;

    // 是否回滚流程
    /**
     * @var bool
     */
    public $isRollback;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appName'        => 'app_name',
        'clientToken'    => 'client_token',
        'namespace'      => 'namespace',
        'workspaceGroup' => 'workspace_group',
        'cellNames'      => 'cell_names',
        'sidecarConfig'  => 'sidecar_config',
        'sidecarVersion' => 'sidecar_version',
        'orderNum'       => 'order_num',
        'isRollback'     => 'is_rollback',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('cellNames', $this->cellNames, true);
        Model::validateRequired('sidecarConfig', $this->sidecarConfig, true);
        Model::validateRequired('orderNum', $this->orderNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->cellNames) {
            $res['cell_names'] = $this->cellNames;
        }
        if (null !== $this->sidecarConfig) {
            $res['sidecar_config'] = null !== $this->sidecarConfig ? $this->sidecarConfig->toMap() : null;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }
        if (null !== $this->isRollback) {
            $res['is_rollback'] = $this->isRollback;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSidecaropsConsistencyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['cell_names'])) {
            if (!empty($map['cell_names'])) {
                $model->cellNames = $map['cell_names'];
            }
        }
        if (isset($map['sidecar_config'])) {
            $model->sidecarConfig = SidecarConfig::fromMap($map['sidecar_config']);
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }
        if (isset($map['is_rollback'])) {
            $model->isRollback = $map['is_rollback'];
        }

        return $model;
    }
}
