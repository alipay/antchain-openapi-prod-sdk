<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqTopicRequest extends Model
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

    // 需创建的 Topic 的名称
    /**
     * @var string
     */
    public $topic;

    // Topic对应Schema的兼容性策略
    /**
     * @var string
     */
    public $schemaCompatibility;

    // Topic对应Schema的序列化方式
    /**
     * @var string
     */
    public $schemaSerialization;

    // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
    /**
     * @var string
     */
    public $owner;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'instanceId'          => 'instance_id',
        'messageType'         => 'message_type',
        'remark'              => 'remark',
        'topic'               => 'topic',
        'schemaCompatibility' => 'schema_compatibility',
        'schemaSerialization' => 'schema_serialization',
        'owner'               => 'owner',
    ];

    public function validate()
    {
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->schemaCompatibility) {
            $res['schema_compatibility'] = $this->schemaCompatibility;
        }
        if (null !== $this->schemaSerialization) {
            $res['schema_serialization'] = $this->schemaSerialization;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqTopicRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['message_type'])) {
            $model->messageType = $map['message_type'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['schema_compatibility'])) {
            $model->schemaCompatibility = $map['schema_compatibility'];
        }
        if (isset($map['schema_serialization'])) {
            $model->schemaSerialization = $map['schema_serialization'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
