<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Cell extends Model {
    protected $_name = [
        'deploymentZone' => 'deployment_zone',
        'description' => 'description',
        'id' => 'id',
        'masterZone' => 'master_zone',
        'name' => 'name',
        'paasId' => 'paas_id',
        'status' => 'status',
        'tenant' => 'tenant',
        'type' => 'type',
        'workspace' => 'workspace',
        'workspaceGroup' => 'workspace_group',
        'zones' => 'zones',
        'displayName' => 'display_name',
        'appendedZoneIds' => 'appended_zone_ids',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->deploymentZone) {
            $res['deployment_zone'] = $this->deploymentZone;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->masterZone) {
            $res['master_zone'] = $this->masterZone;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->appendedZoneIds) {
            $res['appended_zone_ids'] = $this->appendedZoneIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Cell
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['deployment_zone'])){
            $model->deploymentZone = $map['deployment_zone'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['master_zone'])){
            $model->masterZone = $map['master_zone'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['paas_id'])){
            $model->paasId = $map['paas_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        if(isset($map['workspace_group'])){
            $model->workspaceGroup = $map['workspace_group'];
        }
        if(isset($map['zones'])){
            if(!empty($map['zones'])){
                $model->zones = $map['zones'];
            }
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['appended_zone_ids'])){
            if(!empty($map['appended_zone_ids'])){
                $model->appendedZoneIds = $map['appended_zone_ids'];
            }
        }
        return $model;
    }
    // 部署区域名称
    /**
     * @example 
     * @var string
     */
    public $deploymentZone;

    // 部署单元描述
    /**
     * @example 
     * @var string
     */
    public $description;

    // 部署单元名称
    /**
     * @example 
     * @var string
     */
    public $id;

    // 部署单元所属主可用区ID列表
    /**
     * @example 
     * @var string
     */
    public $masterZone;

    // 部署单元显示名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 部署单元对应的paas id
    /**
     * @example 
     * @var string
     */
    public $paasId;

    // 部署单元状态
    /**
     * @example 
     * @var string
     */
    public $status;

    // 租户名称
    /**
     * @example 
     * @var string
     */
    public $tenant;

    // 部署单元类型[单元化模式特有]。
    /**
     * @example RZone
     * @var string
     */
    public $type;

    // 工作空间名称
    /**
     * @example 
     * @var string
     */
    public $workspace;

    // 环境名称
    /**
     * @example 
     * @var string
     */
    public $workspaceGroup;

    // 部署单元所属可用区ID列表
    /**
     * @example 
     * @var string[]
     */
    public $zones;

    // displayName
    /**
     * @example displayName
     * @var string
     */
    public $displayName;

    // appendedZoneIds
    /**
     * @example 
     * @var string[]
     */
    public $appendedZoneIds;

}
