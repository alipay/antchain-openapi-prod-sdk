<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqClusterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // appkey
    /**
     * @var string
     */
    public $appkey;

    // cluster
    /**
     * @var string
     */
    public $cluster;

    // cluster_type
    /**
     * @var string
     */
    public $clusterType;

    // 0:单机房,1:本地优先,2:交叉部署,3:独占LDC
    /**
     * @var string
     */
    public $deployMode;

    // unshared: 独占
    // shared: 共享
    /**
     * @var string
     */
    public $ldcMode;

    // remark
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appkey'            => 'appkey',
        'cluster'           => 'cluster',
        'clusterType'       => 'cluster_type',
        'deployMode'        => 'deploy_mode',
        'ldcMode'           => 'ldc_mode',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqClusterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
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

        return $model;
    }
}
