<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateContainerserviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属应用名称。
    /**
     * @var string
     */
    public $appName;

    // 必填，且不能重复。保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    /**
     * @var string
     */
    public $clientToken;

    // 容器服务配置。
    /**
     * @var ContainerServiceConfig
     */
    public $config;

    // 容器服务描述
    /**
     * @var string
     */
    public $description;

    // 容器服务名称。
    /**
     * @var string
     */
    public $name;

    // 所属命名空间名称。
    /**
     * @var string
     */
    public $namespace;

    // 操作人iam账号名，通过pop调用时该参数无效。
    /**
     * @var string
     */
    public $operator;

    // owner_id（废弃）
    /**
     * @var string
     */
    public $ownerId;

    // owner_name（废弃）
    /**
     * @var string
     */
    public $ownerName;

    // 所属工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroup;

    // 应用appid
    /**
     * @var string
     */
    public $appId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appName'        => 'app_name',
        'clientToken'    => 'client_token',
        'config'         => 'config',
        'description'    => 'description',
        'name'           => 'name',
        'namespace'      => 'namespace',
        'operator'       => 'operator',
        'ownerId'        => 'owner_id',
        'ownerName'      => 'owner_name',
        'workspaceGroup' => 'workspace_group',
        'appId'          => 'app_id',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('appId', $this->appId, true);
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
        if (null !== $this->config) {
            $res['config'] = null !== $this->config ? $this->config->toMap() : null;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContainerserviceRequest
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
        if (isset($map['config'])) {
            $model->config = ContainerServiceConfig::fromMap($map['config']);
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }

        return $model;
    }
}
