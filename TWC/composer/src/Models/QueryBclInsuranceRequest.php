<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclInsuranceRequest extends Model
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

    // 租赁宝plus订单id
    /**
     * @var string
     */
    public $orderId;

    // 保单单号
    /**
     * @var string
     */
    public $bclInsuranceRecordId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'orderId'              => 'order_id',
        'bclInsuranceRecordId' => 'bcl_insurance_record_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateMaxLength('orderId', $this->orderId, 32);
        Model::validateMaxLength('bclInsuranceRecordId', $this->bclInsuranceRecordId, 64);
        Model::validateMinLength('orderId', $this->orderId, 16);
        Model::validateMinLength('bclInsuranceRecordId', $this->bclInsuranceRecordId, 16);
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
        if (null !== $this->bclInsuranceRecordId) {
            $res['bcl_insurance_record_id'] = $this->bclInsuranceRecordId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclInsuranceRequest
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
        if (isset($map['bcl_insurance_record_id'])) {
            $model->bclInsuranceRecordId = $map['bcl_insurance_record_id'];
        }

        return $model;
    }
}
