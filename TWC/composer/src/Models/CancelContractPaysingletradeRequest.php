<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelContractPaysingletradeRequest extends Model
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

    // 智能合同id
    /**
     * @var string
     */
    public $flowId;

    // 被取消的某一期的代扣id
    /**
     * @var string
     */
    public $cancelOutOrderNo;

    // 租赁宝租赁订单号
    /**
     * @var string
     */
    public $bclOrderId;

    // 租赁订单对应的租户id
    /**
     * @var string
     */
    public $bclTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'cancelOutOrderNo'  => 'cancel_out_order_no',
        'bclOrderId'        => 'bcl_order_id',
        'bclTenantId'       => 'bcl_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('cancelOutOrderNo', $this->cancelOutOrderNo, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->cancelOutOrderNo) {
            $res['cancel_out_order_no'] = $this->cancelOutOrderNo;
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
     * @return CancelContractPaysingletradeRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['cancel_out_order_no'])) {
            $model->cancelOutOrderNo = $map['cancel_out_order_no'];
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
