<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SendSofamqMessageRequest extends Model
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

    // 目标单元
    /**
     * @var string
     */
    public $cell;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 消息的 Message Key
    /**
     * @var string
     */
    public $key;

    // 消息内容
    /**
     * @var string
     */
    public $message;

    // 消息 Tag
    /**
     * @var string
     */
    public $tag;

    // 需要发送的 Topic 名称
    /**
     * @var string
     */
    public $topic;

    // 使用的Schema的版本号
    /**
     * @var int
     */
    public $schemaVersion;

    // 消息属性 key-value
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'instanceId'        => 'instance_id',
        'key'               => 'key',
        'message'           => 'message',
        'tag'               => 'tag',
        'topic'             => 'topic',
        'schemaVersion'     => 'schema_version',
        'properties'        => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('message', $this->message, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->schemaVersion) {
            $res['schema_version'] = $this->schemaVersion;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendSofamqMessageRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['schema_version'])) {
            $model->schemaVersion = $map['schema_version'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
