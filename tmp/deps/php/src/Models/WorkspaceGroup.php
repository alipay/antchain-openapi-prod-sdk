<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceGroup extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'status' => 'status',
        'tenant' => 'tenant',
        'workspaces' => 'workspaces',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WorkspaceGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = $map['workspaces'];
            }
        }
        return $model;
    }
    // 环境名称
    /**
     * @example 
     * @var string
     */
    public $id;

    // 环境显示名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 环境状态
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

    // 工作空间名称列表
    /**
     * @example 
     * @var string[]
     */
    public $workspaces;

}
