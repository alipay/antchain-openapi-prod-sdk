<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryAreaProvinceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 省份, 空:全部省份, 不为空筛选关键字省份
    /**
     * @var string
     */
    public $province;
    protected $_name = [
        'authToken' => 'auth_token',
        'province'  => 'province',
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
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAreaProvinceRequest
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

        return $model;
    }
}
