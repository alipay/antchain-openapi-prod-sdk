<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Computer;
use AntChain\Deps\Models\DepsDatabase;
use AntChain\Deps\Models\SLBInfo;

class AppServiceEntity extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'appName' => 'app_name',
        'buildpackFullVersion' => 'buildpack_full_version',
        'buildpackId' => 'buildpack_id',
        'cellIds' => 'cell_ids',
        'description' => 'description',
        'ecsList' => 'ecs_list',
        'extendProperties' => 'extend_properties',
        'id' => 'id',
        'isDefault' => 'is_default',
        'isService' => 'is_service',
        'lastDeployStatus' => 'last_deploy_status',
        'lastDeployVersion' => 'last_deploy_version',
        'lastOpsOrderId' => 'last_ops_order_id',
        'name' => 'name',
        'ownerId' => 'owner_id',
        'rdsList' => 'rds_list',
        'slbList' => 'slb_list',
        'techstackId' => 'techstack_id',
        'techstackIdentity' => 'techstack_identity',
        'techstackName' => 'techstack_name',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
        'workspaceDisplayName' => 'workspace_display_name',
        'workspaceId' => 'workspace_id',
        'workspaceName' => 'workspace_name',
        'ownerLoginName' => 'owner_login_name',
        'ownerDisplayName' => 'owner_display_name',
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
        if (null !== $this->ecsList) {
            $res['ecs_list'] = [];
            if(null !== $this->ecsList && is_array($this->ecsList)){
                $n = 0;
                foreach($this->ecsList as $item){
                    $res['ecs_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->rdsList) {
            $res['rds_list'] = [];
            if(null !== $this->rdsList && is_array($this->rdsList)){
                $n = 0;
                foreach($this->rdsList as $item){
                    $res['rds_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->slbList) {
            $res['slb_list'] = [];
            if(null !== $this->slbList && is_array($this->slbList)){
                $n = 0;
                foreach($this->slbList as $item){
                    $res['slb_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->workspaceDisplayName) {
            $res['workspace_display_name'] = $this->workspaceDisplayName;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->ownerDisplayName) {
            $res['owner_display_name'] = $this->ownerDisplayName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppServiceEntity
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
        if(isset($map['ecs_list'])){
            if(!empty($map['ecs_list'])){
                $model->ecsList = [];
                $n = 0;
                foreach($map['ecs_list'] as $item) {
                    $model->ecsList[$n++] = null !== $item ? Computer::fromMap($item) : $item;
                }
            }
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
        if(isset($map['rds_list'])){
            if(!empty($map['rds_list'])){
                $model->rdsList = [];
                $n = 0;
                foreach($map['rds_list'] as $item) {
                    $model->rdsList[$n++] = null !== $item ? DepsDatabase::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['slb_list'])){
            if(!empty($map['slb_list'])){
                $model->slbList = [];
                $n = 0;
                foreach($map['slb_list'] as $item) {
                    $model->slbList[$n++] = null !== $item ? SLBInfo::fromMap($item) : $item;
                }
            }
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
        if(isset($map['workspace_display_name'])){
            $model->workspaceDisplayName = $map['workspace_display_name'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['owner_display_name'])){
            $model->ownerDisplayName = $map['owner_display_name'];
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

    // 构建包id
    /**
     * @example buildpackId
     * @var string
     */
    public $buildpackId;

    // cellIds
    /**
     * @example cellIds
     * @var string[]
     */
    public $cellIds;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // 当前应用服务用到的 ecs 资源列表
    /**
     * @example 
     * @var Computer[]
     */
    public $ecsList;

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
     * @example WAITING,EXECUTING,SUCCEED,EXCEPTION
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

    // 当前应用服务使用的 rds 资源列表
    /**
     * @example 
     * @var DepsDatabase[]
     */
    public $rdsList;

    // 当前应用服务使用的 slb 资源列表
    /**
     * @example 
     * @var SLBInfo[]
     */
    public $slbList;

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

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcModified;

    // 工作空间显示名称
    /**
     * @example 预发环境
     * @var string
     */
    public $workspaceDisplayName;

    // workspaceId
    /**
     * @example workspaceId
     * @var string
     */
    public $workspaceId;

    // 工作空间名称
    /**
     * @example sit
     * @var string
     */
    public $workspaceName;

    // 负责人登录名称
    /**
     * @example alipayAdmin@alipay.net
     * @var string
     */
    public $ownerLoginName;

    // 负责人显示名称
    /**
     * @example 乐乐
     * @var string
     */
    public $ownerDisplayName;

}
