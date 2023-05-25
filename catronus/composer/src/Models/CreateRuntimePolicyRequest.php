<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class CreateRuntimePolicyRequest extends Model
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

    // 名称
    /**
     * @var string
     */
    public $name;

    // 运行时策略yaml文件内容
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken' => 'auth_token',
        'clusterId' => 'cluster_id',
        'namespace' => 'namespace',
        'name'      => 'name',
        'content'   => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRuntimePolicyRequest
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
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
