<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDataWeatherRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 行政区域代码
    /**
     * @var string
     */
    public $areaCode;
    protected $_name = [
        'authToken' => 'auth_token',
        'areaCode'  => 'area_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->areaCode) {
            $res['area_code'] = $this->areaCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataWeatherRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['area_code'])) {
            $model->areaCode = $map['area_code'];
        }

        return $model;
    }
}
