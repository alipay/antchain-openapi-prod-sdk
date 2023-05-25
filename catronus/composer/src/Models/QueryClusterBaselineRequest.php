<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryClusterBaselineRequest extends Model
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

    // 扫描id，不填默认最近一次
    /**
     * @var string
     */
    public $scanId;

    // 页码
    /**
     * @var int
     */
    public $page;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken' => 'auth_token',
        'clusterId' => 'cluster_id',
        'scanId'    => 'scan_id',
        'page'      => 'page',
        'pageSize'  => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
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
        if (null !== $this->scanId) {
            $res['scan_id'] = $this->scanId;
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
     * @return QueryClusterBaselineRequest
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
        if (isset($map['scan_id'])) {
            $model->scanId = $map['scan_id'];
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
