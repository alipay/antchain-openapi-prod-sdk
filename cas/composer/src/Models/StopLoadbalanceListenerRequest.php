<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class StopLoadbalanceListenerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // load_balancer_id
    /**
     * @var string
     */
    public $loadBalancerId;

    // listener_port
    /**
     * @var int
     */
    public $listenerPort;
    protected $_name = [
        'authToken'      => 'auth_token',
        'loadBalancerId' => 'load_balancer_id',
        'listenerPort'   => 'listener_port',
    ];

    public function validate()
    {
        Model::validateRequired('loadBalancerId', $this->loadBalancerId, true);
        Model::validateRequired('listenerPort', $this->listenerPort, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loadBalancerId) {
            $res['load_balancer_id'] = $this->loadBalancerId;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StopLoadbalanceListenerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['load_balancer_id'])) {
            $model->loadBalancerId = $map['load_balancer_id'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }

        return $model;
    }
}
