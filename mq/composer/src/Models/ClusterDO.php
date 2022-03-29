<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ClusterDO extends Model
{
    // appkey
    /**
     * @example appkey
     *
     * @var string
     */
    public $appkey;

    // cluster
    /**
     * @example cluster
     *
     * @var string
     */
    public $cluster;

    // cluster cluster
    /**
     * @example cluster type
     *
     * @var string
     */
    public $clusterType;

    // 0:单机房
    /**
     * @example 0
     *
     * @var string
     */
    public $deployMode;

    // ldc模式
    /**
     * @example shared
     *
     * @var string
     */
    public $ldcMode;

    // remark
    /**
     * @example remark
     *
     * @var string
     */
    public $remark;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // create
    /**
     * @example create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'appkey'      => 'appkey',
        'cluster'     => 'cluster',
        'clusterType' => 'cluster_type',
        'deployMode'  => 'deploy_mode',
        'ldcMode'     => 'ldc_mode',
        'remark'      => 'remark',
        'id'          => 'id',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appkey) {
            $res['appkey'] = $this->appkey;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->clusterType) {
            $res['cluster_type'] = $this->clusterType;
        }
        if (null !== $this->deployMode) {
            $res['deploy_mode'] = $this->deployMode;
        }
        if (null !== $this->ldcMode) {
            $res['ldc_mode'] = $this->ldcMode;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['appkey'])) {
            $model->appkey = $map['appkey'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['cluster_type'])) {
            $model->clusterType = $map['cluster_type'];
        }
        if (isset($map['deploy_mode'])) {
            $model->deployMode = $map['deploy_mode'];
        }
        if (isset($map['ldc_mode'])) {
            $model->ldcMode = $map['ldc_mode'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
