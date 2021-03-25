<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CellView extends Model {
    protected $_name = [
        'deploymentZoneId' => 'deployment_zone_id',
        'description' => 'description',
        'displayName' => 'display_name',
        'id' => 'id',
        'identity' => 'identity',
        'masterZoneId' => 'master_zone_id',
        'status' => 'status',
        'workspaceId' => 'workspace_id',
        'workspaceGroupId' => 'workspace_group_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->deploymentZoneId) {
            $res['deployment_zone_id'] = $this->deploymentZoneId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->masterZoneId) {
            $res['master_zone_id'] = $this->masterZoneId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CellView
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['deployment_zone_id'])){
            $model->deploymentZoneId = $map['deployment_zone_id'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['master_zone_id'])){
            $model->masterZoneId = $map['master_zone_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['workspace_group_id'])){
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        return $model;
    }
    // 扩展部署机房id
    /**
     * @example 0000000000000002
     * @var string
     */
    public $deploymentZoneId;

    // 部署单元描述
    /**
     * @example description
     * @var string
     */
    public $description;

    // 显示名称
    /**
     * @example 部署单元A
     * @var string
     */
    public $displayName;

    // table id
    /**
     * @example 0000000000000002
     * @var string
     */
    public $id;

    // 标识
    /**
     * @example CellA
     * @var string
     */
    public $identity;

    // master zone id
    /**
     * @example master_zone
     * @var string
     */
    public $masterZoneId;

    // 部署单元状态
    /**
     * @example status
     * @var string
     */
    public $status;

    // 工作空间 id
    /**
     * @example workspace
     * @var string
     */
    public $workspaceId;

    // 工作空间组 id
    /**
     * @example workspace_group
     * @var string
     */
    public $workspaceGroupId;

}
