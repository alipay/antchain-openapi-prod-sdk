<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QueryRcSynctaskRequest extends Model
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

    // 集群id
    /**
     * @var string
     */
    public $clusterId;

    // 集群任务唯一键
    /**
     * @var string
     */
    public $clusterTaskUniqueKey;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 任务类型，up 或者 down
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'clusterId'            => 'cluster_id',
        'clusterTaskUniqueKey' => 'cluster_task_unique_key',
        'instanceId'           => 'instance_id',
        'type'                 => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('clusterTaskUniqueKey', $this->clusterTaskUniqueKey, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->clusterTaskUniqueKey) {
            $res['cluster_task_unique_key'] = $this->clusterTaskUniqueKey;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRcSynctaskRequest
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
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['cluster_task_unique_key'])) {
            $model->clusterTaskUniqueKey = $map['cluster_task_unique_key'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
