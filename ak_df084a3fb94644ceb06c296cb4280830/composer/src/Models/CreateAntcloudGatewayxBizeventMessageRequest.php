<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_df084a3fb94644ceb06c296cb4280830\Models;

use AlibabaCloud\Tea\Model;

class CreateAntcloudGatewayxBizeventMessageRequest extends Model
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

    // 消息类型，1：点对点，2: 广播消息
    /**
     * @var string
     */
    public $msgType;

    // 二级消息主题,订阅方可以过滤消息
    /**
     * @var string
     */
    public $tags;

    // 日期对应的timestamp
    /**
     * @var int
     */
    public $utcTimestamp;
    protected $_name = [
        'authToken'    => 'auth_token',
        'bizContent'   => 'biz_content',
        'consumerId'   => 'consumer_id',
        'consumerType' => 'consumer_type',
        'msgId'        => 'msg_id',
        'msgKey'       => 'msg_key',
        'msgType'      => 'msg_type',
        'tags'         => 'tags',
        'utcTimestamp' => 'utc_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('consumerType', $this->consumerType, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('msgType', $this->msgType, true);
        Model::validateRequired('utcTimestamp', $this->utcTimestamp, true);
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
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->consumerType) {
            $res['consumer_type'] = $this->consumerType;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->msgType) {
            $res['msg_type'] = $this->msgType;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        if (null !== $this->utcTimestamp) {
            $res['utc_timestamp'] = $this->utcTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntcloudGatewayxBizeventMessageRequest
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
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['consumer_type'])) {
            $model->consumerType = $map['consumer_type'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['msg_type'])) {
            $model->msgType = $map['msg_type'];
        }
        if (isset($map['tags'])) {
            $model->tags = $map['tags'];
        }
        if (isset($map['utc_timestamp'])) {
            $model->utcTimestamp = $map['utc_timestamp'];
        }

        return $model;
    }
}
