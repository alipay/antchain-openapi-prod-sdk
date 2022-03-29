<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AuthDO extends Model
{
    // ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 登录名
    /**
     * @example luyou.yl
     *
     * @var string
     */
    public $userLoginName;

    // 权限码
    /**
     * @example EDIT
     *
     * @var string
     */
    public $auth;

    // 权限的资源类型
    /**
     * @example FOLDER
     *
     * @var string
     */
    public $resourceType;

    // 权限的资源ID (如果FOLDER或CUSTOM_PLUGIN，需要自行转成Number类型)
    /**
     * @example 15
     *
     * @var string
     */
    public $resourceId;
    protected $_name = [
        'id'            => 'id',
        'userLoginName' => 'user_login_name',
        'auth'          => 'auth',
        'resourceType'  => 'resource_type',
        'resourceId'    => 'resource_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('userLoginName', $this->userLoginName, true);
        Model::validateRequired('auth', $this->auth, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->userLoginName) {
            $res['user_login_name'] = $this->userLoginName;
        }
        if (null !== $this->auth) {
            $res['auth'] = $this->auth;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['user_login_name'])) {
            $model->userLoginName = $map['user_login_name'];
        }
        if (isset($map['auth'])) {
            $model->auth = $map['auth'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }

        return $model;
    }
}
