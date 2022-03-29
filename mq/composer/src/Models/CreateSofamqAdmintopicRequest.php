<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqAdmintopicRequest extends Model
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

    // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
    /**
     * @var int
     */
    public $messageType;

    // Topic 的备注信息
    /**
     * @var string
     */
    public $remark;

    // 生效范围，为三板斧使用
    /**
     * @var string
     */
    public $scope;

    // 需创建的 Topic 的名称
    /**
     * @var string
     */
    public $topic;

    // Topic 权限，6为可读可写，4为可读
    /**
     * @var string
     */
    public $perm;

    // Topic 所属的应用名称，要求 app name 在 appinfo 上可查
    /**
     * @var string
     */
    public $owner;

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
        'messageType'       => 'message_type',
        'remark'            => 'remark',
        'scope'             => 'scope',
        'topic'             => 'topic',
        'perm'              => 'perm',
        'owner'             => 'owner',
        'priority'          => 'priority',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('messageType', $this->messageType, true);
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
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->perm) {
            $res['perm'] = $this->perm;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqAdmintopicRequest
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
        if (isset($map['message_type'])) {
            $model->messageType = $map['message_type'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['perm'])) {
            $model->perm = $map['perm'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }

        return $model;
    }
}
