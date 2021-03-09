<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListResourceComputertypeRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // region name
    /**
     * @var string
     */
    public $region;

    // zone name
    /**
     * @var string
     */
    public $zone;

    // 实例规格族
    /**
     * @var string
     */
    public $instanceTypeFamily;
    protected $_name = [
        'authToken'          => 'auth_token',
        'region'             => 'region',
        'zone'               => 'zone',
        'instanceTypeFamily' => 'instance_type_family',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('instanceTypeFamily', $this->instanceTypeFamily, true);
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
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->instanceTypeFamily) {
            $res['instance_type_family'] = $this->instanceTypeFamily;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListResourceComputertypeRequest
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
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['instance_type_family'])) {
            $model->instanceTypeFamily = $map['instance_type_family'];
        }

        return $model;
    }
}
