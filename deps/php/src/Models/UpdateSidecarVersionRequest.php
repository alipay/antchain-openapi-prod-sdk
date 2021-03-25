<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarTemplateConfig;

class UpdateSidecarVersionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'description' => 'description',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'sidecarName' => 'sidecar_name',
        'sidecarVersion' => 'sidecar_version',
        'status' => 'status',
        'template' => 'template',
        'templateConfigs' => 'template_configs',
        'type' => 'type',
        'versionPeriod' => 'version_period',
        'releaseNote' => 'release_note',
    ];
    public function validate() {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('scopeIdentity', $this->scopeIdentity, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('template', $this->template, true);
        Model::validateRequired('templateConfigs', $this->templateConfigs, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('versionPeriod', $this->versionPeriod, true);
        Model::validateRequired('releaseNote', $this->releaseNote, true);
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->templateConfigs) {
            $res['template_configs'] = [];
            if(null !== $this->templateConfigs && is_array($this->templateConfigs)){
                $n = 0;
                foreach($this->templateConfigs as $item){
                    $res['template_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->versionPeriod) {
            $res['version_period'] = $this->versionPeriod;
        }
        if (null !== $this->releaseNote) {
            $res['release_note'] = $this->releaseNote;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateSidecarVersionRequest
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
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        if(isset($map['sidecar_name'])){
            $model->sidecarName = $map['sidecar_name'];
        }
        if(isset($map['sidecar_version'])){
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['template'])){
            $model->template = $map['template'];
        }
        if(isset($map['template_configs'])){
            if(!empty($map['template_configs'])){
                $model->templateConfigs = [];
                $n = 0;
                foreach($map['template_configs'] as $item) {
                    $model->templateConfigs[$n++] = null !== $item ? SidecarTemplateConfig::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['version_period'])){
            $model->versionPeriod = $map['version_period'];
        }
        if(isset($map['release_note'])){
            $model->releaseNote = $map['release_note'];
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

    // sidecar版本描述
    /**
     * @var string
     */
    public $description;

    // sidecar生效范围：workspace、workspace_group、region
    // 
    /**
     * @var string
     */
    public $scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    /**
     * @var string
     */
    public $scopeIdentity;

    // sidecar名称
    /**
     * @var string
     */
    public $sidecarName;

    // sidecar版本号
    /**
     * @var string
     */
    public $sidecarVersion;

    // 版本状态
    /**
     * @var int
     */
    public $status;

    // sidecar模板内容
    /**
     * @var string
     */
    public $template;

    // sidecar模板配置
    /**
     * @var SidecarTemplateConfig[]
     */
    public $templateConfigs;

    // sidecar版本类型
    /**
     * @var string
     */
    public $type;

    // 版本周期：alpha/beta/release
    // 
    /**
     * @var string
     */
    public $versionPeriod;

    // 版本特性
    /**
     * @var string
     */
    public $releaseNote;

}
