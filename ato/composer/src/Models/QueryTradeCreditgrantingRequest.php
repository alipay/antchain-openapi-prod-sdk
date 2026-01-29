<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryTradeCreditgrantingRequest extends Model
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

    // granting_id
    /**
     * @var string
     */
    public $grantingId;

    // merchant_id
    /**
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'grantingId'        => 'granting_id',
        'merchantId'        => 'merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('grantingId', $this->grantingId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateMaxLength('grantingId', $this->grantingId, 49);
        Model::validateMaxLength('merchantId', $this->merchantId, 63);
        Model::validateMinLength('grantingId', $this->grantingId, 6);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
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
        if (null !== $this->grantingId) {
            $res['granting_id'] = $this->grantingId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTradeCreditgrantingRequest
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
        if (isset($map['granting_id'])) {
            $model->grantingId = $map['granting_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }

        return $model;
    }
}
