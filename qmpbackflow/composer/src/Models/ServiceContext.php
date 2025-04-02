<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ServiceContext extends Model
{
    // 客户端IP
    /**
     * @example 10.214.138.14
     *
     * @var string
     */
    public $clientIp;

    // 客户端UMID
    /**
     * @example WV1bz5927da956db072d3001792dcc67e
     *
     * @var string
     */
    public $clientPcidguid;

    // 服务器名
    /**
     * @example server
     *
     * @var string
     */
    public $serverName;

    // 会话ID
    /**
     * @example RZ1 2cz9oSg1GTGtGp9CwYtBbZMcD8DmobilecashierRZ12
     *
     * @var string
     */
    public $sessionId;

    // 用户ID
    /**
     * @example 2088522384403582
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'clientIp'       => 'client_ip',
        'clientPcidguid' => 'client_pcidguid',
        'serverName'     => 'server_name',
        'sessionId'      => 'session_id',
        'userId'         => 'user_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientIp) {
            $res['client_ip'] = $this->clientIp;
        }
        if (null !== $this->clientPcidguid) {
            $res['client_pcidguid'] = $this->clientPcidguid;
        }
        if (null !== $this->serverName) {
            $res['server_name'] = $this->serverName;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_ip'])) {
            $model->clientIp = $map['client_ip'];
        }
        if (isset($map['client_pcidguid'])) {
            $model->clientPcidguid = $map['client_pcidguid'];
        }
        if (isset($map['server_name'])) {
            $model->serverName = $map['server_name'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
