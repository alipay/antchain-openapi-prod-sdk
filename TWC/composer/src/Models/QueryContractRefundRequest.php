<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractRefundRequest extends Model
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

    // 退款ID，用户调用退款接口时传入的自定义第三方id
    /**
     * @var string
     */
    public $refundId;

    // 合同流程id
    /**
     * @var string
     */
    public $flowId;

    // 租赁宝租赁订单号
    /**
     * @var string
     */
    public $bclOrderId;

    //
    // 租赁订单对应的租户id
    /**
     * @var string
     */
    public $bclTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundId'          => 'refund_id',
        'flowId'            => 'flow_id',
        'bclOrderId'        => 'bcl_order_id',
        'bclTenantId'       => 'bcl_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('refundId', $this->refundId, true);
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
        if (null !== $this->refundId) {
            $res['refund_id'] = $this->refundId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->bclOrderId) {
            $res['bcl_order_id'] = $this->bclOrderId;
        }
        if (null !== $this->bclTenantId) {
            $res['bcl_tenant_id'] = $this->bclTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractRefundRequest
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
        if (isset($map['refund_id'])) {
            $model->refundId = $map['refund_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['bcl_order_id'])) {
            $model->bclOrderId = $map['bcl_order_id'];
        }
        if (isset($map['bcl_tenant_id'])) {
            $model->bclTenantId = $map['bcl_tenant_id'];
        }

        return $model;
    }
}
