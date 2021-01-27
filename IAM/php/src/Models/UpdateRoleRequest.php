<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class UpdateRoleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'roleId' => 'role_id',
        'name' => 'name',
        'description' => 'description',
    ];
    public function validate() {
        Model::validateRequired('roleId', $this->roleId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->roleId) {
            $res['role_id'] = $this->roleId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateRoleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['role_id'])){
            $model->roleId = $map['role_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 角色ID
    /**
     * @var string
     */
    public $roleId;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 描述
    /**
     * @var string
     */
    public $description;

}
