<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateSecuritygroupPermissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // PermissionVO
    /**
     * @var PermissionVO
     */
    public $permission;

    // securityGroupId
    /**
     * @var string
     */
    public $securityGroupId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'permission'      => 'permission',
        'securityGroupId' => 'security_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('permission', $this->permission, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->permission) {
            $res['permission'] = null !== $this->permission ? $this->permission->toMap() : null;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSecuritygroupPermissionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['permission'])) {
            $model->permission = PermissionVO::fromMap($map['permission']);
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }

        return $model;
    }
}
