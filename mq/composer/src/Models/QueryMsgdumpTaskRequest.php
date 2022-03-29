<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryMsgdumpTaskRequest extends Model
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

    // 源 event code
    /**
     * @var string
     */
    public $sourceEventCode;

    // 源实例 id
    /**
     * @var string
     */
    public $sourceInstanceId;

    // 源 topic
    /**
     * @var string
     */
    public $sourceTopic;

    // 任务状态
    /**
     * @var int
     */
    public $status;

    // 目标 instance id
    /**
     * @var string
     */
    public $targetInstanceId;

    // 目标 tag
    /**
     * @var string
     */
    public $targetTag;

    // 目标 topic
    /**
     * @var string
     */
    public $targetTopic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceEventCode'   => 'source_event_code',
        'sourceInstanceId'  => 'source_instance_id',
        'sourceTopic'       => 'source_topic',
        'status'            => 'status',
        'targetInstanceId'  => 'target_instance_id',
        'targetTag'         => 'target_tag',
        'targetTopic'       => 'target_topic',
    ];

    public function validate()
    {
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
        if (null !== $this->sourceEventCode) {
            $res['source_event_code'] = $this->sourceEventCode;
        }
        if (null !== $this->sourceInstanceId) {
            $res['source_instance_id'] = $this->sourceInstanceId;
        }
        if (null !== $this->sourceTopic) {
            $res['source_topic'] = $this->sourceTopic;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->targetInstanceId) {
            $res['target_instance_id'] = $this->targetInstanceId;
        }
        if (null !== $this->targetTag) {
            $res['target_tag'] = $this->targetTag;
        }
        if (null !== $this->targetTopic) {
            $res['target_topic'] = $this->targetTopic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMsgdumpTaskRequest
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
        if (isset($map['source_event_code'])) {
            $model->sourceEventCode = $map['source_event_code'];
        }
        if (isset($map['source_instance_id'])) {
            $model->sourceInstanceId = $map['source_instance_id'];
        }
        if (isset($map['source_topic'])) {
            $model->sourceTopic = $map['source_topic'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['target_instance_id'])) {
            $model->targetInstanceId = $map['target_instance_id'];
        }
        if (isset($map['target_tag'])) {
            $model->targetTag = $map['target_tag'];
        }
        if (isset($map['target_topic'])) {
            $model->targetTopic = $map['target_topic'];
        }

        return $model;
    }
}
