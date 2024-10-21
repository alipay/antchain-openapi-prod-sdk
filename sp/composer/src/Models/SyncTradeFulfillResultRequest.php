<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class SyncTradeFulfillResultRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 履约单据号，可用于作为幂等依据
    /**
     * @var string
     */
    public $fulfillOrderNo;

    // 履约枚举，新购-NEW
    /**
     * @var string
     */
    public $fulfillType;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 租户8位英文名
    /**
     * @var string
     */
    public $tenantName;

    // 主商品编码
    /**
     * @var string
     */
    public $commodityCode;

    // 履约实例ID
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'fulfillOrderNo'    => 'fulfill_order_no',
        'fulfillType'       => 'fulfill_type',
        'tenantId'          => 'tenant_id',
        'tenantName'        => 'tenant_name',
        'commodityCode'     => 'commodity_code',
        'instanceId'        => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('fulfillOrderNo', $this->fulfillOrderNo, true);
        Model::validateRequired('fulfillType', $this->fulfillType, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->fulfillOrderNo) {
            $res['fulfill_order_no'] = $this->fulfillOrderNo;
        }
        if (null !== $this->fulfillType) {
            $res['fulfill_type'] = $this->fulfillType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncTradeFulfillResultRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['fulfill_order_no'])) {
            $model->fulfillOrderNo = $map['fulfill_order_no'];
        }
        if (isset($map['fulfill_type'])) {
            $model->fulfillType = $map['fulfill_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
