<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ReinitRcSyncclusterRequest extends Model
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

    // 集群唯一表示，大部分情况下等于 instanceId
    /**
     * @var string
     */
    public $clusterTaskUniqueKey;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 新的集群信息.
    // { // 商户当前注册中心集群信息 "type": "EUREKA", // 集群类型 "name": "xx_eureka", // 集群名字 "vip": "11.22.33.44;12.33.44.1", // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔) "extraParams": [{ //扩展参数，比如涉及到鉴权 "key": "user", "value": "xx" }, { "key": "password", "value": "xx" }] }
    /**
     * @var string
     */
    public $newCluster;

    // 是否允许集群切换
    /**
     * @var string
     */
    public $replaceClusterEnabled;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'clusterTaskUniqueKey'  => 'cluster_task_unique_key',
        'instanceId'            => 'instance_id',
        'newCluster'            => 'new_cluster',
        'replaceClusterEnabled' => 'replace_cluster_enabled',
    ];

    public function validate()
    {
        Model::validateRequired('clusterTaskUniqueKey', $this->clusterTaskUniqueKey, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('newCluster', $this->newCluster, true);
        Model::validateRequired('replaceClusterEnabled', $this->replaceClusterEnabled, true);
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
        if (null !== $this->newCluster) {
            $res['new_cluster'] = $this->newCluster;
        }
        if (null !== $this->replaceClusterEnabled) {
            $res['replace_cluster_enabled'] = $this->replaceClusterEnabled;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReinitRcSyncclusterRequest
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
        if (isset($map['new_cluster'])) {
            $model->newCluster = $map['new_cluster'];
        }
        if (isset($map['replace_cluster_enabled'])) {
            $model->replaceClusterEnabled = $map['replace_cluster_enabled'];
        }

        return $model;
    }
}
