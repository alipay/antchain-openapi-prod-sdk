<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildpackAppService extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'appName' => 'app_name',
        'buildpackFullVersion' => 'buildpack_full_version',
        'buildpackId' => 'buildpack_id',
        'cellIds' => 'cell_ids',
        'description' => 'description',
        'extendProperties' => 'extend_properties',
        'id' => 'id',
        'isDefault' => 'is_default',
        'isService' => 'is_service',
        'lastDeployStatus' => 'last_deploy_status',
        'lastDeployVersion' => 'last_deploy_version',
        'lastOpsOrderId' => 'last_ops_order_id',
        'name' => 'name',
        'ownerId' => 'owner_id',
        'techstackId' => 'techstack_id',
        'techstackIdentity' => 'techstack_identity',
        'techstackName' => 'techstack_name',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->buildpackFullVersion) {
            $res['buildpack_full_version'] = $this->buildpackFullVersion;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isDefault) {
            $res['is_default'] = $this->isDefault;
        }
        if (null !== $this->isService) {
            $res['is_service'] = $this->isService;
        }
        if (null !== $this->lastDeployStatus) {
            $res['last_deploy_status'] = $this->lastDeployStatus;
        }
        if (null !== $this->lastDeployVersion) {
            $res['last_deploy_version'] = $this->lastDeployVersion;
        }
        if (null !== $this->lastOpsOrderId) {
            $res['last_ops_order_id'] = $this->lastOpsOrderId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        if (null !== $this->techstackIdentity) {
            $res['techstack_identity'] = $this->techstackIdentity;
        }
        if (null !== $this->techstackName) {
            $res['techstack_name'] = $this->techstackName;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackAppService
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['buildpack_full_version'])){
            $model->buildpackFullVersion = $map['buildpack_full_version'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['cell_ids'])){
            if(!empty($map['cell_ids'])){
                $model->cellIds = $map['cell_ids'];
            }
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['extend_properties'])){
            $model->extendProperties = $map['extend_properties'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['is_default'])){
            $model->isDefault = $map['is_default'];
        }
        if(isset($map['is_service'])){
            $model->isService = $map['is_service'];
        }
        if(isset($map['last_deploy_status'])){
            $model->lastDeployStatus = $map['last_deploy_status'];
        }
        if(isset($map['last_deploy_version'])){
            $model->lastDeployVersion = $map['last_deploy_version'];
        }
        if(isset($map['last_ops_order_id'])){
            $model->lastOpsOrderId = $map['last_ops_order_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['owner_id'])){
            $model->ownerId = $map['owner_id'];
        }
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        if(isset($map['techstack_identity'])){
            $model->techstackIdentity = $map['techstack_identity'];
        }
        if(isset($map['techstack_name'])){
            $model->techstackName = $map['techstack_name'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    // appId
    /**
     * @example appId
     * @var string
     */
    public $appId;

    // appName
    /**
     * @example appName
     * @var string
     */
    public $appName;

    // buildpackFullVersion
    /**
     * @example buildpackFullVersion
     * @var string
     */
    public $buildpackFullVersion;

    // buildpackId
    /**
     * @example buildpackId
     * @var string
     */
    public $buildpackId;

    // cellIds
    /**
     * @example 
     * @var string[]
     */
    public $cellIds;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // extendProperties
    /**
     * @example extendProperties
     * @var string
     */
    public $extendProperties;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // isDefault
    /**
     * @example true, false
     * @var bool
     */
    public $isDefault;

    // isService
    /**
     * @example true, false
     * @var bool
     */
    public $isService;

    // lastDeployStatus
    /**
     * @example lastDeployStatus
     * @var string
     */
    public $lastDeployStatus;

    // lastDeployVersion
    /**
     * @example lastDeployVersion
     * @var string
     */
    public $lastDeployVersion;

    // lastOpsOrderId
    /**
     * @example lastOpsOrderId
     * @var string
     */
    public $lastOpsOrderId;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // ownerId
    /**
     * @example ownerId
     * @var string
     */
    public $ownerId;

    // techstackId
    /**
     * @example 
     * @var int
     */
    public $techstackId;

    // techstackIdentity
    /**
     * @example techstackIdentity
     * @var string
     */
    public $techstackIdentity;

    // techstackName
    /**
     * @example techstackName
     * @var string
     */
    public $techstackName;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcModified;

    // workspaceId
    /**
     * @example workspaceId
     * @var string
     */
    public $workspaceId;

}
