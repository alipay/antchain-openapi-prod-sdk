<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteSecuritygroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 需要删除的 security group id
    /**
     * @var string
     */
    public $securityGroupSequence;
    protected $_name = [
        'authToken'             => 'auth_token',
        'securityGroupSequence' => 'security_group_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('securityGroupSequence', $this->securityGroupSequence, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSecuritygroupRequest
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

        return $model;
    }
}
