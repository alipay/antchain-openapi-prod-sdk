<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RemoveLoadbalanceSecurityipRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 要删除的 ip
    /**
     * @var string[]
     */
    public $ips;

    // 监听器端口
    /**
     * @var int
     */
    public $listenerPort;

    // lb paas id
    /**
     * @var string
     */
    public $loadbalanceSequence;
    protected $_name = [
        'authToken'           => 'auth_token',
        'ips'                 => 'ips',
        'listenerPort'        => 'listener_port',
        'loadbalanceSequence' => 'loadbalance_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('ips', $this->ips, true);
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('loadbalanceSequence', $this->loadbalanceSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
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
     * @return RemoveLoadbalanceSecurityipRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
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
