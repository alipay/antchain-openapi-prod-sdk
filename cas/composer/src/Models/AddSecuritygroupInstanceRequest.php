<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AddSecuritygroupInstanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 需向安全组中添加的实例 paas 序列号
    /**
     * @var string[]
     */
    public $instanceSequences;

    // 安全组 paas id
    /**
     * @var string
     */
    public $securityGroupSequence;
    protected $_name = [
        'authToken'             => 'auth_token',
        'instanceSequences'     => 'instance_sequences',
        'securityGroupSequence' => 'security_group_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('instanceSequences', $this->instanceSequences, true);
        Model::validateRequired('securityGroupSequence', $this->securityGroupSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceSequences) {
            $res['instance_sequences'] = $this->instanceSequences;
        }
        if (null !== $this->securityGroupSequence) {
            $res['security_group_sequence'] = $this->securityGroupSequence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSecuritygroupInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['instance_sequences'])) {
            if (!empty($map['instance_sequences'])) {
                $model->instanceSequences = $map['instance_sequences'];
            }
        }
        if (isset($map['security_group_sequence'])) {
            $model->securityGroupSequence = $map['security_group_sequence'];
        }

        return $model;
    }
}
