<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ServiceStatus extends Model
{
    // 服务名称
    /**
     * @example data.gateway
     *
     * @var string
     */
    public $service;

    // 服务的开通与关闭状态
    /**
     * @example SERVING,CLOSED,PAUSED
     *
     * @var string
     */
    public $state;
    protected $_name = [
        'service' => 'service',
        'state'   => 'state',
    ];

    public function validate()
    {
        Model::validateRequired('service', $this->service, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service'])) {
            $model->service = $map['service'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }

        return $model;
    }
}
