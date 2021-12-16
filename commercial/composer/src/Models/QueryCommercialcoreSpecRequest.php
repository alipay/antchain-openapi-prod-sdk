<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryCommercialcoreSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 规格code
    /**
     * @var string
     */
    public $specCode;
    protected $_name = [
        'authToken' => 'auth_token',
        'specCode'  => 'spec_code',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCommercialcoreSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }

        return $model;
    }
}
