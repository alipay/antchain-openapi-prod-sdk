<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ClientInfoDTO extends Model
{
    // 客户端ID
    /**
     * @example clientID
     *
     * @var string
     */
    public $clientId;

    // 客户端地址
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $clientAddr;

    // 订阅详情
    /**
     * @example
     *
     * @var SubscriptionDTO[]
     */
    public $subscriptions;
    protected $_name = [
        'clientId'      => 'client_id',
        'clientAddr'    => 'client_addr',
        'subscriptions' => 'subscriptions',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('clientAddr', $this->clientAddr, true);
        Model::validateRequired('subscriptions', $this->subscriptions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->clientAddr) {
            $res['client_addr'] = $this->clientAddr;
        }
        if (null !== $this->subscriptions) {
            $res['subscriptions'] = [];
            if (null !== $this->subscriptions && \is_array($this->subscriptions)) {
                $n = 0;
                foreach ($this->subscriptions as $item) {
                    $res['subscriptions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClientInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['client_addr'])) {
            $model->clientAddr = $map['client_addr'];
        }
        if (isset($map['subscriptions'])) {
            if (!empty($map['subscriptions'])) {
                $model->subscriptions = [];
                $n                    = 0;
                foreach ($map['subscriptions'] as $item) {
                    $model->subscriptions[$n++] = null !== $item ? SubscriptionDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
