<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateSofamqAdmintopicRequest extends Model
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

    // 集群名
    /**
     * @var string
     */
    public $cluster;

    // 需创建的 Topic 所对应的实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 设置该 Topic 的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
    /**
     * @var int
     */
    public $perm;

    // 读队列数
    /**
     * @var int
     */
    public $readQueueNum;

    // topic名
    /**
     * @var string
     */
    public $topic;

    // 写队列数
    /**
     * @var int
     */
    public $writeQueueNum;

    // 生效范围，三板斧使用
    /**
     * @var string
     */
    public $scope;

    // 标识该 topic 的消息是否具有优先级
    /**
     * @var bool
     */
    public $priority;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cluster'           => 'cluster',
        'instanceId'        => 'instance_id',
        'perm'              => 'perm',
        'readQueueNum'      => 'read_queue_num',
        'topic'             => 'topic',
        'writeQueueNum'     => 'write_queue_num',
        'scope'             => 'scope',
        'priority'          => 'priority',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
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
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->perm) {
            $res['perm'] = $this->perm;
        }
        if (null !== $this->readQueueNum) {
            $res['read_queue_num'] = $this->readQueueNum;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->writeQueueNum) {
            $res['write_queue_num'] = $this->writeQueueNum;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSofamqAdmintopicRequest
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
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['perm'])) {
            $model->perm = $map['perm'];
        }
        if (isset($map['read_queue_num'])) {
            $model->readQueueNum = $map['read_queue_num'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['write_queue_num'])) {
            $model->writeQueueNum = $map['write_queue_num'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }

        return $model;
    }
}
