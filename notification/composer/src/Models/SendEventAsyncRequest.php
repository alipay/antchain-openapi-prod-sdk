<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class SendEventAsyncRequest extends Model
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

    // 事件上下文，用于填充消息模板里的参数
    /**
     * @var KeyValuePair[]
     */
    public $eventParams;

    // 消息接收人，对应自定义人群
    /**
     * @var EventReceiver[]
     */
    public $eventReceivers;

    // 租户信息，对应智科用户群组
    /**
     * @var EventTenant
     */
    public $eventTenant;

    // 事件资源，据此查询相关的内部小二群组
    /**
     * @var EventResource[]
     */
    public $eventResources;

    // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
    /**
     * @var string
     */
    public $sender;

    // 描述sender
    /**
     * @var string
     */
    public $senderName;
    protected $_name = [
        'authToken'      => 'auth_token',
        'eventCode'      => 'event_code',
        'eventParams'    => 'event_params',
        'eventReceivers' => 'event_receivers',
        'eventTenant'    => 'event_tenant',
        'eventResources' => 'event_resources',
        'sender'         => 'sender',
        'senderName'     => 'sender_name',
    ];

    public function validate()
    {
        Model::validateRequired('eventCode', $this->eventCode, true);
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
        if (null !== $this->eventReceivers) {
            $res['event_receivers'] = [];
            if (null !== $this->eventReceivers && \is_array($this->eventReceivers)) {
                $n = 0;
                foreach ($this->eventReceivers as $item) {
                    $res['event_receivers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->eventTenant) {
            $res['event_tenant'] = null !== $this->eventTenant ? $this->eventTenant->toMap() : null;
        }
        if (null !== $this->eventResources) {
            $res['event_resources'] = [];
            if (null !== $this->eventResources && \is_array($this->eventResources)) {
                $n = 0;
                foreach ($this->eventResources as $item) {
                    $res['event_resources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return SendEventAsyncRequest
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
        if (isset($map['event_receivers'])) {
            if (!empty($map['event_receivers'])) {
                $model->eventReceivers = [];
                $n                     = 0;
                foreach ($map['event_receivers'] as $item) {
                    $model->eventReceivers[$n++] = null !== $item ? EventReceiver::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['event_tenant'])) {
            $model->eventTenant = EventTenant::fromMap($map['event_tenant']);
        }
        if (isset($map['event_resources'])) {
            if (!empty($map['event_resources'])) {
                $model->eventResources = [];
                $n                     = 0;
                foreach ($map['event_resources'] as $item) {
                    $model->eventResources[$n++] = null !== $item ? EventResource::fromMap($item) : $item;
                }
            }
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
