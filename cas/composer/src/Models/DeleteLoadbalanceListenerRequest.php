<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteLoadbalanceListenerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // listener 端口
    /**
     * @var int
     */
    public $listenerPort;

    // lb id
    /**
     * @var string
     */
    public $loadbalanceSequence;
    protected $_name = [
        'authToken'           => 'auth_token',
        'listenerPort'        => 'listener_port',
        'loadbalanceSequence' => 'loadbalance_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('loadbalanceSequence', $this->loadbalanceSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->loadbalanceSequence) {
            $res['loadbalance_sequence'] = $this->loadbalanceSequence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteLoadbalanceListenerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['loadbalance_sequence'])) {
            $model->loadbalanceSequence = $map['loadbalance_sequence'];
        }

        return $model;
    }
}
