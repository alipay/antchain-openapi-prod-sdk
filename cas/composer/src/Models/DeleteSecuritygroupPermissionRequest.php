<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteSecuritygroupPermissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 安全组 paas id
    /**
     * @var string
     */
    public $securityGroupSequence;

    // 12345
    /**
     * @var string
     */
    public $permissionHash;
    protected $_name = [
        'authToken'             => 'auth_token',
        'securityGroupSequence' => 'security_group_sequence',
        'permissionHash'        => 'permission_hash',
    ];

    public function validate()
    {
        Model::validateRequired('securityGroupSequence', $this->securityGroupSequence, true);
        Model::validateRequired('permissionHash', $this->permissionHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->securityGroupSequence) {
            $res['security_group_sequence'] = $this->securityGroupSequence;
        }
        if (null !== $this->permissionHash) {
            $res['permission_hash'] = $this->permissionHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSecuritygroupPermissionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['security_group_sequence'])) {
            $model->securityGroupSequence = $map['security_group_sequence'];
        }
        if (isset($map['permission_hash'])) {
            $model->permissionHash = $map['permission_hash'];
        }

        return $model;
    }
}
