<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateSidecaropsRequest extends Model
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

    // 保证请求幂等性
    /**
     * @var string
     */
    public $clientToken;

    // 所属命名空间
    /**
     * @var string
     */
    public $namespace;

    // 所属工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // sidecar的类型，如mosn，odp
    /**
     * @var SidecarConfig
     */
    public $sidecarConfig;

    // 指定sidecar的基线模板版本进行升级，可选，不填时，默认选中指定sidecar的最新版本进行升级
    /**
     * @var string
     */
    public $sidecarVersion;

    // 单元名称
    /**
     * @var string
     */
    public $cellName;

    // 要更新的hostname列表
    /**
     * @var string[]
     */
    public $serverIdentities;

    // 工单id
    /**
     * @var string
     */
    public $orderNum;
    protected $_name = [
        'authToken'        => 'auth_token',
        'appName'          => 'app_name',
        'clientToken'      => 'client_token',
        'namespace'        => 'namespace',
        'workspaceGroup'   => 'workspace_group',
        'sidecarConfig'    => 'sidecar_config',
        'sidecarVersion'   => 'sidecar_version',
        'cellName'         => 'cell_name',
        'serverIdentities' => 'server_identities',
        'orderNum'         => 'order_num',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('sidecarConfig', $this->sidecarConfig, true);
        Model::validateRequired('cellName', $this->cellName, true);
        Model::validateRequired('serverIdentities', $this->serverIdentities, true);
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
        if (null !== $this->sidecarConfig) {
            $res['sidecar_config'] = null !== $this->sidecarConfig ? $this->sidecarConfig->toMap() : null;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->cellName) {
            $res['cell_name'] = $this->cellName;
        }
        if (null !== $this->serverIdentities) {
            $res['server_identities'] = $this->serverIdentities;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSidecaropsRequest
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
        if (isset($map['sidecar_config'])) {
            $model->sidecarConfig = SidecarConfig::fromMap($map['sidecar_config']);
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['cell_name'])) {
            $model->cellName = $map['cell_name'];
        }
        if (isset($map['server_identities'])) {
            if (!empty($map['server_identities'])) {
                $model->serverIdentities = $map['server_identities'];
            }
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }

        return $model;
    }
}
