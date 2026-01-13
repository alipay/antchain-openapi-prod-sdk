<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENT\Models;

use AlibabaCloud\Tea\Model;

class SendMessageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // The message to send to the agent.
    /**
     * @var Message
     */
    public $request;

    // tenant
    /**
     * @var string
     */
    public $tenant;
    protected $_name = [
        'authToken' => 'auth_token',
        'request'   => 'request',
        'tenant'    => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->request) {
            $res['request'] = null !== $this->request ? $this->request->toMap() : null;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendMessageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request'])) {
            $model->request = Message::fromMap($map['request']);
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
