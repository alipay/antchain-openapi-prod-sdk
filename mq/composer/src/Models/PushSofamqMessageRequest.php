<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class PushSofamqMessageRequest extends Model
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

    // 单元名称
    /**
     * @var string
     */
    public $cell;

    // 需要接收消息的 Client ID
    /**
     * @var string
     */
    public $clientId;

    // 需要 push 的消费组 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 需要 push 的消息 Message ID
    /**
     * @var string
     */
    public $msgId;

    // 需要发送的 Topic 名称
    /**
     * @var string
     */
    public $topic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'clientId'          => 'client_id',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'msgId'             => 'msg_id',
        'topic'             => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('msgId', $this->msgId, true);
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
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushSofamqMessageRequest
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
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
