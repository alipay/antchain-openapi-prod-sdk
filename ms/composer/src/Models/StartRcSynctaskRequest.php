<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class StartRcSynctaskRequest extends Model
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

    // 自己指定的生成集群任务的唯一 key，针对聚石塔的情况，与用户的环境一一映射
    /**
     * @var string
     */
    public $clusterTaskUniqueKey;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'clusterTaskUniqueKey' => 'cluster_task_unique_key',
        'instanceId'           => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('clusterTaskUniqueKey', $this->clusterTaskUniqueKey, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->clusterTaskUniqueKey) {
            $res['cluster_task_unique_key'] = $this->clusterTaskUniqueKey;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartRcSynctaskRequest
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
        if (isset($map['cluster_task_unique_key'])) {
            $model->clusterTaskUniqueKey = $map['cluster_task_unique_key'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
