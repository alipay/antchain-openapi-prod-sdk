<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryPodEventRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单对应的service_id
    /**
     * @var string
     */
    public $serviceId;

    // POD对应的u_id
    /**
     * @var string
     */
    public $uId;
    protected $_name = [
        'authToken' => 'auth_token',
        'serviceId' => 'service_id',
        'uId'       => 'u_id',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('uId', $this->uId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->uId) {
            $res['u_id'] = $this->uId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPodEventRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['u_id'])) {
            $model->uId = $map['u_id'];
        }

        return $model;
    }
}
