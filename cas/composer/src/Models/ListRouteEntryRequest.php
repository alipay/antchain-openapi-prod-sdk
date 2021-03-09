<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListRouteEntryRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 所属地域
    /**
     * @var string
     */
    public $region;

    // 要查询的路由条目所属路由表的所属路由器的ID。
    /**
     * @var string
     */
    public $routerId;
    protected $_name = [
        'authToken' => 'auth_token',
        'region'    => 'region',
        'routerId'  => 'router_id',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('routerId', $this->routerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->routerId) {
            $res['router_id'] = $this->routerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListRouteEntryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['router_id'])) {
            $model->routerId = $map['router_id'];
        }

        return $model;
    }
}
