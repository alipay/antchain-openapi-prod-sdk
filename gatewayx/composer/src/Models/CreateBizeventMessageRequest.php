<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class CreateBizeventMessageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务消息内容，json格式
    /**
     * @var string
     */
    public $bizContent;

    // 日期对应的timestamp
    /**
     * @var int
     */
    public $utcTimestamp;

    // 消息发送过程中的唯一ID
    /**
     * @var string
     */
    public $msgId;

    // 消息事件编码
    /**
     * @var string
     */
    public $msgKey;

    // 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
    /**
     * @var string
     */
    public $consumerId;

    // 消费者类型，例如TENANT, APP
    /**
     * @var string
     */
    public $consumerType;

    // 二级消息主题,订阅方可以过滤消息
    /**
     * @var string
     */
    public $tags;

    // 消息类型，1：点对点，2: 广播消息
    /**
     * @var string
     */
    public $msgType;
    protected $_name = [
        'authToken'    => 'auth_token',
        'bizContent'   => 'biz_content',
        'utcTimestamp' => 'utc_timestamp',
        'msgId'        => 'msg_id',
        'msgKey'       => 'msg_key',
        'consumerId'   => 'consumer_id',
        'consumerType' => 'consumer_type',
        'tags'         => 'tags',
        'msgType'      => 'msg_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('utcTimestamp', $this->utcTimestamp, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('consumerType', $this->consumerType, true);
        Model::validateRequired('msgType', $this->msgType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->utcTimestamp) {
            $res['utc_timestamp'] = $this->utcTimestamp;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->consumerType) {
            $res['consumer_type'] = $this->consumerType;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        if (null !== $this->msgType) {
            $res['msg_type'] = $this->msgType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBizeventMessageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['utc_timestamp'])) {
            $model->utcTimestamp = $map['utc_timestamp'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['consumer_type'])) {
            $model->consumerType = $map['consumer_type'];
        }
        if (isset($map['tags'])) {
            $model->tags = $map['tags'];
        }
        if (isset($map['msg_type'])) {
            $model->msgType = $map['msg_type'];
        }

        return $model;
    }
}
