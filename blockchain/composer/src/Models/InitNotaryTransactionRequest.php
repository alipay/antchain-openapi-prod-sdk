<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitNotaryTransactionRequest extends Model
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

    // 客户的身份信息
    /**
     * @var IdentityParam
     */
    public $customer;

    // 扩展字段
    /**
     * @var string
     */
    public $properties;

    // 托管用户信息
    /**
     * @var IdentityParam
     */
    public $trustee;

    // 是否使⽤用可信时间戳，默认为false
    /**
     * @var bool
     */
    public $tsr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customer'          => 'customer',
        'properties'        => 'properties',
        'trustee'           => 'trustee',
        'tsr'               => 'tsr',
    ];

    public function validate()
    {
        Model::validateRequired('customer', $this->customer, true);
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
        if (null !== $this->customer) {
            $res['customer'] = null !== $this->customer ? $this->customer->toMap() : null;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->trustee) {
            $res['trustee'] = null !== $this->trustee ? $this->trustee->toMap() : null;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitNotaryTransactionRequest
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
        if (isset($map['customer'])) {
            $model->customer = IdentityParam::fromMap($map['customer']);
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['trustee'])) {
            $model->trustee = IdentityParam::fromMap($map['trustee']);
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }

        return $model;
    }
}
