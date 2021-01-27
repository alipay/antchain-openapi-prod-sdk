<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class ListRoleOperatorRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'roleId' => 'role_id',
        'tenant' => 'tenant',
    ];
    public function validate() {
        Model::validateRequired('roleId', $this->roleId, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->roleId) {
            $res['role_id'] = $this->roleId;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListRoleOperatorRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['role_id'])){
            $model->roleId = $map['role_id'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
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

    // 租户信息
    /**
     * @var string
     */
    public $tenant;

}
