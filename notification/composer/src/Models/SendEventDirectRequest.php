<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class SendEventDirectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 事件码
    /**
     * @var string
     */
    public $eventCode;

    // 事件参数
    /**
     * @var KeyValuePair[]
     */
    public $eventParams;

    // 接收者
    /**
     * @var EventReceiver
     */
    public $eventReceiver;

    // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
    /**
     * @var string
     */
    public $sender;

    // 用于描述sender
    /**
     * @var string
     */
    public $senderName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'eventCode'     => 'event_code',
        'eventParams'   => 'event_params',
        'eventReceiver' => 'event_receiver',
        'sender'        => 'sender',
        'senderName'    => 'sender_name',
    ];

    public function validate()
    {
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('eventReceiver', $this->eventReceiver, true);
        Model::validateRequired('sender', $this->sender, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->eventParams) {
            $res['event_params'] = [];
            if (null !== $this->eventParams && \is_array($this->eventParams)) {
                $n = 0;
                foreach ($this->eventParams as $item) {
                    $res['event_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->eventReceiver) {
            $res['event_receiver'] = null !== $this->eventReceiver ? $this->eventReceiver->toMap() : null;
        }
        if (null !== $this->sender) {
            $res['sender'] = $this->sender;
        }
        if (null !== $this->senderName) {
            $res['sender_name'] = $this->senderName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendEventDirectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['event_params'])) {
            if (!empty($map['event_params'])) {
                $model->eventParams = [];
                $n                  = 0;
                foreach ($map['event_params'] as $item) {
                    $model->eventParams[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['event_receiver'])) {
            $model->eventReceiver = EventReceiver::fromMap($map['event_receiver']);
        }
        if (isset($map['sender'])) {
            $model->sender = $map['sender'];
        }
        if (isset($map['sender_name'])) {
            $model->senderName = $map['sender_name'];
        }

        return $model;
    }
}
