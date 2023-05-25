<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryClusterRequest extends Model
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

    // 集群名
    /**
     * @var string
     */
    public $clusterName;

    // 来源
    /**
     * @var string
     */
    public $source;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 环境
    /**
     * @var string
     */
    public $env;

    // 当前页
    /**
     * @var int
     */
    public $page;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'   => 'auth_token',
        'clusterId'   => 'cluster_id',
        'clusterName' => 'cluster_name',
        'source'      => 'source',
        'status'      => 'status',
        'env'         => 'env',
        'page'        => 'page',
        'pageSize'    => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryClusterRequest
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
