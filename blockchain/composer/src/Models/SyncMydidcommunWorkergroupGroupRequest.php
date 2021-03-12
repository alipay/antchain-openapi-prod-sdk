<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SyncMydidcommunWorkergroupGroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 计算集群明称
    /**
     * @var string
     */
    public $workerGroup;

    // 计算集群环境
    /**
     * @var string
     */
    public $env;

    // 执行状态上报
    /**
     * @var string
     */
    public $metrics;

    // 执行器code
    /**
     * @var string[]
     */
    public $executorList;

    // 主节点名
    /**
     * @var string
     */
    public $masterNode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'workerGroup'       => 'worker_group',
        'env'               => 'env',
        'metrics'           => 'metrics',
        'executorList'      => 'executor_list',
        'masterNode'        => 'master_node',
    ];

    public function validate()
    {
        Model::validateRequired('workerGroup', $this->workerGroup, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('metrics', $this->metrics, true);
        Model::validateRequired('executorList', $this->executorList, true);
        Model::validateRequired('masterNode', $this->masterNode, true);
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
        if (null !== $this->workerGroup) {
            $res['worker_group'] = $this->workerGroup;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->metrics) {
            $res['metrics'] = $this->metrics;
        }
        if (null !== $this->executorList) {
            $res['executor_list'] = $this->executorList;
        }
        if (null !== $this->masterNode) {
            $res['master_node'] = $this->masterNode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncMydidcommunWorkergroupGroupRequest
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
        if (isset($map['worker_group'])) {
            $model->workerGroup = $map['worker_group'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['metrics'])) {
            $model->metrics = $map['metrics'];
        }
        if (isset($map['executor_list'])) {
            if (!empty($map['executor_list'])) {
                $model->executorList = $map['executor_list'];
            }
        }
        if (isset($map['master_node'])) {
            $model->masterNode = $map['master_node'];
        }

        return $model;
    }
}
