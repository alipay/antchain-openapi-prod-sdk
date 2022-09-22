<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateContainerserviceJsonpatchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 必填：保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    /**
     * @var string
     */
    public $clientToken;

    // 应用服务名称
    /**
     * @var string
     */
    public $name;

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

    // 应用服务版本，不传取最新的版本
    /**
     * @var string
     */
    public $revision;

    // 操作人账号
    /**
     * @var string
     */
    public $operator;

    // json patch 内容
    /**
     * @var JsonPatch[]
     */
    public $jsonPatches;

    // 配置为CLOUD_NATIVE_GROUP_RELEASE会自动创建发布单
    /**
     * @var string
     */
    public $opsType;

    // 发布单类型，SLS_CHANGE代表只做sls配置变更
    /**
     * @var string
     */
    public $opsMode;

    // 部署策略
    /**
     * @var DeployConfig
     */
    public $deployConfig;

    // 是否自动执行发布单，默认 true
    /**
     * @var bool
     */
    public $isAutoExecute;

    // 灰度平台pods分批序列化为json的结果
    //
    /**
     * @var string
     */
    public $graycoreBatches;

    // [huanyu场景使用]huanyu变更单id
    /**
     * @var string
     */
    public $huanyuExecNo;
    protected $_name = [
        'authToken'       => 'auth_token',
        'clientToken'     => 'client_token',
        'name'            => 'name',
        'namespace'       => 'namespace',
        'workspaceGroup'  => 'workspace_group',
        'revision'        => 'revision',
        'operator'        => 'operator',
        'jsonPatches'     => 'json_patches',
        'opsType'         => 'ops_type',
        'opsMode'         => 'ops_mode',
        'deployConfig'    => 'deploy_config',
        'isAutoExecute'   => 'is_auto_execute',
        'graycoreBatches' => 'graycore_batches',
        'huanyuExecNo'    => 'huanyu_exec_no',
    ];

    public function validate()
    {
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('jsonPatches', $this->jsonPatches, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->jsonPatches) {
            $res['json_patches'] = [];
            if (null !== $this->jsonPatches && \is_array($this->jsonPatches)) {
                $n = 0;
                foreach ($this->jsonPatches as $item) {
                    $res['json_patches'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }
        if (null !== $this->opsMode) {
            $res['ops_mode'] = $this->opsMode;
        }
        if (null !== $this->deployConfig) {
            $res['deploy_config'] = null !== $this->deployConfig ? $this->deployConfig->toMap() : null;
        }
        if (null !== $this->isAutoExecute) {
            $res['is_auto_execute'] = $this->isAutoExecute;
        }
        if (null !== $this->graycoreBatches) {
            $res['graycore_batches'] = $this->graycoreBatches;
        }
        if (null !== $this->huanyuExecNo) {
            $res['huanyu_exec_no'] = $this->huanyuExecNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContainerserviceJsonpatchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['json_patches'])) {
            if (!empty($map['json_patches'])) {
                $model->jsonPatches = [];
                $n                  = 0;
                foreach ($map['json_patches'] as $item) {
                    $model->jsonPatches[$n++] = null !== $item ? JsonPatch::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ops_type'])) {
            $model->opsType = $map['ops_type'];
        }
        if (isset($map['ops_mode'])) {
            $model->opsMode = $map['ops_mode'];
        }
        if (isset($map['deploy_config'])) {
            $model->deployConfig = DeployConfig::fromMap($map['deploy_config']);
        }
        if (isset($map['is_auto_execute'])) {
            $model->isAutoExecute = $map['is_auto_execute'];
        }
        if (isset($map['graycore_batches'])) {
            $model->graycoreBatches = $map['graycore_batches'];
        }
        if (isset($map['huanyu_exec_no'])) {
            $model->huanyuExecNo = $map['huanyu_exec_no'];
        }

        return $model;
    }
}
