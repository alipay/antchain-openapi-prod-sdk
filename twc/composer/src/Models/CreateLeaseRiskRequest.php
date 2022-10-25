<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseRiskRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 承租人信息
    /**
     * @var LesseePerson
     */
    public $person;

    // 承租人类型，目前仅支持个人类型
    // PERSONAL 个人
    // ENTERPRISE 企业
    /**
     * @var string
     */
    public $lesseeType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'person'            => 'person',
        'lesseeType'        => 'lessee_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('person', $this->person, true);
        Model::validateRequired('lesseeType', $this->lesseeType, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->person) {
            $res['person'] = null !== $this->person ? $this->person->toMap() : null;
        }
        if (null !== $this->lesseeType) {
            $res['lessee_type'] = $this->lesseeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseRiskRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['person'])) {
            $model->person = LesseePerson::fromMap($map['person']);
        }
        if (isset($map['lessee_type'])) {
            $model->lesseeType = $map['lessee_type'];
        }

        return $model;
    }
}
