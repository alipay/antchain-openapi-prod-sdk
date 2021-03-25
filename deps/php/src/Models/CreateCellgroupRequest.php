<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateCellgroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'datacenter' => 'datacenter',
        'defaultGzone' => 'default_gzone',
        'name' => 'name',
        'operator' => 'operator',
        'type' => 'type',
        'workspaceGroup' => 'workspace_group',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->datacenter) {
            $res['datacenter'] = $this->datacenter;
        }
        if (null !== $this->defaultGzone) {
            $res['default_gzone'] = $this->defaultGzone;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateCellgroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['datacenter'])){
            $model->datacenter = $map['datacenter'];
        }
        if(isset($map['default_gzone'])){
            $model->defaultGzone = $map['default_gzone'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['operator'])){
            $model->operator = $map['operator'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['workspace_group'])){
            $model->workspaceGroup = $map['workspace_group'];
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

    // 所属idc
    /**
     * @var string
     */
    public $datacenter;

    // 默认全局域
    /**
     * @var string
     */
    public $defaultGzone;

    // 逻辑单元名称
    /**
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 逻辑单元类型
    /**
     * @var string
     */
    public $type;

    // 所属环境组名称
    /**
     * @var string
     */
    public $workspaceGroup;

}
