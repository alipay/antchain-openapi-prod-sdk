<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class QueryRoleActionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 系统来源
    /**
     * @var string
     */
    public $sourceSystem;

    // 角色ID
    /**
     * @var string
     */
    public $roleId;

    // 角色名称，查询时和owner配套使用
    /**
     * @var string
     */
    public $roleName;

    // 角色所有者
    /**
     * @var string
     */
    public $roleOwner;
    protected $_name = [
        'authToken'    => 'auth_token',
        'sourceSystem' => 'source_system',
        'roleId'       => 'role_id',
        'roleName'     => 'role_name',
        'roleOwner'    => 'role_owner',
    ];

    public function validate()
    {
        Model::validateRequired('sourceSystem', $this->sourceSystem, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        if (null !== $this->roleId) {
            $res['role_id'] = $this->roleId;
        }
        if (null !== $this->roleName) {
            $res['role_name'] = $this->roleName;
        }
        if (null !== $this->roleOwner) {
            $res['role_owner'] = $this->roleOwner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRoleActionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
        if (isset($map['role_id'])) {
            $model->roleId = $map['role_id'];
        }
        if (isset($map['role_name'])) {
            $model->roleName = $map['role_name'];
        }
        if (isset($map['role_owner'])) {
            $model->roleOwner = $map['role_owner'];
        }

        return $model;
    }
}
