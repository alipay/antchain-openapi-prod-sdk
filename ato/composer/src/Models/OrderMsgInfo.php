<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderMsgInfo extends Model
{
    // 订单id
    //
    /**
     * @example 13213123
     *
     * @var string
     */
    public $orderId;

    // 消息ID
    //
    /**
     * @example 79256C48A6004E1EA4E18AF06745DB0A
     *
     * @var string
     */
    public $msgId;

    // 消息类型
    //
    /**
     * @example ORDER_STATUS_CHANGE
     *
     * @var string
     */
    public $msgPublishType;

    // 消息创建时间
    //
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $msgCreateTime;

    // 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $msgStatus;

    // 消息重投次数
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $msgRetryTime;

    // 消息体内容
    /**
     * @example {}
     *
     * @var string
     */
    public $msgContent;

    // 消息回调地址
    /**
     * @example https://hstest02.xd0.co/antchain/ato/notify
     *
     * @var string
     */
    public $msgCallbackUrl;

    // 新回调地址
    /**
     * @example http://test
     *
     * @var string
     */
    public $newMsgCallbackUrl;
    protected $_name = [
        'orderId'           => 'order_id',
        'msgId'             => 'msg_id',
        'msgPublishType'    => 'msg_publish_type',
        'msgCreateTime'     => 'msg_create_time',
        'msgStatus'         => 'msg_status',
        'msgRetryTime'      => 'msg_retry_time',
        'msgContent'        => 'msg_content',
        'msgCallbackUrl'    => 'msg_callback_url',
        'newMsgCallbackUrl' => 'new_msg_callback_url',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('msgPublishType', $this->msgPublishType, true);
        Model::validateRequired('msgCreateTime', $this->msgCreateTime, true);
        Model::validateRequired('msgStatus', $this->msgStatus, true);
        Model::validateRequired('msgRetryTime', $this->msgRetryTime, true);
        Model::validateRequired('msgContent', $this->msgContent, true);
        Model::validateRequired('msgCallbackUrl', $this->msgCallbackUrl, true);
        Model::validateRequired('newMsgCallbackUrl', $this->newMsgCallbackUrl, true);
        Model::validatePattern('msgCreateTime', $this->msgCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->msgPublishType) {
            $res['msg_publish_type'] = $this->msgPublishType;
        }
        if (null !== $this->msgCreateTime) {
            $res['msg_create_time'] = $this->msgCreateTime;
        }
        if (null !== $this->msgStatus) {
            $res['msg_status'] = $this->msgStatus;
        }
        if (null !== $this->msgRetryTime) {
            $res['msg_retry_time'] = $this->msgRetryTime;
        }
        if (null !== $this->msgContent) {
            $res['msg_content'] = $this->msgContent;
        }
        if (null !== $this->msgCallbackUrl) {
            $res['msg_callback_url'] = $this->msgCallbackUrl;
        }
        if (null !== $this->newMsgCallbackUrl) {
            $res['new_msg_callback_url'] = $this->newMsgCallbackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderMsgInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['msg_publish_type'])) {
            $model->msgPublishType = $map['msg_publish_type'];
        }
        if (isset($map['msg_create_time'])) {
            $model->msgCreateTime = $map['msg_create_time'];
        }
        if (isset($map['msg_status'])) {
            $model->msgStatus = $map['msg_status'];
        }
        if (isset($map['msg_retry_time'])) {
            $model->msgRetryTime = $map['msg_retry_time'];
        }
        if (isset($map['msg_content'])) {
            $model->msgContent = $map['msg_content'];
        }
        if (isset($map['msg_callback_url'])) {
            $model->msgCallbackUrl = $map['msg_callback_url'];
        }
        if (isset($map['new_msg_callback_url'])) {
            $model->newMsgCallbackUrl = $map['new_msg_callback_url'];
        }

        return $model;
    }
}
