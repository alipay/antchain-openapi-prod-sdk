<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddRcSyncbucketRequest extends Model
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

    // 是否自动开启数据同步任务(默认不开启同步任务)
    /**
     * @var bool
     */
    public $autoStart;

    // 自己指定的生成集群任务的唯一 key，针对聚石塔的情况，与用户的环境一一映射(查询时使用)
    /**
     * @var string
     */
    public $clusterTaskUniqueKey;

    // {  // 商户当前注册中心集群信息
    // "type": "EUREKA",   // 集群类型
    // "name": "xx_eureka", // 集群名字
    // "vip": "11.22.33.44;12.33.44.1",   // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔)
    // "extraParams": [{   //扩展参数，比如涉及到鉴权
    // "key": "user",
    // "value": "xx"
    // }, {
    // "key": "password",
    // "value": "xx"
    // }]
    // }
    /**
     * @var string
     */
    public $sourceCluster;

    // {  // 商户当前注册中心集群信息
    // "type": "EUREKA",   // 集群类型
    // "name": "xx_eureka", // 集群名字
    // "vip": "11.22.33.44;12.33.44.1",   // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔)
    // "extraParams": [{   //扩展参数，比如涉及到鉴权
    // "key": "user",
    // "value": "xx"
    // }, {
    // "key": "password",
    // "value": "xx"
    // }]
    // }
    /**
     * @var string
     */
    public $targetCluster;

    // 是否开启双向同步(默认单向：从 source_cluster -> target_cluster)，聚石塔中传为 true
    /**
     * @var bool
     */
    public $twoWaySync;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'autoStart'            => 'auto_start',
        'clusterTaskUniqueKey' => 'cluster_task_unique_key',
        'sourceCluster'        => 'source_cluster',
        'targetCluster'        => 'target_cluster',
        'twoWaySync'           => 'two_way_sync',
        'instanceId'           => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('autoStart', $this->autoStart, true);
        Model::validateRequired('clusterTaskUniqueKey', $this->clusterTaskUniqueKey, true);
        Model::validateRequired('sourceCluster', $this->sourceCluster, true);
        Model::validateRequired('targetCluster', $this->targetCluster, true);
        Model::validateRequired('twoWaySync', $this->twoWaySync, true);
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
        if (null !== $this->autoStart) {
            $res['auto_start'] = $this->autoStart;
        }
        if (null !== $this->clusterTaskUniqueKey) {
            $res['cluster_task_unique_key'] = $this->clusterTaskUniqueKey;
        }
        if (null !== $this->sourceCluster) {
            $res['source_cluster'] = $this->sourceCluster;
        }
        if (null !== $this->targetCluster) {
            $res['target_cluster'] = $this->targetCluster;
        }
        if (null !== $this->twoWaySync) {
            $res['two_way_sync'] = $this->twoWaySync;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddRcSyncbucketRequest
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
        if (isset($map['auto_start'])) {
            $model->autoStart = $map['auto_start'];
        }
        if (isset($map['cluster_task_unique_key'])) {
            $model->clusterTaskUniqueKey = $map['cluster_task_unique_key'];
        }
        if (isset($map['source_cluster'])) {
            $model->sourceCluster = $map['source_cluster'];
        }
        if (isset($map['target_cluster'])) {
            $model->targetCluster = $map['target_cluster'];
        }
        if (isset($map['two_way_sync'])) {
            $model->twoWaySync = $map['two_way_sync'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
