<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryApiOwnerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 网关产品码
    /**
     * @var string
     */
    public $productCode;

    // api方法信息
    /**
     * @var string
     */
    public $api;
    protected $_name = [
        'authToken'   => 'auth_token',
        'productCode' => 'product_code',
        'api'         => 'api',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('api', $this->api, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->api) {
            $res['api'] = $this->api;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiOwnerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['api'])) {
            $model->api = $map['api'];
        }

        return $model;
    }
}
