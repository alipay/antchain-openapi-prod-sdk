<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListDnsProviderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // regionId
    /**
     * @var string
     */
    public $regionId;

    // zone_id
    /**
     * @var string
     */
    public $zoneId;
    protected $_name = [
        'authToken' => 'auth_token',
        'regionId'  => 'region_id',
        'zoneId'    => 'zone_id',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDnsProviderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }

        return $model;
    }
}
