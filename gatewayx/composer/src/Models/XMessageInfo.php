<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class XMessageInfo extends Model
{
    // 消息事件编码
    /**
     * @example antcloud.gatewayx.bizevent.message
     *
     * @var string
     */
    public $msgKey;

    // 消费方id，例如appId，tenantId
    /**
     * @example AXAEGSSA
     *
     * @var string
     */
    public $consumerId;

    // 消费者类型，例如TENANT, APP
    /**
     * @example TENANT
     *
     * @var string
     */
    public $consumerType;

    // 业务消息内容，json格式
    /**
     * @example {"biz_type":"order","order_id":"197002BB1bcb984cc0ab4c5ebed9c592df6acX80",""user_id":"2088102285927804"}
     *
     * @var string
     */
    public $bizContent;

    // 消息发送过程中的唯一ID
    /**
     * @example 2798c9cf5f88f24bb7ab6a94733cab1m3l
     *
     * @var string
     */
    public $msgId;
    protected $_name = [
        'msgKey'       => 'msg_key',
        'consumerId'   => 'consumer_id',
        'consumerType' => 'consumer_type',
        'bizContent'   => 'biz_content',
        'msgId'        => 'msg_id',
    ];

    public function validate()
    {
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('consumerType', $this->consumerType, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('msgId', $this->msgId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->consumerType) {
            $res['consumer_type'] = $this->consumerType;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMessageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['consumer_type'])) {
            $model->consumerType = $map['consumer_type'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }

        return $model;
    }
}
