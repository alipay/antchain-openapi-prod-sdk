<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Cluster extends Model
{
    // id
    /**
     * @example cluster-id-000001
     *
     * @var string
     */
    public $id;

    // 集群名称
    /**
     * @example cluster_name_myname
     *
     * @var string
     */
    public $clusterName;

    // 环境
    /**
     * @example prod
     *
     * @var string
     */
    public $env;

    // 纳管状态（imported已纳管/unimported未纳管）
    /**
     * @example imported
     *
     * @var string
     */
    public $status;

    // 导入方式
    /**
     * @example manual
     *
     * @var string
     */
    public $source;

    // 白名单
    /**
     * @example ["default", "kube-system", "mynamespace"]
     *
     * @var string[]
     */
    public $namespaceWhitelist;
    protected $_name = [
        'id'                 => 'id',
        'clusterName'        => 'cluster_name',
        'env'                => 'env',
        'status'             => 'status',
        'source'             => 'source',
        'namespaceWhitelist' => 'namespace_whitelist',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('namespaceWhitelist', $this->namespaceWhitelist, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
     * @return Cluster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
