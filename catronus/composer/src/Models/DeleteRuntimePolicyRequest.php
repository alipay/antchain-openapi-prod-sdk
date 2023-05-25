<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class DeleteRuntimePolicyRequest extends Model
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

    // 运行时策略命名空间
    /**
     * @var string
     */
    public $namespace;

    // 运行时策略名称
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken' => 'auth_token',
        'clusterId' => 'cluster_id',
        'namespace' => 'namespace',
        'name'      => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteRuntimePolicyRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
