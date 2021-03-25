<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppServiceEnvParam extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'appServiceId' => 'app_service_id',
        'baselineBuildpackId' => 'baseline_buildpack_id',
        'creationTime' => 'creation_time',
        'defaultValue' => 'default_value',
        'description' => 'description',
        'id' => 'id',
        'key' => 'key',
        'modificationTime' => 'modification_time',
        'originalDefaultValue' => 'original_default_value',
        'originalDescription' => 'original_description',
        'originalReadonly' => 'original_readonly',
        'originalRequired' => 'original_required',
        'readonly' => 'readonly',
        'required' => 'required',
        'status' => 'status',
        'value' => 'value',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->baselineBuildpackId) {
            $res['baseline_buildpack_id'] = $this->baselineBuildpackId;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->originalDefaultValue) {
            $res['original_default_value'] = $this->originalDefaultValue;
        }
        if (null !== $this->originalDescription) {
            $res['original_description'] = $this->originalDescription;
        }
        if (null !== $this->originalReadonly) {
            $res['original_readonly'] = $this->originalReadonly;
        }
        if (null !== $this->originalRequired) {
            $res['original_required'] = $this->originalRequired;
        }
        if (null !== $this->readonly) {
            $res['readonly'] = $this->readonly;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppServiceEnvParam
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['app_service_id'])){
            $model->appServiceId = $map['app_service_id'];
        }
        if(isset($map['baseline_buildpack_id'])){
            $model->baselineBuildpackId = $map['baseline_buildpack_id'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['default_value'])){
            $model->defaultValue = $map['default_value'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['original_default_value'])){
            $model->originalDefaultValue = $map['original_default_value'];
        }
        if(isset($map['original_description'])){
            $model->originalDescription = $map['original_description'];
        }
        if(isset($map['original_readonly'])){
            $model->originalReadonly = $map['original_readonly'];
        }
        if(isset($map['original_required'])){
            $model->originalRequired = $map['original_required'];
        }
        if(isset($map['readonly'])){
            $model->readonly = $map['readonly'];
        }
        if(isset($map['required'])){
            $model->required = $map['required'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    // app_id
    /**
     * @example app_id
     * @var string
     */
    public $appId;

    // app_service_id
    /**
     * @example app_service_id
     * @var string
     */
    public $appServiceId;

    // baseline_buildpack_id
    /**
     * @example baseline_buildpack_id
     * @var string
     */
    public $baselineBuildpackId;

    // creation_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $creationTime;

    // default_value
    /**
     * @example default_value
     * @var string
     */
    public $defaultValue;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // key
    /**
     * @example key
     * @var string
     */
    public $key;

    // modification_time
    /**
     * @example 
     * @var string
     */
    public $modificationTime;

    // original_default_value
    /**
     * @example original_default_value
     * @var string
     */
    public $originalDefaultValue;

    // original_description
    /**
     * @example original_description
     * @var string
     */
    public $originalDescription;

    // original_readonly
    /**
     * @example original_readonly
     * @var string
     */
    public $originalReadonly;

    // original_required
    /**
     * @example true,false
     * @var bool
     */
    public $originalRequired;

    // readonly
    /**
     * @example true, false
     * @var bool
     */
    public $readonly;

    // required
    /**
     * @example true, false
     * @var bool
     */
    public $required;

    // status
    /**
     * @example status
     * @var string
     */
    public $status;

    // value
    /**
     * @example value
     * @var string
     */
    public $value;

    // workspace_id
    /**
     * @example workspace_id
     * @var string
     */
    public $workspaceId;

}
