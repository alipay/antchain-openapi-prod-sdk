<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class SkipClusterBaselineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群id
    /**
     * @var string
     */
    public $clusterId;

    // 资源名称
    /**
     * @var string
     */
    public $name;

    // 资源命名空间
    /**
     * @var string
     */
    public $namespace;

    // 资源id
    /**
     * @var string
     */
    public $resourceId;

    // 资源类型
    /**
     * @var string
     */
    public $kind;
    protected $_name = [
        'authToken'  => 'auth_token',
        'clusterId'  => 'cluster_id',
        'name'       => 'name',
        'namespace'  => 'namespace',
        'resourceId' => 'resource_id',
        'kind'       => 'kind',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SkipClusterBaselineRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }

        return $model;
    }
}
