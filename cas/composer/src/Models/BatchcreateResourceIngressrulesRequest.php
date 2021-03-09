<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateResourceIngressrulesRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 安全组入口规则
    /**
     * @var SecurityGroupRule[]
     */
    public $ingressRules;

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
        'ingressRules'    => 'ingress_rules',
        'region'          => 'region',
        'securityGroupId' => 'security_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('ingressRules', $this->ingressRules, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->ingressRules) {
            $res['ingress_rules'] = [];
            if (null !== $this->ingressRules && \is_array($this->ingressRules)) {
                $n = 0;
                foreach ($this->ingressRules as $item) {
                    $res['ingress_rules'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return BatchcreateResourceIngressrulesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['ingress_rules'])) {
            if (!empty($map['ingress_rules'])) {
                $model->ingressRules = [];
                $n                   = 0;
                foreach ($map['ingress_rules'] as $item) {
                    $model->ingressRules[$n++] = null !== $item ? SecurityGroupRule::fromMap($item) : $item;
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
