<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class VerifyBclContractmetricRequest extends Model
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

    // 接口使用场景
    // - RESOURCE_CHECK, 权限与资源量校验
    // - METRIC，签署达到终态，资源量扣减
    /**
     * @var string
     */
    public $serviceType;

    // 合同流程id，该接口返回的，该流程均为已完成
    /**
     * @var string
     */
    public $flowId;

    // 合同流程状态
    /**
     * @var int
     */
    public $flowStatus;

    // 租赁宝订单id
    /**
     * @var string
     */
    public $bclOrderId;

    // 8位租户英文id
    /**
     * @var string
     */
    public $contractTenantId;

    // RESOURCE_CHECK必填，代扣总金额,单位为分
    /**
     * @var int
     */
    public $totalAmount;

    // 总期数，12
    /**
     * @var int
     */
    public $totalPeriod;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceType'       => 'service_type',
        'flowId'            => 'flow_id',
        'flowStatus'        => 'flow_status',
        'bclOrderId'        => 'bcl_order_id',
        'contractTenantId'  => 'contract_tenant_id',
        'totalAmount'       => 'total_amount',
        'totalPeriod'       => 'total_period',
    ];

    public function validate()
    {
        Model::validateRequired('serviceType', $this->serviceType, true);
        Model::validateRequired('bclOrderId', $this->bclOrderId, true);
        Model::validateRequired('contractTenantId', $this->contractTenantId, true);
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
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->flowStatus) {
            $res['flow_status'] = $this->flowStatus;
        }
        if (null !== $this->bclOrderId) {
            $res['bcl_order_id'] = $this->bclOrderId;
        }
        if (null !== $this->contractTenantId) {
            $res['contract_tenant_id'] = $this->contractTenantId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalPeriod) {
            $res['total_period'] = $this->totalPeriod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyBclContractmetricRequest
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
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['flow_status'])) {
            $model->flowStatus = $map['flow_status'];
        }
        if (isset($map['bcl_order_id'])) {
            $model->bclOrderId = $map['bcl_order_id'];
        }
        if (isset($map['contract_tenant_id'])) {
            $model->contractTenantId = $map['contract_tenant_id'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['total_period'])) {
            $model->totalPeriod = $map['total_period'];
        }

        return $model;
    }
}
