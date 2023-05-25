<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class AddClusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群名
    /**
     * @var string
     */
    public $clusterName;

    // 环境
    /**
     * @var string
     */
    public $env;

    // 必为manual
    /**
     * @var string
     */
    public $source;

    // 命名空间白名单
    /**
     * @var string[]
     */
    public $namespaceWhitelist;

    // 新增集群kubeconfig
    /**
     * @var string
     */
    public $kubeconfig;
    protected $_name = [
        'authToken'          => 'auth_token',
        'clusterName'        => 'cluster_name',
        'env'                => 'env',
        'source'             => 'source',
        'namespaceWhitelist' => 'namespace_whitelist',
        'kubeconfig'         => 'kubeconfig',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('namespaceWhitelist', $this->namespaceWhitelist, true);
        Model::validateRequired('kubeconfig', $this->kubeconfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->kubeconfig) {
            $res['kubeconfig'] = $this->kubeconfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddClusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
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
        if (isset($map['kubeconfig'])) {
            $model->kubeconfig = $map['kubeconfig'];
        }

        return $model;
    }
}
