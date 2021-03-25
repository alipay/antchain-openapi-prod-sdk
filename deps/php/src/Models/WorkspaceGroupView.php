<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\WorkspaceView;

class WorkspaceGroupView extends Model {
    protected $_name = [
        'displayName' => 'display_name',
        'id' => 'id',
        'identity' => 'identity',
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'workspaces' => 'workspaces',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = [];
            if(null !== $this->workspaces && is_array($this->workspaces)){
                $n = 0;
                foreach($this->workspaces as $item){
                    $res['workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WorkspaceGroupView
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = [];
                $n = 0;
                foreach($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? WorkspaceView::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 显示名称
    /**
     * @example LHC开发环境
     * @var string
     */
    public $displayName;

    // table id
    /**
     * @example 135a06b2-9548-492d-b
     * @var string
     */
    public $id;

    // 标识
    /**
     * @example lksdev
     * @var string
     */
    public $identity;

    // 环境状态
    /**
     * @example status
     * @var string
     */
    public $status;

    // 租户id
    /**
     * @example tenant
     * @var string
     */
    public $tenantId;

    // 工作空间列表
    /**
     * @example 
     * @var WorkspaceView[]
     */
    public $workspaces;

}
