<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class InitSidecaropsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用服务名称
    /**
     * @var string
     */
    public $containerServiceName;

    // 预留用于防止请求重放
    /**
     * @var string
     */
    public $clientToken;

    // 应用服务所属命名空间
    /**
     * @var string
     */
    public $namespace;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 需要被注入的sidecar配置列表，可以同时注入多个
    /**
     * @var SidecarConfig[]
     */
    public $sidecarConfigs;

    // 部署单元名称
    /**
     * @var string
     */
    public $cellName;

    // 要被注入的pod列表，列表元素为pod的名称
    /**
     * @var string[]
     */
    public $serverIdentities;

    // 执行单号，所以批次共用同一单号
    /**
     * @var string
     */
    public $orderNum;
    protected $_name = [
        'authToken'            => 'auth_token',
        'containerServiceName' => 'container_service_name',
        'clientToken'          => 'client_token',
        'namespace'            => 'namespace',
        'workspaceGroup'       => 'workspace_group',
        'sidecarConfigs'       => 'sidecar_configs',
        'cellName'             => 'cell_name',
        'serverIdentities'     => 'server_identities',
        'orderNum'             => 'order_num',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('sidecarConfigs', $this->sidecarConfigs, true);
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
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
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
        if (null !== $this->sidecarConfigs) {
            $res['sidecar_configs'] = [];
            if (null !== $this->sidecarConfigs && \is_array($this->sidecarConfigs)) {
                $n = 0;
                foreach ($this->sidecarConfigs as $item) {
                    $res['sidecar_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return InitSidecaropsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
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
        if (isset($map['sidecar_configs'])) {
            if (!empty($map['sidecar_configs'])) {
                $model->sidecarConfigs = [];
                $n                     = 0;
                foreach ($map['sidecar_configs'] as $item) {
                    $model->sidecarConfigs[$n++] = null !== $item ? SidecarConfig::fromMap($item) : $item;
                }
            }
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
