<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryAreaCityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 省份名称
    /**
     * @var string
     */
    public $province;

    // 城市
    /**
     * @var string
     */
    public $city;
    protected $_name = [
        'authToken' => 'auth_token',
        'province'  => 'province',
        'city'      => 'city',
    ];

    public function validate()
    {
        Model::validateRequired('province', $this->province, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAreaCityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }

        return $model;
    }
}
