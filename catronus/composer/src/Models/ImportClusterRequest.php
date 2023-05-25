<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ImportClusterRequest extends Model
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

    // 集群名称
    /**
     * @var string
     */
    public $clusterName;

    // 环境
    /**
     * @var string
     */
    public $env;

    // 导入方式（手工manual/自动auto）
    /**
     * @var string
     */
    public $source;

    // 命名空间白名单
    /**
     * @var string[]
     */
    public $namespaceWhitelist;
    protected $_name = [
        'authToken'          => 'auth_token',
        'clusterId'          => 'cluster_id',
        'clusterName'        => 'cluster_name',
        'env'                => 'env',
        'source'             => 'source',
        'namespaceWhitelist' => 'namespace_whitelist',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->namespaceWhitelist) {
            $res['namespace_whitelist'] = $this->namespaceWhitelist;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportClusterRequest
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
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['namespace_whitelist'])) {
            if (!empty($map['namespace_whitelist'])) {
                $model->namespaceWhitelist = $map['namespace_whitelist'];
            }
        }

        return $model;
    }
}
