<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class EventReceiver extends Model
{
    // 接收人的有效联系方式
    /**
     * @example 19999999999
     *
     * @var string
     */
    public $receiver;

    // 接收人联系方式的类型
    /**
     * @example PHONE_NUMBER
     *
     * @var string
     */
    public $receiverType;

    // 消息发送类型
    /**
     * @example SMS
     *
     * @var string
     */
    public $msgType;
    protected $_name = [
        'receiver'     => 'receiver',
        'receiverType' => 'receiver_type',
        'msgType'      => 'msg_type',
    ];

    public function validate()
    {
        Model::validateRequired('receiver', $this->receiver, true);
        Model::validateRequired('receiverType', $this->receiverType, true);
        Model::validateRequired('msgType', $this->msgType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->receiver) {
            $res['receiver'] = $this->receiver;
        }
        if (null !== $this->receiverType) {
            $res['receiver_type'] = $this->receiverType;
        }
        if (null !== $this->msgType) {
            $res['msg_type'] = $this->msgType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventReceiver
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['receiver'])) {
            $model->receiver = $map['receiver'];
        }
        if (isset($map['receiver_type'])) {
            $model->receiverType = $map['receiver_type'];
        }
        if (isset($map['msg_type'])) {
            $model->msgType = $map['msg_type'];
        }

        return $model;
    }
}
