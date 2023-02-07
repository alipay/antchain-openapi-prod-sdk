<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BindOptestplusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // optestplus
    /**
     * @var string
     */
    public $optestplus;
    protected $_name = [
        'authToken'  => 'auth_token',
        'optestplus' => 'optestplus',
    ];

    public function validate()
    {
        Model::validateRequired('optestplus', $this->optestplus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->optestplus) {
            $res['optestplus'] = $this->optestplus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindOptestplusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['optestplus'])) {
            $model->optestplus = $map['optestplus'];
        }

        return $model;
    }
}
