<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateResourceEgressrulesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 安全组出方向规则
    /**
     * @var SecurityGroupRule[]
     */
    public $egressRules;

    // region identity
    /**
     * @var string
     */
    public $region;

    // 安全组id
    /**
     * @var string
     */
    public $securityGroupId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'egressRules'     => 'egress_rules',
        'region'          => 'region',
        'securityGroupId' => 'security_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('egressRules', $this->egressRules, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->egressRules) {
            $res['egress_rules'] = [];
            if (null !== $this->egressRules && \is_array($this->egressRules)) {
                $n = 0;
                foreach ($this->egressRules as $item) {
                    $res['egress_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateResourceEgressrulesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['egress_rules'])) {
            if (!empty($map['egress_rules'])) {
                $model->egressRules = [];
                $n                  = 0;
                foreach ($map['egress_rules'] as $item) {
                    $model->egressRules[$n++] = null !== $item ? SecurityGroupRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }

        return $model;
    }
}
