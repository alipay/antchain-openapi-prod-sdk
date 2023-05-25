<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ListRuntimepolicyPodsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $clusterId;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 策略名称
    /**
     * @var string
     */
    public $policyName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'clusterId'  => 'cluster_id',
        'namespace'  => 'namespace',
        'policyName' => 'policy_name',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('policyName', $this->policyName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->policyName) {
            $res['policy_name'] = $this->policyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListRuntimepolicyPodsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['policy_name'])) {
            $model->policyName = $map['policy_name'];
        }

        return $model;
    }
}
