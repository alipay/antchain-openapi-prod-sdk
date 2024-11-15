<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class DeleteProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // YUNYOU
    /**
     * @var string
     */
    public $prodCode;
    protected $_name = [
        'authToken' => 'auth_token',
        'prodCode'  => 'prod_code',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }

        return $model;
    }
}
