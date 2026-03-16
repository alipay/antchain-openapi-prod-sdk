<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryTradeCreditauthRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // merchant_id
    /**
     * @var string
     */
    public $merchantId;

    // auth_id
    /**
     * @var string
     */
    public $authId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'authId'            => 'auth_id',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('authId', $this->authId, true);
        Model::validateMaxLength('merchantId', $this->merchantId, 64);
        Model::validateMaxLength('authId', $this->authId, 32);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('authId', $this->authId, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTradeCreditauthRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }

        return $model;
    }
}
