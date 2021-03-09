<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateLoadbalanceSecurityipRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // lb id
    /**
     * @var string
     */
    public $id;

    // listener_port
    /**
     * @var int
     */
    public $listenerPort;

    // ips
    /**
     * @var string[]
     */
    public $ips;
    protected $_name = [
        'authToken'    => 'auth_token',
        'id'           => 'id',
        'listenerPort' => 'listener_port',
        'ips'          => 'ips',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('ips', $this->ips, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLoadbalanceSecurityipRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
        }

        return $model;
    }
}
