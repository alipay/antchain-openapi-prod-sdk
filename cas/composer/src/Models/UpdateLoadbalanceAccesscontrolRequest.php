<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateLoadbalanceAccesscontrolRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // lb paas id
    /**
     * @var string
     */
    public $loadbalanceSequence;

    // 监听器端口
    /**
     * @var int
     */
    public $listenerPort;

    // 是否打开访问控制
    /**
     * @var bool
     */
    public $accessControl;
    protected $_name = [
        'authToken'           => 'auth_token',
        'loadbalanceSequence' => 'loadbalance_sequence',
        'listenerPort'        => 'listener_port',
        'accessControl'       => 'access_control',
    ];

    public function validate()
    {
        Model::validateRequired('loadbalanceSequence', $this->loadbalanceSequence, true);
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('accessControl', $this->accessControl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loadbalanceSequence) {
            $res['loadbalance_sequence'] = $this->loadbalanceSequence;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->accessControl) {
            $res['access_control'] = $this->accessControl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLoadbalanceAccesscontrolRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['loadbalance_sequence'])) {
            $model->loadbalanceSequence = $map['loadbalance_sequence'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['access_control'])) {
            $model->accessControl = $map['access_control'];
        }

        return $model;
    }
}
