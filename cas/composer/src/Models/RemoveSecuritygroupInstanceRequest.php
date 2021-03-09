<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RemoveSecuritygroupInstanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 安全组 paas id
    /**
     * @var string
     */
    public $securityGroupSequence;

    // 要移除的实例序列号
    /**
     * @var string[]
     */
    public $instanceSequences;
    protected $_name = [
        'authToken'             => 'auth_token',
        'securityGroupSequence' => 'security_group_sequence',
        'instanceSequences'     => 'instance_sequences',
    ];

    public function validate()
    {
        Model::validateRequired('securityGroupSequence', $this->securityGroupSequence, true);
        Model::validateRequired('instanceSequences', $this->instanceSequences, true);
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
        if (null !== $this->instanceSequences) {
            $res['instance_sequences'] = $this->instanceSequences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RemoveSecuritygroupInstanceRequest
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
        if (isset($map['instance_sequences'])) {
            if (!empty($map['instance_sequences'])) {
                $model->instanceSequences = $map['instance_sequences'];
            }
        }

        return $model;
    }
}
