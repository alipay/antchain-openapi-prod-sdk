<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateMsgdumpTaskRequest extends Model
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

    // cell
    /**
     * @var string
     */
    public $cell;

    // 对消息同步任务的描述
    /**
     * @var string
     */
    public $remark;

    // 源端 event code
    /**
     * @var string
     */
    public $sourceEventCode;

    // 源端实例 id
    /**
     * @var string
     */
    public $sourceInstanceId;

    // 源端 topic
    /**
     * @var string
     */
    public $sourceTopic;

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

    // 目标 instance id
    /**
     * @var string
     */
    public $targetInstanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cell'              => 'cell',
        'remark'            => 'remark',
        'sourceEventCode'   => 'source_event_code',
        'sourceInstanceId'  => 'source_instance_id',
        'sourceTopic'       => 'source_topic',
        'targetTag'         => 'target_tag',
        'targetTopic'       => 'target_topic',
        'targetInstanceId'  => 'target_instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('remark', $this->remark, true);
        Model::validateRequired('sourceEventCode', $this->sourceEventCode, true);
        Model::validateRequired('sourceInstanceId', $this->sourceInstanceId, true);
        Model::validateRequired('sourceTopic', $this->sourceTopic, true);
        Model::validateRequired('targetTag', $this->targetTag, true);
        Model::validateRequired('targetTopic', $this->targetTopic, true);
        Model::validateRequired('targetInstanceId', $this->targetInstanceId, true);
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
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
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
        if (null !== $this->targetTag) {
            $res['target_tag'] = $this->targetTag;
        }
        if (null !== $this->targetTopic) {
            $res['target_topic'] = $this->targetTopic;
        }
        if (null !== $this->targetInstanceId) {
            $res['target_instance_id'] = $this->targetInstanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMsgdumpTaskRequest
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
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
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
        if (isset($map['target_tag'])) {
            $model->targetTag = $map['target_tag'];
        }
        if (isset($map['target_topic'])) {
            $model->targetTopic = $map['target_topic'];
        }
        if (isset($map['target_instance_id'])) {
            $model->targetInstanceId = $map['target_instance_id'];
        }

        return $model;
    }
}
