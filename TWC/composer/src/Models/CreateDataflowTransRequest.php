<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateDataflowTransRequest extends Model
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

    // 存证主体信息，使用存证公钥加密
    /**
     * @var string
     */
    public $customer;

    // 子业务ID，选填
    /**
     * @var string
     */
    public $subBizId;

    // 扩展属性信息，使用存证公钥加密，选填
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customer'          => 'customer',
        'subBizId'          => 'sub_biz_id',
        'properties'        => 'properties',
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
            $res['customer'] = $this->customer;
        }
        if (null !== $this->subBizId) {
            $res['sub_biz_id'] = $this->subBizId;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataflowTransRequest
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
            $model->customer = $map['customer'];
        }
        if (isset($map['sub_biz_id'])) {
            $model->subBizId = $map['sub_biz_id'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
