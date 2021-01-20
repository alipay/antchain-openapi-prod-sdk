<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Cell;

class DeploymentZone extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'displayName' => 'display_name',
        'description' => 'description',
        'workspaceId' => 'workspace_id',
        'workspaceGroupId' => 'workspace_group_id',
        'status' => 'status',
        'masterZoneId' => 'master_zone_id',
        'appendedZoneIds' => 'appended_zone_ids',
        'cells' => 'cells',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->masterZoneId) {
            $res['master_zone_id'] = $this->masterZoneId;
        }
        if (null !== $this->appendedZoneIds) {
            $res['appended_zone_ids'] = $this->appendedZoneIds;
        }
        if (null !== $this->cells) {
            $res['cells'] = [];
            if(null !== $this->cells && is_array($this->cells)){
                $n = 0;
                foreach($this->cells as $item){
                    $res['cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeploymentZone
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['workspace_group_id'])){
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['master_zone_id'])){
            $model->masterZoneId = $map['master_zone_id'];
        }
        if(isset($map['appended_zone_ids'])){
            if(!empty($map['appended_zone_ids'])){
                $model->appendedZoneIds = $map['appended_zone_ids'];
            }
        }
        if(isset($map['cells'])){
            if(!empty($map['cells'])){
                $model->cells = [];
                $n = 0;
                foreach($map['cells'] as $item) {
                    $model->cells[$n++] = null !== $item ? Cell::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // id
    /**
     * @example 123
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example xx
     * @var string
     */
    public $name;

    // 显示名
    /**
     * @example aa
     * @var string
     */
    public $displayName;

    // 描述
    /**
     * @example aa
     * @var string
     */
    public $description;

    // 环境 id
    /**
     * @example 123
     * @var string
     */
    public $workspaceId;

    // 工作空间组 id
    /**
     * @example 123
     * @var string
     */
    public $workspaceGroupId;

    // 状态
    /**
     * @example CREATED
     * @var string
     */
    public $status;

    // 主可用区 ID
    /**
     * @example 123
     * @var string
     */
    public $masterZoneId;

    // 附属可用区 ID
    /**
     * @example 
     * @var string[]
     */
    public $appendedZoneIds;

    // 包含部署单元
    /**
     * @example 
     * @var Cell[]
     */
    public $cells;

}
