<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateEcocontractTransRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 存证关联实体（个人/企业）的身份识别信息
    /**
     * @var Identity
     */
    public $customer;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

    // 业务子类型标识
    /**
     * @var string
     */
    public $subBizId;

    // 是否使用可信时间戳，默认为false
    /**
     * @var bool
     */
    public $tsr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customer'          => 'customer',
        'properties'        => 'properties',
        'subBizId'          => 'sub_biz_id',
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
        if (null !== $this->subBizId) {
            $res['sub_biz_id'] = $this->subBizId;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEcocontractTransRequest
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
            $model->customer = Identity::fromMap($map['customer']);
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['sub_biz_id'])) {
            $model->subBizId = $map['sub_biz_id'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }

        return $model;
    }
}
