<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelLeaseInsuranceRequest extends Model
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

    // 租赁订单id
    /**
     * @var string
     */
    public $orderId;

    // 人保扩展信息，订单投保时的保司为人保时，此字段必填
    /**
     * @var RenbaoExtInfo
     */
    public $renbaoExtInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'renbaoExtInfo'     => 'renbao_ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->renbaoExtInfo) {
            $res['renbao_ext_info'] = null !== $this->renbaoExtInfo ? $this->renbaoExtInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelLeaseInsuranceRequest
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
        if (isset($map['renbao_ext_info'])) {
            $model->renbaoExtInfo = RenbaoExtInfo::fromMap($map['renbao_ext_info']);
        }

        return $model;
    }
}
