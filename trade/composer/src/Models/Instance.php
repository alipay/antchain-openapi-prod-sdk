<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class Instance extends Model
{
    // 租户id
    /**
     * @example 2088*****
     *
     * @var string
     */
    public $tenantId;

    // 实例id
    /**
     * @example 实例id
     *
     * @var string
     */
    public $instanceId;

    // 商品code
    /**
     * @example ECS
     *
     * @var string
     */
    public $productName;

    // 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
    /**
     * @example PREPAY_BY_MONTH
     *
     * @var string
     */
    public $chargeType;

    // 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
    /**
     * @example STARTED
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'tenantId'    => 'tenant_id',
        'instanceId'  => 'instance_id',
        'productName' => 'product_name',
        'chargeType'  => 'charge_type',
        'status'      => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('chargeType', $this->chargeType, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Instance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['charge_type'])) {
            $model->chargeType = $map['charge_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
