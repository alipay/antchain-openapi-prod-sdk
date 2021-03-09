<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class LoadBalanceHealthStatus extends Model
{
    // server_id
    /**
     * @example server_id
     *
     * @var string
     */
    public $serverId;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'serverId' => 'server_id',
        'status'   => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('serverId', $this->serverId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serverId) {
            $res['server_id'] = $this->serverId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalanceHealthStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['server_id'])) {
            $model->serverId = $map['server_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
