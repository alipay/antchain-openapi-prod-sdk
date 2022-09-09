<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotifyWaasBusinessOrderRequest extends Model
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

    // 业务合作方id
    /**
     * @var string
     */
    public $businessId;

    // 转账用户的did
    /**
     * @var string
     */
    public $did;

    // 业务转账订单id
    /**
     * @var string
     */
    public $businessOrderId;

    // 订单结果
    /**
     * @var string
     */
    public $result;

    // 结果描述
    /**
     * @var string
     */
    public $resultMessage;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessId'        => 'business_id',
        'did'               => 'did',
        'businessOrderId'   => 'business_order_id',
        'result'            => 'result',
        'resultMessage'     => 'result_message',
    ];

    public function validate()
    {
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('businessOrderId', $this->businessOrderId, true);
        Model::validateRequired('result', $this->result, true);
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
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->businessOrderId) {
            $res['business_order_id'] = $this->businessOrderId;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->resultMessage) {
            $res['result_message'] = $this->resultMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyWaasBusinessOrderRequest
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
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['business_order_id'])) {
            $model->businessOrderId = $map['business_order_id'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['result_message'])) {
            $model->resultMessage = $map['result_message'];
        }

        return $model;
    }
}
