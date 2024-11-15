<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateApisStatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 待更新的api数组
    /**
     * @var string[]
     */
    public $apis;

    // 产品码，原字段废弃
    /**
     * @var string
     */
    public $newProductCode;
    protected $_name = [
        'authToken'      => 'auth_token',
        'apis'           => 'apis',
        'newProductCode' => 'new_product_code',
    ];

    public function validate()
    {
        Model::validateRequired('apis', $this->apis, true);
        Model::validateRequired('newProductCode', $this->newProductCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apis) {
            $res['apis'] = $this->apis;
        }
        if (null !== $this->newProductCode) {
            $res['new_product_code'] = $this->newProductCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateApisStatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['apis'])) {
            if (!empty($map['apis'])) {
                $model->apis = $map['apis'];
            }
        }
        if (isset($map['new_product_code'])) {
            $model->newProductCode = $map['new_product_code'];
        }

        return $model;
    }
}
