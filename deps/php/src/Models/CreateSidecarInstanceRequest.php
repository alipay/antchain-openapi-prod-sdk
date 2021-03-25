<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarParamsConfig;

class CreateSidecarInstanceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'description' => 'description',
        'instanceName' => 'instance_name',
        'params' => 'params',
        'rule' => 'rule',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'sidecarReleaseVersionId' => 'sidecar_release_version_id',
        'paramsConfigs' => 'params_configs',
    ];
    public function validate() {
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('rule', $this->rule, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('scopeIdentity', $this->scopeIdentity, true);
        Model::validateRequired('sidecarReleaseVersionId', $this->sidecarReleaseVersionId, true);
        Model::validateRequired('paramsConfigs', $this->paramsConfigs, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->rule) {
            $res['rule'] = $this->rule;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->sidecarReleaseVersionId) {
            $res['sidecar_release_version_id'] = $this->sidecarReleaseVersionId;
        }
        if (null !== $this->paramsConfigs) {
            $res['params_configs'] = [];
            if(null !== $this->paramsConfigs && is_array($this->paramsConfigs)){
                $n = 0;
                foreach($this->paramsConfigs as $item){
                    $res['params_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateSidecarInstanceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['instance_name'])){
            $model->instanceName = $map['instance_name'];
        }
        if(isset($map['params'])){
            $model->params = $map['params'];
        }
        if(isset($map['rule'])){
            $model->rule = $map['rule'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        if(isset($map['sidecar_release_version_id'])){
            $model->sidecarReleaseVersionId = $map['sidecar_release_version_id'];
        }
        if(isset($map['params_configs'])){
            if(!empty($map['params_configs'])){
                $model->paramsConfigs = [];
                $n = 0;
                foreach($map['params_configs'] as $item) {
                    $model->paramsConfigs[$n++] = null !== $item ? SidecarParamsConfig::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 规则描述
    /**
     * @var string
     */
    public $description;

    // 实例名称
    /**
     * @var string
     */
    public $instanceName;

    // 环境参数模板
    /**
     * @var string
     */
    public $params;

    // 自定义规则内容
    /**
     * @var string
     */
    public $rule;

    // sidecar生效范围：workspace、workspace_group、region
    // 
    /**
     * @var string
     */
    public $scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    // 
    /**
     * @var string
     */
    public $scopeIdentity;

    // sidecar版本id
    // 
    /**
     * @var string
     */
    public $sidecarReleaseVersionId;

    // sidecar环境参数配置
    // 
    /**
     * @var SidecarParamsConfig[]
     */
    public $paramsConfigs;

}
